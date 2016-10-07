package groovy.midi.builder

import groovy.transform.CompileStatic

import javax.sound.midi.MidiChannel
import javax.sound.midi.MidiSystem
import javax.sound.midi.Synthesizer

@CompileStatic
class ChannelBuilder {

    void channel(int channelNumber, @DelegatesTo(NoteBuilder) Closure c) {
        Synthesizer synthesizer = MidiSystem.synthesizer
        synthesizer.open()

        MidiChannel[] channels = synthesizer.channels

        def noteBuilder = new NoteBuilder(channel: channels[channelNumber])
        c = (Closure)c.clone()
        c.delegate = noteBuilder
        c()

        synthesizer.close()
    }
}

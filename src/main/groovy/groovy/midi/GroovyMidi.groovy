package groovy.midi

import groovy.midi.builder.ChannelBuilder
import groovy.transform.CompileStatic

@CompileStatic
class GroovyMidi {

    static play(@DelegatesTo(ChannelBuilder) Closure c) {
        def channelBuilder = new ChannelBuilder()
        c.delegate = channelBuilder
        c()
    }
}

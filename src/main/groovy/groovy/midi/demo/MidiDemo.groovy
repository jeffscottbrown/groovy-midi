package groovy.midi.demo

import groovy.midi.GroovyMidi
import groovy.transform.CompileStatic

@CompileStatic
class MidiDemo {

    static void main(args) {
// tag::fur_elise[]
        GroovyMidi.play {
            channel(0) {
                pause 100
                play E4, 300
                play DS4, 300
                play E4, 300
                play DS4, 300
                play E4, 300
                play B4, 300
                play D4, 300
                play C4, 300
                play A4, 900
                pause 1000
            }
        }
// end::fur_elise[]
// tag::aqualung[]
        GroovyMidi.play {
            channel(0) {
                pause 100
                play D4, 300
                play G3, 300
                play AS4, 300
                play C4, 300
                play CS4, 300
                pause 300
                play C4, 300
                pause 1000
            }
        }
// end::aqualung[]
    }
}

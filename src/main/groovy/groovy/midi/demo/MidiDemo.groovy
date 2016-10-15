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

// tag::smoke[]
        GroovyMidi.play {
            channel(0) {
                pause 500

                press A4
                press D4
                pause 450
                release A4
                release D4

                press C4
                press F4
                pause 450
                release C4
                release F4

                press D4
                press G4
                pause 600
                release D4
                release G4

                pause 150

                press A4
                press D4
                pause 450
                release A4
                release D4

                press C4
                press F4
                pause 450
                release C4
                release F4

                press DS4
                press GS4
                pause 225
                release DS4
                release GS4

                press D4
                press G4
                pause 450
                release D4
                release G4

                pause 300

                press A4
                press D4
                pause 450
                release A4
                release D4

                press C4
                press F4
                pause 450
                release C4
                release F4

                press D4
                press G4
                pause 600
                release D4
                release G4

                pause 75

                press C4
                press F4
                pause 450
                release C4
                release F4

                press A4
                press D4
                pause 600
                release A4
                release D4

                pause 1000
            }
        }
// end::smoke[]
    }
}

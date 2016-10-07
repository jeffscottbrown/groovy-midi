package groovy.midi.builder

import groovy.midi.Notes
import groovy.transform.CompileStatic

import javax.sound.midi.MidiChannel

@CompileStatic
class NoteBuilder implements Notes {

    MidiChannel channel

    /**
     * Plays the specified note for the specified duration.
     *
     * @param note the MIDI note number, from 0 to 127 (60 = Middle C)
     * @param duration time to play the note in milliseconds
     * @see #press(int)
     * @see #pause(long)
     * @see #release(int)
     */
    void play(int note, int duration) {
        press(note)
        pause(duration)
        release(note)
    }

    /**
     * Plays the specified note.  The note will be left playing until
     * <code>release(int)</code> is called.
     * <pre>
     *     {@code
     *     press 60
     *     pause 1000
     *     release 60
     *     }
     * </pre>
     *
     * @param note the MIDI note number, from 0 to 127 (60 = Middle C)
     * @see #play(int, int)
     * @see #pause(long)
     * @see #release(int)
     */
    void press(int note) {
        channel.noteOn(note, 200)
    }

    /**
     * Releases a note that has been played with <code>press(int)</code>
     * <pre>
     *     {@code
     *     press 60
     *     pause 1000
     *     release 60
     *     }
     * </pre>
     * @param note the MIDI note number, from 0 to 127 (60 = Middle C)
     * @see #play(int, int)
     * @see #pause(long)
     * @see #press(int)
     */
    void release(int note) {
        channel.noteOff(note)
    }

    /**
     * Sleeps for the specified duration.
     *
     * <pre>
     *     {@code
     *     press 60
     *     pause 1000
     *     release 60
     *     }
     * </pre>
     *
     * @param duration Time to sleep in milliseconds
     */
    void pause(long duration) {
        Thread.sleep(duration)
    }
}

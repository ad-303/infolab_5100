/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musicplayer;
import java.io.File;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
    
/**
 *
 * @author admin
 */
public class MusicPlayer {
    // Path to the Sounds directory (update this path if needed)
    private static final String SOUNDS_PATH = "src/Sounds/";

    // Define the tones for each thread
    private static final String[] THREAD1_TONES = {"do.wav", "mi.wav", "sol.wav", "si.wav", "do-octave.wav"};
    private static final String[] THREAD2_TONES = {"re.wav", "fa.wav", "la.wav", "do-octave.wav"};

    // Song sequence for Twinkle Twinkle Little Star
    private static final String[] SONG_SEQUENCE = {
        "do.wav", "do.wav", "sol.wav", "sol.wav", "la.wav", "la.wav", "sol.wav",
        "fa.wav", "fa.wav", "mi.wav", "mi.wav", "re.wav", "re.wav", "do.wav",
        "sol.wav", "sol.wav", "fa.wav", "fa.wav", "mi.wav", "mi.wav", "re.wav",
        "do.wav", "do.wav", "sol.wav", "sol.wav", "la.wav", "la.wav", "sol.wav",
        "fa.wav", "fa.wav", "mi.wav", "mi.wav", "re.wav", "re.wav", "do.wav"
    };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        FilePlayer player = new FilePlayer();
        Lock lock = new ReentrantLock();
        Condition thread1Condition = lock.newCondition();
        Condition thread2Condition = lock.newCondition();

        // Thread 1
        Thread thread1 = new Thread(() -> {
            for (String tone : SONG_SEQUENCE) {
                if (isThread1Tone(tone)) {
                    lock.lock();
                    try {
                        playTone(player, tone);
                        thread2Condition.signal(); // Signal thread 2
                        thread1Condition.await(); // Wait for thread 2
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                }
            }
        });

        // Thread 2
        Thread thread2 = new Thread(() -> {
            for (String tone : SONG_SEQUENCE) {
                if (isThread2Tone(tone)) {
                    lock.lock();
                    try {
                        thread1Condition.signal(); // Signal thread 1
                        playTone(player, tone);
                        thread2Condition.await(); // Wait for thread 1
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                }
            }
        });

        // Start threads
        thread1.start();
        thread2.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Method to play a tone
    private static void playTone(FilePlayer player, String tone) {
        System.out.println("Playing: " + tone);
        player.play(SOUNDS_PATH + tone);
        try {
            Thread.sleep(500); // Delay for proper timing
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Check if the tone belongs to Thread 1
    private static boolean isThread1Tone(String tone) {
        return tone.equals("do.wav") || tone.equals("mi.wav") || tone.equals("sol.wav")
                || tone.equals("si.wav") || tone.equals("do-octave.wav");
    }

    // Check if the tone belongs to Thread 2
    private static boolean isThread2Tone(String tone) {
        return tone.equals("re.wav") || tone.equals("fa.wav") || tone.equals("la.wav")
                || tone.equals("do-octave.wav");
        // TODO code application logic here
    }
    
}

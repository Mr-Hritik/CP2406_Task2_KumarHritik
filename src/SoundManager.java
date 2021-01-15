import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class SoundManager {
    Clip clip;
    public SoundManager() {
        try {
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(new File("Traffic Sounds - Free Sound Effects - Traffic Sound Clips - Sound Bites.wav"));
            clip = AudioSystem.getClip();
            clip.open(inputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            Thread.sleep(100000000); // looping as long as this thread is alive
        } catch (Exception e) {
            System.out.print("Hello world");
        }
    }
}

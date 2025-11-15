package rinavori.bridge;
import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.InputStream;
public class WavFileSource implements AudioSource {
    private Clip clip;
    @Override
    public void play(String resourceName) {
        stop();
        try (InputStream is = getClass().getClassLoader().getResourceAsStream("music/" + resourceName)) {
            if (is == null) {
                System.out.println("Audio resource not found: " + resourceName);
                return;
            }
            BufferedInputStream bis = new BufferedInputStream(is);
            AudioInputStream ais = AudioSystem.getAudioInputStream(bis);
            clip = AudioSystem.getClip();
            clip.open(ais);
            clip.start();
            System.out.println("[WavFileSource] Playing: " + resourceName);
        } catch (Exception e) {
            System.out.println("Error playing WAV: " + e.getMessage());
        }
    }
    @Override
    public void stop() {
        try {
            if (clip != null && clip.isRunning()) {
                clip.stop();
                clip.close();
                System.out.println("[WavFileSource] Stopped.");
            }
        } catch (Exception e) {
        }
    }
}

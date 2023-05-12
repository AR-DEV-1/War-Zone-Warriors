import javax.sound.sampled.*;

public class Game {
    private Clip shootSound;

    public Game() {
        // Load shoot sound file
        try {
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(getClass().getResource("shoot.wav"));
            shootSound = AudioSystem.getClip();
            shootSound.open(audioIn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ...
}

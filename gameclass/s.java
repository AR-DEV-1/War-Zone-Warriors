public class Player {
    // ...

    public List<Bullet> shoot() {
        if (getCurrentWeapon().getAmmo() <= 0) {
            return Collections.emptyList();
        }

        List<Bullet> bullets = getCurrentWeapon().shoot(x, y, direction);
        getCurrentWeapon().playShootSound(); // Play shoot sound
        return bullets;
    }
}

public abstract class Weapon {
    // ...

    protected Clip shootSound;

    public Weapon(String name, int damage, int ammo, String shootSoundFile) {
        this.name = name;
        this.damage = damage;
        this.ammo = ammo;

        // Load shoot sound file
        try {
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(getClass().getResource(shootSoundFile));
            shootSound = AudioSystem.getClip();
            shootSound.open(audioIn);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void playShootSound() {
        if (shootSound != null) {
            shootSound.stop();
            shootSound.setFramePosition(0);
            shootSound.start();
        }
    }

    // ...
}

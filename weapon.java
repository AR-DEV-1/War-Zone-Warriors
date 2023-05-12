public abstract class Weapon {
    protected String name;
    protected int damage;
    protected int ammo;

    public Weapon(String name, int damage, int ammo) {
        this.name = name;
        this.damage = damage;
        this.ammo = ammo;
    }

    public abstract List<Bullet> shoot(double x, double y, double direction);

    // Getters and setters omitted for brevity
}

public class Pistol extends Weapon {
    public Pistol() {
        super("Pistol", 10, 100);
    }

    @Override
    public List<Bullet> shoot(double x, double y, double direction) {
        if (ammo <= 0) {
            return Collections.emptyList();
        }

        ammo--;

        List<Bullet> bullets = new ArrayList<>();
        bullets.add(new Bullet(Math.random() * 100000, x, y, Math.cos(direction) * 10, Math.sin(direction) * 10));
        return bullets;
    }
}

public class Shotgun extends Weapon {
    public Shotgun() {
        super("Shotgun", 20, 20);
    }

    @Override
    public List<Bullet> shoot(double x, double y, double direction) {
        if (ammo <= 0) {
            return Collections.emptyList();
        }

        ammo--;

        List<Bullet> bullets = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            double d = direction + (Math.random() - 0.5) * 0.5;
            bullets.add(new Bullet(Math.random() * 100000, x, y, Math.cos(d) * 10, Math.sin(d) * 10));
        }
        return bullets;
    }
}

public class RocketLauncher extends Weapon {
    public RocketLauncher() {
        super("Rocket Launcher", 50, 5);
    }

    @Override
    public List<Bullet> shoot(double x, double y, double direction) {
        if (ammo <= 0) {
            return Collections.emptyList();
        }

        ammo--;

        List<Bullet> bullets = new ArrayList<>();
        bullets.add(new Rocket(Math.random() * 100000, x, y, Math.cos(direction) * 5, Math.sin(direction) * 5));
        return bullets;
   

public class Bullet {
    private int id;
    private double x;
    private double y;
    private double vx;
    private double vy;

    public Bullet(int id, double x, double y, double vx, double vy) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }

    // Getters and setters omitted for brevity

    public void update() {
        x += vx;
        y += vy;
    }
}

public class Player {
    private int id;
    private String name;
    private double x;
    private double y;
    private boolean isShooting;

    public Player(int id, String name, double x, double y) {
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
        this.isShooting = false;
    }

    // Getters and setters omitted for brevity

    public void update(double x, double y, boolean isShooting) {
        this.x = x;
        this.y = y;
        this.isShooting = isShooting;
    }
}

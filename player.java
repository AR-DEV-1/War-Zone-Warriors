public class Player {
    // Existing fields omitted for brevity
    private int currentWeaponIndex;
    private List<Weapon> weapons;

    public Player(int id, String name, double x, double y) {
        // Existing constructor code omitted for brevity
        this.currentWeaponIndex = 0;
        this.weapons = new ArrayList<>();
        this.weapons.add(new Pistol());
        this.weapons.add(new Shotgun());
        this.weapons.add(new RocketLauncher());
    }

    public Weapon getCurrentWeapon() {
        return weapons.get(currentWeaponIndex);
    }

    public void nextWeapon() {
        currentWeaponIndex = (currentWeaponIndex + 1) % weapons.size();
    }

    public void previousWeapon() {
        currentWeaponIndex = (currentWeaponIndex - 1 + weapons.size()) % weapons.size();
    }
}


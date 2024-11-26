public abstract class Soldier {
    protected String name;
    protected String type;
    protected int damage;

    public Soldier(String name, String type, int damage) {
        this.name = name;
        this.type = type;
        this.damage = damage;
    }

    public void report() {
        System.out.println("Soldier " + name + " here. Type - " + type);
    }

    public abstract void performSpecialAbility();

    public void attack() {
        System.out.println(name + " deals " + damage + " damage.");
    }

    public void defend() {
        System.out.println(name + " defends with " + damage + " damage.");
    }
}

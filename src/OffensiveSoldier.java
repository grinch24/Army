public class OffensiveSoldier extends Soldier {
    public OffensiveSoldier(String name) {
        super(name, "OFFENSIVE", 5);
    }

    @Override
    public void performSpecialAbility() {
        System.out.println(name + " is flanking.");
    }
}

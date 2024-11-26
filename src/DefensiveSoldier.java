public class DefensiveSoldier extends Soldier {
    public DefensiveSoldier(String name) {
        super(name, "DEFENSIVE", 2);
    }

    @Override
    public void performSpecialAbility() {
        System.out.println(name + " uses defensive formation.");
    }

    @Override
    public void defend() {
        System.out.println(name + " defends with " + (damage * 2) + " damage.");
    }
}

public class AdaptableSoldier extends Soldier {
    public AdaptableSoldier(String name) {
        super(name, "ADAPTABLE", 3);
    }

    @Override
    public void performSpecialAbility() {
        System.out.println(name + " adapts to the situation.");
    }
}

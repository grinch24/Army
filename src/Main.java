public class Main {
    public static void main(String[] args) {
        Army myArmy = new Army();

        myArmy.addSoldier(new OffensiveSoldier("Knight 1"));
        myArmy.addSoldier(new OffensiveSoldier("Knight 2"));
        myArmy.addSoldier(new DefensiveSoldier("Archer 1"));
        myArmy.addSoldier(new DefensiveSoldier("Spearman 1"));
        myArmy.addSoldier(new AdaptableSoldier("Swordsman 1"));
        myArmy.addSoldier(new AdaptableSoldier("Swordsman 2"));

        myArmy.report();
        myArmy.attack();
        myArmy.defend();
        myArmy.performSpecialAbilities();
    }
}
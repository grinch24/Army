import java.util.ArrayList;
import java.util.List;

public class Army {
    private final List<Soldier> soldiers;

    public Army() {
        this.soldiers = new ArrayList<>();
    }

    public void addSoldier(Soldier soldier) {
        soldiers.add(soldier);
    }

    public void report() {
        System.out.println("-------REPORT-------");
        for (Soldier soldier : soldiers) {
            soldier.report();
        }
    }

    public void attack() {
        System.out.println("-------ATTACK-------");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof OffensiveSoldier || soldier instanceof AdaptableSoldier) {
                soldier.attack();
            }
        }
    }

    public void defend() {
        System.out.println("-------DEFEND-------");
        for (Soldier soldier : soldiers) {
            if (soldier instanceof DefensiveSoldier || soldier instanceof AdaptableSoldier) {
                soldier.defend();
            }
        }
    }

    public void performSpecialAbilities() {
        System.out.println("-------SPECIAL ABILITIES-------");
        for (Soldier soldier : soldiers) {
            soldier.performSpecialAbility();
        }
    }
}

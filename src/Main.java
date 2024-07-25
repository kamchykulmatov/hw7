//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Hero[] heroes = {
            new Magic(500, 300, "cinetic"),
            new Warrior(700, 250, "CRITICAL DAMAGE"),
            new Medic(450, 5, "healing",80)
    };
    for (Hero hero: heroes){
        if (hero instanceof Medic) {
            Medic medic = (Medic) hero;
            medic.increaseExperience();
        }
    }
    }
}
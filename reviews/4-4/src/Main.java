import e1.FoodEater;
import e1.Magician;
import e1.SpellCaster;
import e1.Wizard;

public class Main {
    public static void main(String[] args) {
        Wizard wiz1 = new Wizard();
        Magician mag1 = new Magician("GREEN");

        SpellCaster s1 = wiz1;
        SpellCaster s2 = mag1;
        s1.castSpell();
        s2.castSpell();

        // Wizard doesn't implement FoodEater
        FoodEater f1 = wiz1;
        FoodEater f2 = mag1;
        f2.eat();

        SpellCaster wiz2 = new Wizard();
        wiz2.castSpell();
        // Interface doesn't have hasBeard
        wiz2.hasBeard;
    }
}
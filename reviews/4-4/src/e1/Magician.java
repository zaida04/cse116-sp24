package e1;

public class Magician implements SpellCaster, FoodEater {
    public String hatColor;

    public Magician(String hatColor) {
        this.hatColor = hatColor;
    }

    @Override
    public void castSpell() {
        System.out.println("I also cast a spell");
    }

    @Override
    public void eat() {
        System.out.println("I also eat a food");
    }
}

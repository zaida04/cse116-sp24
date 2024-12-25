package e1;

public class Wizard implements SpellCaster {
    public boolean hasBeard;

    public Wizard() {
        this.hasBeard = true;
    }

    @Override
    public void castSpell() {
        System.out.println("I cast spell");
    }
}

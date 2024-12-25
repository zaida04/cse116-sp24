import java.util.ArrayList;

public class Hero extends Character {
    public ArrayList<GameItem> inventory;

    public Hero(String name) {
        super(name);

        this.inventory = new ArrayList<>();
    }

    public void addItem(GameItem item) {
        this.inventory.add(item);
    }

    public void attack(Villain badGuy, Weapon weapon) {
        badGuy.health = badGuy.health - weapon.damage;
    }
}

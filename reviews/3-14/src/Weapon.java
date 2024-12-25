public class Weapon extends GameItem {
    public Integer damage;

    public Integer durability;

    public Weapon(String name, Integer locationX, Integer locationY, Integer damage) {
        super(name, locationX, locationY);

        this.damage = damage;
        this.durability = 10;
    }

    @Override
    public void use() {
        this.durability = this.durability - 1;
    }
}

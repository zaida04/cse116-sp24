public class Main {
    public static void main(String[] args) {
        // https://lonk.lol/manage?id=IAAGjG
        Weapon sword = new Weapon("zaid's sword", 10, 20, 50000);
        System.out.println(sword.toString());
        System.out.println(sword);

        Potion healthPotion = new Potion("health potion", 10, 25);
        System.out.println(healthPotion);

        Hero goodGuy = new Hero("paul");
        goodGuy.addItem(sword);
        goodGuy.addItem(healthPotion);
        System.out.println(goodGuy.inventory);

        Villain badGuy = new Villain("not paul");
        goodGuy.attack(badGuy, sword);
        System.out.println(badGuy.health);
    }
}
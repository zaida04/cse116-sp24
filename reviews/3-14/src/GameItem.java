public class GameItem {
    public String name;
    public Integer locationX;
    public Integer locationY;
    public boolean isUsed;

    public GameItem(String name, Integer locationX, Integer locationY) {
        this.name = name;
        this.locationX = locationX;
        this.locationY = locationY;
        this.isUsed = false;
    }

    public String toString() {
        // this will make "[name]: (x, y)"
        return "[" + this.name + "]: " + "(" + this.locationX + "," + this.locationY + ")";
    }

    public void use() {
        this.isUsed = true;
    }
}

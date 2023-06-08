package components;

public class BattleShip {
    private int point;
    private String name;

    public BattleShip(int point, String name) {
        this.point = point;
        this.name = name;
    }

    public int getPoint() {
        return this.point;
    }

    public String getName() {
        return this.name;
    }
}
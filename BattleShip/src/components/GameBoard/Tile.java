package components.GameBoard;

import common.Button;

public class Tile extends Button {
    private String shipName;

    public Tile(String shipName) {
        this.shipName = shipName;
    }

    public String getShipName() {
        return shipName;
    }
}

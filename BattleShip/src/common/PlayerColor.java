package common;

import java.util.HashMap;
import java.util.Map;

public class PlayerColor {
    public Map<String, Integer> playerColors = new HashMap<>();

    public PlayerColor() {
        playerColors.put("RED", 0xb71c1c);
        playerColors.put("BLUE", 0x1a237e);
        playerColors.put("YELLOW", 0xffff00);
        playerColors.put("GREEN", 0x00c853);
    }
}
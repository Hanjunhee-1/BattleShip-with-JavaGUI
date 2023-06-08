package components;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class BattleShip extends JPanel{
    private int point;
    private String name;
    private JLabel nameLabel;

    public BattleShip(int point, String name) {
        this.point = point;
        this.name = name;

        nameLabel = new JLabel(name);
        nameLabel.setFont(new Font("Ink Free", Font.BOLD, 7));

        this.add(nameLabel);
    }

    public int getPoint() {
        return this.point;
    }

    public String getName() {
        return this.name;
    }
}
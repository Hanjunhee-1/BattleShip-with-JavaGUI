package common;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Button extends JPanel {
    private JButton button;

    public Button() {
        button = new JButton();
        button.setSize(60, 20);
        button.setText("click!");
        button.setBorder(new LineBorder(Color.black, 1));

        this.add(button);
    }

    public void setButtonSize(int width, int height) {
        button.setSize(width, height);
    }

    public void setButtonText(String text) {
        button.setText(text);
    }
}

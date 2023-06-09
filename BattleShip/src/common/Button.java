package common;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicButtonUI;

public class Button extends JPanel {
    private JButton button;

    public Button() {
        button = new JButton() {
            @Override
            protected void paintComponent(Graphics g) {
                if (getModel().isPressed()) {
                    g.setColor(getBackground().darker());
                } else if (getModel().isRollover()) {
                    g.setColor(getBackground().brighter());
                } else {
                    g.setColor(getBackground());
                }
                g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 10, 10);
                super.paintComponent(g);
            }

            @Override
            protected void paintBorder(Graphics g) {
                g.setColor(getForeground());
                g.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 10, 10);
            }
        };

        button.setPreferredSize(new Dimension(60, 20));
        button.setBorder(new LineBorder(Color.black, 1));
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setUI(new BasicButtonUI());

        this.add(button);
    }

    public void setButtonSize(int width, int height) {
        button.setPreferredSize(new Dimension(width, height));
    }

    public void setButtonText(String text) {
        button.setText(text);
    }

    public void setButtonBorder() {
        button.setBorder(new LineBorder(Color.black, 1));
    }
}

package components.Player;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Player extends JPanel{
    private String name;
    private int score;
    private JLabel nameLabel;
    private JPanel namePanel;
    private JLabel scoreLabel;
    private JPanel scorePanel;

    public Player(String name, int colorCode) {
        this.name = name;
        this.score = 0;

        nameLabel = new JLabel(name);
        nameLabel.setFont(new Font("Ink Free", Font.BOLD, 32));
        namePanel = new JPanel();
        namePanel.add(nameLabel);

        scoreLabel = new JLabel(Integer.toString(score));
        scoreLabel.setFont(new Font("Ink Free", Font.BOLD, 22));
        scorePanel = new JPanel();
        scorePanel.add(scoreLabel);

        this.setLayout(new BorderLayout());
        this.setPreferredSize(new Dimension(160, 120));
        this.setBorder(new LineBorder(new Color(colorCode), 2));

        this.add(namePanel, BorderLayout.NORTH);
        this.add(scorePanel, BorderLayout.SOUTH);
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setScoreLabel() {
        scoreLabel.setText(Integer.toString(getScore()));
    }
}

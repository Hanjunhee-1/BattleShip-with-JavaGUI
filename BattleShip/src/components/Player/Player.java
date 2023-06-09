package components.Player;

import java.awt.BorderLayout;
import java.awt.Color;

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
        namePanel = new JPanel();
        namePanel.add(nameLabel);

        scoreLabel = new JLabel(Integer.toString(score));
        scorePanel = new JPanel();
        scorePanel.add(scoreLabel);

        /* 확인용 나중에 지워야 됨 */
        nameLabel.setOpaque(true);
        nameLabel.setBackground(Color.red);

        /* 확인용 나중에 지워야 됨 */
        scoreLabel.setOpaque(true);
        scoreLabel.setBackground(Color.blue);

        this.setLayout(new BorderLayout());
        this.setSize(120, 90);
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

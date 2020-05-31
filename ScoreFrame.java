import javax.swing.*;

public class ScoreFrame extends JFrame {
    private Player player;
    ScoreFrame(){
        setVisible(true);
        setSize(400,400);
    }

    JTextField nick = new JTextField();
    JLabel score = new JLabel(player.getScoreString());

}

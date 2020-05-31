import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class HighscoreFrame extends JFrame {
   private ArrayList<Player> playersHighscorelist = HighScore.getHighscoreList();
    private Player player;
    HighscoreFrame(){
        highscoreLabel.setText(HighScore.readFromFile());
        highscoreLabel.setHorizontalAlignment(0);
        getAccessibleContext();

        this.add(bar,BorderLayout.WEST);
        this.add(highscoreLabel,BorderLayout.CENTER);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);


    }
    JLabel highscoreLabel = new JLabel();
    JScrollBar bar = new JScrollBar(JScrollBar.VERTICAL);

}

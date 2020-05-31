import javax.swing.*;
import java.awt.*;

public class PlayerFrame extends JFrame {

    PlayerFrame(Player player){

        setLayout(new GridLayout(1,2));
        nick.setPreferredSize(new Dimension(100,50));
        add(nick);
        add(confirm);

        confirm.addActionListener((evt)->{
            super.setVisible(false);
            player.setName(nick.getText());
            player.setScore((int) Math.random()*1000);
            HighScore.addTolist(player);

            HighScore.saveToFile();
            new HighscoreFrame();
        });


        setSize(200,100);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    JTextField nick = new JTextField("Nick");
    JButton confirm = new JButton("Confirm");
}

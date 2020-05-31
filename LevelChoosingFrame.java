import javax.swing.*;
import java.awt.*;

public class LevelChoosingFrame extends JFrame {

    LevelChoosingFrame(){

        mypanel.add(easy);
        mypanel.add(normal);
        mypanel.add(hard);
        this.add(mypanel, BorderLayout.CENTER);



        setLocationRelativeTo(null);
        setSize(400,100);
        setVisible(true);

        easy.addActionListener((evt)->{
           // Player player = new Player(10000);
            TestWindow testWindow = new TestWindow(0);
            super.setVisible(false);
        });
        normal.addActionListener((evt)->{

           // Player p1 = new Player(1000);
            TestWindow testWindow = new TestWindow(1);
            super.setVisible(false);
        });
        hard.addActionListener((evt)->{
           // Player player = new Player(100);
            TestWindow testWindow = new TestWindow(2);
            super.setVisible(false);
        });

    }
    JPanel  mypanel = new JPanel();
    JButton easy = new JButton("Easy");
    JButton normal = new JButton("normal");
    JButton hard = new JButton("hard");
}

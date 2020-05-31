import com.sun.jdi.event.MethodEntryEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MenuStart extends JFrame {

    public MenuStart(){
        test.setText("Gra Antiplague "+"Wykonawca:  Piotr Karolak S18746 " );
        exit.addActionListener(actionEvent -> System.exit(5));
        highscore.addActionListener(ActionListener ->{
            new HighscoreFrame();

        });
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuStart.super.setVisible(false);
                LevelChoosingFrame lcf = new LevelChoosingFrame();
            }
        });

        JPanel panelStartowy = new JPanel();
        panelStartowy.setBackground(Color.lightGray);
        panelStartowy.setLayout(new GridLayout(3,1));
        panelStartowy.add(start);
        panelStartowy.add(highscore);
        panelStartowy.add(exit);
        this.add(test,BorderLayout.NORTH);
       this.add(panelStartowy,BorderLayout.CENTER);






        setLocationRelativeTo(null);
        setSize(800,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    JButton start = new JButton("Start Gry");
    JButton highscore = new JButton("Highscore");
    JButton exit = new JButton("exit");
    JLabel test = new JLabel();


}

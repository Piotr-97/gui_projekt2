import javax.swing.*;
import java.awt.*;

public class MapWindow extends JFrame {


    MapWindow(){

        JPanel mapPanel   = new JPanel();
        //==========================================

        //===========================================


        mapPanel.setBackground(Color.black);
        JButton poland = new JButton();
        poland.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\Mapa\\poland1.PNG"));
         mapPanel.add(poland);
        poland.setPreferredSize(new Dimension(200,200));

        this.add(mapPanel);
        mapPanel.setBackground(Color.gray);
        poland.addActionListener(actionEvent -> System.out.println("WOW"));



        setTitle("AntiPlague");
        setLocationRelativeTo(null);
        setSize(1200,1000);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }




}

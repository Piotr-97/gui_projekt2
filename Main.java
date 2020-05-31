import javafx.event.Event;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
       EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               // new TestWindow();
               MenuStart start = new MenuStart();
                //PlayerFrame frame = new PlayerFrame(new Player(1000));
            }
        });



    }



}

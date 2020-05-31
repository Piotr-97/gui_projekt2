import javax.swing.*;
import java.awt.*;

public class InfoPanel2 extends JPanel {


    InfoPanel2(){
        setLayout(new GridLayout(2,5));
        airplanesBox.setEnabled(false);
        busBox.setEnabled(false);
        trainBox.setEnabled(false);
        carBox.setEnabled(false);
        cargoBox.setEnabled(false);
        add(airplanes);
        add(bus);
        add(train);
        add(car);
        add(cargo);
        add(airplanesBox);
        add(busBox);
        add(trainBox);
        add(carBox);
        add(cargoBox);
    }
    JLabel airplanes = new JLabel("Airplanes:");
    JLabel bus = new JLabel("Bus:");
    JLabel train = new JLabel("Train:");
    JLabel car = new JLabel("Car:");
    JLabel cargo = new JLabel("Cargo:");
    JCheckBox airplanesBox = new JCheckBox();
    JCheckBox busBox = new JCheckBox();
    JCheckBox trainBox = new JCheckBox();
    JCheckBox carBox = new JCheckBox();
    JCheckBox cargoBox= new JCheckBox();

    public void getInfo2(Country country){
        airplanesBox.setSelected(country.isAirplanes());
        busBox.setSelected(country.isBus());
        trainBox.setSelected(country.isTrain());
        carBox.setSelected(country.isCar());
        cargoBox.setSelected(country.isCargo());
    }



}

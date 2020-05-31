import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class InfoPanel extends JPanel {

    InfoPanel(){

        setLayout(new GridLayout(2,4));


        add(populationField);
        add(infectedField);
        add(countryField);
        add(curedField);
        add(getpopulationField);
        add(getInfectedField);
        add(getCountryField);
        add(getCuredField);






        setVisible(true);

    }
    JLabel populationField = new JLabel("Population:");
    JLabel infectedField = new JLabel("Infected:");
    JLabel countryField = new JLabel("Country:");
    JLabel curedField = new JLabel("Cured:");
    JLabel getpopulationField = new JLabel("");
    JLabel getInfectedField= new JLabel("");
    JLabel getCuredField= new JLabel("");
    JLabel getCountryField = new JLabel("");


    public void getInfo(Country country){
        getCountryField.setText(country.getCountryName());
        getInfectedField.setText( country.getInfectedString());
        getCuredField.setText(country.getCuredString());
        getpopulationField.setText(country.getPopulationString());

    }


}

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class CountryButton extends JButton{


    private Color colorButton;
    private Country country;
    private static ArrayList<CountryButton> allCountryButtonlist = new ArrayList<>();

    CountryButton(Country country){
        this.country = country;
        setVisible(true);
        this.colorButton = this.getBackground();
        setBackground(colorButton);
        setOpaque(true);
        allCountryButtonlist.add(this);
    }




    public void showInfo(){

        System.out.println( country.toString());
    }

    public Country getCountry() {
        return country;
    }


    public  void paintButton(){
        if((colorButton.getBlue()-10)>=0 && (colorButton.getGreen()-10)>=0) {
            colorButton = new Color(colorButton.getRed(), colorButton.getGreen() - 10, colorButton.getBlue() - 10);
            setBackground(colorButton);
        }

    }
    public Color getColor(){
        return colorButton;
    }
    public static ArrayList<CountryButton> getColorButtonList(){
        return  allCountryButtonlist;
    }










}

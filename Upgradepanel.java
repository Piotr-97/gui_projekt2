import javax.swing.*;
import java.awt.*;

public class Upgradepanel extends JPanel {

    Upgradepanel(){
        setLayout(new GridLayout(4,5));

     add(upgrade1);
     add(upgrade2);
     add(upgrade3);
     add(upgrade4);
     add(upgrade5);
     add(upgradename1);
        add(upgradename2);
        add(upgradename3);
        add(upgradename4);
        add(upgradename5);
        add(upgrade6);
     add(upgrade7);
     add(upgrade8);
     add(upgrade9);
     add(upgrade10);
        add(upgradename6);
        add(upgradename7);
        add(upgradename8);
        add(upgradename9);
        add(upgradename10);



    }




    UpgradesbyTime movmentBan = new UpgradesbyTime("MovmentBan",1000,1500);
    UpgradesbyTime media = new UpgradesbyTime("Media", 3000, 4500);
    UpgradesbyTime quarantine = new UpgradesbyTime("Quarantine", 5000, 5000);
    UpgradesbyTime awerness = new UpgradesbyTime("Awerness",500,1000);
    UpgradesbyTime betterHospitals = new UpgradesbyTime("Better Hospital",6000,1000 );
    Uprgradesbypress vitamins = new Uprgradesbypress("Vitamins",500,100);
    Uprgradesbypress vaccine = new Uprgradesbypress("Vaccine", 10000,100000);
    Uprgradesbypress gloves = new Uprgradesbypress("Gloves", 500,50);
    Uprgradesbypress mask = new Uprgradesbypress("mask", 1000,1000);
    Uprgradesbypress cure = new Uprgradesbypress("cure", 10,Country.allpopulation());

    UpgradeButton upgrade1 = new UpgradeButton(movmentBan);
    UpgradeButton upgrade2 = new UpgradeButton(media);
    UpgradeButton upgrade3 = new UpgradeButton(quarantine);
    UpgradeButton upgrade4 = new UpgradeButton(awerness);
    UpgradeButton upgrade5 = new UpgradeButton(betterHospitals);
    UpgradeButton upgrade6 = new UpgradeButton(vitamins);
    UpgradeButton upgrade7 = new UpgradeButton(vaccine);
    UpgradeButton upgrade8 = new UpgradeButton(gloves);
    UpgradeButton upgrade9 = new UpgradeButton(mask);
    UpgradeButton upgrade10 = new UpgradeButton(cure);

    JLabel  upgradename1 = new JLabel(movmentBan.toString());
    JLabel  upgradename2 = new JLabel(media.toString());
    JLabel  upgradename3 = new JLabel(quarantine.toString());
    JLabel  upgradename4 = new JLabel(awerness.toString());
    JLabel  upgradename5 = new JLabel(betterHospitals.toString());
    JLabel  upgradename6 = new JLabel(vitamins.toString());
    JLabel  upgradename7 = new JLabel(vaccine.toString());
    JLabel  upgradename8 = new JLabel(gloves.toString());
    JLabel  upgradename9 = new JLabel(mask.toString());
    JLabel  upgradename10 = new JLabel("Cost: "+cure.getCost()+"Cure : All");


}

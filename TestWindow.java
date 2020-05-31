import javafx.scene.input.KeyEvent;
import javafx.scene.input.Mnemonic;

import javax.swing.*;
import java.util.Objects;

public class TestWindow extends JFrame {



    Player player = new Player(0) ;
    Player[] players = new Player[]{new Player(10000), new Player(1000), new Player(0)};
    TestWindow(int playerindex){




        
        setLayout(null);
        settings();


        /*
        polandButton.setBounds(800,200,100,97);
        germanyButton.setBounds(700,200,100,129);
        southAmericaButton.setBounds(300,400,200,266 );
        centralAmericaButton.setBounds(100,245,200,155);
        americaAndCanadaButton.setBounds(0,70,200,176);
        this.add(polandButton);
        this.add(germanyButton);
        this.add(southAmericaButton);
        this.add(centralAmericaButton);
        this.add(americaAndCanadaButton);


        */

        polandButton.setBounds(540,110,10,10);
        usaButton.setBounds(130,150,40,40);
        canadaButton.setBounds(160,60, 40,40);
        germanyButton.setBounds(515,115,10,10);
        centralAmericaButton.setBounds(90,250,20,20);
        chinaButton.setBounds(850,190,40,40);
        americaSouthButton.setBounds(230,410,40,40);
        franceButton.setBounds(490,140,15,15);
        spainButton.setBounds(470,170,10,10);
        japanButton.setBounds(960,165,10,10);
        russiaButton.setBounds(700,60, 40,40);
        ukraineButton.setBounds(580,120,20,20);
        australiaButton.setBounds(980,500,40,40);
        africaButton.setBounds(540,300,40,40);
        greatBriButton.setBounds(470,100,10,10);
        swedenButton.setBounds(520,80,15,15);
        infoPanel.setBounds(0,670,400,50);
        infoPanel2.setBounds(0,730,400,50);
        upgradepanel.setBounds(401,670,700,200);
        panelWorld.setBounds(0,0,1140,657);
        startButton.setBounds(0,850,150,100);
      moneyInfo.setBounds(401,850,100,100);
        //=========================================================================
        add(panelWorld);
        add(polandButton);
        add(usaButton);
        add(canadaButton);
        add(germanyButton);
        add(centralAmericaButton);
        add(chinaButton);
        add(americaSouthButton);
        add(franceButton);
        add(spainButton);
        add(japanButton);
        add(russiaButton);
        add(ukraineButton);
        add(australiaButton);
        add(africaButton);
        add(greatBriButton);
        add(swedenButton);
        add(infoPanel);
        add(infoPanel2);
        add(upgradepanel);
        add(startButton);
        //add(moneyInfo);


        //===========================================================
        polandButton.addActionListener((event)->{
            infoPanel.getInfo(polandButton.getCountry());
            infoPanel2.getInfo2(polandButton.getCountry());



        });
        ukraineButton.addActionListener((event)->{
                infoPanel.getInfo(ukraineButton.getCountry());
                infoPanel2.getInfo2(ukraineButton.getCountry());
        });
        usaButton.addActionListener((event)->{
            infoPanel.getInfo(usaButton.getCountry());
            infoPanel2.getInfo2(usaButton.getCountry());
        });
        canadaButton.addActionListener((event)->{
            infoPanel.getInfo(canadaButton.getCountry());
            infoPanel2.getInfo2(canadaButton.getCountry());
        });
        germanyButton.addActionListener((event)->{
            infoPanel.getInfo(germanyButton.getCountry());
            infoPanel2.getInfo2(germanyButton.getCountry());
        });
        centralAmericaButton.addActionListener((event)->{
            infoPanel.getInfo(centralAmericaButton.getCountry());
            infoPanel2.getInfo2(centralAmericaButton.getCountry());
        });
        chinaButton.addActionListener((event)->{
            infoPanel.getInfo(chinaButton.getCountry());
            infoPanel2.getInfo2(chinaButton.getCountry());

        });
        americaSouthButton.addActionListener((event)->{
            infoPanel.getInfo(americaSouthButton.getCountry());
            infoPanel2.getInfo2(americaSouthButton.getCountry());

        });
        franceButton.addActionListener((event)->{
            infoPanel.getInfo(franceButton.getCountry());
            infoPanel2.getInfo2(franceButton.getCountry());
        });
        spainButton.addActionListener((event)->{
            infoPanel.getInfo(spainButton.getCountry());
            infoPanel2.getInfo2(spainButton.getCountry());
        });
        japanButton.addActionListener((event)->{
            infoPanel.getInfo(japanButton.getCountry());
            infoPanel2.getInfo2(japanButton.getCountry());
        });
        russiaButton.addActionListener((event)->{
            infoPanel.getInfo(russiaButton.getCountry());
            infoPanel2.getInfo2(russiaButton.getCountry());
        });
        australiaButton.addActionListener((event)->{
            infoPanel.getInfo(australiaButton.getCountry());
            infoPanel2.getInfo2(australiaButton.getCountry());
        });
        africaButton.addActionListener((event)->{
            infoPanel.getInfo(africaButton.getCountry());
            infoPanel2.getInfo2(africaButton.getCountry());
        });
        greatBriButton.addActionListener((event)->{
            infoPanel.getInfo(greatBriButton.getCountry());
            infoPanel2.getInfo2(greatBriButton.getCountry());
        });
        swedenButton.addActionListener((event)->{
            infoPanel.getInfo(swedenButton.getCountry());
            infoPanel2.getInfo2(swedenButton.getCountry());
        });
        //===================================Upgrade=====================================
        upgradepanel.upgrade1.addActionListener((evt)->{
            if(player.getCash()>1000) {
                upgradepanel.upgrade1.setEnabled(false);
                GameThread.setTimeCar(1500);
                player.setCash(player.getCash()-1000);
                moneyInfo.setText(player.getCashString());
            }else{
                System.out.println("Cash < 1000");
            }
        });
        upgradepanel.upgrade2.addActionListener((evt)->{
            if(player.getCash()>3000) {
                        upgradepanel.upgrade2.setEnabled(false);
                        GameThread.setTimeAitplanes(4500);
                        player.setCash(player.getCash()-3000);
                        moneyInfo.setText(player.getCashString());
            }else{
                System.out.println("Cash < 3000");
            }

        });
        upgradepanel.upgrade3.addActionListener((evt)->{
            if(player.getCash()>5000) {
                upgradepanel.upgrade3.setEnabled(false);
                GameThread.setTimeCargo(5000);
                player.setCash(player.getCash()-5000);
                moneyInfo.setText(player.getCashString());
            }else{
                System.out.println("cash<5000");
            }

        });
        upgradepanel.upgrade4.addActionListener((evt)->{
                    if(player.getCash()>500) {
                        upgradepanel.upgrade4.setEnabled(false);
                        GameThread.setTimeBus(1500);
                        player.setCash(player.getCash()-500);
                        moneyInfo.setText(player.getCashString());
                    }else{
                        System.out.println("cash<500");
                    }
        });
        upgradepanel.upgrade5.addActionListener((evt)->{
            if(player.getCash()>6000) {
                upgradepanel.upgrade5.setEnabled(false);
                GameThread.setTimeTrain(1000);
                player.setCash(player.getCash()-6000);
                moneyInfo.setText(player.getCashString());
            }else{
                System.out.println("Cash<6000");
            }
        });

        upgradepanel.upgrade6.addActionListener((evt)->{
            if(player.getCash()>500) {
                for (int i = 0; i < CountryButton.getColorButtonList().size(); i++) {
                    Country.meds(upgradepanel.upgrade6.getUprgradesbypress());
                    player.setCash(player.getCash()-500);
                    moneyInfo.setText(player.getCashString());

                }
            }else{
                System.out.println("cash<500");
            }

        });
        upgradepanel.upgrade7.addActionListener((evt)->{
                    if(player.getCash()>10000) {
                        for (int i = 0; i < CountryButton.getColorButtonList().size(); i++) {
                            Country.meds(upgradepanel.upgrade7.getUprgradesbypress());
                        }
                        player.setCash(player.getCash()-10000);
                        moneyInfo.setText(player.getCashString());
                    }else{
                        System.out.println("cash<10000");
                    }

        });
        upgradepanel.upgrade8.addActionListener((evt)->{
            if(player.getCash()>500) {
                for (int i = 0; i < CountryButton.getColorButtonList().size(); i++) {
                    Country.meds(upgradepanel.upgrade8.getUprgradesbypress());
                }
                player.setCash(player.getCash()-500);
                moneyInfo.setText(player.getCashString());

            }else{
                    System.out.println("cash<500");

            }

        });
        upgradepanel.upgrade9.addActionListener((evt)->{
            if(player.getCash()>1000) {
                for (int i = 0; i < CountryButton.getColorButtonList().size(); i++) {
                    Country.meds(upgradepanel.upgrade9.getUprgradesbypress());

                }
                player.setCash(player.getCash()-1000);
                moneyInfo.setText(player.getCashString());
            }else{
                System.out.println("cash<500");
            }

        });
        upgradepanel.upgrade10.addActionListener((evt)->{
            if(player.getCash()>10)
            super.setVisible(false);
            PlayerFrame pf = new PlayerFrame(players[playerindex]);
        });



        //================================================================
        startButton.addActionListener((actionEvent -> {
            startButton.setEnabled(false);
            player = players[playerindex];
            System.out.println("game started");
            gameThread.start();
            curingThread.start();
            moneyInfo.setText("Cash: "+ player.getCashString());
            super.add(add(moneyInfo));
            repaint();


        }));














       
        setSize(1140,1000);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    JMenuItem item = new JMenuItem();
    InfoPanel infoPanel = new InfoPanel();
    InfoPanel2 infoPanel2 = new InfoPanel2();
    Upgradepanel upgradepanel = new Upgradepanel();
    ObrazPanel panelWorld = new ObrazPanel();
    Country poland = new Country(10000,"Poland",0);
    Country germany = new Country(100000, "Germany",0);
    Country usa = new Country(12500,"Usa",0);
    Country canada = new Country(7000,"Canada",0);
    Country centralAmerica = new Country(6000,"Central America",0);
    Country china = new Country(70000, "China",1000);
    Country americaSouth = new Country(1000, "South America",0);
    Country france = new Country(9200, "France",0);
    Country spain = new Country(13000,"Spain",0);
    Country japan = new Country(4000, "Japan",0);
    Country russia = new Country(150000, "Russia",0);
    Country ukraine = new Country(7000," Ukraine",0);
    Country australia = new Country(30000,"Australia",0);
    Country africa = new Country(12000,"Africa",0);
    Country greatBri = new Country(3000, "Great Britain",0);
    Country sweden = new Country(8500, "Sweden",0);
    //===========================================
    JLabel moneyInfo = new JLabel();
    //===========================================


    CountryButton polandButton = new CountryButton(poland);
    CountryButton usaButton = new CountryButton(usa);
    CountryButton canadaButton = new CountryButton(canada);
    CountryButton germanyButton = new CountryButton(germany);
    CountryButton centralAmericaButton = new CountryButton(centralAmerica);
    CountryButton chinaButton = new CountryButton(china);
    CountryButton americaSouthButton = new CountryButton(americaSouth);
    CountryButton franceButton = new CountryButton(france);
    CountryButton spainButton = new CountryButton(spain);
    CountryButton japanButton = new CountryButton(japan);
    CountryButton russiaButton = new CountryButton(russia);
    CountryButton ukraineButton = new CountryButton(ukraine);
    CountryButton australiaButton = new CountryButton(australia);
    CountryButton africaButton = new CountryButton(africa);
    CountryButton greatBriButton = new CountryButton(greatBri);
    CountryButton swedenButton = new CountryButton(sweden);


    JButton startButton = new JButton("Start");
    GameThread gameThread = new GameThread();
    CuringThread curingThread = new CuringThread();





    /*
    CountryButton polandButton = new CountryButton("C:\\Users\\ADMIN\\Downloads\\Mapa\\poland.jpg",poland);
    CountryButton germanyButton = new CountryButton("C:\\Users\\ADMIN\\Downloads\\Mapa\\germany.jpg",germany);
    CountryButton southAmericaButton = new CountryButton("C:\\Users\\ADMIN\\Downloads\\Mapa\\southAmericaJPEG.jpg",americaSouth);
    CountryButton centralAmericaButton = new CountryButton("C:\\Users\\ADMIN\\Downloads\\Mapa\\centralAmericaJPEG.jpg",centralAmerica);
    CountryButton americaAndCanadaButton = new CountryButton("C:\\Users\\ADMIN\\Downloads\\Mapa\\canada_usaJPEG.jpg",americaAndCanada);
    CountryButton spainButton = new CountryButton("C:\\Users\\ADMIN\\Downloads\\Mapa\\canada_usaJPEG.jpg",spain);


     */

    public void settings(){
        poland.setAirplanes(true);
        poland.setBus(true);
        poland.setCar(true);
        poland.setCargo(true);
        poland.setTrain(true);
        germany.setAirplanes(true);
        germany.setBus(true);
        germany.setCar(true);
        germany.setCargo(true);
        germany.setTrain(true);
        greatBri.setAirplanes(true);
        greatBri.setBus(false);
        greatBri.setCar(true);
        greatBri.setCargo(true);
        greatBri.setTrain(false);
        usa.setAirplanes(true);
        usa.setBus(true);
        usa.setCar(true);
        usa.setCargo(true);
        usa.setTrain(true);
        canada.setAirplanes(true);
        canada.setBus(true);
        canada.setCar(true);
        canada.setCargo(true);
        canada.setTrain(true);
        centralAmerica.setAirplanes(false);
        centralAmerica.setBus(true);
        centralAmerica.setCar(true);
        centralAmerica.setCargo(false);
        centralAmerica.setTrain(false);
        china.setAirplanes(true);
        china.setBus(true);
        china.setCar(true);
        china.setCargo(true);
        china.setTrain(true);
        americaSouth.setAirplanes(true);
        americaSouth.setBus(false);
        americaSouth.setCar(true);
        americaSouth.setCargo(false);
        americaSouth.setTrain(false);
        france.setAirplanes(true);
        france.setBus(true);
        france.setCar(true);
        france.setCargo(true);
        france.setTrain(true);
        spain.setAirplanes(true);
        spain.setBus(true);
        spain.setCar(true);
        spain.setCargo(false);
        spain.setTrain(false);
        japan.setAirplanes(true);
        japan.setBus(false);
        japan.setCar(true);
        japan.setCargo(true);
        japan.setTrain(false);
        russia.setAirplanes(true);
        russia.setBus(false);
        russia.setCar(true);
        russia.setCargo(true);
        russia.setTrain(false);
        ukraine.setAirplanes(true);
        ukraine.setBus(true);
        ukraine.setCar(true);
        ukraine.setCargo(true);
        ukraine.setTrain(false);
        australia.setAirplanes(true);
        australia.setBus(false);
        australia.setCar(true);
        australia.setCargo(true);
        australia.setTrain(true);
        africa.setAirplanes(true);
        africa.setBus(true);
        africa.setCar(true);
        africa.setCargo(true);
        africa.setTrain(false);
        greatBri.setAirplanes(true);
        greatBri.setBus(true);
        greatBri.setCar(true);
        greatBri.setCargo(true);
        greatBri.setTrain(true);
        sweden.setAirplanes(true);
        sweden.setBus(true);
        sweden.setCar(true);
        sweden.setCargo(true);
        sweden.setTrain(true);





    }
    public void end(){

        setVisible(false);

    }


}

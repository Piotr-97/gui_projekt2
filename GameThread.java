import java.util.ArrayList;

public class GameThread extends Thread{

    ArrayList<Country> list = Country.getallCounrtyList();
    ArrayList<CountryButton> allCountryButtonList = CountryButton.getColorButtonList();
    private static  int timeAitplanes = 0;
    private static int timeCar = 0;
    private static int timeBus = 0;
    private static int timeCargo = 0 ;
    private static int timeTrain = 0;
    private Player player;
    static int  timeWaiting =3000;

    GameThread(){

    }
    @Override
    public synchronized void run() {
            try {

                while(Player.isGameon()==true) {
                    sleep(timeWaiting + timeCar);
                    Country.infectingCars();
                    sleep(timeWaiting + timeBus);
                    Country.infectingBus();
                    sleep(timeWaiting + timeTrain);
                    Country.infectingTrain();
                    sleep(timeWaiting + timeAitplanes);
                    Country.infectingAirplanes();
                    sleep(timeWaiting + timeCargo);
                    Country.infectingCargo();
                   for(int i =0; i< allCountryButtonList.size();i++){
                       allCountryButtonList.get(i).paintButton();
                   }

                }


            } catch (InterruptedException e) {
                interrupt();
            }


    }
    public void cancel() { interrupt(); }

    public static void setTimeAitplanes(int timeAitplanes) {
        GameThread.timeAitplanes = timeAitplanes;
    }

    public static void setTimeCar(int timeCar) {
        GameThread.timeCar = timeCar;
    }

    public static void setTimeBus(int timeBus) {
        GameThread.timeBus = timeBus;
    }

    public static void setTimeCargo(int timeCargo) {
        GameThread.timeCargo = timeCargo;
    }

    public static void setTimeTrain(int timeTrain) {
        GameThread.timeTrain = timeTrain;
    }

    public static void setTimeWaiting(int timeWaiting) {
        GameThread.timeWaiting = timeWaiting;
    }
}

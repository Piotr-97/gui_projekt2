import java.util.ArrayList;

public class CuringThread extends Thread{


    private ArrayList<Country> allcoutryList = Country.getallCounrtyList();
    @Override
    public synchronized void run() {

        while(Player.isGameon()==true){
            try {
                wait(10000);
                for (int i =0; i< allcoutryList.size();i++){
                    allcoutryList.get(i).healing();
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }




    }
}

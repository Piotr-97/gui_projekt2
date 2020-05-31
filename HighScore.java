import java.io.*;
import java.util.ArrayList;

public class HighScore implements Serializable {


    static ArrayList<Player> highscoreList = new ArrayList<>();



    public  static void addTolist(Player player){
        testList();
        highscoreList.add(player);
        highscoreList.sort(Player::compareTo);
    }

    public static void saveToFile(){
        try {

            FileOutputStream fos = new FileOutputStream("C:\\Users\\ADMIN\\Downloads\\Mapa\\zapis2.txt");

            byte[] highscoreByte = getPlayerList().getBytes();
            fos.write(highscoreByte,0,highscoreByte.length);

            fos.flush();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String readFromFile(){
            String s="";
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\ADMIN\\Downloads\\Mapa\\zapis2.txt");
            int tmp;
            while((tmp = fis.read())!= -1){

                s+=(char)tmp;

            }
            fis.close();
            return s;


        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "";
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
    public static ArrayList<Player> getHighscoreList(){
        return highscoreList;
    }


    public static String getPlayerList(){
        String s = "";
        for(int i =0; i < highscoreList.size();i++){
            s =s+ (i+1) +" "+ highscoreList.get(i).getName() + " " +highscoreList.get(i).getScore()+"\n ";
        }
        return s;
    }
    public static void testList(){
        highscoreList.add(new Player("Test1",750));
        highscoreList.add(new Player("Test2",50));
        highscoreList.add(new Player("Test3",100));
        highscoreList.add(new Player("Test5",2500));
        highscoreList.add(new Player("Test6",10));
        highscoreList.add(new Player("Test4",1020));

    }
}

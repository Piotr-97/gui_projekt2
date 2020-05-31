import java.util.Date;

public class Player implements Comparable<Player>{

    private int score;
    private String name;
    private static boolean gameon = true;
    private  int cash ;
    Player(int cash){
        this.cash = cash;

    }
    Player(String name, int score){
        this.name = name;
        this.score = score;

    }


    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Player player) {
        if(player.getScore() >this.getScore() )
            return 1;
        if (player.getScore() < this.getScore()) {
            return -1;
        }else{
            return 0;
        }

    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return this.getName() + " "+this.getScore() ;
    }


    public  static boolean isGameon() {
        return gameon;
    }

    public static void  setGameonOff() {
        gameon=false;
    }
    public String getScoreString(){
        return ""+score;
    }

    public String getCashString() {
        return ""+cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getCash() {
        return cash;
    }
}

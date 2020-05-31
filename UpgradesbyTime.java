public  class UpgradesbyTime {


    private String name;
    private int cost;
    private boolean isUpgraded;
    private int time;
    private static  int timeAitplanes =4500;
    private static int timeCar = 1000;
    private static int timeBus = 1500;
    private static int timeCargo = 5000 ;
    private static int timeTrain = 1000;

    public UpgradesbyTime(String name, int cost, int time){
        this.name = name;
        this.cost = cost;
        this.time = time;
        this.isUpgraded = false;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public boolean isUpgraded() {
        return isUpgraded;
    }

    public void setUpgraded(boolean upgraded) {
        isUpgraded = upgraded;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "C: "+ cost + " T: " + time+"(ms)";
    }

    public static void addtoBusTimer(){
        GameThread.setTimeBus(timeBus);
    }
    public static void addtoAirplaneTimer(){
        GameThread.setTimeAitplanes(timeAitplanes);
    }
    public static void addtoTraintimer(){
        GameThread.setTimeAitplanes(timeTrain);
    }
    public static void addtoCargoTimer(){
        GameThread.setTimeCargo(timeCargo);
    }
    public static void addtoCarTimer(){
        GameThread.setTimeCargo(timeCar);
    }


}

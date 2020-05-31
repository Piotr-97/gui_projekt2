import java.util.ArrayList;

public class Country  implements InfectingAirplane,InfectingCar,InfectingTrain,InfectingCargo,InfectingBus{


    private String countryName;
    private int population;
    private int infected;
    private int cured;
    private static ArrayList<Country> allCountryList = new ArrayList<>();
    boolean isBus,isAirplanes,isTrain,isCar,isCargo;
    private  int canBeInfected ;

    public Country(int population, String countryName, int infected){
        this.population = population;
        this.countryName = countryName;
        this.infected = infected;
        allCountryList.add(this);
        this.cured = 0;
        this.canBeInfected = population;
    }

    public String getCountryName() {
        return countryName;
    }



    public boolean isBus() {
        return isBus;
    }

    public void setBus(boolean bus) {
        isBus = bus;
    }

    public boolean isAirplanes() {
        return isAirplanes;
    }

    public void setAirplanes(boolean airplanes) {
        isAirplanes = airplanes;
    }

    public boolean isTrain() {
        return isTrain;
    }

    public void setTrain(boolean train) {
        isTrain = train;
    }

    public boolean isCar() {
        return isCar;
    }

    public void setCar(boolean car) {
        isCar = car;
    }

    public boolean isCargo() {
        return isCargo;
    }

    public void setCargo(boolean cargo) {
        isCargo = cargo;
    }

    public String getPopulationString() {
        return ""+population;
    }

    public String getInfectedString() {
        return ""+infected;
    }

    public String getCuredString() {
        return ""+cured;
    }

    public static ArrayList<Country> getallCounrtyList(){
        return allCountryList;
    }

    public int getPopulation() {
        return population;
    }

    public int getInfected() {
        return infected;
    }

    public int getCured() {
        return cured;
    }

    public void setInfected(int infected) {
        this.infected = infected;
    }

    public void setCured(int cured) {
        this.cured = cured;
    }

    public int getCanBeInfected() {
        return canBeInfected;
    }

    public void setCanBeInfected(int canBeInfected) {
        this.canBeInfected = canBeInfected;
    }

    @Override
    public void infectingbyAirPlane() {
        double randomIndex= Math.random()*16;
        int index = (int)randomIndex;


            if(allCountryList.get(index).getCanBeInfected()<=30 ){
                allCuntryList.get(index).setInfected(allCuntryList.get(index).getPopulation());
                this.canBeInfected=0;
            }else{
                allCuntryList.get(index).setInfected((allCuntryList.get(index).getInfected()+30));
                this.canBeInfected-=30;
            }
    }


    public static  void infectingAirplanes (){

        for(int i = 0; i < allCountryList.size();i++){
            if(allCountryList.get(i).isAirplanes==true) {
                if (allCountryList.get(i).getInfected() > 0) {
                    allCountryList.get(i).infectingbyAirPlane();
                }

            }

        }
    }

    @Override
    public void infectingbyCar() {
        this.setInfected(getInfected()+1);
        this.setCanBeInfected(getCanBeInfected()-1);
    }
    public  static void infectingCars(){
        for(int i = 0; i < allCountryList.size();i++){
            if(allCountryList.get(i).isCar==true) {
                if (allCountryList.get(i).getInfected() > 0) {
                    allCountryList.get(i).infectingbyCar();
                }
            }
        }
    }


    @Override
    public void infectingbyTrain() {
        double randomIndex= Math.random()*16;
        int index = (int)randomIndex;
        if(allCountryList.get(index).getCanBeInfected()<=20 ){
            allCuntryList.get(index).setInfected(allCuntryList.get(index).getPopulation());
            this.canBeInfected=0;
        }else{
            allCuntryList.get(index).setInfected((allCuntryList.get(index).getInfected()+20));
            this.canBeInfected-=20;
        }

    }

    public static  void infectingTrain(){

        for(int i = 0; i < allCountryList.size();i++){
            if(allCountryList.get(i).isTrain==true){
                if (allCountryList.get(i).getInfected() > 0) {
                    allCountryList.get(i).infectingbyTrain();
                }
            }
        }
    }


    @Override
    public void infectingbyCargo() {
        double randomIndex= Math.random()*16;
        int index = (int)randomIndex;
        if(allCountryList.get(index).getCanBeInfected()<=50 ){
            allCuntryList.get(index).setInfected(allCuntryList.get(index).getPopulation());
            this.canBeInfected=0;
        }else{
            allCuntryList.get(index).setInfected((allCuntryList.get(index).getInfected()+50));
            this.canBeInfected-=50;
        }

    }

    public static  void infectingCargo (){

        for(int i = 0; i < allCountryList.size();i++){
            if(allCountryList.get(i).isCargo==true) {
                if (allCountryList.get(i).getInfected() > 0) {
                    allCountryList.get(i).infectingbyCargo();
                }
            }

        }
    }


    @Override
    public void infectingByBus() {
        this.setInfected(getInfected()+10);
        this.setCanBeInfected(getCanBeInfected()-10);

    }
    public  static void infectingBus(){


        for(int i = 0; i < allCountryList.size();i++){
            if(allCountryList.get(i).isBus==true) {
                if (allCountryList.get(i).getInfected() > 0) {
                    allCountryList.get(i).infectingByBus();
                }
            }
        }
    }

    public static int allpopulation(){
        int allpopulation =0;
        for(int i = 0; i< allCountryList.size();i++){
            allpopulation = allCountryList.get(i).population +allpopulation;
        }
        return allpopulation;
    }

    public void cure(){
        for (int i =0;i < allCountryList.size();i++){
         allCountryList.get(i).setInfected(0);
            allCountryList.get(i).setCanBeInfected(0);
            allCountryList.get(i).setCured(allCountryList.get(i).getPopulation());
        }
    }


    public void healing(){
        if(this.getInfected()>1500  ) {
            for (int i = 0; i < allCountryList.size(); i++) {
                double random = Math.random() * 100;
                int cured = (int) random;
                if(cured < allCountryList.get(i).getInfected())
                allCountryList.get(i).setInfected(allCountryList.get(i).getInfected() - cured);
                allCountryList.get(i).setCured(allCountryList.get(i).getCured() + cured);

            }
        }
    }

    public static void meds(Uprgradesbypress ubp ){
        for(int i = 0; i < allCountryList.size(); i++){
            if(allCountryList.get(i).getInfected()>=ubp.getThreated()) {
                allCountryList.get(i).setInfected(allCountryList.get(i).getInfected() - ubp.getThreated());
                allCountryList.get(i).setCured(allCountryList.get(i).getCured() + ubp.getThreated());
            }else{
                allCountryList.get(i).setCured(allCountryList.get(i).getCured()+allCountryList.get(i).getInfected());
                allCountryList.get(i).setInfected(0);
            }

        }

    }








}

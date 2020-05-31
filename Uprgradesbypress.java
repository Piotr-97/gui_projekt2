import javax.swing.*;
import java.util.ArrayList;

public class Uprgradesbypress {

    private String name;
    private int cost;
    private boolean isUpgraded;
    private static ArrayList<Country> allCountryList = Country.getallCounrtyList();
    private int threated;
    public Uprgradesbypress(String name, int cost ,int threated){
        this.name = name;
        this.cost = cost;
        this.threated = threated;
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

    public int getThreated() {
        return threated;
    }

    public void setThreated(int threated) {
        this.threated = threated;
    }

    @Override
    public String toString() {
        return "C:" + cost +"Cure:"+threated;
    }
}

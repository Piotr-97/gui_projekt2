import javax.swing.*;

public class UpgradeButton extends JButton {


    private UpgradesbyTime ubt;
    private Uprgradesbypress uprgradesbypress;


    UpgradeButton(UpgradesbyTime upgradesbyTime){
        this.ubt = upgradesbyTime;
        setText(upgradesbyTime.getName());
    }


    UpgradeButton(Uprgradesbypress uprgradesbypress){
        setText(uprgradesbypress.getName());
        this.uprgradesbypress = uprgradesbypress;
    }

    public UpgradesbyTime getUbt() {
        return ubt;
    }

    public void setUbt(UpgradesbyTime ubt) {
        this.ubt = ubt;
    }

    public Uprgradesbypress getUprgradesbypress() {
        return uprgradesbypress;
    }

    public void setUprgradesbypress(Uprgradesbypress uprgradesbypress) {
        this.uprgradesbypress = uprgradesbypress;
    }
}

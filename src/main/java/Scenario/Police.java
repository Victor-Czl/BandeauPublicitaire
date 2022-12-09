package Scenario;

import bandeau.Bandeau;
import java.awt.*;

public class Police extends Effet {

    private Font nouvellePolice;
    public Police(String m, Font nouvellePolice) {
        super(m);
        this.nouvellePolice = nouvellePolice;
    }

    @Override
    public void playEffet(Bandeau b) {

        b.setMessage(this.getMessage());
        b.sleep(1000);
        b.setFont(this.nouvellePolice);
        b.sleep(1000);
    }
}

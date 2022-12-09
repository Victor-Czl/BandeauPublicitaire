package Scenario;

import bandeau.Bandeau;
import java.awt.*;

public class Couleur extends Effet {

    private Color nouvelleCouleur;
    public Couleur(String m, Color c) {
        super(m);
        this.nouvelleCouleur = c;
    }

    @Override
    public void playEffet(Bandeau b) {
        b.setMessage(this.getMessage());
        b.sleep(1000);
        b.setForeground(this.nouvelleCouleur);
        b.sleep(1000);
    }
}

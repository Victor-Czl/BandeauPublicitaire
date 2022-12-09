package Scenario;

import java.awt.*;

public class Main {

    public static void main (String[]args) {

        Scenario s1 = new Scenario();
        s1.addEffet(new Zoom("Zoom..."), 1);
        s1.addEffet(new Couleur("Couleur", Color.GREEN), 1);
        s1.addEffet(new Police("Police", new Font("SansSerif", Font.PLAIN, 15)),1);
        s1.addEffet(new Rotation("Rotation"), 1);
        s1.playScenario();

    }
}

package Scenario;

import bandeau.Bandeau;
import java.awt.*;

public class Zoom extends Effet {

    public Zoom(String message) {
        super(message);
    }
    @Override
    public void playEffet(Bandeau b) {
        b.setMessage(this.getMessage());
        for (int i = 5; i < 60; i += 5) {
            b.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            b.sleep(100);
        }
        b.sleep(1000);
    }
}

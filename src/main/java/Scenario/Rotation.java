package Scenario;

import bandeau.Bandeau;

public class Rotation extends Effet {
    public Rotation(String m) {
        super(m);
    }

    @Override
    public void playEffet(Bandeau bandeau) {
        bandeau.setMessage(this.getMessage());
        bandeau.sleep(1000);
        bandeau.setRotation(Math.PI / 4.0f);
        bandeau.sleep(1000);
        bandeau.setRotation(Math.PI / 2.0f);
        bandeau.sleep(1000);
    }
}

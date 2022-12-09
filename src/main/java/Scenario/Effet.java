package Scenario;

import bandeau.Bandeau;

public abstract class Effet {
    private String message;

    public Effet(String m) {
        this.message = m;
    }
    public String getMessage() {
        return this.message;
    }

    public abstract void playEffet(Bandeau b);
}

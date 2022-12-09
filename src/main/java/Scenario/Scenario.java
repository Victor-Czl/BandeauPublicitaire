package Scenario;

import bandeau.Bandeau;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scenario {

    List<Effet> effets;
    Map<Effet, Integer> effetToNbRepetition;
    Bandeau bandeau;

    public Scenario() {
        this.effets = new ArrayList<>();
        this.effetToNbRepetition = new HashMap<>();
    }

    public void addEffet(Effet effet, int nbRepetion) {
        this.effets.add(effet);
        this.effetToNbRepetition.put(effet, nbRepetion);
    }

    public void playScenario() {
        this.bandeau = new Bandeau();
        for(Effet e : this.effets) {
            for(int i = 0; i < this.effetToNbRepetition.get(e); i++) {
                e.playEffet(this.bandeau);
            }
        }
    }
}

package pt.junit5.sample;

import pt.junit5.sample.model.Pizza;

public class PizzaFactory {
    public Pizza createQuattroStagioni(){
        return new Pizza("artichokes", "basil", "mushrooms","ham",  "olives");
    }
}

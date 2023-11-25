package hf.dp.FactoryMethodPattern;

import hf.dp.FactoryMethodPattern.ConcreteFactory.NYStyleCheesePizza;
import hf.dp.FactoryMethodPattern.ConcreteFactory.NYStyleVeggiePizza;
import hf.dp.FactoryMethodPattern.ConcreteFactory.Pizza;

public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else return null;
    }
}
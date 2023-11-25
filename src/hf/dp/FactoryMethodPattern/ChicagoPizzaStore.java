package hf.dp.FactoryMethodPattern;

import hf.dp.FactoryMethodPattern.ConcreteFactory.ChicagoStyleCheesePizza;
import hf.dp.FactoryMethodPattern.ConcreteFactory.ChicagoStyleVeggiePizza;
import hf.dp.FactoryMethodPattern.ConcreteFactory.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else return null;
    }
}
package hf.dp.AbstractFactoryPattern.IngredientFactory;

import hf.dp.AbstractFactoryPattern.PizzaIngredient.*;

public interface PizzaIngredientFactory {
	public Sauce createSauce();
	public Dough createDough(); 
	public Cheese createCheese(); 
	public Veggies[] createVeggies(); 
	public Pepperoni createPepperoni(); 
	public Clams createClam();
}
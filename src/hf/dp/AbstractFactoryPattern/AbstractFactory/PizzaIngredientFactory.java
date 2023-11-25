package hf.dp.AbstractFactoryPattern.AbstractFactory;

import hf.dp.AbstractFactoryPattern.AbstractProduct.Cheese;
import hf.dp.AbstractFactoryPattern.AbstractProduct.Clams;
import hf.dp.AbstractFactoryPattern.AbstractProduct.Dough;
import hf.dp.AbstractFactoryPattern.AbstractProduct.Sauce;

public interface PizzaIngredientFactory {
	public Sauce createSauce();
	public Dough createDough(); 
	public Cheese createCheese(); 
//	public Veggies[] createVeggies(); 
//	public Pepperoni createPepperoni(); 
	public Clams createClam();
}
 






package hf.dp.AbstractFactoryPattern.ConcreteFactory;

import hf.dp.AbstractFactoryPattern.AbstractFactory.PizzaIngredientFactory;
import hf.dp.AbstractFactoryPattern.AbstractProduct.Cheese;
import hf.dp.AbstractFactoryPattern.AbstractProduct.Clams;
import hf.dp.AbstractFactoryPattern.AbstractProduct.Dough;
import hf.dp.AbstractFactoryPattern.AbstractProduct.Sauce;
import hf.dp.AbstractFactoryPattern.AbstractProduct.Concrete.FreshClams;
import hf.dp.AbstractFactoryPattern.AbstractProduct.Concrete.MarinaraSauce;
import hf.dp.AbstractFactoryPattern.AbstractProduct.Concrete.ReggianoCheese;
import hf.dp.AbstractFactoryPattern.AbstractProduct.Concrete.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{ 
	public Dough createDough(){
		return new ThinCrustDough();
	}
	
	public Sauce createSauce(){
		return new MarinaraSauce();
	}
	
	public Cheese createCheese(){ 
		return new ReggianoCheese();
	}
	
//	public Veggies[] createVeggies(){
//		Veggies veggies[] = {new Garlic(), new Onion(),new Mushroom(), new RedPepper()}; 
//		return veggies;
//	}
//	
//	public Pepperoni createPepperoni(){ 
//		return new SlicedPepperoni();
//	}
//	
	public Clams createClam(){ 
		return new FreshClams();
	}
}

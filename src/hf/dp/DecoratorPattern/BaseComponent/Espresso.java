package hf.dp.DecoratorPattern.BaseComponent;

import hf.dp.DecoratorPattern.Beverage;

public class Espresso extends Beverage{ 
	
	public Espresso(){
		description="Espresso";
	}
	
	public double cost(){ 
		return 1.99;
	}
}

package hf.dp.DecoratorPattern.BaseComponent;

import hf.dp.DecoratorPattern.Beverage;

public class HouseBlend extends Beverage{ 
	
	public HouseBlend(){
		description="HouseBlend";
	}
	
	public double cost(){ 
		return 4.99;
	}
}

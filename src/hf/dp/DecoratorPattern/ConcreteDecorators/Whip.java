package hf.dp.DecoratorPattern.ConcreteDecorators;

import hf.dp.DecoratorPattern.Beverage;
import hf.dp.DecoratorPattern.Decorator.CondimentDecorator;

public class Whip extends CondimentDecorator{ 
	public Whip(Beverage beverage){
		this.beverage=beverage;
	}
	public String getDescription(){
		return beverage.getDescription()+",Whip";
	}
	public double cost(){
		return .40+beverage.cost();
	}
}
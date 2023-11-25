package hf.dp.StrategyPattern.Context;

import hf.dp.StrategyPattern.Strategy1.FlyNoWay;
import hf.dp.StrategyPattern.Strategy2.Squeak;

public class ModelDuck extends Duck{ 
	public ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	public void display(){ 
		System.out.println("I’m a modelduck");
	}
}
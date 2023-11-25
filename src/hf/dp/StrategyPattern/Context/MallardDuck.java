package hf.dp.StrategyPattern.Context;

import hf.dp.StrategyPattern.Strategy1.FlyWithWings;
import hf.dp.StrategyPattern.Strategy2.Quack;

public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehavior = new Quack(); 
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("I’m a real Mallard Duck");
	}
}

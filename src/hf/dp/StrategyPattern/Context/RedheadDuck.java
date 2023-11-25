package hf.dp.StrategyPattern.Context;

import hf.dp.StrategyPattern.Strategy1.FlyRocketPowered;
import hf.dp.StrategyPattern.Strategy2.MuteQuack;

public class RedheadDuck extends Duck {
	public RedheadDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyRocketPowered();
	}
	
	public void display() {
		System.out.println("I’m a real RedheadDuck Duck");
	}

}

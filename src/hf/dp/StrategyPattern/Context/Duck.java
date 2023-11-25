package hf.dp.StrategyPattern.Context;

import hf.dp.StrategyPattern.Strategy1.FlyBehavior;
import hf.dp.StrategyPattern.Strategy2.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior; 
	
	public Duck(){}
	
	public abstract void display(); 
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public void performQuack(){ 
		quackBehavior.quack();
	}
	
	public void swim(){
		System.out.println("Allducksfloat,evendecoys!");
	}
	
	public void setFlyBehavior(FlyBehavior fb) { 
		 flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
  	}
}
package hf.dp.StrategyPattern;

import hf.dp.StrategyPattern.MyHWInfo;
import hf.dp.StrategyPattern.Context.Duck;
import hf.dp.StrategyPattern.Context.MallardDuck;
import hf.dp.StrategyPattern.Context.ModelDuck;
import hf.dp.StrategyPattern.Context.RedheadDuck;
import hf.dp.StrategyPattern.Strategy1.FlyRocketPowered;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		MyHWInfo.printInfo();
		
		// TODO Auto-generated method stub
		Duck mallard = new MallardDuck(); 
		Duck model = new ModelDuck();
		Duck mute = new RedheadDuck();
		
		mallard.performQuack(); //Quack
		model.performQuack(); // Squeak
		mute.performQuack(); // <<sience>>
		
		model.performFly(); // i can't fly
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly(); // i'm flying with a rocket
	}
}

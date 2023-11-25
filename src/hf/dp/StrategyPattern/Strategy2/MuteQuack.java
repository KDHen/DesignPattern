package hf.dp.StrategyPattern.Strategy2;

public class MuteQuack implements QuackBehavior{ 
	public void quack(){
		System.out.println("<<silence>>");
	}
}
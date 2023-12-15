package hf.dp.CommandPattern;

import hf.dp.StrategyPattern.MyHWInfo;

public class TestDrive {
	public static void main(String[] args) {
		MyHWInfo.printInfo();
		
		Lamp lamp = new Lamp();
		Command lampOnCommand = new LampOnCommand(lamp);
		Button button1 = new Button(lampOnCommand);
		
		button1.pressed();
		
		Alarm alarm = new Alarm();
		Command alarmOnCommand = new AlarmOnCommand(alarm);
		Button button2 = new Button(alarmOnCommand);
		
		button2.pressed();
		button2.setCommand(lampOnCommand); 
		button2.pressed();
		
		Command lampOffCommand = new LampOffCommand(lamp);
		Button button3 = new Button(lampOffCommand);
		
		button3.pressed();
		
		Command alarmOffCommand = new AlarmOffCommand(alarm);
		Button button4 = new Button(alarmOffCommand);
		
		button4.pressed();
	}
}
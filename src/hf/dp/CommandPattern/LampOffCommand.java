package hf.dp.CommandPattern;

public class LampOffCommand implements Command {
	private Lamp theLamp;
	
	public LampOffCommand(Lamp theLamp) {
		this.theLamp = theLamp;
	}
	
	public void execute() { theLamp.turnOff(); }
}
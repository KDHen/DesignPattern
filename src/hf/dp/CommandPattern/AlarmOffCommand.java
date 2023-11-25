package hf.dp.CommandPattern;

public class AlarmOffCommand implements Command {
	private Alarm theAlarm;
	
	public AlarmOffCommand(Alarm theAlarm) {
		this.theAlarm = theAlarm;
	}
	
	public void execute() { theAlarm.stop(); }
}
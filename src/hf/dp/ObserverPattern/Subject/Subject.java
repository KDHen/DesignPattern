package hf.dp.ObserverPattern.Subject;

import hf.dp.ObserverPattern.Observer.Observer;

public interface Subject{
	public void registerObserver(Observer o); 
	public void removeObserver(Observer o); 
	public void notifyObservers();
}
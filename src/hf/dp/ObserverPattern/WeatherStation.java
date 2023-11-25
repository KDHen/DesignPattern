package hf.dp.ObserverPattern;

import hf.dp.ObserverPattern.Subject.WeatherData;
import hf.dp.ObserverPattern.MyHWInfo;
import hf.dp.ObserverPattern.Observer.CurrentConditionsDisplay;
import hf.dp.ObserverPattern.Observer.StatisticsDisplay;
import hf.dp.ObserverPattern.Observer.ForecastDisplay;

public class WeatherStation {
	public static void main(String[] args) {
		MyHWInfo.printInfo();
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData); 
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80,65,30.4f); 
		weatherData.setMeasurements(82,70,29.2f);
		weatherData.setMeasurements(78,90,29.2f);

	}

}

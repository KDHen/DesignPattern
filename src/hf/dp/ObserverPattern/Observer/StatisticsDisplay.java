package hf.dp.ObserverPattern.Observer;

import hf.dp.ObserverPattern.Display.DisplayElement;
import hf.dp.ObserverPattern.Subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float maxTemp = Float.MIN_VALUE; // 최대 온도
    private float minTemp = Float.MAX_VALUE; // 최소 온도
    private float tempSum; 
    private int numReadings;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    // 업데이트 메소드
    public void update(float temp, float humidity, float pressure) {
        this.tempSum += temp; // 온도 합계에 더함
        numReadings++; // 측정 횟수 증가

        if (temp > maxTemp) { // 최대 온도 갱신
            this.maxTemp = temp;
        }
 
        if (temp < minTemp) { // 최소 온도 갱신
            this.minTemp = temp;
        }
        display(); // 화면 표시 메소드 호출
    }

    // 화면 표시 메소드
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
    }
}
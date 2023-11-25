package hf.dp.ObserverPattern.Observer;

import hf.dp.ObserverPattern.Display.DisplayElement;
import hf.dp.ObserverPattern.Subject.Subject;
import java.util.Queue;
import java.util.LinkedList;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure; // 현재 기압
    private float lastPressure; // 이전 기압
    private Subject weatherData; // 주체 객체
    private Queue<String> forecastMessages; // 예측 메시지 큐

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData; // 주체 객체를 받아서 저장
        weatherData.registerObserver(this); // 주체 객체에 관찰자로 등록[^1^][1]

        // 예측 메시지 큐 초기화
        forecastMessages = new LinkedList<String>();
        forecastMessages.add("Improving weather on the way!");
        forecastMessages.add("Watch out for cooler, rainy weather");
        forecastMessages.add("More of the same");
    }

    // 업데이트 메소드
    public void update(float temp, float humidity, float pressure) {
        this.lastPressure = currentPressure; // 이전 기압을 현재 기압으로 갱신
        this.currentPressure = pressure; // 현재 기압을 새로운 값으로 갱신

        display(); // 화면 표시 메소드 호출
    }

    // 화면 표시 메소드
    public void display() {
        System.out.print("Forecast: ");
        if (forecastMessages.isEmpty()) { // 예측 메시지 큐가 비어있으면 초기화
            forecastMessages.add("Improving weather on the way!");
            forecastMessages.add("Watch out for cooler, rainy weather");
            forecastMessages.add("More of the same");
        }
        System.out.println(forecastMessages.poll()); // 예측 메시지 큐에서 메시지를 꺼내서 출력
    }
}
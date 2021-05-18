package com.yeqifu.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
	
	// 温度
	private float temperature;
	// 湿度
	private float humidity;
	// 气压
	private float pressure;
	
	private List<Observer> observers;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	// 注册一个观察者
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	// 移除一个观察者
	@Override
	public void removeObserver(Observer observer) {
		if (observers.contains(observer)) {
			observers.remove(observer);
		}
	}

	public void dataChange(){
		notifyObservers();
	}
	
	public void setData(float temperature,float pressure,float humidity){
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		dataChange();
	}
	
	// 遍历所有观察者，并通知
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this.temperature, this.pressure, this.humidity);
		}
	}
	
}

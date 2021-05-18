package com.yeqifu.observer;

public class Moji implements Observer {

	// 温度
	private float temperature;
	// 气压
	private float pressure;
	// 湿度
	private float humidity;

	@Override
	public void update(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

	public void display() {
		System.out.println("*****墨迹网站的天气预报*****");
		System.out.println("*****当天温度：" + temperature + "*****");
		System.out.println("*****当天气压：" + pressure + "*****");
		System.out.println("*****当天湿度：" + humidity + "*****");
	}

}

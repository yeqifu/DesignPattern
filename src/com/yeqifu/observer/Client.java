package com.yeqifu.observer;

public class Client {
	public static void main(String[] args) {
		Moji moji = new Moji();
		Sina sina = new Sina();
		WeatherData weatherData = new WeatherData();
		weatherData.registerObserver(moji);
		weatherData.registerObserver(sina);
		System.out.println("通知所有的观察者");

		weatherData.setData(15f, 30f, 50f);
	}
}

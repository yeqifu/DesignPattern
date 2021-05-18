package com.yeqifu.observer;

/**
 * 观察者接口，由观察者来实现
 * @author yeqifu
 *
 */
public interface Observer {

	public void update(float temperature,float pressure,float humidity);
	
}

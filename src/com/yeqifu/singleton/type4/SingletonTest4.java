package com.yeqifu.singleton.type4;

/**
 * 懒汉式(线程安全，同步方法)
 * 
 * @author yeqifu
 *
 */
public class SingletonTest4 {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance);
		System.out.println(instance2);
	}
}

class Singleton {
	// 声明一个静态的instance实例
	private static Singleton instance = null;
	// 私有化构造器
	private Singleton() {

	}
	// 声明一个静态的获取instance的方法
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
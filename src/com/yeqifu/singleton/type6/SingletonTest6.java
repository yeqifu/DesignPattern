package com.yeqifu.singleton.type6;

/**
 * 懒汉式(线程安全，使用双重检查机制)
 * @author yeqifu
 *
 */
public class SingletonTest6 {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance);
		System.out.println(instance2);
	}
}
class Singleton{
	//声明一个静态的instance
	private static Singleton instance = null;
	//私有化构造器
	private Singleton(){
	}
	//声明一个静态的获取instance的方法
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
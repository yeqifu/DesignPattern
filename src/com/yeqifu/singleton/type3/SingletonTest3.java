package com.yeqifu.singleton.type3;

/**
 * 懒汉式(线程不安全)
 * @author yeqifu
 *
 */
public class SingletonTest3 {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance);
		System.out.println(instance2);
	}
}
class Singleton{
	//声明一个静态的singleton
	private static Singleton singleton = null;
	//私有化构造器
	private Singleton() {
	}
	//获取实例的静态方法
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
}

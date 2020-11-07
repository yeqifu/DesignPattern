package com.yeqifu.singleton.type1;

/**
 * 饿汉式(静态常量)
 * @author yeqifu
 *
 */
public class SingletonTestOne {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		System.out.println(instance);
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance2);
	}
}

class Singleton{
	//私有化构造器 
	private Singleton(){
	}
	//声明一个静态常量 
	private static Singleton instance = new Singleton();
	//声明一个获取实例的静态方法 
	public static Singleton getInstance(){
		 return instance; 
	}
}
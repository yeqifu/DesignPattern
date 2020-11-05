package com.yeqifu.singleton.type2;

/**
 * 饿汉式(静态代码块)
 * @author yeqifu
 *
 */
public class SingletonTest2 {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance(); 
		System.out.println(instance);
		System.out.println(instance2);
	}

}

class Singleton{
	private static Singleton instance;
	//私有化构造器
	private Singleton(){	
	}
	//在静态代码块中声明Singleton实例
	static{
		instance = new Singleton();
	}
	//声明一个获取实例的静态方法
	public static Singleton getInstance() {
		return instance;
	}
}
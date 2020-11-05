package com.yeqifu.singleton.type5;

/**
 * 懒汉式(线程安全，同步代码块)
 * 但是这种同步并不能起到线程同步的作用
 * 跟第3种实现方式遇到的情形一致，假如一个线程进入了if (singleton == null)判断语句块，
 * 还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例
 * @author yeqifu
 *
 */
public class SingletonTest5 {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance);
		System.out.println(instance2);
	}
}

class Singleton {
	// 声明一个静态的instance
	private static Singleton instance = null;

	// 私有化构造器
	private Singleton() {
	}

	// 声明一个获取实例的静态方法
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				instance = new Singleton();
			}
		}
		return instance;
	}
}
package com.yeqifu.singleton.type8;

/**
 * 通过枚举实现单例模式
 * @author yeqifu
 *
 */
public class SingletonTest8 {
	public static void main(String[] args) {
		Singleton instance = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
	}
}

enum Singleton{
	INSTANCE;
}
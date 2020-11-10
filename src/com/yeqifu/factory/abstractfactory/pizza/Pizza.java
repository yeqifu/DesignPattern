package com.yeqifu.factory.abstractfactory.pizza;

import com.yeqifu.factory.abstractfactory.ingredient.Cheese;
import com.yeqifu.factory.abstractfactory.ingredient.Clams;
import com.yeqifu.factory.abstractfactory.ingredient.Dough;
import com.yeqifu.factory.abstractfactory.ingredient.Pepperoni;
import com.yeqifu.factory.abstractfactory.ingredient.Sauce;
import com.yeqifu.factory.abstractfactory.ingredient.Veggies;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	//抽象的烘烤方法
	public abstract void prepare();
	public void bake(){
		System.out.println("完成烘烤");
	}
	public void cut(){
		System.out.println("完成切割");
	}
	public void box(){
		System.out.println("完成打包");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

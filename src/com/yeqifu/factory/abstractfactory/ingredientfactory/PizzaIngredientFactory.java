package com.yeqifu.factory.abstractfactory.ingredientfactory;

import com.yeqifu.factory.abstractfactory.ingredient.Cheese;
import com.yeqifu.factory.abstractfactory.ingredient.Clams;
import com.yeqifu.factory.abstractfactory.ingredient.Dough;
import com.yeqifu.factory.abstractfactory.ingredient.Pepperoni;
import com.yeqifu.factory.abstractfactory.ingredient.Sauce;
import com.yeqifu.factory.abstractfactory.ingredient.Veggies;
/**
 * 创建所有的原料
 * @author yeqifu
 *
 */
public interface PizzaIngredientFactory {
	//创建面条的抽象方法
	public Dough createDough();
	//创建酱汁的抽象方法
	public Sauce createSauce();
	//创建奶酪的抽象方法
	public Cheese createCheese();
	//创建蔬菜的抽象方法
	public Veggies[] createVeggies();
	//创建意式腊肠的抽象方法
	public Pepperoni createPepperoni();
	//创建蛤蜊的抽象方法
	public Clams createClam();
}

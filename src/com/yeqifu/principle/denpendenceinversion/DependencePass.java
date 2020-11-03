package com.yeqifu.principle.denpendenceinversion;

public class DependencePass {
	public static void main(String[] args) {
		OpenAndClose openAndClose = new OpenAndClose(new Skyworth());
		openAndClose.open();
	}
}
//依赖倒转的三种传递方式
//1.通过接口实现依赖倒转

//2.通过构造器实现依赖倒转
interface IOpenAndClose{
	public void open();
}
interface ITV{
	public void play();
}
class OpenAndClose implements IOpenAndClose{
	public ITV itv;
	public OpenAndClose(ITV itv) {
		this.itv = itv;
	}
	
	@Override
	public void open() {
		this.itv.play();
	}
}
//3.通过setter实现依赖倒转



class Skyworth implements ITV{

	@Override
	public void play() {
		System.out.println("开启");
	}
	
}
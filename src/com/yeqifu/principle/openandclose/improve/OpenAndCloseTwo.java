package com.yeqifu.principle.openandclose.improve;

public class OpenAndCloseTwo {
	public static void main(String[] args) {
		GraphicEditor graphicEditor = new GraphicEditor();
		graphicEditor.drawType(new Circle());
		graphicEditor.drawType(new Rectangle());
		graphicEditor.drawType(new Triangle());
	}
}
//根据图形的种类来画图
class GraphicEditor{
	public void drawType(Shape shape){
		shape.draw();
	}
}
//图形类
abstract class Shape{
	Integer type;
	abstract public void draw();
}
//圆形类
class Circle extends Shape{
	public Circle(){
		super.type = 1;
	}

	@Override
	public void draw() {
		 System.out.println("画的是圆形");
	}
	
}
//矩形类
class Rectangle extends Shape{
	public Rectangle(){
		super.type = 2;
	}

	@Override
	public void draw() {
		System.out.println("画的是矩形");
	}
}
//三角形类
class Triangle extends Shape{
	public Triangle(){
		super.type = 3;
	}

	@Override
	public void draw() {
		System.out.println("画的是三角形");
	}
}
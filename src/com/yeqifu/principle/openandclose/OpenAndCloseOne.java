package com.yeqifu.principle.openandclose;

public class OpenAndCloseOne {
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
		if(shape.type == 1){
			drawCircle(new Circle());
		}else if (shape.type == 2) {
			drawRectangle(new Rectangle());
		}else if (shape.type == 3) {
			drawTriangle(new Triangle());
		}
	}
	public void drawCircle(Shape shape){
		System.out.println("画的是圆形");
	}
	public void drawRectangle(Shape shape){
		System.out.println("画的是矩形");
	}
	public void drawTriangle(Shape shape) {
		System.out.println("画的是三角形");
	}
}
//图形类
class Shape{
	Integer type;
}
//圆形类
class Circle extends Shape{
	public Circle(){
		super.type = 1;
	}
}
//矩形类
class Rectangle extends Shape{
	public Rectangle(){
		super.type = 2;
	}
}
//三角形类
class Triangle extends Shape{
	public Triangle(){
		super.type = 3;
	}
}
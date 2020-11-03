package com.yeqifu.principle.denpendenceinversion;

public class DependenceInversionTwo {
	public static void main(String[] args) {
		Person2 person2 = new Person2();
		person2.receive(new Email2());
		person2.receive(new Phone());
	}
}
interface Message{
	String getInfo();
}

class Email2 implements Message{
	@Override
	public String getInfo() {
		return "Email:这是通过邮件发消息";
	}
}
class Phone implements Message{
	@Override
	public String getInfo() {
		return "Phone:这是通过手机发消息";
	}
}

class Person2{
	public void receive(Message message){
		System.out.println(message.getInfo());
	}
}
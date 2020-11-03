package com.yeqifu.principle.denpendenceinversion;

public class DependenceInversionOne {
	public static void main(String[] args) {
		Person person = new Person();
		person.receive(new Email());
	}
}
class Email{
	public String getInfo(){
		return "Email:hello world";
	}
}
class Person{
	public void receive(Email email){
		String info = email.getInfo();
		System.out.println(info);
	}
}
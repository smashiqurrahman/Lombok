package com.ashiq.lombokexample;

import lombok.Getter;
import lombok.Setter;

/*Here using private variable...Lomobk gives getter,setter*/


public class Student implements Cloneable {

	@Getter
	@Setter
	private int rollno;
	private String name;
	
	
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	
	public static void main(String[] args) {
		
		try {
			Student s1 = new Student();
			s1.rollno=1;
			s1.name="Johnny Bravo";
			Student s2 = (Student)s1.clone();
			System.out.println(s1.rollno+" "+s1.name+" ---Original");
			System.out.println(s2.rollno+" "+s2.name+" ---Cloned");
		} 
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
	} 
	
}

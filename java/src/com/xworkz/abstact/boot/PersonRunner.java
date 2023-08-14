package com.xworkz.abstact.boot;

import com.xworkz.abstact.app.Person;
import com.xworkz.abstact.app.Student;

public class PersonRunner {

	public static void main(String[] args) {
		
		
		Person person=new Student();
		person.celebrateBirthday();
		person.displayAge();
		person.eat();
		person.exercise();
		person.greet();
		person.introduce();
		person.relax();
		person.sleep();
		person.study();
		person.work();

	}

}

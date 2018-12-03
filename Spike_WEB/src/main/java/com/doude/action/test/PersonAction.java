package com.doude.action.test;


import jdk.nashorn.internal.ir.annotations.Reference;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.doude.enity.test.Person;
import com.doude.service.test.PersonService;

@Controller
public class PersonAction {
	
	@Reference
	PersonService personService;
	
	@Test
	public void testPerson(){
		ApplicationContext applcition = new ClassPathXmlApplicationContext("application-context.xml");
		PersonAction personAction = (PersonAction) applcition.getBean("personAction");
		Person person = personAction.personService.querypersonbyid(3);
//		 Person person = new Person();
//		 person.setName("С�װ�");
//		 person.setAddress("�Ϻ�");
//		 person.setAge(15);
//		 person.setBirthday("05-04");
//		 personAction.personService.inserperson(person);
		System.out.println(person);
	}
	
	

}

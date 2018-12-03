package com.doude.service.test;

import com.doude.dao.test.PersonDao;
import com.doude.enity.test.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{
	
	@Autowired
	PersonDao personDao;
	
	public Person querypersonbyid(int id){
		return personDao.querypersonbyid(id);
	}
	
	
	public void inserperson(Person person){
		personDao.inserperson(person);
	}
}

package ONE_TO_ONE_BIDIRECTION.CONTROLLER;

import ONE_TO_ONE_BIDIRECTION.DAO.Dao;
import ONE_TO_ONE_BIDIRECTION.DTO.*;

public class Diver 
{
	public static void main(String[] args) 
	{
		Person person = new Person();
		Pancard pancard = new Pancard();
		
		person.setPersonId(1);
		person.setName("saurabh");
		person.setAddress("PUNE");
		person.setPancard(pancard);
		
		pancard.setPancardId(1001);
		pancard.setName("SG");
		pancard.setAddress("Pune");
		pancard.setPerson(person);
		
		Dao dao = new Dao();
		dao.savePerson(person);
	}

}

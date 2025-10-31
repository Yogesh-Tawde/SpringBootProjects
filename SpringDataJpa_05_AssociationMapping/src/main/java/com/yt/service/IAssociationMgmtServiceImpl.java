package com.yt.service;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yt.entity.Person;
import com.yt.entity.PhoneNumber;
import com.yt.repository.IPersonRepository;
import com.yt.repository.IPhoneNumberRepository;

@Service
public class IAssociationMgmtServiceImpl implements IAssociationMgmtService 
{

	@Autowired
	private IPersonRepository perRepo;
	
	@Autowired
	private IPhoneNumberRepository phoneRepo;	
	
	@Override
	public void saveDataUsingParent() 
	{
		
		//parent object
		Person person = new Person("Yogesh","Hyderabad");
		
		//child object
		PhoneNumber ph1 = new PhoneNumber(7218410068L,"Airtel","Personal");
		PhoneNumber ph2 = new PhoneNumber(8010332050L,"Jio","Home");
		
		//parent to child
		ph1.setPersonInfo(person);
		ph2.setPersonInfo(person);
		
		//child to parent
		Set<PhoneNumber> phoneSet = new HashSet<>();
		phoneSet.add(ph1);
		phoneSet.add(ph2);
		person.setContactDetails(phoneSet);
		
		//save the parent object
		 perRepo.save(person);
		 System.out.println("Person and his associated numbers are saved(parent to child) ");
	     
	}

	@Override
	public void saveDataUsingChild() 
	{
		//parent object
		Person person = new Person("Praveen","Pune");
		
		//child object
		PhoneNumber ph1 = new PhoneNumber();
		PhoneNumber ph2 = new PhoneNumber();
		
		//add parent object to child
		ph1.setPersonInfo(person);
		ph2.setPersonInfo(person);
		
		//add child object to parent
		Set<PhoneNumber> phoneSet = new HashSet<>();
		phoneSet.add(ph1);
		phoneSet.add(ph2);
		person.setContactDetails(phoneSet);
		phoneRepo.save(ph1);
		phoneRepo.save(ph2);
		
		System.out.println("Person and his associated numbers are saved using (child to parent)");
		

	}

	@Override
	public void loadDataUsingParent()
	{
		
		List<Person> listOfPersons = perRepo.findAll();
		listOfPersons.forEach(per->
		{
			System.out.println("Person"+per);
			//get child of each parent
			Set<PhoneNumber> childs = per.getContactDetails();
			
			System.out.println("Child count: "+childs.size());
			childs.forEach(ph->
			{
				System.out.println(ph.getMobileNo());
			});
		
		});

	}

}

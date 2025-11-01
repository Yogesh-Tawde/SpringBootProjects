package com.yt.service;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import com.yt.runners.AssociationTestRunner;
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

/*	@Override
	public String deleteByPerson(int personId) 
	{
		
		Optional<Person> opt = perRepo.findById(personId);
		
		if(opt.isPresent())
		{
			perRepo.delete(opt.get());
			return  "Person and his associated Numbers are deleted";
		}
		return "Invalid Person Id";
	}	
	*/
	
	
	
	
/*
	//delete childs of person
	public String deleteAllPhoneNumbersOfAPerson(int personId)
	{
		
		Optional<Person> opt = perRepo.findById(personId);
		if(opt.isPresent())
		{
			Set<PhoneNumber> childs = opt.get().getContactDetails();
			childs.forEach(ph->
			{
				ph.setPersonInfo(null);
			});
			phoneRepo.deleteAll(childs);
			return "Phone Numbers associated with "+personId+ " deleted Successfully";
		}
		return personId+"Not Found";
	}
*/

           //adding new child to existing parent
	     
	@Override
	public void addNewChildToParentById(int personId) 
	{
		
		//load the parent object
		Optional<Person> opt = perRepo.findById(personId);
		if(opt.isPresent())
		{
			Person person = opt.get();
			//get child of parent
			Set<PhoneNumber> childs = person.getContactDetails();
			
			//create new Child Object
			PhoneNumber ph = new PhoneNumber(7474747474L,"vi","personal");
			//link child to parent
			ph.setPersonInfo(person);
			//add child to existing child of parent
			childs.add(ph);
			perRepo.save(person);
			System.out.println("New Child Added successfully existing child of parent");
		}
		else
		{
			System.out.println(personId+"Id not found for operaion");
		}
		
	}
	

}

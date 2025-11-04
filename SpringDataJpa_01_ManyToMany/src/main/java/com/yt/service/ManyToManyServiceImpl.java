package com.yt.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yt.entity.Faculty;
import com.yt.entity.Student;
import com.yt.repository.IFacultyRepository;


@Service
public class ManyToManyServiceImpl implements IManyToManyAssMappService
{
    
	@Autowired
	private IFacultyRepository facRepo;
	
//	@Autowired
//	private IStudentRepository stdRepo;
	@Override
	public void saveDataUsingParent() 
	{
		//Parent objs
		Faculty faculty1 = new Faculty("Raja","Hyderabad");
		Faculty faculty2 = new Faculty("Rajesj","Pune");
		
		
		//child objs
		Student std1 = new Student("Yogesh","Hyderabad","CBIET");
		Student std2 = new Student("Karan","Hyderabad","GHRIET");
		Student std3 = new Student("Shubham","Hyderabad","DYPU");
		
		//assigning faculties to student
		faculty1.getStudentInfo().add(std1);
		faculty1.getStudentInfo().add(std2);
		faculty1.getStudentInfo().add(std3);
		faculty2.getStudentInfo().add(std1);
		faculty2.getStudentInfo().add(std2);
		
		//assigning student to faculties
		std1.getFacultyInfo().add(faculty1);
		std1.getFacultyInfo().add(faculty2);		
		std2.getFacultyInfo().add(faculty1);
		std2.getFacultyInfo().add(faculty2);		
		std3.getFacultyInfo().add(faculty1);
		
		//save data using parent
		facRepo.save(faculty1);
		facRepo.save(faculty2);
		System.out.println("Faculties and associated students are saved successfully ");
	}
	
	
	
	//loading data using parent
	@Transactional
	@Override
	public void loadDataUsingParent() 
	{
		
		List<Faculty> faculties = facRepo.findAll();
         faculties.stream()
         .forEach(fac->{
        	 System.out.println("Faculty: "+fac);
        	 Set<Student> students = fac.getStudentInfo();
        	 students.forEach(std->
        	 {
        		System.out.println("Students: "+std); 
        	 });
        	 
         });
         
	}

}

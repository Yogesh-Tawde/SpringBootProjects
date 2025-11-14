package com.yt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.yt.model.Employee;


@Controller
public class TestController {

	
	//passing simple values
	@GetMapping("/show")
    public String showReport(Map<String, Object> map) {

        map.put("name", "yogesh");  
        map.put("age", 23);        

        return "display";          
    }
    
	
	//passing collection values
    @GetMapping("/info")
    public String sendData(Map<String,Object> map)
    {
    		map.put("favColors",new String[] {"red","black","white","wine"});
    		map.put("nickNames",List.of("bhaiya","pintya","golu"));
    		map.put("phonenumbers", Set.of(7218410068L,9921493774L,8010332050L));
    		map.put("idDetails", Map.of("aadhar:",121212121L,"pan",48484484));
    	    
    		return "data";
    }
    
    
  //passing model class object
    @GetMapping("/model")
    public String sendInfo(Map<String,Object> map)
    {
    			Employee emp = new Employee();
    		    emp.setId(101);
    		    emp.setName("Yogesh");
    		    emp.setSalary(50000D);
    		    emp.setVaccinated(true);
    			map.put("empInfo", emp);
    			return "report";
    }
    
    
    //passing model class collection
    @GetMapping("/details")
    public String sendEmpInfo(Map<String,Object> map)
    {
    			List<Employee> listOfEmp =List.of(new Employee(1002,"Monika",60000D,true),new Employee(1003,"Kartika",25000D,false),new Employee(1004,"Shantanu",70000D,true));
    			map.put("empList", listOfEmp);		
    			return "show_details";
    }
}

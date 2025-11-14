package com.yt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TestController {

	@GetMapping("/show")
    public String showReport(Map<String, Object> map) {

        map.put("name", "yogesh");  
        map.put("age", 23);        

        return "display";          
    }
    
    @GetMapping("/info")
    public String sendData(Map<String,Object> map)
    {
    		map.put("favColors",new String[] {"red","black","white","wine"});
    		map.put("nickNames",List.of("bhaiya","pintya","golu"));
    		map.put("phonenumbers", Set.of(7218410068L,9921493774L,8010332050L));
    		map.put("idDetails", Map.of("aadhar:",121212121L,"pan",48484484));
    	    
    		return "data";
    }
}

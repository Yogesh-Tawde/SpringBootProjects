package com.yt.controller;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.yt.service.ISeasonFinder;

@Controller
public class SeasonFinderController 
{
	@Autowired
	private ISeasonFinder service;
	
	@GetMapping("/")
	public String showHome()
	{
		return "welcome";
	}
	
	@GetMapping("/season")
	public String showCurrentSeason(Map<String,Object> map)
	{
		String season = service.findSeason();
		map.put("resultMsg", season);
		return "display";
	}

}

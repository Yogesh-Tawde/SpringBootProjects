package com.yt.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class SeasonFinderMgmtService implements ISeasonFinder
{

	@Override
	public String findSeason() 
	{
		LocalDate date = LocalDate.now();
		
		int month = date.getMonthValue();
		if(month>=3 && month<=6)
		{
			return "Summmer season";
		}
		else if(month>=7 && month<=10)
		{
			return "Rainy Season";
		}
		return "Winter Season";
	}

}

package com.yt.beans;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component("company")
@Data
@ConfigurationProperties(prefix="org.payroll")
public class Company 
{
	private String companyName;
    private String currency;
    private double taxRate;
    private boolean overtimeEnabled;

    private List<String> departments;
    private Map<String, Double> salaryBands;

    private HolidayPolicy holidayPolicy;
    private List<Benefit> benefits;
    
    @Data
    public static class HolidayPolicy 
    {
        private int maxLeaves;
        private boolean carryForward;
        private int paidLeaves;
    }
    
    @Data
    public static class Benefit 
    {
        private String name;
        private String description;
        private double amount;
    }
}

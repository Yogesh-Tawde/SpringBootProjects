package com.yt.beans;


import org.springframework.stereotype.Service;

@Service
public class PayRollService
{
	
	 private final Company properties;

	    public PayRollService(Company properties)
	    {
	        this.properties = properties;
	    }
        
	    public void printPayrollPolicy()
	    {
	        System.out.println("=== Company Payroll Policy ===");
	        System.out.println("Company: " + properties.getCompanyName());
	        System.out.println("Currency: " + properties.getCurrency());
	        System.out.println("Tax Rate: " + properties.getTaxRate() + "%");
	        System.out.println("Overtime Enabled: " + properties.isOvertimeEnabled());
	        System.out.println();
	    }
	    
	    public void listBenefits() 
	    {
	        System.out.println("=== Benefits ===");
	        properties.getBenefits().forEach(b ->
	                System.out.println(b.getName() + " → " + b.getAmount() + " (" + b.getDescription() + ")")
	        );
	        System.out.println();
	    }
	    
	    public void showSalaryBandsAndDepartments() 
	    {
	        System.out.println("=== Salary Bands ===");
	        properties.getSalaryBands().forEach((band, amount) ->
	                System.out.println(band + " → " + amount)
	        );

	        System.out.println("\n=== Departments ===");
	        properties.getDepartments().forEach(System.out::println);
	        System.out.println();
	    }
	    
	    public void showHolidayPolicy() {
	        System.out.println("=== Holiday Policy ===");
	        Company.HolidayPolicy hp = properties.getHolidayPolicy();
	        System.out.println("Max Leaves: " + hp.getMaxLeaves());
	        System.out.println("Paid Leaves: " + hp.getPaidLeaves());
	        System.out.println("Carry Forward Allowed: " + hp.isCarryForward());
	        System.out.println();
	    }
}

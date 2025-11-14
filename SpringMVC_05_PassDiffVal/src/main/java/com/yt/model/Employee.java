package com.yt.model;

public class Employee {

    private Integer id;
    public void setId(Integer id) {
		this.id = id;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setSalary(Double salary) {
		this.salary = salary;
	}

	private String name;
    private Double salary;
    private Boolean vaccinated;   // IMPORTANT
    
    
    
    public Employee() {
		super();
		
	}



	public Employee(Integer id, String name, Double salary, Boolean vaccinated) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.vaccinated = vaccinated;
    }
    
    

    public Integer getId() { return id; }
    public String getName() { return name; }
    public Double getSalary() { return salary; }

    public Boolean getVaccinated() {  
        return vaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
}

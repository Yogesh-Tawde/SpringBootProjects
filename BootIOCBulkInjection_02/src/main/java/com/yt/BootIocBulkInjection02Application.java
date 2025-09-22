package com.yt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.yt.beans.PayRollService;

@SpringBootApplication
public class BootIocBulkInjection02Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootIocBulkInjection02Application.class, args);
		PayRollService service = ctx.getBean(PayRollService.class);
		 service.printPayrollPolicy();
		 service.listBenefits();
		 service.showSalaryBandsAndDepartments();
		 service.showHolidayPolicy();
	}

}

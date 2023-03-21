package com.venky;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {
	@Bean("pb")
	public EmployeeBean printProduct() {
		Scanner sc=new Scanner(System.in);
		  System.out.println("Enetr the Address:");
		  int id=sc.nextInt();
		  String name=sc.next();
		AddressBean p=new AddressBean();
		p.setId(id);
		p.setName(name);
		System.out.println("Enter the Employee Deatails:");
		int eid=sc.nextInt();
		String ename=sc.next();
		double salary=sc.nextDouble();
		EmployeeBean e=new EmployeeBean();
		e.setId(eid);
		e.setName(ename);
		e.setSalary(salary);
		e.setAddr(p);
		return e;
	}
}

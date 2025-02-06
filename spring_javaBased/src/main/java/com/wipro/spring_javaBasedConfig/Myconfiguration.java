package com.wipro.spring_javaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.wipro.spring_javaBased.Address;
import com.wipro.spring_javaBased.Student;

@Configuration
public class Myconfiguration {
	
	@Bean
	public Student getStudent(Address address) {
		Student student = new Student();
		student.setId(1);
		student.setName("Rajat Raj");
		student.setAddress(getAddress());
		
		return student;
	}
	
	@Bean
	public Address getAddress() {
		Address address = new Address();
		address.setCity("Hyderabad");
		address.setState("Telangana");
		
		return address;
	}
}

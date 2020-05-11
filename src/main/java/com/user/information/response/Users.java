package com.user.information.response;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "users")
public class Users {

	@Id
	private String id;
	private String name;
	private String address;
	private Double salary;
	private String lastname;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	
	public Users(String name, String address, Double salary,String lastname) {
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.lastname=lastname;
	}

	public Users() {
		// TODO Auto-generated constructor stub
	}
}

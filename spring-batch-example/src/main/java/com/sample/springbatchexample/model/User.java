package com.sample.springbatchexample.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User {

	@Id
	private String id;
	private String name;
	private String dept;
	private String salary;
	private Date time;

	public User(String id, String name, String dept, String salary, Date time) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		this.time = time;
	}

	public User() {
	}

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer("User{");
		sb.append("id=").append(id);
		sb.append(", name='").append(name).append('\'');
		sb.append(", dept='").append(dept).append('\'');
		sb.append(", salary=").append(salary);
		sb.append('}');
		return sb.toString();
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
}

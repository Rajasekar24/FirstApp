package com.variablesoneone;

public class Employee {

	private int id, age;
	private String name, dept, role;
	private float salary;
	private Address add;

	public Employee(int id, int age, String name, String dept, String role,
			float salary, Address add) {
		this.id = id;
		this.age = age;
		this.name = name;
		this.dept = dept;
		this.role = role;
		this.salary = salary;
		this.add = add;
		// System.out.println(add.doorNum);
		// this.setAdd(add);
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setage(int a) {
		age = a;
	}

	public int getAge() {
		return age;
	}

	public void setName(String a) {
		name = a;
	}

	public String getName() {
		return name;
	}

	public void setDept(String a) {
		dept = a;
	}

	public String getDept() {
		return dept;
	}

	public void setRole(String a) {
		role = a;
	}

	public String getRole() {
		return role;
	}

	public void setSalary(float a) {
		salary = a;
	}

	public float getSalary() {
		return salary;
	}

	public void setAddress(Address a) {
		add = a;
	}

	public Address getAddress() {
		return add;
	}

	void showMessage() {
		System.out.println("===Employee Program===");
	}

	void ShowEmployee() {
		System.out.println("ID     :" + id);
		System.out.println("Name   :" + name);
		System.out.println("Dept   :" + dept);
		System.out.println("Age    :" + age);
		System.out.println("Role   :" + role);
		System.out.println("Salary :" + salary);

		System.out.println("=== Address===");
		System.out.println("Door No     : " + add.getDoorNum());
		System.out.println("PinCode     : " + add.getPinCode());
		System.out.println("Street Name : " + add.getStreetName());
		System.out.println("Town Name   : " + add.getTownName());
		System.out.println("District    : " + add.getDistrict());
		System.out.println("State       : " + add.getState());
	}

	// public Address getAdd() {
	// return add;
	// }
	//
	// public void setAdd(Address add) {
	// this.add = add;
	// }

}

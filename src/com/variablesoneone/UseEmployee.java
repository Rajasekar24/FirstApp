package com.variablesoneone;

public class UseEmployee {

	public void show(Employee e) {
		System.out.println("=== USE Employee Program===");
		System.out.println("ID     :" + e.getId());
		System.out.println("Name   :" + e.getName());
		System.out.println("Dept   :" + e.getDept());
		System.out.println("Age    :" + e.getAge());
		System.out.println("Role   :" + e.getRole());
		System.out.println("Salary :" + e.getSalary());
		System.out.println("=== Address===");
		System.out.println("Door No     : " + e.getAddress().getDoorNum());
		System.out.println("PinCode     : " + e.getAddress().getPinCode());
		System.out.println("Street Name : " + e.getAddress().getStreetName());
		System.out.println("Town Name   : " + e.getAddress().getTownName());
		System.out.println("District    : " + e.getAddress().getDistrict());
		System.out.println("State       : " + e.getAddress().getState());
	}

	public static void main(String[] args) {
		Address add = new Address(106, 600091, "street1", "Chennai",
		"district", "TN");

		Employee e1 = new Employee(1, 25, "WWW", "IOT", "Lead", 123.55f, add);

//		e1.setRole("Manager");
		e1.ShowEmployee();
		e1.showMessage();

		UseEmployee u = new UseEmployee();
		u.show(e1);

		System.out.println("===EMPLOYEE 2===");

		Address add1 = new Address(000, 600091, "street1", "Chennai",
				"district", "TN");

		Employee e2 = new Employee(2, 35, "qqqq", "IOT", "Dev", 123.55f, add1);
		e2.ShowEmployee();
		e2.showMessage();

		UseEmployee u2 = new UseEmployee();
		u2.show(e2);
	}

}

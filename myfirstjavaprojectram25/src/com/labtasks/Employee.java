package com.labtasks;

public class Employee {
	
	String employeeName;
	double salary;
	boolean doorPower;
	boolean blocked;
	
	Employee(String employeeName,double salary,boolean doorPower,boolean blocked){
		System.out.println("parameterized consturctor");
		this.employeeName=employeeName;
		this.salary=salary;
		this.doorPower=doorPower;
		this.blocked=blocked;
		
	}
	
		

	void checkAccess() {
		System.out.println("Employeename:"+employeeName);
		System.out.println("Salary:"+salary);
		System.out.println("DoorStep:"+doorPower);
		System.out.println("blocked:"+blocked);
//		System.out.println("Access:"+ (true&(!doorPower)&(!blocked)));
//		System.out.println("Access:"+(!doorPower&&!blocked));
		
	}

	public static void main(String[] args) {
		Employee e1=new Employee("Ram",200000, true, true);
		e1.checkAccess();
	}

}

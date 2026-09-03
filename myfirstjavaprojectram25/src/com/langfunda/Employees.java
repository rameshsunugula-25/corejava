package com.langfunda;

public class Employees {
	String employeename;
	int employeeid;
	String designation;
	String department;
	double salary;
	String remotelocation;
	static String companyname="RAAGVI TECH";
	static String companylocation="KPHB";
	
	
	static {
		System.out.println("WELOCOME TO SUNTECH SOLUTIONS!EMPLOYEE HRMS PORTAL");
	}
	void displayEmployeeDetails() {
		System.out.println("employeename:"+employeename);
		System.out.println("employeeid:"+employeeid);
		System.out.println("designation:"+designation);
		System.out.println("department:"+department);
		System.out.println("salary:"+salary);
		System.out.println("remotelocation:"+remotelocation);
		
	}
	void promoteEmployee() {
		designation="SEO";
		
		System.out.println("PROMOTE TO:"+designation);
	}
void updateSalary() {
	salary=salary+5000;
	System.out.println("increase the emp salary update:"+salary);
}
void updateEployeeLocation() {
	remotelocation="banglore";
	System.out.println("update location:"+remotelocation);
}
	public static void main(String[] args) {
Employees e = new Employees();
e.employeename="RAM";
e.employeeid=2504;
e.designation="digital marketing";
e.department="marketing";
e.salary=100000;
e.remotelocation="hyd";
e.displayEmployeeDetails();
e.promoteEmployee();
e.updateEployeeLocation();
e.updateSalary();
System.out.println("**************************************************");
Employees e1 = new Employees();
e1.employeename="RAj";
e1.employeeid=2504;
e1.designation="business intelligence";
e1.department="data analyst";
e1.salary=200000;
e1.remotelocation="hyd";
e1.displayEmployeeDetails();
e1.updateEployeeLocation();

	}

}

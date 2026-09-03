package com.langfunda;

public class Budtracker {
	int Bugid;
	String applicationname;
	String bugtitle;
	String severity;
	int priority;
	String status;
	String assigneddeveloper;
	int getbugid(){
		return Bugid;
	}
	String getappicationname() {
		 return applicationname;
	}
	String getbugtitle() {
		return bugtitle;
	}
	String getrseverity() {
		return severity;
	}
	int getpriority() {
		return priority;
		
	}
	String getstatus() {
		return status;
		
	}
	String getassigneddeveloper(){
		return assigneddeveloper;
	}
	void assignToDeveloper(int Budid,String applicationname){
		this.Bugid=getbugid();
		this.assigneddeveloper= getassigneddeveloper();
		
		
	}
	void updateStatus(String status){
		this.status= status;
		System.out.println("Updated Status : "+status);
		
	}
	 void dispalyBugsummary(){
		 System.out.println("bugid:"+getbugid());
		 System.out.println("applicationname:"+getappicationname());
		 System.out.println("bugtitle:"+getbugtitle());
		 System.out.println("severity:"+getrseverity());
		 System.out.println("priority:"+getpriority());
		 System.out.println("status:"+getstatus());
		 System.out.println("assigneddeveloper:"+getassigneddeveloper());
	}
	
	public static void main(String[] args) {
Budtracker b1=new Budtracker();

b1.Bugid=101;
b1.applicationname="mytra";
b1.bugtitle="code ";
b1.severity="high";
b1.priority=2;
b1.status="testing";
b1.assigneddeveloper="Raj";
b1.dispalyBugsummary();
b1.assignToDeveloper(b1.Bugid, b1.assigneddeveloper  );
b1.updateStatus("completed");

	}

}

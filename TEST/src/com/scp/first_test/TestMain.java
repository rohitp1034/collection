package com.scp.first_test;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1=new Employee(70);
Employee e2=new Employee(100);
Employee e3=new Employee(30);
Employee e4=new Employee(60);
System.out.println(e1);
System.out.println(e2);
System.out.println(e3);
System.out.println(e4);
	}

}
class Employee{
	int empId;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId) {
		super();
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + "]";
	}
}
package com.example.comparator;

public class Employee {
	private String EmployeeName;
	private int EmployeeId;
	private double EmloyeeSalary;
	private String EmployeeDepartment;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String employeeName, int employeeId, double emloyeeSalary, String employeeDepartment) {
		super();
		EmployeeName = employeeName;
		EmployeeId = employeeId;
		EmloyeeSalary = emloyeeSalary;
		EmployeeDepartment = employeeDepartment;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public double getEmloyeeSalary() {
		return EmloyeeSalary;
	}

	public void setEmloyeeSalary(double emloyeeSalary) {
		EmloyeeSalary = emloyeeSalary;
	}

	public String getEmployeeDepartment() {
		return EmployeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		EmployeeDepartment = employeeDepartment;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeName=" + EmployeeName + ", EmployeeId=" + EmployeeId + ", EmloyeeSalary="
				+ EmloyeeSalary + ", EmployeeDepartment=" + EmployeeDepartment + "]";
	}

	

}

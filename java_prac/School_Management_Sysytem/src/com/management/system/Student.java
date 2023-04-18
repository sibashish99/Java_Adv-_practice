package com.management.system;

public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, int grade, int feesPaid, int feesTotal) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feesPaid = feesPaid;
		this.feesTotal = feesTotal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}

	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", feesPaid=" + feesPaid + ", feesTotal="
				+ feesTotal + "]";
	}

}

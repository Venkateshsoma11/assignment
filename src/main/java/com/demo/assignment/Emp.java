package com.demo.assignment;

import java.util.Scanner;

public abstract class Emp {
	private String name;
	private int age;
	private int salary;
	private String designation;
	public Emp(int salary,String designation)
	{
		this.salary=salary;
		this.designation=designation;
		this.getDetails();
	}
	public void getDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter name : ");
		this.name=sc.next();
		System.out.println(" enter age : ");
		this.age=sc.nextInt();
		
	}
	public void raiseSalary()
	{
		System.out.println("enter amount to raise salary of "+this.name+":");
		int amt=new Scanner(System.in).nextInt();
		this.salary+=amt;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + ", salary=" + salary + ", designation=" + designation + "]";
	}

	
}

package model;
public class Person{
	private String name;
	private double height;
	private double weight;
	
	public Person(String n, double h, double w){
		name = n;
		height = h;
		weight = w;
	}
	
	public double calculateBMI(){
		double bmi;
		bmi = weight/(height*height);
		return bmi;
	}
}
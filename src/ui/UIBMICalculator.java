package ui;
import model.Person;
import java.util.Scanner;
public class UIBMICalculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to BMI Calculator!");
		System.out.print("Please enter your name: ");
		String n = sc.nextLine();
		System.out.print("Please enter your height: ");
		double h = Double.parseDouble(sc.nextLine());
		System.out.print("Please enter your weight: ");
		double w = Double.parseDouble(sc.nextLine());
		
		Person p = new Person(n, h, w);
		double bmi = p.calculateBMI();
		System.out.println("Your BMI is "+bmi);
	}
}
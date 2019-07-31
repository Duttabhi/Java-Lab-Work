//program to take input from the console using the scanner class. Sequentially prompt the user to enter his name, roll no. and cgpa and store these values in String and int 
import java.util.*; 
public class Exp4 {
	public static void main(String args[]) {
		int i = 0;
		Double total = 0.0;

		System.out.println("Enter your Name:");
		Scanner scn = new Scanner(System.in);
		String name = scn.nextLine();
		
		System.out.println("Enter your Rollno:");
		String stringRoll = scn.nextLine();
		int roll = Integer.parseInt(stringRoll);
		
		while(i < 4) {
			System.out.println("Enter your marks in subject " + (i+1) + ": ");
			String stringcgpa = scn.nextLine();
			Double cgpa = Double.parseDouble(stringcgpa);
			total = total + cgpa; 	
			i++;
		}

		total = total / 4.0;
		System.out.println("The record is...\n" + name + " has RollNo. " + roll + " with total CPI of " + total);					
	}
}
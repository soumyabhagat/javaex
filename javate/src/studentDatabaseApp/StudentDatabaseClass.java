package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseClass {

	public static void main(String[] args) {
		// Ask how many student we need to add
		System.out.println("Enter no of student you want to enroll");
		Scanner in = new Scanner(System.in);
		int noOfStudent=in.nextInt();
		
		Student[] students =new Student[noOfStudent];
		
		for(Student i:students) {
			i =new Student();
			i.enroll();
			i.payTuition();
			System.out.println(i.showInfo());
		}
		
		

	}

}

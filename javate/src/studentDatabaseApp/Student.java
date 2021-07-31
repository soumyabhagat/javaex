package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses="";
	private int tuitionBalance;
	private static int costOfCourse =600 ;
	public static int id =1000;
	
	//constructor prompt use to enter students name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first Name: ");
		this.firstName=in.nextLine();
		System.out.println("Enter student last Name: ");
		this.lastName=in.nextLine();
		System.out.println("1 - 1st Year\n2 - f2nd Year\n3 - 3rd Year\n4 - 4th Year\nEnter students class Level: ");
		this.gradeYear=in.nextInt();
		setId();
		
		//System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studentId);		
		}
	//Generate a Id 
	private void setId() {
		id++;
		this.studentId=gradeYear+""+id;
	}
	
	//Enroll in courses 
	public void enroll() {
		// TODO Auto-generated method stub
		do {
			System.out.print("Enter course to enroll (Q to quit)");
			Scanner in =new Scanner(System.in);
			String course= in.nextLine();
			if(!course.equals("Q")) {
				courses =courses +"\n"+course;
				tuitionBalance=tuitionBalance+costOfCourse;
			}
			else {
				break;
			}
		}while(1!=0);
		
		//System.out.println("Enrolled in :"+courses);
		//System.out.println("Tution Balance:"+tuitionBalance);

	}
	//View balance 
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("your payment left :"+tuitionBalance);

	}
	//pay tuition
	public void payTuition() {
		viewBalance();
		System.out.println("You are paying:");
		Scanner in =new Scanner(System.in);
		int payment=in.nextInt();
		tuitionBalance=tuitionBalance-payment;
		System.out.println("Thank you for payment of Rs"+payment);
		viewBalance();
		
	}
	//Show status
	public String showInfo() {
		// TODO Auto-generated method stub
		return"Name: "+firstName+" "+lastName+
				"\nGread Year"+gradeYear+
				"\nCourses Enrolled:"+courses+
				"\nPayment left: "+tuitionBalance;

	}

}

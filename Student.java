package in.acts.cdac;
import java.util.Scanner;

public class Student {
	String name;	
    int rollno;		
	 int std;	
	
	public void aceeptRecord() {
		try( Scanner sc = new Scanner(System.in); ){
			System.out.print("Name	:	");
			this.name = sc.nextLine();
			System.out.print("roll no	:	");
			this.rollno = sc.nextInt();
			System.out.print("std	:	");
			this.std = sc.nextInt();
		}
	}
	
	
	public void printRecord( ){		//Method definition
		System.out.println("Name :" +this.name);
		System.out.println("roll no :" +this.rollno);
		System.out.println("std :" +this.std);
	
	}
	
	public static void main(String[] args) {
		
		
		Student stud= new Student();	
		
		
		stud.aceeptRecord( );	
		
		stud.printRecord( );		
		
	}
}





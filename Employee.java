package in.acts.cdac;

public class Employee {
	public static void show(String S1, int T1) {
		   System.out.println("Name of Employee : " +S1);
		   System.out.println("Employee ID : " +T1);
	   }
	   public static void show(float D1) {
		   System.out.print("Salary of Employee : " +D1);
	   }
		
		public static void main(String[] args) {
			Employee.show("Prathmesh", 140 );
			Employee.show(20.555f);
			
		}


}

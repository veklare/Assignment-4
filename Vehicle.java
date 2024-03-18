package in.acts.cdac;

public class Vehicle {
	public static void print(String m1) {
		System.out.println("Model is :"  +m1); 
	}
	public static void print(String m1 , String m2, int p1) {
		
		System.out.println("Color is :" +m2);
		System.out.println("Price is :" +p1);
	}
	
	public static void main(String[] args) {

		
		Vehicle.print( "S105");
		Vehicle.print( "S105","Black" ,125000);



	}

}

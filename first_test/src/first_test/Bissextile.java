package first_test;

import java.util.Scanner;

public class Bissextile {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
	  
	
	System.out.println("Entrer une année :");
	int a;
	a=sc.nextInt();
	
	System.out.println( ((a % 4 ==0 && a % 100 == 1  ) || a % 400 == 0)? a+" est bissextile ":  a+" n'est pas bissextile ");
 	 
 	
	}
}
	

package Assign1;

import java.util.Scanner;

public class Assignment1 {
 public static void main(String[] args) {
	 Assignservice service = new Assignservice();
	
	
	 try {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("please enter 1st number: ");
	 double n1 = sc.nextDouble();
	 System.out.println("please enter 2nd number: ");
	 double n2= sc.nextDouble();
	 System.out.println("sum of two number: " + service.add(n1, n2));

	 System.out.println("subtraction of two number: " + service.sub(n1, n2));
	
	 System.out.println("division of two number: " + service.div(n1, n2));
	
	 System.out.println("multiplication of two number: " + service.multi(n1, n2));
	
	 System.out.println("power of  number: " + service.powercalc(n1, n2));
	 }
	

	 catch(Exception e) {
		 System.out.println("only number are allowed! ");
		 
	 }		
}
}

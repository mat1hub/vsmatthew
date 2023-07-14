import java.util.Scanner;
public class Except {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		   int c;
		   int a = 10;
		   int b =0;
		   try {
			   System.out.println("please enter any number divides with 10");
			   int q =sc.nextInt();
			   
		   c =a/q;
		   System.out.println("result after divides:" +c);
	   }
	catch(ArithmeticException e) {
		System.out.println("null values are not accepted !");
	}
	catch(Exception i) {
		System.out.println("integer only allowed: ");
	}
	
	
	
	
}
}
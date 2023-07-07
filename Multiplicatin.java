import java.util.Scanner;
public class Multiplicatin {
   public static void main(String[] args) {
	   
   do {
	   try {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("please Enter a number: "); 
	   int number1 = sc.nextInt(); 
	   System.out.println("please enter another number");
	   int number2 = sc.nextInt(); 
	   int mul = number1 * number2;
	   System.out.println("multiplication of two number is :" + mul);
	   }
	   catch(Exception e) {
		   System.out.println("PLEASE ENTER A VALID NUMBER!");
	   }
	   
   }
   while(true);
	   
   }
}
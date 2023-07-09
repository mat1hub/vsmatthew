import java.util.Scanner;
public class assignment1{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double a = sc.nextDouble();
		double b =sc.nextDouble();
		if(a<0||b<0) {
			System.out.println("both are not same");
		}
		else {
			System.out.println("both are same");
			
		}
		sc.close();
	}
}
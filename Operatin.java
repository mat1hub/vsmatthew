import java.util.Scanner; 
public class Operatin { 
 public static void main(String[] args) { 
 Scanner reader = new Scanner(System.in); 
 String r = reader.next();
 byte r1 = Byte.valueOf(r);
 String  s =reader.next();
 byte s1 =Byte.valueOf(s);;
 byte d = (byte)(r1*s1);
 System.out.println("multiplication of two number is: "  + d);
 }
}
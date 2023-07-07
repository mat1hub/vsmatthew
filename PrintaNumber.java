import java.util.Scanner; 
public class PrintaNumber { 
 public static void main(String[] args) { 
 do{
     try{
          Scanner reader = new Scanner(System.in); 
         System.out.print("Enter a number: "); 
        int number = reader.nextInt(); 
         System.out.println("You entered: " + number);
     }
     catch(Exception e){
         System.out.println("please enter a correct number");
     }
 
}
while(true);
}
}
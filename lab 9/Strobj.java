public class Strobj {
public static void main(String[] args) {
	String str = new String("hold");
	String str2 =new String("book");
	System.out.println("length of the string : " + str.length());
	System.out.println("concatenation " + str + str2);
	System.out.println(str2.substring(1,2));
	System.out.println(str2.toUpperCase());
	String n = str.replace("h", "") + " " + str2;
	System.out.println(n);
	//equals method  will compare the values only 
	System.out.println("comaparing of  str & str2 result is : "+str.equals(str2));
	System.out.println(str.compareTo(str2));
}
}
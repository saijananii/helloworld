import java.util.Scanner;

public class AsciiChars {
public static void printNumbers() {
	for(int i=48; i< 58;i++) {
	 String n = Character.toString((char)i);
		System.out.println(n);
	}
}
public static void printLowerCase() {
	for(int i= 97;i < 123;i++) {
		String l = Character.toString((char)i);
		System.out.println(l);
	}
	}
public static void printUpperCase() {
	for(int i= 65;i < 90;i++) {
		String u = Character.toString((char)i);
		System.out.println(u);
	}
	}
public static void main(String[]args) {
	printNumbers();
	printUpperCase();
	printLowerCase();
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a name: ");     // type a word and hit enter
	String custName = scanner.next();
	System.out.println("Hello,"+ custName);
	System.out.println("Would you like to continue:(y or N) ");
	String keepGoing = scanner.nextLine();
			if (keepGoing.equals("y")) {
	
		}else {
			return;
		
}


}
}

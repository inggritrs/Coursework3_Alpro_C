import java.util.Scanner;

public class ProcessAName5026211012{
	
	public static void main (String[] args){
	Scanner inputName = new Scanner (System.in);
	System.out.println("Type your name:");
	String name = inputName.nextLine();
	int spaceIdx = name.indexOf(' ');
	String firstName = name.substring(0,spaceIdx);
	System.out.println(firstName.length());
	String lastName = name.substring(spaceIdx+1);
	System.out.println(lastName + ", " + firstName.charAt(0) + ".");
	}
}
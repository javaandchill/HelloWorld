package introtojava;

import java.util.Scanner;
public class ASCIIExample{
  public static void main(String[] args) {
  	//Create an instance of scanner class
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your input: ");
    String strValue = scanner.nextLine(); //JonisHassan
    int strLength = strValue.length(); //11
    // 0 => 0 < 11 => JonisHassan.charAt(0) => J => 74
    // Increment index by 1
    // 1 => 1 < 11 => JonisHassan.charAt(1) => O => 111
    // Increment index by 1
    // 2 => 2 < 11 => JonisHassan.charAt(2) => N => 110
    //
    for(int index = 0; index < strLength; index++) {
   	 char charValue = strValue.charAt(index);
   	 int asciiValue = charValue;
   	 System.out.println("ASCII value of " + charValue + " is: " + asciiValue);
    }
  }
}
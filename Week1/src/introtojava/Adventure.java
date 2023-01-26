package introtojava;
import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    System.out.println("\n\n You are on an island surrounded by water.\n There is a path to the woods to the north, the sea to the south, and a beach shack to the east. \n Which way do you want to go (n,e,s,w)?");
	    String command = scan.nextLine();
	    
	    if (command.equals("n")) 
	    {
	        System.out.println("You enter the forest and hear some rustling. \nThere may be tigers here or maybe it's just monkeys.");
	    }   
	    else if (command.equals("e"))
	        System.out.println("You have reached the beach shack! Be careful, there is a creature inside the shack that doesn't take kindly the visitors");
	    
	    else if (command.equals("s"));
	    	
	    	System.out.println("You have arrived at the salty sea! The water is warm and the fish are friendly, but watch out for the sharks!");
	    	
	    else if (command.equals("w"))
	    	System.out.println("You can't go that direction, a tribe native to the island enjoys the flesh of unwanted guests. ");
	    		    		        	
	    }
		{
		else
	    	System.out.println("End of adventure!");
		}
	  }

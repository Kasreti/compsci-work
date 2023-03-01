import java.util.Arrays;
import java.util.Scanner;

public class hangman {
	public static String[] arrayappend(String oldarray[], String newstring){
		int length = oldarray.length;
		String newarray[] = new String[length + 1];
		for (int i=0; i<length; i++){
			newarray[i] = oldarray[i];
		}
		newarray[length] = newstring;
		return newarray;
	}
	
	public static void main (String[] args) {
		System.out.println("LETTERS WOOOOOOOOOOOOOOOOOO");
		String[] onetofive = {"a"};
		Scanner arraylength = new Scanner(System.in);
		System.out.print("How many values would you like to enter? ");
		int length = arraylength.nextInt();
		for (int c = 1; c<=length; c++){
			Scanner newchar = new Scanner(System.in);
			System.out.print("Enter the letter to append: ");
			String input = newchar.nextLine();
			if(c==1){
				onetofive[0] = input;
			} else{
				onetofive = arrayappend(onetofive, input);
			}
		}
		System.out.println("The new array is " + Arrays.toString(onetofive) + ".");
	}
}


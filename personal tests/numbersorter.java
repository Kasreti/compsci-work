import java.util.Arrays;
import java.util.Scanner;

public class numbersorter {
	public static int[] arrayappend(int oldarray[], int newno){
		int length = oldarray.length;
		int newarray[] = new int[length + 1];
		for (int i=0; i<length; i++){
			newarray[i] = oldarray[i];
		}
		newarray[length] = newno;
		return newarray;
	}
	
	public static int[] bubblesort(int array[]){
		int length = array.length;
		int temp = 0;
		for (int i = 0; i<length; i++){
			for (int j = 1; j < (length-i); j++){
				if(array[j-1]>array[j]){
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}	
	
	public static void main (String[] args) {
		System.out.println("NUMBER SORTER WOOOOOOOOOOOOOOOOOO");
		int[] onetofive = {0};
		Scanner arraylength = new Scanner(System.in);
		System.out.print("How many values would you like to enter? ");
		int length = arraylength.nextInt();
		for (int c = 1; c<=length; c++){
			Scanner newnumber = new Scanner(System.in);
			System.out.print("Enter the number to append: ");
			int input = newnumber.nextInt();
			if(c==1){
				onetofive[0] = input;
			} else{
				onetofive = arrayappend(onetofive, input);
			}
		}
		bubblesort(onetofive);
		System.out.println("The new array is " + Arrays.toString(onetofive) + ".");
	}
}


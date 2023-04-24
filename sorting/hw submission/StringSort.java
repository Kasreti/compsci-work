/*
 * Sorting algos in Java
 *
 */


public class StringSort
{
	public static void printArray(String[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static String[] clone(String[] a)
	{
		String[] x = new String[a.length];
		for(int i = 0; i < a.length; i++)
		{	x[i] = a[i];
		}
		return x;
	}
	
	public static void bubbleSort(String[] a)
	{
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length - 1 - i; j++){
				if(check(a[j],a[j+1])){
					String temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return;
	}
	
	public static boolean check(String a, String b)
	{
		int until = a.length();
		if(a.length() > b.length()){
			until = b.length();
		}
		for(int i = 0; i < until; i++){
			if(a.charAt(i) > b.charAt(i)){
				return true;
			} else if (a.charAt(i) < b.charAt(i)){
				return false;
			}
		}
		return false;
	}
	
	public static boolean invcheck(String a, String b)
	{
		int until = a.length();
		if(a.length() > b.length()){
			until = b.length();
		}
		for(int i = 0; i < until; i++){
			if(a.charAt(i) < b.charAt(i)){
				return true;
			} else if (a.charAt(i) > b.charAt(i)){
				return false;
			}
		}
		return false;
	}
	
	//this is used to show all the steps when i'm testing if the algo works. ignore
	public static boolean check2(String a, String b)
	{
		int until = a.length();
		if(a.length() > b.length()){
			until = b.length();
		}
		System.out.println("\n\nTesting for " + a + " vs " + b);
		for(int i = 0; i < until; i++){
			boolean big = a.charAt(i) > b.charAt(i);
			System.out.println("is " + a.charAt(i) + " > " + b.charAt(i) + ": " + big);
			if(big){
				return true;
			} else if (a.charAt(i) < b.charAt(i)){
				return false;
			}
			System.out.println("no! continuing...");
		}
		return false;
	}


	public static void insertionSort(String[] a)
	{
		for(int i = 1; i < a.length; i++){
			for(int j = i; j > 0; j--){
				if(invcheck(a[j],a[j-1])){
					String temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		return;
	}

	public static void main (String[] args)
	{
		String[] original = { "joseph", "identified", "alex", "chris", "identification", "carmen", "rent", "identify", "identification"};
		String[] test = {"lemon", "rabbit", "carrot", "igloo", "watermelon", "violet", "hat", "queen", "umbrella", "zebra", "orange", "dog", "apple", "frog", "tiger", "banana", "pear", "jacket", "xylophone", "elephant", "kangaroo", "grape", "napkin", "snake", "yacht", "monkey"};
		String[] bubble = clone(original);
		String[] insertion = clone(original);
		String[] bubble2 = clone(test);
		String[] insertion2 = clone(test);
		System.out.println("\nOriginal array:");
		printArray(original);
		System.out.println("Bubble sort:");
		bubbleSort(bubble);
		printArray(bubble);
		System.out.println("Insertion sort:");
		insertionSort(insertion);
		printArray(insertion);
		System.out.println("\nArray 2:");
		printArray(test);
		System.out.println("Bubble sort:");
		bubbleSort(bubble2);
		printArray(bubble2);
		System.out.println("Insertion sort:");
		insertionSort(insertion2);
		printArray(insertion2);
	}
}

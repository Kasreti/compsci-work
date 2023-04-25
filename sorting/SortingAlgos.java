/*
 * Sorting algos in Java
 *
 */


public class SortingAlgos
{
	public static void printArray(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.printf( "[%d]%-2d  ",i , a[i]);
		}
		System.out.println();
	}

	public static int[] clone(int[] a)
	{
		int[] x = new int[a.length];
		for(int i = 0; i < a.length; i++)
		{	x[i] = a[i];
		}
		return x;
	}

	public static void selectionSortPseudo(int[] a)
	{
		int currentIndex = 0;
		while( currentIndex < a.length - 1 )
		{
			int smallestIndex = currentIndex;
			int smallestValue = a[smallestIndex];
			int checkIndex	  = smallestIndex + 1;
			while( checkIndex < a.length )
			{
				if(a[checkIndex] < smallestValue)
				{
					smallestIndex = checkIndex;
					smallestValue = a[checkIndex];
				}
				checkIndex++;
			}
			a[smallestIndex] = a[currentIndex];
			a[currentIndex] = smallestValue;
			currentIndex++;
			System.out.print("\t");
			printArray(a);
		}
	}
	
	public static void selectionSort(int[] a)
	{
		for(int i=0; i<a.length; i++){
			int min = a[i];
			for(int j=i+1; j<a.length; j++){
				if(a[j] < a[i]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void bubbleSortPsuedo(int[] a)
	{
		int I = a.length;
		boolean ELEMENTS_SWAPPED = true;
		while(ELEMENTS_SWAPPED){
			int J = 0;
			ELEMENTS_SWAPPED = false;
			while(J < I-1){
				if(a[J] > a[J+1]){
					int temp = a[J];
					a[J] = a[J+1];
					a[J+1] = temp;
					ELEMENTS_SWAPPED = true;
				}
				J = J + 1;
			}
			I = I - 1;
		}
		return;
	}
	
	public static void bubbleSort(int[] a)
	{
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a.length - 1 - i; j++){
				if(a[j] > a[j + 1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return;
	}

	public static void insertionSort(int[] a)
	{
		for(int i = 1; i < a.length; i++){
			for(int j = i; j > 0; j--){
				if(a[j] < a[j-1]){
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		return;
	}

	public static void main (String[] args)
	{
		int[] original = { 12, 7, 14, 9, 5, 3 };
		int[] selection = clone(original);
		int[] bubble = clone(original);
		int[] insert = clone(original);
		System.out.println("\nOriginal array:");
		printArray(original);
		System.out.println("\nSelection sort:");
		selectionSort(selection);
		System.out.println("\nFinal result:");
		printArray(selection);
		System.out.println("\nBubble sort:");
		bubbleSort(bubble);
		System.out.println("\nFinal result:");
		printArray(bubble);
		System.out.println("\nInsertion sort:");
		insertionSort(insert);
		System.out.println("\nFinal result:");
		printArray(insert);
	}
}

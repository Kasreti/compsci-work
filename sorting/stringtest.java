/*
 * Sorting algos in Java
 *
 */


public class stringtest
{
	public static void printArray(char[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main (String[] args)
	{
		String[] original = { "chris", "alex" };
		System.out.println(original[0].charAt(0) > original[1].charAt(0));
	}
}

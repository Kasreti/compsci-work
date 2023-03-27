import java.util.Arrays;

public class ArraysStats
{
	// List all elements in array
	public static void list(double[] array)
	{
		// your code goes here
	}
	//------------------------------------------------------------------
	
	// Minimum:
	public static double min(double[] array)
	{
		double min = array[0];
		for(int i=1; i<array.length; i++){
			if(array[i]<min){
				min = array[i];
			}
		}
		return min;
	}
	//------------------------------------------------------------------

	// Maximum:
	public static double max(double[] array)
	{
		double max = array[0];
		for(int i=1; i<array.length; i++){
			if(array[i]>max){
				max = array[i];
			}
		}
		return max;
	}
	//------------------------------------------------------------------

	// Range
	public static double range(double[] array)
	{
		return max(array)-min(array);
	}
	//------------------------------------------------------------------
		
	public static double mean(double[] array)
	{
		double sum = 0;
		for(int i=0; i<array.length; i++){
			sum = sum + array[i];
		}
		return sum/array.length;
	}

	// Mode:
	public static double mode(double array[])
	{
		int max=0;
		double who=0;
		int count=0;
		int maxcount = 0;
		for(int i=0; i<array.length; i++){
			count = 0;
			for(int j=0; j<array.length; j++){
				if(array[i] == array[j]){
					count++;
				}
				if(count>maxcount){
					maxcount = count;
					who = array[i];
				}
			}
		}
		return who;
	}
	//------------------------------------------------------------------

	public static double[] trim(double[] a){
		double[] b = new double[a.length-2];
		for(int i=0; i<b.length; i++){
			b[i] = a[i+1];
		}
		return b;
	}
		
	// For the median to work, the array double[] MUST BE SORTED
	public static double median(double[] array)
	{
		Arrays.sort(array);	// sorts data set to make it easier for you to
							// find the median
		// your code goes here
		if((array.length%2)!=0){
			do{
				array = trim(array);
			}while (array.length != 1);
			return array[0];
		} else{
			do{
				array = trim(array);
			}while (array.length != 2);
			return mean(array);
		}
	}
	//------------------------------------------------------------------

	public static void main (String args[])
	{
		System.out.println();
		System.out.println("*** Statistical Analysis of Data Set ***\n");
		
		double data[] = { 29, 39, 40, 56, 3, 5, 14, 21, 23, 7, 12, 13, 23, 23, 23  };
		
		System.out.println(data.length + " measurements");
		System.out.println( "Minimum: " + min(data) );
		System.out.println( "Maximum: " + max(data) );
		System.out.println( "Range  : " + range(data) );
		System.out.println( "Mean   : " + mean(data) );
		System.out.println( "Median : " + median(data) );
		System.out.println( "Mode   : " + mode(data) );
		System.out.println();
		
	}
}

/********************
 * EXPECTED RESULTS *
 ********************
 
*** Statistical Analysis of Data Set ***

29.0  39.0  40.0  56.0  3.0  5.0  14.0  21.0  23.0  7.0  12.0  13.0  23.0  23.0  23.0  

Minimum: 3.0
Maximum: 56.0
Range  : 53.0
Mean   : 22.066666666666666
Median : 23.0
Mode   : 23.0

*/

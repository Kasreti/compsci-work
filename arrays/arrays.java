public class arrays {
	
	public static void main (String[] args) {
		int array[] = {13, 22, 4, 42};
		int max = array[0];
		int min = array[0];
		double sum = array[0];
		for(int k=1; k<array.length; k++){
			if(array[k]>max){
				max = array[k];
			} else if(array[k] < min){
				min = array[k];
			}
			sum = sum + array[k];
		}
		sum = sum/array.length;
		System.out.println("average :" + sum);
		System.out.println("max/min :" + max + "/" + min);
	}
}


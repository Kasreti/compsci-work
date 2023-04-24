public class searches {
	
	public static void linearsearch(int[] a, int val){
		for(int i = 0; i < a.length; i++){
			if(a[i] == val){
				System.out.println(val + " was found at position " + i);
				return;
			}
		}
		System.out.println("Not found!");
		return;
	}
	
	public static void binarysearch(int[] a, int val){
		int low = 0;
		int high = a.length-1;
		int mid;
		do{
			mid = (low+high)/2;
			if(val > a[mid]){
				low = mid + 1;
			} else if(val < a[mid]){
				high = mid - 1;
			} else if(val == a[mid]){
				System.out.println(val + " was found at position " + mid);
				return;
			}
		} while(high != low);
		System.out.println("Not found!");
		return;
	}
	
	public static void main (String[] args) {
		int[] values = {2, 5, 8, 12, 16, 23, 28, 56, 72, 91};
		linearsearch(values, 23);
		linearsearch(values, 10);
		binarysearch(values, 23);
		binarysearch(values, 10);
	}
}


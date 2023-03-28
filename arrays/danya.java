public class danya {
	public static void printArray(String[] a){
		for(int i=0; i<a.length-1; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println(a[a.length-1]);
		return;
	}
	
	public static boolean isEmpty(String[] a){
		int count = 0;
		for(int i=0; i<a.length; i++){
			if(a[i] == null){
				count++;
			}
		}
		return (count==a.length);
	}
	
	public static String[] clonearray(String[] a){
		String[] copy = new String[a.length];
		for(int i=0; i<a.length; i++){
			copy[i] = a[i];
		}
		return copy;
	}
	
	public static String[] append(String[] a, String b){
		String[] copy = new String[a.length + 1];
		for(int i=0; i<a.length; i++){
			copy[i] = a[i];
		}
		copy[a.length] = b;
		return copy;
	}
	
	public static void exist(String[] a, String b){
		for(int i=0; i<a.length; i++){
			if(a[i] == b){
				System.out.println("you can find " + b + " at a[" + i + "]!");
				return;
			}
		}
		System.out.println(b + " doesnt exist lmfao what");
		return;
	}
	
	public static int returnindex(String[] a, String b){
		for(int i=0; i<a.length; i++){
			if(a[i] == b){
				return i;
			}
		}
		return -1;
	}
		
	public static String[] delete(String[] a, int b){
		String[] copy = new String[a.length-1];
		for(int i=0; i<b; i++){
			copy[i] = a[i];
		}
		for(int i=b; i<copy.length; i++){
			copy[i] = a[i+1];
		}
		return copy;
	}
	
	public static String[] insert(String[] a, int b, String c){
		String[] copy = new String[a.length+1];
		for(int i=0; i<b; i++){
			copy[i] = a[i];
		}
		copy[b] = c;
		for(int i=b; i<a.length; i++){
			copy[i+1] = a[i];
		}
		return copy;
	}
	
	public static String[] nameremove(String[] a, String b){
		String[] copy = new String[a.length-1];
		int index = returnindex(a,b);
		if(index == -1){
			IBIO.output("doesnt exist!!1 try agian");
			return copy;
		}
		for(int i=0; i<index; i++){
			copy[i] = a[i];
		}
		for(int i=index; i<copy.length; i++){
			copy[i] = a[i+1];
		}
		return copy;
	}
	
	public static String[] replace(String[] a, int b, String c){
		a[b] = c;
		return a;
	}
	
	public static String[] swap(String[] a, int b, int c){
		String temp = "";
		temp = a[b];
		a[b] = a[c];
		a[c] = temp;
		return a;
	}
	
	public static void main (String[] args) {
		String[] original = {"mike", "jake"};
		printArray(original);
		exist(original, "vaayu");
		original = append(original, "vaayu");
		System.out.println("\nHere's the new array:");
		printArray(original);
		System.out.println("\nIs it empty? " + isEmpty(original));
		exist(original, "vaayu");
		System.out.println("\nLet's replace Jake. ");
		original = replace(original, 1, "sam");
		printArray(original);
		System.out.println("\nLet's insert Arman between Sam and Vaayu. ");
		original = insert(original, 2, "arman");
		printArray(original);
		System.out.println("\nLet's swap Mike and Vaayu. ");
		original = swap(original, 0, 3);
		printArray(original);
		System.out.println("\nLet's delete Sam. ");
		original = nameremove(original, "sam");
		printArray(original);
	}
}


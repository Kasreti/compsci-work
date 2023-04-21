public class vaayu {
	private static final int maxsize = 4; //max number of values
	private static int tail = 0; //what is the last value?
	
	public static void printArray(String[] a){
		for(int i=0; i<a.length-1; i++){
			System.out.print(a[i] + " ");
		}
		System.out.print(a[a.length-1] + " (tail is at ");
		if(isFull()){
			System.out.print(maxsize + " -- Array is full!)\n");
		} else if(tail!=0){
			System.out.print(tail +", in front of " + a[tail-1] + ")\n");
		} else{
			System.out.print(tail +", in front of nothing.)\n");
		}
		return;
	}
	
	public static boolean isEmpty(String[] a){
		return (tail==0);
	}
	
	public static boolean isFull(){
		return (tail==maxsize);
	}
	
	public static String[] clonearray(String[] a){
		String[] copy = new String[maxsize];
		for(int i=0; i<maxsize; i++){
			copy[i] = a[i];
		}
		return copy;
	}
	
	public static String[] append(String[] a, String b){
		if(isFull()){
			System.out.println("Array is full. Can't do that!");
			return a;
		} else{
			a[tail] = b;
			tail++;
			return a;
		}
	}
	
	public static void where(String[] a, String b){
		for(int i=0; i<maxsize; i++){
			if(b.equalsIgnoreCase(a[i])){ //NOTE! b.equalsIgnorecase(a[i]), not a[i].equalsIgnoreCase(b)!
				System.out.println("You can find " + b + " at a[" + i + "]!");
				return;
			}
		}
		System.out.println(b + " isn't in the array!");
		return;
	}
	
	public static int returnindex(String[] a, String b){
		for(int i=0; i<maxsize; i++){
			if(a[i].equalsIgnoreCase(b)){
				return i;
			}
		}
		return -1;
	}
	
	public static String[] deleteshift(String[] a, int b){
		for(int i=b; i<maxsize; i++){
			a[i] = a[i+1];
		}
		tail--;
		return a;
	}
	
	public static String[] insert(String[] a, int b, String c){
		if(isFull()){
			System.out.println("Array is full. Can't do that!");
			return a;
		} else{
			for(int i=b; i<maxsize-1; i++){
				a[i+1] = a[i];
			}
			a[b] = c;
			tail++;
			return a;
		}
	}
	
	public static String[] nameremove(String[] a, String b){
		int index = returnindex(a,b);
		if(index == -1){
			IBIO.output("Unable to find " + b);
			return a;
		}
		for(int i=index; i<maxsize-1; i++){
			a[i] = a[i+1];
		}
		tail--;
		a[tail] = null;
		return a;
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
	
		//initialization
		String[] original = new String[maxsize];
		printArray(original);
		append(original, "mike");
		printArray(original);
		append(original, "jake");
		printArray(original);
		System.out.println("\n^^^ This is our starting array.\n");
		
		//begins
		where(original, "vaayu");
		original = append(original, "vaayu");
		System.out.println("\nLet's append Vaayu:");
		printArray(original);
		where(original, "vaayu");
		System.out.println("\nLet's replace Jake with Sam.");
		original = replace(original, 1, "sam");
		printArray(original);
		System.out.println("\nLet's insert Arman between Sam and Vaayu. ");
		original = insert(original, 2, "arman");
		printArray(original);
		System.out.println("\nLet's swap Mike and Vaayu. ");
		original = swap(original, 0, 3);
		printArray(original);
		System.out.println("\nLet's try appending Keshav. ");
		original = append(original, "keshav");
		printArray(original);
		System.out.println("\nLet's delete Sam. ");
		original = nameremove(original, "sam");
		printArray(original);
	}
}



public class array_stack
{
	Node top = null;
	
	public static boolean isEmpty(int[] a)
	{
		if(a.length == 1)
			return true;
		else
			return false;
		// alternatively, return top==null;
	}
	
	// public void push(Node newNode) OR
	public static int[] push(int a[], int d)
	{
		int b[] = new int[a.length+1];
		for(int i=0; i<a.length; i++){
			b[i] = a[i];
		}
		b[b.length-1] = d;
		return b;
	}
	
	public static int[] popadjust(int a[])
	{
		int b[] = new int[a.length-1];
		for(int i=0; i<b.length; i++){
			b[i] = a[i];
		}
		return b;
	}
	
	public static int pop(int a[])
	{
		if(!isEmpty(a))
		{
			return a[a.length-1];
		} else {
			System.out.println("Stack is empty.");
			return 0;
		}
	}
	
	public static void printStack(int[] a)
	{
		System.out.print("top -> ");
		for(int i=0; i<a.length-1; i++){
			System.out.print(a[i] + " -> ");
		}
		System.out.println(a[a.length-1]);
		return;
	}
	
	public static void main (String[] args){
		int[] numbers = { 9,7,5,3,1 };
		printStack(numbers);
		int[] stack = {0};
		System.out.println("Populating the stack with the array (pushing)");
		for(int i=0; i<numbers.length; i++){
			stack = push(stack, numbers[i]);
			printStack(stack);
		}
		System.out.println("\nRe-populating the array with the stack (popping)");
		int i = 0;
		while(!isEmpty(stack)){numbers[i] = pop(stack);
			stack = popadjust(stack);
			printStack(stack);
			i++;
		}
	}
}


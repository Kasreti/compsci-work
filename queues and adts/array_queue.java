//
// ADT: queue skeleton -- FIFO
// enqueue, dequeue, isEmpty, printQueue
//
public class array_queue
{
	public static boolean isEmpty(int a[])
	{
		if(a.length == 1){
			return true; 
		} else{
			return false;
		}
	}
	
	public static int[] enQueue(int a[], int d)
	{
		if(a[0] == 0){
			a[0] = d;
			return a;
		} else {
			int b[] = new int[a.length+1];
			for(int i=0; i<a.length; i++){
				b[i] = a[i];
			}
			b[b.length-1] = d;
			return b;
		}	
	}
	
	public static int deQueue(int a[])
	{	
		if(!isEmpty(a)){
			return a[0];
		} else {
			System.out.println("queue is empty . you get 0");
			return 0;
		}
	}
	
	public static int[] deQueueAdjust(int a[])
	{	
		if(!isEmpty(a)){
			int b[] = new int[a.length-1];
			for(int i=0; i<b.length; i++){
				b[i] = a[i+1];
			}
			return b;
		} else {
			return a;
		}
	}
	
	public static void printQueue(int a[])
	{	
		if(!isEmpty(a)){
			System.out.print("Head <- ");
			for(int i=0; i<a.length-1; i++){
				System.out.print(a[i] + " <- ");
			}
			System.out.println("Tail");
		} else{
			System.out.println("Queue is empty.");
		}
		return;
	}
	
	public static void printArray(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.println( i + " : " + a[i] );
		}
	}
	
	public static void main (String[] args)
	{
		// input integers until 0 is input
		// display the queue as it gets populated
		int input;
		int queue[] = new int[] {0};
		int queueSize = 0;
		System.out.println("Creating a queue:");
		do
		{
			input = IBIO.inputInt("enter an integer (0 ends): ");
			if( input != 0 )
			{	queueSize++;
				queue = enQueue(queue,input);
				printQueue(queue);
			}
		} while( input != 0 );
		
		// Is there a better way of keeping track and getting the size of the queue?
		System.out.println("\nCopying the queue into an array:");
		int[] array = new int[queueSize];
		for(int i = 0; i < queueSize; i++)
		{	array[i] = deQueue(queue);
			queue = deQueueAdjust(queue);
			printQueue(queue);
			printArray(array);
		}
		
		
	}
	
}

	


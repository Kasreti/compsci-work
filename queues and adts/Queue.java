//
// ADT: queue skeleton -- FIFO
// enqueue, dequeue, isEmpty, printQueue
//
public class Queue
{
	Node head;
	Node tail;
	
	public boolean isEmpty()
	{
		if(head == null){
			return true; 
		} else{
			return false;
		}
	}
	
	public void enQueue(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		if(isEmpty()){
			head = newNode; //only one node exists, so it's both the head and tail
			tail = newNode;
		} else{
			tail.next = newNode; //the node after tail is now newNode
			tail = newNode; //the tail has now shifted to newNode
		}
		return;		
	}
	
	public int deQueue()
	{	
		if(!isEmpty()){
			int d = head.data; //get the data of head before head shifts
			head = head.next; //head now shifts down (original head lost)
			return d;
		} else {
			System.out.println("queue is empty . you get 0");
			return 0;
		}
	}
	
	public void printQueue()
	{	
		if(!isEmpty()){
			System.out.print("Head <- ");
			Node temp = head; //temporary var, similar to head/tail to point to nodes
			do{
				System.out.print(temp.data + " <- ");
				temp = temp.next;
			} while (temp != tail.next);
			System.out.println("Tail");
		} else{
			System.out.println("Queue is empty.");
		}
		return;
	}
}

	


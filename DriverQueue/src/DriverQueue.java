import java.util.Scanner;

public class DriverQueue {

	public static void main(String[] args) {
		Listing dummy = new Listing("a","b","2");
        Scanner io = new Scanner(System.in);
        Queue queue = new Queue();
        
        /* underflow */
        System.out.println("input queue size");
        int size = io.nextInt();
        queue = new Queue(size);
        
        System.out.println("\nfilling queue.");
        queue.fillQueue();
        
        System.out.println("emptying queue..");
        queue.emptyQueue();
        
        System.out.println("dequeing the queue to check empty queue\n.\n..\n...");
        queue.underflowTest();
        
        System.out.println("\n...now re-creating queue, pushing information into node 0 and repeating an underflow test...\n.\n..\n...");
        queue = new Queue(size);
        queue.enque(dummy);
        queue.underflowTest();
        
       /*overflow*/
       System.out.println("\n***Overflow test***\n");
       
       System.out.println("input queue size");
       size = io.nextInt();
       
       queue = new Queue(size);
       
       System.out.println("\nfilling up queue\n.\n..\n...");
       queue.fillQueue();
       
       System.out.println("\nperforming an overflow test by pushing additional information...\n.\n..");
       queue.overflowTest(dummy);
       
       /*peek*/
       System.out.println("\n***peek test***\n");
       queue = new Queue(5);
       queue.fillQueue();
       System.out.println("\nqueue filled\n.\n..\n...");
       System.out.println("\npeeking by performing a deque that doesnt delete the node\n.\n..");
       queue.peek();
	}

}

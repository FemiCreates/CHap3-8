import java.util.Scanner;

public class DriverStack {

	public static void main(String[] args) {
		  Listing dummy = new Listing("a","b","2");
	        Scanner io = new Scanner(System.in);
	        Stack stack = new Stack();
	        
	        /* underflow */
	        System.out.println("input stack size");
	        int size = io.nextInt();
	        stack = new Stack(size);
	        
	        System.out.println("\nfilling stack.");
	        stack.fillStack();
	        
	        System.out.println("emptying stack..");
	        stack.emptyStack();
	        
	        System.out.println("popping the stack to check empty stack\n.\n..\n...");
	        stack.underflowTest();
	        
	        System.out.println("\n...now re-creating stack, pushing information into node 0 and repeating an underflow test...\n.\n..\n...");
	        stack = new Stack(size);
	        stack.push(dummy);
	        stack.underflowTest();
	        
	       /*overflow*/
	       System.out.println("\n***Overflow test***\n");
	       
	       System.out.println("input stack size");
	       size = io.nextInt();
	       
	       stack = new Stack(size);
	       
	       System.out.println("\nfilling up stack\n.\n..\n...");
	       stack.fillStack();
	       
	       System.out.println("\nperforming an overflow test by pushing additional information...\n.\n..");
	       stack.overflowTest(dummy);
	       
	       /*peek*/
	       System.out.println("\n***peek test***\n");
	       stack = new Stack(5);
	       stack.fillStack();
	       System.out.println("\nStack filled\n.\n..\n...");
	       System.out.println("\npeeking by performing a pop that doesnt delete the node\n.\n..");
	       stack.peek();
	       

	}

}

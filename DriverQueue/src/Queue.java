
public class Queue {
	private Listing[] data;
	   private int size;
	   private int numOfNodes;
	   private int front;
	   private int rear;
	   
	   public Queue()
	  {  size = 100;
	      numOfNodes = 0;
	      front = 0;
	      rear = 0;
	      data = new Listing[100];
	   }
	   
	    public void emptyQueue()
	  {  size = 0;
	      numOfNodes = 0;
	      front = 0;
	      rear = 0;
	      data = null;
	   }
	    
	   public Queue(int n)
	  {  size = n;
	      numOfNodes = 0;
	      front = 0;
	      rear = 0;
	     data = new Listing[n];
	   }
	   
	   public void fillQueue(){
	   
	   for(int a = 0; a <= size - 1; a++)
	    {
	       data[a] = new Listing("n","a","1");
	       numOfNodes++;
	       rear++;
	    }
	   }
	   public boolean enque(Listing newNode)
	  {  if(numOfNodes == size)
	         return false;  // ** overflow error **
	      else
	      { numOfNodes = numOfNodes +1;
	         data[rear] = newNode.deepCopy();
	         rear = (rear +1) % size;
	         return true;  // push operation successful
	      }
	  }
	   public Listing dequeue( )
	   {  int frontLocation;
	       if(numOfNodes == 0)
	          return null;  // ** underflow error **
	       else
	       { frontLocation = front;
	          front = (front + 1) % size;
	          numOfNodes = numOfNodes -1;
	          return data[frontLocation];
	       }
	   }
	   
	    public void overflowTest(Listing newNode){
	    if(numOfNodes == size)
	         System.out.println("There is an overflow(full queue)");
	      else
	      { numOfNodes = numOfNodes +1;
	         data[rear] = newNode.deepCopy();
	         rear = (rear +1) % size;
	         System.out.println("enque successfull");
	      }
	   }
	    
	    public void underflowTest(){
	   
	       int frontLocation;
	       if(numOfNodes == 0)
	          System.out.println("there is an underflow(empty queue)");
	       else
	       { frontLocation = front;
	          front = (front + 1) % size;
	          numOfNodes = numOfNodes -1;
	          System.out.println("dequeue successfull");
	       }
	   }
	    
	   public void peek( )
	   {  
	       int frontLocation;
	       Listing dummy;
	       if(numOfNodes == 0)
	       {System.out.println("there is an underflow(empty queue)");} 
	       else
	       { frontLocation = front;
	          dummy = data[frontLocation].deepCopy();
	          System.out.println(dummy.toString());
	       }
	   }
	   
	   
	   public void showAll()
	   {   int i = front;
	       for(int c = 0; c <= numOfNodes; c++)
	       {  System.out.println(data[i].toString( ));
	           i = (i + 1) % size;
	       }
	   }
}
	   

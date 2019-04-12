
public class Stack {
	 private Listing[] data;
	   private int top;
	   private int size;
	   
	   public Stack( )
	   {  top = -1;
	      size = 100;
	      data = new Listing[100];
	   }
	   
	   public void emptyStack( )
	   {  
	       top = -1;
	       data = null;
	   }
	   public Stack(int n)
	   {  top = -1;
	      size = n;
	      data = new Listing[n];
	   }
	   
	   public void fillStack(){
	   
	   for(int a = 0; a <= size - 1; a++)
	    {
	       data[a] = new Listing("n","a","1");
	       top = a;
	    }
	   }
	     
	   public void overflowTest(Listing newNode){
	   if(top == size-1)
	           
	       System.out.println("There is an overflow(full stack)");
	           
	           
	       else
	       {  top = top +1;
	          data[top] = newNode.deepCopy();
	          System.out.println("Push succesfull\n");
	       }
	   }
	   
	   public void underflowTest(){
	   
	       int topLocation;
	       if(top == -1)
	           System.out.println("there is an underflow(empty stack)");
	           
	       else
	       {  topLocation = top;
	           top = top -1;
	           data[topLocation].toString();
	           System.out.println("pop successfull ");
	       }
	   }
	   
	   
	   public boolean push(Listing newNode)
	   {  if(top == size-1)
	           return false;  // ** overflow error **
	           
	       else
	       {  top = top +1;
	          data[top] = newNode.deepCopy();
	          return true;  // push operation successful
	       }
	   
	   }
	   public Listing pop( )
	   {  int topLocation;
	       if(top == -1)
	           return null;  // ** underflow error **
	           
	       else
	       {  topLocation = top;
	           top = top -1;
	           return data[topLocation];
	       }
	   }
	   
	   public void peek( )
	   {  
	       Listing dummy;
	       if(top == -1)
	             System.out.println("underflow error");
	       else
	       {  
	            dummy = data[top].deepCopy();
	            System.out.println(dummy.toString());
	       }
	   }
	   
	   public void showAll( )
	   {  for(int i = top; i >= 0; i--)
	         System.out.println(data[i].toString());
	   }
	    
}

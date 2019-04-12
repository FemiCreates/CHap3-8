
public class Listing {
	private String name;  // key field
	   private String gpa;
	   private String number;
	   public Listing(String n, String gpa, String num )
	  {  name = n;
	      this.gpa = gpa;
	      number = num;
	  }
	   @Override
	   public String toString( )
	   {   
	       return "Name is " + name +
	                    "\ngpa is " + gpa +
	                    "\nNumber is " + number + "\n";
	   }
	   public Listing deepCopy( )
	   {  Listing clone = new Listing(name, gpa, number);
	      return clone;
	   }
	   public int compareTo(String targetKey)
	   {  
	       return(name.compareTo(targetKey)); 
	    }
	   
	   
}

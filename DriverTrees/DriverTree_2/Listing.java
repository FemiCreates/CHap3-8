/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drivertree;

/**
 *
 * @author bluek
 */
public class Listing {
    private String name;  // key field
   private String gpa;
   private String number;
   
   
   public Listing(String n, String a, String num )
  {  name = n;
      gpa = a;
      number = num;
  }
   
   
   public String toString( )
   {   return("Student name: " + name +
                    "\nGpa: " + gpa +
                    "\nIdentification Number: " + number + "\n");
   }
   
   public Listing deepCopy( )
   {  Listing clone = new Listing(name, gpa, number);
      return clone;
   }
   
   public int compareTo(String targetKey)
   {  return(name.compareTo(targetKey));
   }
   
   public void setGpa(String a) // coded to demonstrate encapsulation
   {  gpa = a;
   }
   
       public String getKey()
   {   return name;
   }   
}

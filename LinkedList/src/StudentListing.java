import java.util.Scanner;

public class StudentListing {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		    int y = 1;
		    Listing student;
		    SinglyLinkedList LList = new SinglyLinkedList();
		    
		    
		     System.out.println("Input name of first student\n");
		     
		     System.out.println("enter name of student");
		     String name = in.next();
		     System.out.println("enter gpa of student");
		     String gpa = in.next();
		     System.out.println("enter identification number of student");
		     String number = in.next();
		     
		     student = new Listing(name, gpa, number);
		     LList.insert(student);
		    
		   
		    while(y != 0)
		    {
		            System.out.println("Choose operation from below");
		            System.out.println("1 to insert a new student's information,");
		            System.out.println("2 to fetch and output a student's information,");
		            System.out.println("3 to delete a student's information,");
		            System.out.println("4 to update a student's information,");
		            System.out.println("5 to output all Student data");
		            System.out.println("\n\nEnter: 0 to exit the program");
		            int choice = in.nextInt();
		            
		       
		        if (choice == 1)
		        {
		          System.out.println("Enter Student name");
		          name = in.next();
		          System.out.println("Enter Student GPA");
		          gpa = in.next();
		          System.out.println("Enter Student number");
		          number = in.next();
		          
		          student = new Listing( name , gpa, number);
		          LList.insert(student);
		          System.out.println();
		        }
		        
		        if (choice == 2)
		        {
		          
		          System.out.println("Enter Student name to retrieve");
		          String n = in.next();
		          LList.fetch(n);
		          System.out.println();
		        }
		        
		        if (choice == 3)
		        {
		          System.out.println("Enter Student name to be deleted");
		          String n = in.next();
		          LList.delete(n);
		          System.out.println(n + " deleted");
		          System.out.println();
		        }
		        
		        if (choice == 4)
		        {
		          System.out.println("Enter Student name to be updated");
		          name = in.next();
		          System.out.println("Enter Student updated identification number");
		          number = in.next();
		          System.out.println("Enter Student updated GPA");
		          gpa = in.next();
		          
		          student = new Listing(name,gpa,number);
		          
		          LList.update(name, student);
		          System.out.println(name + " updated");
		          System.out.println();
		        }
		        
		        if (choice == 5)
		        {
		            LList.showAll();
		        }
		  
		        if (choice == 0)
		        {
		           System.out.println("Thank you");
		           y = 0;
		        }
		 
		    }
		   
		   System.exit(0);
	}

}

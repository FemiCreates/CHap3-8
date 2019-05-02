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
public class DriverTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
    
    BinaryTree t = new BinaryTree();
    
    int x = 1;
    System.out.println("             STUDENT PROGRAM");
    System.out.println("CHOOSE AN ACTION FROM THE FOLLOWING BELOW");
    while (x != 0)
    {
            System.out.println("");
            System.out.println("");
            System.out.println("1 to insert a new student's information,");
            System.out.println("2 to fetch and output a student's information,");
            System.out.println("3 to delete a student's information,");
            System.out.println("4 to update a student's information,");
            System.out.println("5 to output all Student data");
            System.out.println("\n\nEnter: 6 to exit the program");
            System.out.println("");
            System.out.print("Choice: ");int choice = in.nextInt();
            
            
        if (choice == 6)
        {
           System.out.println("Thank you");
           x = 0;
        }
        
        if (choice == 1)
        {
          System.out.println("");
          System.out.println("Enter Student name");
          String n = in.next();
          System.out.println("Enter Student number");
          String number = in.next();
          System.out.println("Enter Student GPA");
          String gpa = in.next();
          
          Listing student = new Listing(n,gpa,number);
          t.insert(student);
        }
        
        if (choice == 2)
        {
          System.out.println("");
          System.out.println("Enter Student name to retrieve");
          String n = in.next();
          System.out.println(t.fetch(n));
        }
        
        if (choice == 3)
        {
          System.out.println("");
          System.out.println("Enter Student name to be deleted");
          String n = in.next();
          t.delete(n);
        }
        
        if (choice == 4)
        {
          System.out.println("");
          System.out.println("Enter Student name to be updated");
          String n = in.next();
          System.out.println("Enter Student number");
          String number = in.next();
          System.out.println("Enter Student updated GPA");
          String gpa = in.next();
          
          Listing student = new Listing(n,gpa,number);
          t.update(n, student);
        }
        
        if (choice == 5)
        {
            System.out.println("");
            t.showAll();
        }
        
     
    }
    System.exit(0);
    }
    
}

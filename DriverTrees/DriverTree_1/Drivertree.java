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
public class Drivertree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BinaryTree t = new BinaryTree();
   Listing l;
   Listing l1  = new Listing("A",    "4.0",  "000001");
   Listing l2  = new Listing("B",     "4.0",  "000002");
   Listing l3  = new Listing("C",  "4.0",  "000003");
   Listing l4  = new Listing("D",   "4.0",  "000004");
   Listing l5  = new Listing("E",      "4.0",  "000005");
   Listing l6  = new Listing("F",   "4.0",  "000006");
   Listing l7  = new Listing("G",     "4.0",  "000007");
   Listing l8  = new Listing("H",   "4.0",  "000008");
   Listing l9  = new Listing("I",   "4.0",  "000009");
   Listing l10 = new Listing("J",  "4.0", "000010");
   Listing l11 = new Listing("K",  "4.0", "000011");
   
   
   
    // insert the nodes 
   t.insert(l9);
   t.insert(l7);
   t.insert(l10);
   t.insert(l2);
   t.insert(l8);
   t.insert(l1);
   t.insert(l4);
   t.insert(l3);
   t.insert(l6);
   t.insert(l5);
//Output all the nodes in LNR (assending) order 
   t.showAll();
   
   System.out.println("\nNow making some deletions:\n.\n..\n... \ndone!");
   
   t.delete("I");
    
   t.delete("B");
   
   
   System.out.println("\nUpdated Student name 'J' ");
   // update nodes
   l10 = new Listing("J",  "100.0", "000010");
   t.update("J", l10);
   
   System.out.println(t.fetch("J"));
   
  
   System.out.println("names of students left are...\n");
   
   

//Output all the nodes in LNR (assending) order 
   t.showAll();
  
   System.exit(0);
    }
    
}

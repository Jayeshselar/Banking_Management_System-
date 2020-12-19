package Banking_Management_classes;

import java.util.*;

import javax.swing.JOptionPane;

public class BankMainClass {
    public static void main(String args[]) {
        String choice = null, ch = null, operation = null;
        Transaction transac = new Transaction();
       Scanner sc = new Scanner(System.in);	
        double amount;
        long accountNo;
        
        System.out.println("enter your choice and double hit the enter to proceed further");
        
        JOptionPane.showMessageDialog(null,"WELCOME TO BANKING.....");
                
        do {
        	 
        	 
//        	JOptionPane.showInputDialog(null,choice);
  //       	JOptionPane.showInputDialog(null,ch);
    //     	JOptionPane.showInputDialog(null,operation);
         
        	//Scanner sc = new Scanner(JOptionPane.showInputDialog(choice));    	
        		
        	
            System.out.println("1. New account");
            System.out.println("2. Transaction");
            System.out.println("3. View Account Information");
            System.out.println("q. Exit");
            System.out.println("choice:");
        
            
        	
        	
        	
        
        //	String input = JOptionPane.showInputDialog("Enter Input:",sc.nextDouble());
        //	String input1 = JOptionPane.showInputDialog("Enter Input:",sc.nextDouble());
        //  System.out.println(input);
        	
        	
        	
        	choice = sc.next();
        	
            switch (choice)
            {
            
             
           
              
          
            case "1":
                double openingBalance;
                
                System.out.println("Enter the opening balance :");
               
                openingBalance = sc.nextDouble();
                JOptionPane.showInputDialog("Balance added into your account", openingBalance);
                transac.transaction(0, "Opening", openingBalance); 
                break;
            case "2":
                System.out.println("a. Deposit");
                System.out.println("b. Withdraw");
                System.out.println("c. Pay Bills");
                ch = sc.next();
                if (ch.equalsIgnoreCase("a"))
                { operation = "Deposit";
                JOptionPane.showMessageDialog(null,"Deposit the amount.....");
                }
                else if (ch.equalsIgnoreCase("b"))
                { operation = "Withdrawing";
                JOptionPane.showMessageDialog(null,"Withdraw the amount.....");
                }
                else if (ch.equalsIgnoreCase("c"))
                { operation = "Pay Bills";
                JOptionPane.showMessageDialog(null,"Pay bills.....");
                }
                else {
                    operation = "Invalid option";
                }
                System.out.println("\n Account Number:\n");
                accountNo = sc.nextLong();
                System.out.println("Amount:");
                amount = sc.nextDouble();
                transac.transaction(accountNo, operation, amount);
                break;

            case "3":
                System.out.println("\n Account Number: \n");
                accountNo = sc.nextLong();
                operation = "showInfo";
                transac.transaction(accountNo, operation, 0);
                break;

            case "q":
                System.out.println("Thank you!");
                break;

            default:
                System.out.println("Wrong choice!!");
                
               
            }
            
        } while (choice != "q");
        
       
        
        sc.close();
        
    }
    
    //String choice1 = JOptionPane.showInputDialog("Enter Input:",1);
        	
}
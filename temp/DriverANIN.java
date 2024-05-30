//package labProject;
//import java.util.*;
//public class Driver {
//    public void main (String[] args) {
//    	Inventory i1=new Inventory();
//    	Invoice i2=new Invoice();
//    	Scanner input=new Scanner(System.in);
//    	int choice=0;
//    	int choice2=0;
//    	    System.out.println("\n\n\n\n\n\n\n\n\n**************************************************************");
//    	    System.out.println("\n\t\t------WELCOME TO VINYL AND CD SHOP MANAGEMENT SYSTEM---");
//    	    System.out.println("\n\t\t****************************************************************");
//    	    while (choice!=3)
//    	    {
//    	        System.out.println("\n 1 : To check the Inventory.\n");
//    	        System.out.println("\n 2 : To go to Invoice");
//    	        System.out.println("\n 3 : To exit");
//    	        choice=input.nextInt();
//    	        switch(choice)
//    	        {
//    	        case 1:
//    	        	 System.out.println("\n\t\t------INVENTORY---");
//    	        	 while (choice2!=4)
//    	        	    {
//    	        	        System.out.println("\n 1 : To add new Stock of a product.");
//    	        	        System.out.println("\n 2 : To sort by price");
//    	        	        System.out.println("\n 3 : To sort by available stock.");
//    	        	        System.out.println("\n 4 : to exit\n");
//    	        	        choice2=input.nextInt();
//    	        	        switch(choice2)
//    	        	        {
//    	        	        case 1:
//    	        	        	System.out.println("Enter the productId and number of new stock");
//    	        	        	int p=input.nextInt();
//    	        	        	int n=input.nextInt();
//    	        	        	i1.addProductStock(p,n);
//    	        	            break;
//    	        	        case 2:
//    	        	            i1.sortByPrice();
//    	        	            break;
//    	        	        case 3:
//    	        	            i1.sortByAvailableStock();
//    	        	            break;
//    	        	        case 4:
//    	        	            System.out.println("\n\n\t\t\t\tTHANK YOU FOR USING OUR SERVICE");
//    	        	            break;
//    	        	        default:
//    	        	            System.out.println("Incorrect Input");
//    	        	            System.out.println("\nAny key to continue");
//    	        	            break;
//    	        	        }
//    	        	    }
//    	            break;
//    	        case 2:
//    	        	System.out.println("\n\t\t------INVOICE---");
//    	        	 while (choice2!=4)
// 	        	    {
// 	        	        System.out.println("\n 1 : To add a product.");
// 	        	        System.out.println("\n 2 : To remove a product");
// 	        	        System.out.println("\n 3 : To print invoice.");
// 	        	        System.out.println("\n 4 : to exit\n");
// 	        	        choice2=input.nextInt();
// 	        	        switch(choice2)
// 	        	        {
// 	        	        case 1:
// 	        	        	System.out.println("Enter the product");
// 	        	        	int p=input.nextInt();
// 	        	        	int n=input.nextInt();
// 	        	        	i1.addProductStock(p,n);
// 	        	            break;
// 	        	        case 2:
// 	        	            i1.sortByPrice();
// 	        	            break;
// 	        	        case 3:
// 	        	            i1.sortByAvailableStock();
// 	        	            break;
// 	        	        case 0:
// 	        	            System.out.println("\n\n\t\t\t\tTHANK YOU FOR USING OUR SERVICE");
// 	        	            break;
// 	        	        default:
// 	        	            System.out.println("Incorrect Input");
// 	        	            System.out.println("\nAny key to continue");
// 	        	            break;
// 	        	        }
// 	        	    }
//    	            break;
//    	        case 0:
//    	            System.out.println("\n\n\t\t\t\tTHANK YOU FOR USING OUR SERVICE");
//    	            break;
//    	        default:
//    	            System.out.println("Incorrect Input");
//    	            System.out.println("\nAny key to continue");
//    	            break;
//    	        }
//    	    }
//    }
//}

import java.util.Scanner;

class ErrorAccessCodeException extends Exception{
    ErrorAccessCodeException(String str){
        super(str);
        System.out.println("Custom Exception: Please Enter a valid Initializer");
    }
}
public class Driver {

    public static void main(String[] args) throws ErrorAccessCodeException {

        Scanner cs = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while (true) {
            System.out.println("\n\n\n\n**************************************************************");
    	    System.out.println("\n\t\t------WELCOME TO VINYL AND CD SHOP MANAGEMENT SYSTEM---");
    	    System.out.println("\n\t\t****************************************************************");
            System.out.println("Press 1 to work with inventory");
            System.out.println("Press 2 to start working with invoice");
            System.out.println("Press 3 To exit");
//            int choice=cs.nextInt();
//            //int input=;
            if (takeInput() == 1) {
                //working with the inventory
                System.out.println("You are inside Inventory, What do you want to do: ");
                System.out.println("1.Check Inventory");
                System.out.println("2.ADD");
                System.out.println("3.Sort by Price");
                System.out.println("4.Sort by Availibility");
                System.out.println("5.Remove an item ");
                System.out.println("6.Update the number of Stock");
                System.out.println("Enter Which action you want to perform: ");

                if (takeInput() == 1) {
                    //checking the inventory
                    System.out.println("Initial Inventory:");
                    inventory.printInventory();
                } else if (takeInput() == 2) {
                    System.out.println("Which Type of product you want to add: \n1.Game\n2.Music\n3.Movie");
                    int id;
                    double price;
                    String genre;
                    int year;
                    double discount;
                    int stock;
                    String dev;
                    //for game
                    String developer;
                    String name;

                    if (takeInput() == 1) {
                        //code for adding game
                        System.out.println("Enter the name for adding to the Game Category: ");
                        name = cs.nextLine();
                        System.out.println("Enter the id");
                        id = cs.nextInt();
                        System.out.println("Enter the price");
                        price = cs.nextDouble();
                        System.out.println("Enter the genre");
                        genre = cs.nextLine();
                        System.out.println("Enter the year");
                        year = cs.nextInt();
                        System.out.println("Enter the discount");
                        discount = cs.nextDouble();
                        System.out.println("Enter the stock");
                        stock = cs.nextInt();
                        System.out.println("Enter the developer");
                        dev = cs.nextLine();
                        developer = cs.nextLine();
                        Game game = new Game(name, id, price, genre, year, discount, stock, developer);
                        inventory.addItem(game);
                        System.out.print("Stock Added : \n" + stock);
                    } else if (takeInput() == 2) {
                        //code for adding music
                        //Scanner cs=new Scanner(System.in);
                        System.out.println("Enter the name for adding to the music category");
                        name = cs.nextLine();
                        System.out.println("Enter the id");
                        id = cs.nextInt();
                        System.out.println("Enter the price");
                        price = cs.nextDouble();
                        System.out.println("Enter the genre");
                        genre = cs.nextLine();
                        System.out.println("Enter the year");
                        year = cs.nextInt();
                        System.out.println("Enter the discount");
                        discount = cs.nextDouble();
                        System.out.println("Enter the stock");
                        int sstock = cs.nextInt();
                        System.out.println("Enter the artist");
                        dev = cs.nextLine();
                        String artist = cs.nextLine();
                        Music music = new Music(name, id, price, genre, year, discount, sstock, artist);
                        inventory.addItem(music);
                        System.out.print("Stock: " + sstock);
                    } else if (takeInput() == 3) {
                        //code for adding movies
                        System.out.println("Enter the name for adding to the movie category");
                        name = cs.nextLine();
                        System.out.println("Enter the id");
                        id = cs.nextInt();
                        System.out.println("Enter the price");
                        price = cs.nextDouble();
                        System.out.println("Enter the genre");
                        String ge = cs.nextLine();
                        genre = cs.nextLine();
                        System.out.println("Enter the year");
                        year = cs.nextInt();
                        System.out.println("Enter the discount");
                        discount = cs.nextDouble();
                        System.out.println("Enter the stock");
                        int ssstock = cs.nextInt();
                        System.out.println("Enter the director");
                        String d = cs.nextLine();
                        String director = cs.nextLine();
                        Movie movie = new Movie(name, id, price, genre, year, discount, ssstock, director);
                        inventory.addItem(movie);
                        System.out.print("Stock: " + ssstock);

                    } else throw new ErrorAccessCodeException("Please enter a valid initializer");
                }
                else if (takeInput() == 3) {
                    //sort by price
                    System.out.println("\nSorted by Price:");
                    inventory.sortByPrice();
                    inventory.printInventory();
                } else if (takeInput() == 4) {
                    //sort by availibilty
                    System.out.println("\nSorted by Availability:");
                    inventory.sortByAvailable();
                    inventory.printInventory();

                } else if (takeInput() == 5) {
                    //remove an item
                    System.out.println("Enter the id name to remove an item: ");
                    int idname = cs.nextInt();
                    System.out.println("\nRemoving a product with ID :" + idname);
                    inventory.removeItem(idname);
                    inventory.printInventory();

                } else if (takeInput() == 6) {
                    System.out.println("Enter the id name to add an item: ");
                    int newidname = cs.nextInt();
                    System.out.println("Enter the number of Stock");
                    int newStock = cs.nextInt();
                    System.out.println("\nAdding stock to product with ID :" + newidname);
                    inventory.addProductStock(newidname, newStock);
                    inventory.printInventory();
                    System.out.println("This product" + newidname + "has " + newStock + " stock");
                } else {

                    throw new ErrorAccessCodeException("Invalid Number");
                }
            }else if(takeInput()==2){
                //code for invoice
                System.out.println("Generating invoice");



            }else if(takeInput()==3){
                System.out.println("Thank you for using our system ");
                break;
            }else{
                throw new ErrorAccessCodeException("Invalid Input");
            }
        }
    }

    public static int takeInput() {
        Scanner sc = new Scanner(System.in);
        //System.out.println("PLease enter the number for input: ");
        int input1 = sc.nextInt();
        return input1;
    }
}
//
//    public static void main1(String[] args) {
//        Invoice invoice = new Invoice();
//        for(int i=0; i<4; i++) {
//            System.out.println("If you want to add game product to invoice then press 1, movie then 2 or music then 3");
//            int inv = cs.nextInt();
//
//            if (inv == 1) {
//                invoice.addProduct(game);
//
//                System.out.println("Enter the quantity: ");
//                int quantity=cs.nextInt();
//                System.out.println("\nInvoice adding game products:");
//                System.out.println(invoice.getInvoice());
//                System.out.println("quantity: "+quantity);
//                System.out.println("Press 1 for adding more product:");
//                int a=cs.nextInt();
//                if(a==1)
//                {
//                    continue;
//                }
//                else
//                    break;
//
//            } else if (inv == 2) {
//                invoice.addProduct(movie);
//                System.out.println("Enter the quantity: ");
//                int quantity=cs.nextInt();
//                System.out.println("\nInvoice adding movie products:");
//                System.out.println(invoice.getInvoice());
//                System.out.println("quantity: "+quantity);
//
//
//                System.out.println("Press 1 for adding more product:");
//                int a=cs.nextInt();
//                if(a==1)
//                {
//                    continue;
//                }
//                else
//                    break;
//            } else if (inv == 3) {
//                invoice.addProduct(music);
//                System.out.println("Enter the quantity: ");
//                int quantity=cs.nextInt();
//                System.out.println("\nInvoice after adding music product:");
//                System.out.println(invoice.getInvoice());
//                System.out.println("quantity: "+quantity);
//                System.out.println("Press 1 for adding more product:");
//                int a=cs.nextInt();
//                if(a==1)
//                {
//                    continue;
//                }
//                else
//                    break;
//            }
//        }
//System.out.println("If you want to remove game product form the inventory then press 1, movie then 2 or music then 3");
//int pvt=cs.nextInt();
//if(pvt==1)
//{
//    invoice.removeProduct(game);
//    System.out.println("\nInvoice after removing a product:");
//    System.out.println(invoice.getInvoice());
//}
//else if(pvt==2) {
//    invoice.removeProduct(movie);
//    System.out.println("\nInvoice after removing a product:");
//    System.out.println(invoice.getInvoice());
//}
//else if(pvt==3)
//{
//    invoice.removeProduct(music);
//    System.out.println("\nInvoice after removing a product:");
//    System.out.println(invoice.getInvoice());
//}
//
//        System.out.println("Is full house discount available? " + invoice.isFullHouseDiscountAvailable());
//    }
//}

import java.util.Scanner;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

/**
 * 
 * @author Papa Kofi Akoto Asante
 * @author Ernest Ampomah-Benefo
 * @version 1.0
 *  This program is a system that alows a essentials manager to keep manage and update his stock.
 */
//this ia class which inherits methods form class serializable.
public class stock_essential implements Serializable {
    // These are the instance variables of the class stock_essential
    String name;
    int id;
    int quantity;
    double price;
    // This is the constructor of the class.
    private static final long serialVersionUID = 1L;
    public stock_essential() {
        this.name= " ";
        this.id=0;
        this.quantity=0;
        this. price=0.0;


        
    }
    // Below are the setter methods for:

    //Name of the product.
    public String setName(final String productname) {
        name = productname;
        return name;
    }
    //The product's ID.
    public int setId(final int productid) {
        id = productid;
        return id;
    }

    //The quantity of the product in stock.
    public int setQuantity(final int productQuant) {
        quantity = productQuant;
        return productQuant;
    }

    //The price of the product.
    public double setPrice(final Double productPrice) {
        price = productPrice;
        return price;

    }
    
    //These are the getter methods for:

    //The product's name.
    public String getName() {
        return name;
    }

    //The product's ID.
    public int getId() {
        return id;
    }

    //The product's quantity.
    public int getQuantity() {
        return quantity;
    }

    //The product's price.
    public double getPrice() {
        return price;
    }
    //This method is responsible for increasing the quantity of a particular product.
    public int increment(final int num) {
        quantity = quantity + num;
        return quantity;
    }

    //This is the method that writes the obtained information to a file called essential_stock.txt.
    //This information includes the name, quantity, ID and price of products.
    public void writeToAfile() {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileOutputStream("essential_stock.txt", true));
        } catch (final FileNotFoundException fnfe) {
            fnfe.getMessage();
        }
        printWriter.printf(  getName() + " Ghc " + getPrice() + " quantity " + getQuantity() + "\n" );
        
        printWriter.close();

    }

    //This method creates a backup file of the essentials_stock.txt file.
    public void writingBinaryData() throws IOException {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(new FileOutputStream("backup_essential_stock.txt", true));
        } catch (final FileNotFoundException fnfe) {
            fnfe.getMessage();
        }
        printWriter.printf(  getName() + " Ghc " + getPrice() + " quantity " + getQuantity() + "\n" );
        
        printWriter.close();


    }
     
    
    //This is where the program starts running from.
    public static void main(final String[] args) {

        //This method creates the instance of a scanner which requests the number of stock the user desires to enter.
        final stock_essential sale = new stock_essential();
        final Scanner input=new Scanner(System.in);
        System.out.print("how many items are you stocking to day");
        final int num24=input.nextInt();
       
       
        //This method gives the user the orportunity to imput the stated number of product at his/her discresion.    
        for (int i=0;i<=num24-1;i++) {
            final Scanner st = new Scanner(System.in);
            System.out.print("Please input the product name ");
            final String name24 = st.nextLine();
            System.out.print("Please input the product quntity ");
            final int quantity24 = st.nextInt();
            System.out.print("Please input the product price ");
            final double price24 = st.nextDouble();
        
            sale.setName(name24);
            sale.setPrice(price24);
            sale.setQuantity(quantity24);
        
            // This method has the fuction to handle an IoException and give the command to write to the stated file and also create a back up.
            try {
                sale.writeToAfile();
                sale.writingBinaryData();
            
            } catch (IOException e) {
                e.printStackTrace();
            }
           
        }
        // This method is used to close the the instance of the scanner object created earlier. 
        input.close();
        //st.close();

        
       
    }
        
        
         
        
       
        
        






        
    



}
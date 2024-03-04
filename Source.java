import java.util.ArrayList;

// Database Lab 5 Example
class Product{
    // attributes - what makes up an object/class
    int id;
    String pName;
    double sCost;

    //3-arg constructor
    Product(int id, String pName, double sCost){
        this.id = id;
        this.pName = pName;
        this.sCost = sCost;
    }

    // pre-defined method in Java
    // define our own toString
    public String toString(){
        String row = String.format("%d\t%-20s\t$%.2f", id, pName, sCost);
        return row;
    } 
}

public class Source {
    public static void main(String[] args) {
        // this will be a table in my Database
        /*Product[] table = new Product[3];

        table[0] = new Product(134, "Chai", 13.5);
        table[1] = new Product(256, "Syrup", 7.5);
        table[2] = new Product(382, "Cajun Seasoning", 16.5);*/

        // ArrayList of products
        //ArrayList<Product> myProd = new ArrayList<Product>();


        ArrayList<String> strList = new ArrayList<String>();
        // add a new string to the strList ArrayList
        strList.add("hello"); // 0
        strList.add("world"); // 1
        strList.add("to all!"); // 2
        strList.add(1, "!");
        strList.add("hello"); // 4

        // remove by element
        strList.remove("hello"); // remove the hello at 0

        // remove by index
        strList.remove(0);

        
    }
}

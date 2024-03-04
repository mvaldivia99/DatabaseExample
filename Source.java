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

    // remove product from ArrayList by prodID
    public static boolean removeElement(ArrayList<Product> a, int ID){
        int indexFound = -1;

        for (int i = 0; i < a.size(); i++){
            if (a.get(i).id == ID){
                indexFound = i;
                break;
            }
        }

        if (indexFound != -1){
            a.remove(indexFound);
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        // this will be a table in my Database
        /*Product[] table = new Product[3];

        table[0] = new Product(134, "Chai", 13.5);
        table[1] = new Product(256, "Syrup", 7.5);
        table[2] = new Product(382, "Cajun Seasoning", 16.5);*/

        // ArrayList of products
        ArrayList<Product> myProd = new ArrayList<Product>();

        // one way of adding
        myProd.add(new Product(134, "Chair", 13.5));
        myProd.add(new Product(256, "Syrup", 7.5));
        myProd.add(new Product(382, "Cajun Seasoning", 16.5));

        // another way of adding
        Product newProd = new Product(168, "Sweater", 25.0);
        myProd.add(newProd);

        
                


        
    }
}

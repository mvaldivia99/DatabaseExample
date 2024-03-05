// Database Lab 5 Example
public class Product{
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

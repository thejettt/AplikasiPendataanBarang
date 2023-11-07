package model;

public class Product {
    private int id;
    private String name;
    private int quantity;

    public Product(int id, String name, int quantity){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
    //set and get
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantyity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(int updatedQuantity) {
        return quantity;
    }
}

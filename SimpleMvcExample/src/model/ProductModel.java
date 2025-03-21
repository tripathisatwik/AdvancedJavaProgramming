package model;
public class ProductModel {
    private String title;
    private double price;
    private String category;
    private int quantity;
    
    //Public Getter and Setter Methods 
    public void setTitle(String param_title){
        this.title = param_title;
    }
    public String getTitle(){
        return this.title;
    }
    
    public void setPrice(double param_price){
        this.price = param_price;
    }
    public double getPrice(){
        return this.price;
    }
    
    public void setCategory(String param_category){
        this.category = param_category;
    }
    public String getCategory(){
        return this.category;
    }
    
    public void setQuantity(int param_qunatity){
        this.quantity = param_qunatity;
    }
    public int getQuantity(){
        return this.quantity;
    }

}

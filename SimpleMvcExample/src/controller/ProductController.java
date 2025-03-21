package controller;
import model.ProductModel;
public class ProductController {
   private final ProductModel pm;
   
    public ProductController(){
       this.pm = new ProductModel();
   }
   
   public void setTitle(String title){
       pm.setTitle(title);
   }
   public String getTitle(){
           return pm.getTitle();
    }
   public void setPrice(double price){
        pm.setPrice(price);
    }
    public double getPrice(){
        return pm.getPrice();
    }
    
    public void setCategory(String category){
        pm.setCategory(category);
    }
    public String getCategory(){
        return pm.getCategory();
    }
    
    public void setQuantity(int qunatity){
        pm.setQuantity(qunatity);
    }
    public int getQuantity(){
        return pm.getQuantity();
    }
    
    //store product method
    public ProductController storeProduct(ProductController pc){
        return pc;
    } 
    
    //Dispalying the
    public void displayProduct(){
        System.out.println("Title: " + this.getTitle());
        System.out.println("Category: " + this.getCategory());
        System.out.println("Price: " + this.getPrice());
        System.out.println("Quantity: " + this.getQuantity());
    }
}


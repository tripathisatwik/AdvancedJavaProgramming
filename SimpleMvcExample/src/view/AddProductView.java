package view;

import controller.ProductController;

public class AddProductView {
    public ProductController addProduct(){
        String title = "Futsal Boots";
        String catagory = "Indoor Sports";
        double price = 2700.00;
        int quantity = 7;
        ProductController pc = new ProductController();
        pc.setTitle(title);
        pc.setPrice(price);
        pc.setCategory(catagory);
        pc.setQuantity(quantity);
        return pc;
    }
}

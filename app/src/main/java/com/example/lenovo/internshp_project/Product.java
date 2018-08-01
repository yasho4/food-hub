package com.example.lenovo.internshp_project;

/**
 * Created by lenovo on 04-06-2018.
 */

public class Product {
    String  productName, productDesc,price;
    int productImage;
    boolean itemsSelected;

    public Product(int productImage, String productName, String productDesc, String price,boolean itemsSelected) {
        this.productImage = productImage;
        this.productName = productName;
        this.productDesc = productDesc;
        this.price = price;
        this.itemsSelected=itemsSelected;
    }

    public int getProductImage() {
        return productImage;
    }

    public void setProductImage(int productImage) {
        this.productImage = productImage;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public boolean getItemsSelected() { return itemsSelected; }
    public void setItemsSelected(boolean itemsSelected) { this.itemsSelected=itemsSelected; }


}

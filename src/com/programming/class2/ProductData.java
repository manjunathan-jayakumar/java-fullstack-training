package com.programming.class2;

// This example shows constructor overloading.
public class ProductData {

    int prodId;
    String prodName;
    float prodPrice;
    String prodDesc;

    ProductData() {
        this.prodId = 123;
        this.prodName = "Final Fantasy";
        this.prodPrice = 39.95f;
        this.prodDesc = "A good game";
    }
    ProductData(int id) {
            this.prodId = id;
            this.prodName = "Final Fantasy";
            this.prodPrice = 39.95f;
            this.prodDesc = "A good game";
        }
    ProductData(int id, String name) {
            this.prodId = id;
            this.prodName = name;
            this.prodPrice = 39.95f;
            this.prodDesc = "A good game";
        }
    ProductData(int id, String name, float price) {
            this.prodId = id;
            this.prodName = name;
            this.prodPrice = price;
            this.prodDesc = "A good game";
        }
    ProductData(int id, String name, float price, String description) {
            this.prodId = id;
            this.prodName = name;
            this.prodPrice = price;
            this.prodDesc = description;
        }

    void display() {
        System.out.println("Product Id: "+ prodId+ "\nProduct name: "+ prodName+ "\nProduct price: "+ prodPrice+ "\nProduct description: "+ prodDesc);
    }

    public static void main(String[] args) {
        ProductData obj = new ProductData();
        obj.display();
        System.out.println();
        ProductData obj1 = new ProductData(124);
        obj1.display();
        System.out.println();
        ProductData obj2 = new ProductData(125, "Uncharted");
        obj2.display();
        System.out.println();
        ProductData obj3 = new ProductData(126, "Wild rift", 68.99f);
        obj3.display();
        System.out.println();
        ProductData obj4 = new ProductData(127, "Black Ops", 98.99f, "Forget you SSD space");
        obj4.display();
        System.out.println();
    }
}

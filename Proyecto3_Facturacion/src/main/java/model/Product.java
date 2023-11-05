/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author argen
 */
public class Product {
    private String Id;
    private String name;
    private int price;
    private String typeProduct;

    public Product() {
    }

    public Product(String Id, String name, int price, String typeProduct) {
        this.Id = Id;
        this.name = name;
        this.price = price;
        this.typeProduct = typeProduct;
    }
    

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }
    
    
}

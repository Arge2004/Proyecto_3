/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author argen
 */
public class ProductForReceipt {
    String id;
    String cantity;
    String totalPrice;

    public ProductForReceipt() {
    }

    public ProductForReceipt(String id, String cantity, String totalPrice) {
        this.id = id;
        this.cantity = cantity;
        this.totalPrice = totalPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCantity() {
        return cantity;
    }

    public void setCantity(String cantity) {
        this.cantity = cantity;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
       
}

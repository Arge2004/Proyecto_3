/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author argen
 */
public class Detail {
    private String numDetail;
    private String idReceipt;
    private String idProduct;
    private String quantity;
    private String price;

    public Detail(String numDetail, String idReceipt, String idProduct, String quantity, String price) {
        this.numDetail = numDetail;
        this.idReceipt = idReceipt;
        this.idProduct = idProduct;
        this.quantity = quantity;
        this.price = price;
    }

    public Detail() {
    }

    public String getNumDetail() {
        return numDetail;
    }

    public void setNumDetail(String numDetail) {
        this.numDetail = numDetail;
    }

    public String getIdReceipt() {
        return idReceipt;
    }

    public void setIdReceipt(String idReceipt) {
        this.idReceipt = idReceipt;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
    
}

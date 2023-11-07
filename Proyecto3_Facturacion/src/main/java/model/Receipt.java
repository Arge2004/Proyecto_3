/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author argen
 */
public class Receipt {
    private String numReceipt;
    private String nameClient;
    private String idClient;
    private String typeClient;
    private String date;

    public Receipt(String numReceipt, String nameClient, String idClient, String date,String typeClient) {
        this.numReceipt = numReceipt;
        this.nameClient = nameClient;
        this.idClient = idClient;
        this.date = date;
        this.typeClient= typeClient;
    }

    public Receipt() {
    }

    public String getNumReceipt() {
        return numReceipt;
    }

    public void setNumReceipt(String numReceipt) {
        this.numReceipt = numReceipt;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTypeClient() {
        return typeClient;
    }

    public void setTypeClient(String typeClient) {
        this.typeClient = typeClient;
    }
    
    
    
    
}

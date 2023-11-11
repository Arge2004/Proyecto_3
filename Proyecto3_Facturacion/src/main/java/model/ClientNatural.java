/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import control.Clients;

/**
 *
 * @author argen
 */
public class ClientNatural extends Client implements Clients{
    private String name;
    private String lastName;

    public ClientNatural(String name, String lastName, String phoneNumber, String emailAddress, String id, String address) {
        super(phoneNumber, emailAddress, id, address);
        this.name = name;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public String getCompleteName(){
        return name+" "+lastName;
    }
    
    public void setName(String name) {
        this.name = name;
    }

   

}

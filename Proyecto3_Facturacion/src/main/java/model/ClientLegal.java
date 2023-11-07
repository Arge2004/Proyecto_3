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
public class ClientLegal extends Client implements Clients {
    private String socialReason;

    public ClientLegal(String socialReason, String phoneNumber, String emailAddress, String id, String address) {
        super(phoneNumber, emailAddress, id, address);
        this.socialReason = socialReason;
    }


    @Override
    public String getName() {
        return socialReason;
    }
    
    public void setSocialReason(String socialReason) {
        this.socialReason = socialReason;
    }

    public String getSocialReason() {
        return socialReason;
    }

   
}

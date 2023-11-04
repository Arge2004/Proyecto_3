/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author argen
 */
public class clientLegal extends client {
    private String socialReason;

    public clientLegal(String socialReason, String phoneNumber, String emailAddress, String id, Address address) {
        super(phoneNumber, emailAddress, id, address);
        this.socialReason = socialReason;
    }


    public String getSocialReason() {
        return socialReason;
    }

    public void setSocialReason(String socialReason) {
        this.socialReason = socialReason;
    }

}

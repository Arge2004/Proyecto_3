/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

/**
 *
 * @author argen
 */
public class UseComponents {
   public static String totalPrice(javax.swing.JSpinner txt_cantity, javax.swing.JTextField txt_priceProducts){
      return String.valueOf((int)txt_cantity.getValue()*Integer.parseInt(txt_priceProducts.getText()));
   }
}

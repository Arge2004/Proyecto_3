/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import javax.swing.JTextField;

/**
 *
 * @author argen
 */
public class UseComponents {

    public static String totalPrice(javax.swing.JSpinner txt_cantity, javax.swing.JTextField txt_priceProducts) {
        return String.valueOf((int) txt_cantity.getValue() * Integer.parseInt(txt_priceProducts.getText()));
    }

    public static void deleteFields(javax.swing.JComboBox<String> combobox, javax.swing.JTextField... textfields) {
        combobox.setSelectedIndex(0);
        for (JTextField textfield : textfields) {
            textfield.setText("");
        }
    }

    public static void naturalType(javax.swing.JComboBox<String> combobox, javax.swing.JTextField textfield, javax.swing.JLabel... labels) {
        labels[0].setText("Nombre");
        labels[1].setText("Apellido");
        labels[1].setEnabled(true);
        labels[2].setText("Tipo de Documento");
        labels[2].setEnabled(true);
        labels[3].setText("Documento");
        textfield.setEnabled(true);
        combobox.setEnabled(true);
    }

    public static void legalType(javax.swing.JComboBox<String> combobox, javax.swing.JTextField textfield, javax.swing.JLabel... labels) {
        labels[0].setText("Razón Social");
        labels[1].setText("No Disponible");
        labels[1].setEnabled(false);
        labels[2].setText("No Disponible");
        labels[2].setEnabled(false);
        labels[3].setText("NIT");
        textfield.setEnabled(false);
        combobox.setEnabled(false);
    }
}

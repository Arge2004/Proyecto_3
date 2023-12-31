/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
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

    public static boolean validateIsNumber(javax.swing.JTextField... textfields) {
        try {
            for (JTextField textfield : textfields) {
                int number = Integer.parseInt(textfield.getText());
            }
            return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "¡Debes Ingresar Numeros en los Campos de Documento/NIT, Teléfono y Codigo Postal!");
            return false;
        }
    }

    public static boolean validateEmptyFields(javax.swing.JComboBox<String> combobox1, javax.swing.JTextField... textfields) {
        boolean flag = true;
        for (JTextField textfield : textfields) {
            if (textfield.getText().isBlank()) {
                flag = false; //si hay uno vacio entonces flag se vuelve false

            }
        }
        if (flag == false) { //se valida si hay uno vacio
            JOptionPane.showMessageDialog(null, "¡Debes Llenar Todos los Campos!");
            return true;
        } else {
            if (combobox1.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "¡Debes Llenar Todos los Campos!");
                return true;
            } else {
                return false;
            }
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

    public static boolean validateDate(Date fechaInicio, Date fechaFin, Date fechaAComparar) {
        if (fechaFin.equals(fechaInicio) && fechaFin.equals(fechaAComparar)) {
            return true;
        }
        return (fechaAComparar.after(fechaInicio) || fechaAComparar.equals(fechaInicio))
                && (fechaAComparar.before(fechaFin) || fechaAComparar.equals(fechaFin));
    }

}

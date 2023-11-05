/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

import control.Clients;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import model.Client;
import model.ClientNatural;


/**
 *
 * @author argen
 */
public class CrudBD {
    
    PreparedStatement ps = null;
    
    public void createClient(Client p, Clients client, ConexionDB conexion) throws SQLException {
        try {
            Statement st = conexion.getConexion().createStatement();
            String query;
            if (p instanceof ClientNatural) {
                query = "INSERT INTO clients_natural (id,name, phoneNumber, emailAddress, address) values (?, ?, ?,?,?)";
            } else {
                query = "INSERT INTO clients_legal (id,reasonSocial, phoneNumber, emailAddress, address) values (?, ?, ?,?,?)";
            }
            ps = conexion.getConexion().prepareStatement(query);
            ps.setString(2, client.getName());
            ps.setString(1, p.getId());
            ps.setString(3, p.getPhoneNumber());
            ps.setString(4, p.getEmailAdress());
            ps.setString(5, p.getAddress().toString());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        
        conexion.closeConexion();
    }
    
    public void eliminateClient(){
        
    }
    
    public void getClient(){
        
    }
}

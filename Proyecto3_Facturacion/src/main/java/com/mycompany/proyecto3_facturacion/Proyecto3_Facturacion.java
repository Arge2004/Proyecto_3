/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto3_facturacion;

import DB.ConexionDB;

/**
 *
 * @author argen
 */
public class Proyecto3_Facturacion {

    public static void main(String[] args) {
        ConexionDB conexion= new ConexionDB();
        conexion.getConexion();
        conexion.closeConexion();
    }
}

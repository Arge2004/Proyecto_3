/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSON;

import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author argen
 */
public class ProcessJSON {
    public class GrabarJson {

     {
        Gson gson = new Gson(); 
        gson.toJson(p1);             
        String cabeza = "Los pedidos del 9 de febrero";
        String infomia1 = gson.toJson(p1);         
        //Guardar
            BufferedWriter bw = new BufferedWriter(new FileWriter()));
            bw.write(cabeza);
            bw.newLine();
            bw.write(infomia1);
            System.out.println("Archivo creado y primera persona registrada");
        
        // adicionar
        p3.setNombre("JUAN");
        p3.setApellidos("Ruiz");
        p3.setEdad(60);
}

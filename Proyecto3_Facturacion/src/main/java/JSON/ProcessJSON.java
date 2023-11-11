/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSON;

import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author argen
 */
public class ProcessJSON {
    //Esstructura base
    public void GrabarJson() {

        // Crear un objeto Gson
        Gson gson = new Gson();

        // Crear un objeto para convertir a JSON
        Persona p1 = new Persona();
        p1.setNombre("Pedro");
        p1.setApellidos("Perez");
        p1.setEdad(30);

        // Convertir el objeto a JSON
        String json = gson.toJson(p1);

        // Escribir el JSON en un archivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("archivo.json"))) {
            bw.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

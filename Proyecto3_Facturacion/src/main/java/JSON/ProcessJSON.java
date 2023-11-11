/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JSON;

import DB.CrudDB;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import model.Detail;
import model.Product;
import model.Receipt;

/**
 *
 * @author argen
 */
public class ProcessJSON {

    public void GrabarJsons(ArrayList<String> list) {
        // Crear un objeto Gson con formato bonito
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Receipts.json"))) {
            for (String numReceipt : list) {
                // Acceder a la base de datos
                CrudDB crudDB = new CrudDB();

                // Obtener la información
                Receipt receipt = crudDB.getReceipt(numReceipt);
                ArrayList<Detail> details = crudDB.getDetails(Integer.parseInt(numReceipt));
                ArrayList<Product> products = new ArrayList<>();

                for (Detail detail : details) {
                    String numRpt = detail.getIdProduct();
                    Product product = crudDB.getProduct(numRpt);
                    products.add(product);
                }

                System.out.println(details);
                System.out.println(products);

                // Crear un objeto JSON que contenga la nueva información
                JsonObject jsonObject = new JsonObject();
                jsonObject.add("receipt", gson.toJsonTree(receipt));
                jsonObject.add("details", gson.toJsonTree(details));
                jsonObject.add("products", gson.toJsonTree(products));

                // Convertir el objeto JSON a una cadena
                String json = gson.toJson(jsonObject);

                // Escribir el JSON en el archivo (modo de anexar)
                bw.write(json);
                bw.newLine(); // Agregar una nueva línea después de cada iteración
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

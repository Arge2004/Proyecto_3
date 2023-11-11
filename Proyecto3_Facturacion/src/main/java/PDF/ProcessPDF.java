/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PDF;

import DB.CrudDB;
import com.itextpdf.text.BaseColor;
import control.Clients;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Detail;
import model.Product;
import model.Receipt;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.html.WebColors;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author argen
 */
public class ProcessPDF {

    public DefaultTableModel modifyTablePDF(javax.swing.JTable table, String id) {
        CrudDB crudDB = new CrudDB();
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) table.getModel();

        Receipt receipt = crudDB.getReceipt(id);
        ArrayList<Detail> details = crudDB.getDetails(Integer.parseInt(id));

        for (Detail detail : details) {
            String numRpt = detail.getIdProduct();
            Product product = crudDB.getProduct(numRpt);
            model.addRow(new Object[]{product.getTypeProduct(),
                product.getName(),
                detail.getQuantity(),
                product.getPrice(),
                detail.getPrice()});
        }
        return model;
    }

    public DefaultTableModel modifyHeadPDF(javax.swing.JTable table, String id) {
        CrudDB crudDB = new CrudDB();
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) table.getModel();
        Receipt receipt = crudDB.getReceipt(id);
        Clients client = (Clients) crudDB.getClient(receipt.getIdClient());
        model.setValueAt(id, 0, 3);
        model.setValueAt(client.getName(), 5, 1);
        model.setValueAt(client.getId(), 6, 1);
        model.setValueAt(client.getPhoneNumber(), 7, 1);
        model.setValueAt(client.getEmailAddress(), 8, 1);
        model.setValueAt(client.getAddress(), 9, 1);
        return model;
    }

    public DefaultTableModel modifyFootPDF(javax.swing.JTable table, String id) {
        CrudDB crudDB = new CrudDB();
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) table.getModel();
        Clients client = (Clients) crudDB.getClient(id);
        ArrayList<Detail> details = crudDB.getDetails(Integer.parseInt(id));
        int sume = 0;
        for (Detail detail : details) {
            sume += Integer.parseInt(detail.getPrice());
        }
        model.addRow(new Object[]{" ",
            " ",
            " ",
            " ",
            " "});
        model.addRow(new Object[]{"",
            "",
            "",
            "SubTotal:",
            sume});

        model.addRow(new Object[]{"",
            "",
            "",
            "IVA:",
            sume * 0.19});

        model.addRow(new Object[]{"",
            "",
            "",
            "Total:",
            sume * 1.19});
        return model;
    }

    public void generatePDF(javax.swing.JTable tableHeader, javax.swing.JTable tablePDF) {
        try {
            Document doc = new Document();
            PdfWriter.getInstance(doc, new FileOutputStream("facturacion.pdf"));
            doc.open();

            PdfPTable table = new PdfPTable(tableHeader.getColumnCount());
            table.getDefaultCell().setBorderColor(BaseColor.WHITE);

            for (int x = 0; x < tableHeader.getRowCount(); x++) {
                for (int y = 0; y < tableHeader.getColumnCount(); y++) {
                    String valor = (tableHeader.getValueAt(x, y) != null) ? tableHeader.getValueAt(x, y).toString() : " ";
                    table.addCell(valor);
                }
            }

            PdfPTable table1 = new PdfPTable(tablePDF.getColumnCount());

            for (int y = 0; y < tablePDF.getColumnCount(); y++) {
                PdfPCell headerCell = new PdfPCell(new Phrase(tablePDF.getColumnName(y)));
                headerCell.setBackgroundColor(BaseColor.CYAN); // Cambiar el color de fondo solo para la primera fila
                table1.addCell(headerCell);
            }

            for (int x = 1; x < tablePDF.getRowCount(); x++) {
                for (int y = 0; y < tablePDF.getColumnCount(); y++) {
                    String valor = (tablePDF.getValueAt(x, y) != null) ? tablePDF.getValueAt(x, y).toString() : " ";
                    table1.addCell(valor);
                }
            }

            doc.add(table);
            doc.add(table1);
            doc.close();
        } catch (DocumentException | java.io.FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

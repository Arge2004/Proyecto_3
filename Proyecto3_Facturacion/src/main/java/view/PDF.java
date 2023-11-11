/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import PDF.ProcessPDF;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author argen
 */
public class PDF extends javax.swing.JFrame {

    private ArrayList<String> ids;
    private ProcessPDF pdf = new ProcessPDF();
    private DefaultTableModel model;

    public PDF() {
        initComponents();
    }

    public PDF(ArrayList<String> numReceipts) {
        initComponents();
        tableHeader.getColumnModel().getColumn(1).setPreferredWidth(120);
        tableHeader.getColumnModel().getColumn(2).setPreferredWidth(15);
        tableHeader.getColumnModel().getColumn(3).setPreferredWidth(30);  
        model= (DefaultTableModel) tablePDF.getModel();
        ids= numReceipts;
        for (String id : ids) {
            model.setRowCount(1);
            tablePDF.setModel(pdf.modifyTablePDF(tablePDF, id));
            tableHeader.setModel(pdf.modifyHeadPDF(tableHeader, id));
            tablePDF.setModel(pdf.modifyFootPDF(tablePDF, id));
            pdf.generatePDF(tableHeader,tablePDF, ids.size());
            ProcessPDF.document.newPage();
        }

        if (ProcessPDF.document != null) {
            ProcessPDF.document.close();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePDF = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHeader = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablePDF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Tipo de Servicio", "Servicio", "Cantidad", "Precio Unitario", "Precio"}
            },
            new String [] {
                "Tipo de Servicio", "Servicio", "Cantidad", "Precio Unitario", "Precio "
            }
        ));
        jScrollPane1.setViewportView(tablePDF);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 954, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Productos", jPanel1);

        tableHeader.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Clínica Veterinaría Santo Tomás", null, "Factura Número:", null},
                {"Medellín, Colombia", null, null, null},
                {"3213423134", null, "", null},
                {"", null, null, null},
                {"Información del Cliente:", null, null, null},
                {"Nombre:", null, null, null},
                {"Identificación", null, null, null},
                {"Teléfono:", null, null, null},
                {"Email:", null, null, null},
                {"Dirección:", null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableHeader);
        if (tableHeader.getColumnModel().getColumnCount() > 0) {
            tableHeader.getColumnModel().getColumn(0).setResizable(false);
            tableHeader.getColumnModel().getColumn(1).setResizable(false);
            tableHeader.getColumnModel().getColumn(2).setResizable(false);
            tableHeader.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Detalles", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PDF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tableHeader;
    private javax.swing.JTable tablePDF;
    // End of variables declaration//GEN-END:variables
}

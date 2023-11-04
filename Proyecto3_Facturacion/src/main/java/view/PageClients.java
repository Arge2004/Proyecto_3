/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import model.Address;
import model.client;
import model.clientLegal;
import model.clientNatural;

/**
 *
 * @author gotle
 */
public class PageClients extends javax.swing.JFrame {

    /**
     * Creates new form PageBilling
     */
    public PageClients() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lbl_adress = new javax.swing.JLabel();
        txt_addressState = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        lbl_email = new javax.swing.JLabel();
        txt_document = new javax.swing.JTextField();
        lbl_phone = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        lbl_document = new javax.swing.JLabel();
        cbx_documentType = new javax.swing.JComboBox<>();
        lbl_documentType = new javax.swing.JLabel();
        txt_lastName = new javax.swing.JTextField();
        lbl_lastName = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        lbl_name = new javax.swing.JLabel();
        cbx_personType = new javax.swing.JComboBox<>();
        lbl_personType = new javax.swing.JLabel();
        lbl_addressState = new javax.swing.JLabel();
        lbl_addressMunicipality = new javax.swing.JLabel();
        txt_addressMunicipality = new javax.swing.JTextField();
        lbl_addressCity = new javax.swing.JLabel();
        txt_addressCity = new javax.swing.JTextField();
        lbl_addressPostalCode = new javax.swing.JLabel();
        txt_addressPostalCode = new javax.swing.JTextField();
        btn_registroCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setBackground(new java.awt.Color(242, 242, 242));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(327, 700));

        jPanel1.setPreferredSize(new java.awt.Dimension(327, 700));

        lbl_adress.setText("Direccion");

        lbl_email.setText("Correo Electronico");

        lbl_phone.setText("Teléfono");

        lbl_document.setText("Documento");

        cbx_documentType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "CC", "CE", "PA" }));

        lbl_documentType.setText("Tipo de Documento");

        lbl_lastName.setText("Apellidos");

        lbl_name.setText("Nombres");

        cbx_personType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Persona Natural", "Persona Juridica" }));

        lbl_personType.setText("Tipo de Persona");

        lbl_addressState.setText("Departamento");

        lbl_addressMunicipality.setText("Municipio");

        lbl_addressCity.setText("Ciudad");

        lbl_addressPostalCode.setText("Codigo Postal");

        btn_registroCliente.setBackground(new java.awt.Color(48, 153, 210));
        btn_registroCliente.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_registroCliente.setForeground(new java.awt.Color(255, 255, 255));
        btn_registroCliente.setText("Registrar Cliente");
        btn_registroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registroClienteActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(15, 120, 186));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("<html> <center>Ingrese Informacion <br> de la Persona </html>");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_addressCity)
                            .addComponent(lbl_personType)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_phone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_document, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbx_documentType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_lastName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_name, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_lastName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_documentType, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_document, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_phone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_email, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_name, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbx_personType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_addressState, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_addressState))
                                    .addGap(30, 30, 30)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbl_addressMunicipality)
                                        .addComponent(txt_addressMunicipality)
                                        .addComponent(lbl_addressPostalCode)
                                        .addComponent(txt_addressPostalCode, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                                .addComponent(txt_email, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(txt_addressCity, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_registroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(lbl_adress)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_personType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_personType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_name)
                .addGap(4, 4, 4)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_lastName)
                .addGap(4, 4, 4)
                .addComponent(txt_lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_documentType)
                .addGap(4, 4, 4)
                .addComponent(cbx_documentType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_document)
                .addGap(4, 4, 4)
                .addComponent(txt_document, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_phone)
                .addGap(4, 4, 4)
                .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_email)
                .addGap(4, 4, 4)
                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lbl_adress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_addressState)
                    .addComponent(lbl_addressMunicipality))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_addressState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_addressMunicipality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_addressCity)
                    .addComponent(lbl_addressPostalCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_addressCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_addressPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_registroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registroClienteActionPerformed

        switch (cbx_personType.getSelectedIndex()) {
            case 1:
                //natural
                client clientNatural = new clientNatural(
                        txt_name.getText(),
                        txt_lastName.getText(),
                        txt_phone.getText(),
                        txt_email.getText(),
                        txt_document.getText(),
                        new Address(
                                txt_addressState.getText(),
                                txt_addressMunicipality.getText(),
                                txt_addressCity.getText(),
                                txt_addressPostalCode.getText()
                        )
                );
            case 2:
            //juridico
                client clientLegal = new clientLegal(
                        txt_name.getText(),   
                        txt_phone.getText(),
                        txt_email.getText(),
                        txt_document.getText(),
                        new Address(
                                txt_addressState.getText(),
                                txt_addressMunicipality.getText(),
                                txt_addressCity.getText(),
                                txt_addressPostalCode.getText()
                        )
                );
            default:
                JOptionPane.showMessageDialog(null,"¡No has seleccionado ningun tipo de Cliente!");

        }

    }//GEN-LAST:event_btn_registroClienteActionPerformed

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
            java.util.logging.Logger.getLogger(PageClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PageClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PageClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PageClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageClients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_registroCliente;
    private javax.swing.JComboBox<String> cbx_documentType;
    private javax.swing.JComboBox<String> cbx_personType;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_addressCity;
    private javax.swing.JLabel lbl_addressMunicipality;
    private javax.swing.JLabel lbl_addressPostalCode;
    private javax.swing.JLabel lbl_addressState;
    private javax.swing.JLabel lbl_adress;
    private javax.swing.JLabel lbl_document;
    private javax.swing.JLabel lbl_documentType;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_lastName;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_personType;
    private javax.swing.JLabel lbl_phone;
    private javax.swing.JTextField txt_addressCity;
    private javax.swing.JTextField txt_addressMunicipality;
    private javax.swing.JTextField txt_addressPostalCode;
    private javax.swing.JTextField txt_addressState;
    private javax.swing.JTextField txt_document;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_lastName;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables
}
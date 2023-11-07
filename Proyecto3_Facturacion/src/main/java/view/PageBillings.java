/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import DB.CrudBD;
import control.Clients;
import control.UseComponents;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Product;
import model.ProductForReceipt;
import model.Receipt;

/**
 *
 * @author gotle
 */
public class PageBillings extends javax.swing.JFrame {
    
    private DefaultTableModel model1, model2;
    private CrudBD crudBD = new CrudBD();
    private ArrayList<Clients> clients = crudBD.getClients();
    private ArrayList<Receipt> receipts = crudBD.getReceipt();
    private ArrayList<Product> productsByType = new ArrayList<>();
    private ArrayList<ProductForReceipt> productsForReceipt = new ArrayList<>();
    private String idClient;

    /**
     * Creates new form PageBillings
     */
    public PageBillings() {
        initComponents();
        this.setLocationRelativeTo(null);
        model1 = (DefaultTableModel) tbl_consultPeople.getModel();
        Iterator<Clients> iterator = clients.iterator();
        while (iterator.hasNext()) {
            Clients client = iterator.next();
            model1.addRow(new Object[]{client.getId(),
                client.getName(),});
            
        }
        tbl_consultPeople.setModel(model1);
        
        model2 = (DefaultTableModel) tbl_consultReceipts.getModel();
        Iterator<Receipt> iterator2 = receipts.iterator();
        while (iterator2.hasNext()) {
            Receipt receipt = iterator2.next();
            model2.addRow(new Object[]{
                receipt.getNumReceipt(),
                receipt.getTypeClient(),
                receipt.getNameClient(),
                receipt.getIdClient(),
                receipt.getDate()});
            
        }
        tbl_consultReceipts.setModel(model2);
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
        jPanel2 = new javax.swing.JPanel();
        lbl_preview = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        txt_priceProducts = new javax.swing.JTextField();
        lbl_unitPrice = new javax.swing.JLabel();
        cbx_products = new javax.swing.JComboBox<>();
        lbl_products = new javax.swing.JLabel();
        cbx_typeProducts = new javax.swing.JComboBox<>();
        lbl_typeProducts = new javax.swing.JLabel();
        lbl_cantity = new javax.swing.JLabel();
        txt_totalPrice = new javax.swing.JTextField();
        lbl_totalPrice = new javax.swing.JLabel();
        lbl_infoBills = new javax.swing.JLabel();
        txt_cantity = new javax.swing.JSpinner();
        btn_addProduct = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_previewBills = new javax.swing.JTable();
        btn_menu = new javax.swing.JButton();
        btn_addReceipt = new javax.swing.JButton();
        lbl_consultPeople = new javax.swing.JLabel();
        txt_consultPeople = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbl_consultPeople = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_consultReceipts = new javax.swing.JTable();
        spn_billDate1 = new javax.swing.JSpinner();
        btn_filter = new javax.swing.JButton();
        lbl_intervalDates = new javax.swing.JLabel();
        lbl_billPersonType = new javax.swing.JLabel();
        cbx_billPersonType = new javax.swing.JComboBox<>();
        lbl_billDocument = new javax.swing.JLabel();
        txt_billDocument = new javax.swing.JTextField();
        spn_billDate2 = new javax.swing.JSpinner();
        btn_generatePdf = new javax.swing.JButton();
        btn_menu2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(15, 120, 186));
        setResizable(false);

        jTabbedPane1.setBackground(new java.awt.Color(15, 120, 186));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(0, 0));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(870, 620));

        jPanel2.setMinimumSize(new java.awt.Dimension(870, 620));
        jPanel2.setPreferredSize(new java.awt.Dimension(870, 620));

        lbl_preview.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_preview.setText("Previsualización");

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 255), 1, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_priceProducts.setEditable(false);
        jPanel3.add(txt_priceProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 130, -1));

        lbl_unitPrice.setText("Precio / Unidad");
        jPanel3.add(lbl_unitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        cbx_products.setEnabled(false);
        cbx_products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_productsActionPerformed(evt);
            }
        });
        jPanel3.add(cbx_products, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 340, -1));

        lbl_products.setText("Servicios / Productos");
        jPanel3.add(lbl_products, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        cbx_typeProducts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Consulta", "Imagenología", "Exámenes Clínicos", "Peluquería" }));
        cbx_typeProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_typeProductsActionPerformed(evt);
            }
        });
        jPanel3.add(cbx_typeProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 340, -1));

        lbl_typeProducts.setText("Tipo de Servicio");
        jPanel3.add(lbl_typeProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        lbl_cantity.setText("Cantidad");
        jPanel3.add(lbl_cantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        txt_totalPrice.setEditable(false);
        jPanel3.add(txt_totalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 340, -1));

        lbl_totalPrice.setText("Precio Total");
        jPanel3.add(lbl_totalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        lbl_infoBills.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_infoBills.setText("<html> <center>Ingrese Informacion del Producto <br> y Seleccione a una Persona </html>");
        jPanel3.add(lbl_infoBills, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        txt_cantity.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        txt_cantity.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txt_cantityStateChanged(evt);
            }
        });
        jPanel3.add(txt_cantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 190, -1));

        btn_addProduct.setBackground(new java.awt.Color(48, 153, 210));
        btn_addProduct.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_addProduct.setForeground(new java.awt.Color(255, 255, 255));
        btn_addProduct.setText("Añadir Producto");
        btn_addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addProductActionPerformed(evt);
            }
        });
        jPanel3.add(btn_addProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 260, 30));

        tbl_previewBills.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Cantidad", "Precio Total"
            }
        ));
        jScrollPane2.setViewportView(tbl_previewBills);

        btn_menu.setBackground(new java.awt.Color(255, 102, 102));
        btn_menu.setText("Menu");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

        btn_addReceipt.setBackground(new java.awt.Color(48, 153, 210));
        btn_addReceipt.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btn_addReceipt.setForeground(new java.awt.Color(255, 255, 255));
        btn_addReceipt.setText("Generar Factura");
        btn_addReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addReceiptActionPerformed(evt);
            }
        });

        lbl_consultPeople.setText("<html> <center>Buscar por <br> Nombre / Documento </html>");

        txt_consultPeople.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_consultPeopleKeyReleased(evt);
            }
        });

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tbl_consultPeople.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre"
            }
        ));
        tbl_consultPeople.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_consultPeopleMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbl_consultPeople);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(lbl_consultPeople, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_consultPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(lbl_preview))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(275, 275, 275)
                                .addComponent(btn_addReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_menu)))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_consultPeople, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_consultPeople, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btn_menu))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_preview)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_addReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(239, 239, 239))
        );

        jTabbedPane1.addTab("Registrar Facturas", jPanel2);

        jPanel1.setMinimumSize(new java.awt.Dimension(870, 620));
        jPanel1.setPreferredSize(new java.awt.Dimension(870, 620));

        tbl_consultReceipts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número Factura", "Tipo de Cliente", "Nombre del Cliente", "Documento/NIT", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(tbl_consultReceipts);

        spn_billDate1.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(1672613340000L), new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));

        btn_filter.setBackground(new java.awt.Color(48, 153, 210));
        btn_filter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_filter.setForeground(new java.awt.Color(255, 255, 255));
        btn_filter.setText("Filtrar");

        lbl_intervalDates.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_intervalDates.setText("Ingresar Intervalo de Fechas");

        lbl_billPersonType.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_billPersonType.setText("Tipo de Persona");

        cbx_billPersonType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Persona Natural", "Persona Juridica" }));

        lbl_billDocument.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_billDocument.setText("Ingresar Documento");

        spn_billDate2.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), new java.util.Date(1672613460000L), new java.util.Date(), java.util.Calendar.DAY_OF_MONTH));

        btn_generatePdf.setBackground(new java.awt.Color(255, 255, 204));
        btn_generatePdf.setText("Generar PDF");

        btn_menu2.setBackground(new java.awt.Color(255, 102, 102));
        btn_menu2.setText("Menu");
        btn_menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_generatePdf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_billPersonType)
                            .addComponent(cbx_billPersonType, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_billDocument)
                            .addComponent(txt_billDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(lbl_intervalDates))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(spn_billDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(spn_billDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_generatePdf, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_billPersonType)
                        .addGap(4, 4, 4)
                        .addComponent(cbx_billPersonType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_billDocument)
                        .addGap(4, 4, 4)
                        .addComponent(txt_billDocument, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_intervalDates)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spn_billDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spn_billDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("Consultar Facturas", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        this.dispose();
        new PageMenu().setVisible(true);
    }//GEN-LAST:event_btn_menuActionPerformed

    private void btn_menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu2ActionPerformed
        this.dispose();
        new PageMenu().setVisible(true);
    }//GEN-LAST:event_btn_menu2ActionPerformed

    private void cbx_productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_productsActionPerformed
        txt_cantity.setValue(1);
        productsByType = crudBD.getProducts(String.valueOf(cbx_typeProducts.getSelectedItem()));
        for (Product elemento : productsByType) {
            if (elemento.getName().equals(cbx_products.getSelectedItem())) {
                txt_priceProducts.setText(String.valueOf(elemento.getPrice()));
                txt_totalPrice.setText(String.valueOf(elemento.getPrice()));
            }
        }
    }//GEN-LAST:event_cbx_productsActionPerformed

    private void cbx_typeProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_typeProductsActionPerformed
        txt_priceProducts.setText("");
        txt_totalPrice.setText("");
        txt_cantity.setValue(1);
        cbx_products.removeAllItems();
        if (cbx_typeProducts.getSelectedIndex() == 0) {
            cbx_products.setEnabled(false);
        } else {
            cbx_products.setEnabled(true);
            for (Product elemento : crudBD.getProducts(String.valueOf(cbx_typeProducts.getSelectedItem()))) {
                cbx_products.addItem(elemento.getName());
            }
        }
    }//GEN-LAST:event_cbx_typeProductsActionPerformed

    private void txt_cantityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txt_cantityStateChanged
        txt_totalPrice.setText(UseComponents.totalPrice(txt_cantity, txt_priceProducts));
    }//GEN-LAST:event_txt_cantityStateChanged

    private void tbl_consultPeopleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_consultPeopleMouseClicked
        int seleccionFila = tbl_consultPeople.rowAtPoint(evt.getPoint());
        idClient = String.valueOf(tbl_consultPeople.getValueAt(seleccionFila, 0));
    }//GEN-LAST:event_tbl_consultPeopleMouseClicked

    private void txt_consultPeopleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_consultPeopleKeyReleased
        String input = txt_consultPeople.getText();
        if (input.isBlank()) {
            model1.setRowCount(0);
            model1 = (DefaultTableModel) tbl_consultPeople.getModel();
            Iterator<Clients> iterator = clients.iterator();
            while (iterator.hasNext()) {
                Clients client = iterator.next();
                model1.addRow(new Object[]{client.getId(),
                    client.getName(),});
            }
            tbl_consultPeople.setModel(model1);
        } else {
            DefaultTableModel model = model1;
            model.setRowCount(0);
            // Filtra y muestra solo los datos que coincidan con la entrada del usuario
            for (Clients person : clients) {
                System.out.println("Input: " + input);
                System.out.println("Person ID: " + person.getId());
                System.out.println("Person Name: " + person.getName());
                if (person.getId().toLowerCase().contains(input.toLowerCase()) || person.getName().toLowerCase().contains(input.toLowerCase())) {
                    model.addRow(new Object[]{person.getId(), person.getName()});
                    
                }
            }
            tbl_consultPeople.setModel(model);
        }
    }//GEN-LAST:event_txt_consultPeopleKeyReleased

    private void btn_addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addProductActionPerformed
        Product product = productsByType.get(cbx_products.getSelectedIndex());
        ProductForReceipt productForReceipt = new ProductForReceipt(product.getId(), String.valueOf(txt_cantity.getValue()), txt_totalPrice.getText());
        productsForReceipt.add(productForReceipt);
        model1 = (DefaultTableModel) tbl_previewBills.getModel();
        model1.addRow(new Object[]{product.getId(),
            product.getName(),
            txt_cantity.getValue(),
            txt_totalPrice.getText()});
        
        tbl_previewBills.setModel(model1);

    }//GEN-LAST:event_btn_addProductActionPerformed

    private void btn_addReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addReceiptActionPerformed
        crudBD.createReceipt(idClient);
        crudBD.addProductReceipt(productsForReceipt);
        System.out.println(idClient);
        JOptionPane.showMessageDialog(null, "Factura Enviada Exitosamente");
        receipts = crudBD.getReceipt();
        model2.setRowCount(0);
        model2 = (DefaultTableModel) tbl_consultReceipts.getModel();
        Iterator<Receipt> iterator2 = receipts.iterator();
        while (iterator2.hasNext()) {
            Receipt receipt = iterator2.next();
            model2.addRow(new Object[]{
                receipt.getNumReceipt(),
                receipt.getTypeClient(),
                receipt.getNameClient(),
                receipt.getIdClient(),
                receipt.getDate()});
            
        }
        tbl_consultReceipts.setModel(model2);
        
    }//GEN-LAST:event_btn_addReceiptActionPerformed

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
            java.util.logging.Logger.getLogger(PageBillings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PageBillings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PageBillings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PageBillings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PageBillings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addProduct;
    private javax.swing.JButton btn_addReceipt;
    private javax.swing.JButton btn_filter;
    private javax.swing.JButton btn_generatePdf;
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_menu2;
    private javax.swing.JComboBox<String> cbx_billPersonType;
    private javax.swing.JComboBox<String> cbx_products;
    private javax.swing.JComboBox<String> cbx_typeProducts;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbl_billDocument;
    private javax.swing.JLabel lbl_billPersonType;
    private javax.swing.JLabel lbl_cantity;
    private javax.swing.JLabel lbl_consultPeople;
    private javax.swing.JLabel lbl_infoBills;
    private javax.swing.JLabel lbl_intervalDates;
    private javax.swing.JLabel lbl_preview;
    private javax.swing.JLabel lbl_products;
    private javax.swing.JLabel lbl_totalPrice;
    private javax.swing.JLabel lbl_typeProducts;
    private javax.swing.JLabel lbl_unitPrice;
    private javax.swing.JSpinner spn_billDate1;
    private javax.swing.JSpinner spn_billDate2;
    private javax.swing.JTable tbl_consultPeople;
    private javax.swing.JTable tbl_consultReceipts;
    private javax.swing.JTable tbl_previewBills;
    private javax.swing.JTextField txt_billDocument;
    private javax.swing.JSpinner txt_cantity;
    private javax.swing.JTextField txt_consultPeople;
    private javax.swing.JTextField txt_priceProducts;
    private javax.swing.JTextField txt_totalPrice;
    // End of variables declaration//GEN-END:variables
}

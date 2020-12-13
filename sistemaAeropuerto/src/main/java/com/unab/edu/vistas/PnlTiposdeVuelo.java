/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.vistas;

import com.unab.edu.DAO.ClsTiposVuelo;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import com.unab.edu.Entidades.Tipos_vuelo;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class PnlTiposdeVuelo extends javax.swing.JPanel {

    /**
     * Creates new form PnlTiposdeVuelo
     */
    public PnlTiposdeVuelo() {
        initComponents();
        CargarTabla();
        tbTipos.setBackground(new Color(0,0,0,0));
        
        tbTipos.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tbTipos.getTableHeader().setOpaque(false);
        tbTipos.getTableHeader().setBackground(new Color(0,153,204));
        tbTipos.getTableHeader().setForeground(new Color(0,0,0));
        tbTipos.setRowHeight(25);
    }
    void CargarTabla() {
        String Titulos[] = {"Id", "Tipo de Vuelo", "Descuento"};
        DefaultTableModel ModeloT = new DefaultTableModel(null, Titulos);
        ClsTiposVuelo clsTipos = new ClsTiposVuelo();
        ArrayList<Tipos_vuelo> tipos = clsTipos.MostrarTipos();
        String filas[] = new String[4];
        for (var IterarTipo : tipos) {
            filas[0] = String.valueOf(IterarTipo.getIdTipos_vuelo());
            filas[1] = IterarTipo.getTipo();
            filas[2] = String.valueOf(IterarTipo.getPorcentajeDesc());
            ModeloT.addRow(filas);
        }
        tbTipos.setModel(ModeloT);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbPTipos = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtDescuento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTipos = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 102, 255));

        tbPTipos.setBackground(new java.awt.Color(51, 102, 255));
        tbPTipos.setForeground(new java.awt.Color(255, 255, 255));
        tbPTipos.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipos de Vuelo");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id:");

        txtId.setBackground(new java.awt.Color(0, 0, 0));
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo:");

        txtTipo.setBackground(new java.awt.Color(0, 0, 0));
        txtTipo.setForeground(new java.awt.Color(255, 255, 255));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtDescuento.setBackground(new java.awt.Color(0, 0, 0));
        txtDescuento.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descuento:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(33, 33, 33)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTipo)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnGuardar)
                            .addGap(116, 116, 116)
                            .addComponent(btnActualizar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar))))
                .addGap(206, 206, 206))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addGap(125, 125, 125))
        );

        tbPTipos.addTab("Registro Tipo de Vuelo", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        tbTipos.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        tbTipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbTipos.setFocusable(false);
        tbTipos.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbTipos.setRowHeight(25);
        tbTipos.setSelectionBackground(new java.awt.Color(0, 102, 255));
        tbTipos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbTipos.setShowVerticalLines(false);
        tbTipos.getTableHeader().setReorderingAllowed(false);
        tbTipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTiposMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTipos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        tbPTipos.addTab("Lista Tipo de Vuelo", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbPTipos)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbPTipos)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(txtTipo.getText().isEmpty()==true ||txtDescuento.getText().isEmpty() ==true){
         JOptionPane.showMessageDialog(null, "Rellene todos los campos necesarios");}
        else{ClsTiposVuelo clsTipos = new ClsTiposVuelo();
        Tipos_vuelo tipo = new Tipos_vuelo();
        tipo.setTipo(txtTipo.getText());
        tipo.setPorcentajeDesc(Double.parseDouble(txtDescuento.getText()));
        clsTipos.AgregarTipo(tipo);
        CargarTabla();}
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       if(txtId.getText().isEmpty()==true ||txtTipo.getText().isEmpty()==true ||txtDescuento.getText().isEmpty()==true){
       JOptionPane.showMessageDialog(null, "Rellene todos los campos necesarios");}
       else{ClsTiposVuelo clsTipos = new ClsTiposVuelo();
        Tipos_vuelo tipo = new Tipos_vuelo();
        tipo.setIdTipos_vuelo(Integer.parseInt(txtId.getText()));
        tipo.setTipo(txtTipo.getText());
        tipo.setPorcentajeDesc(Double.parseDouble(txtDescuento.getText()));
        clsTipos.ActualizarTipo(tipo);
        CargarTabla();}
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(txtId.getText().isEmpty()==true){JOptionPane.showMessageDialog(null, "Rellene todos los campos necesarios");}
        else{ClsTiposVuelo clsTipos = new ClsTiposVuelo();
        Tipos_vuelo tipo = new Tipos_vuelo();
        tipo.setIdTipos_vuelo(Integer.parseInt(txtId.getText()));
        clsTipos.BorrarTipo(tipo);
        CargarTabla();}
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbTiposMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTiposMouseClicked
        tbPTipos.setSelectedIndex(tbPTipos.indexOfComponent(jPanel2));
        int fila = tbTipos.getSelectedRow();

        String ID = String.valueOf(tbTipos.getValueAt(fila, 0));
        String Tipo = String.valueOf(tbTipos.getValueAt(fila, 1));
        String Descuento = String.valueOf(tbTipos.getValueAt(fila, 2));
        txtId.setText(ID);
        txtTipo.setText(Tipo);
        txtDescuento.setText(Descuento);
    }//GEN-LAST:event_tbTiposMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane tbPTipos;
    private javax.swing.JTable tbTipos;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
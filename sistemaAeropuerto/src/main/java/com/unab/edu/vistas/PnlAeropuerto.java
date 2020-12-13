/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.vistas;

import com.unab.edu.DAO.ClsAeropuerto;
import com.unab.edu.Entidades.Aeropuerto;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class PnlAeropuerto extends javax.swing.JPanel {

    /**
     * Creates new form PnlAeropuerto
     */
    public PnlAeropuerto() {
        initComponents();
        CargarTabla();
        tbAeropuerto.setBackground(new Color(0,0,0,0));
        
        tbAeropuerto.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tbAeropuerto.getTableHeader().setOpaque(false);
        tbAeropuerto.getTableHeader().setBackground(new Color(0,153,204));
        tbAeropuerto.getTableHeader().setForeground(new Color(0,0,0));
        tbAeropuerto.setRowHeight(25);
    }

    void CargarTabla() {
        String Titulos[] = {"ID", "Nombre", "Pais", "Ciudad"};
        DefaultTableModel ModeloT = new DefaultTableModel(null, Titulos);
        ClsAeropuerto clsAeropuerto = new ClsAeropuerto();
        ArrayList<Aeropuerto> Companies = clsAeropuerto.MostrAeropuerto();
        String filas[] = new String[5];
        for (var IterarCom : Companies) {
            filas[0] = String.valueOf(IterarCom.getIdAeropuerto());
            filas[1] = String.valueOf(IterarCom.getNombre());
            filas[2] = String.valueOf(IterarCom.getPais());
            filas[3] = String.valueOf(IterarCom.getCiudad());
            ModeloT.addRow(filas);
        }
        tbAeropuerto.setModel(ModeloT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbPAeropuerto = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAeropuerto = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 102, 255));

        tbPAeropuerto.setBackground(new java.awt.Color(51, 102, 255));
        tbPAeropuerto.setForeground(new java.awt.Color(255, 255, 255));
        tbPAeropuerto.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro Aeropuertos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pais:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ciudad:");

        txtCiudad.setBackground(new java.awt.Color(0, 0, 0));
        txtCiudad.setForeground(new java.awt.Color(255, 255, 255));

        txtPais.setBackground(new java.awt.Color(0, 0, 0));
        txtPais.setForeground(new java.awt.Color(255, 255, 255));

        txtNombre.setBackground(new java.awt.Color(0, 0, 0));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));

        txtId.setBackground(new java.awt.Color(0, 0, 0));
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.setEnabled(false);

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
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

        btnActualizar.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(335, 335, 335)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtPais, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                                    .addComponent(txtCiudad)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                                .addComponent(btnActualizar)
                                .addGap(103, 103, 103)
                                .addComponent(btnEliminar)))))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        tbPAeropuerto.addTab("Registro Aeropuertos", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 153, 204));

        tbAeropuerto.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        tbAeropuerto.setModel(new javax.swing.table.DefaultTableModel(
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
        tbAeropuerto.setFocusable(false);
        tbAeropuerto.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbAeropuerto.setRowHeight(25);
        tbAeropuerto.setSelectionBackground(new java.awt.Color(0, 153, 204));
        tbAeropuerto.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbAeropuerto.setShowVerticalLines(false);
        tbAeropuerto.getTableHeader().setReorderingAllowed(false);
        tbAeropuerto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAeropuertoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbAeropuerto);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)
        );

        tbPAeropuerto.addTab("Lista Aeropuertos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbPAeropuerto)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbPAeropuerto)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtNombre.getText().isEmpty() == true || txtPais.getText().isEmpty() == true || txtCiudad.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos necesarios");
        } else {
            ClsAeropuerto aeropuertos = new ClsAeropuerto();
            Aeropuerto aeropuerto = new Aeropuerto();
            aeropuerto.setNombre(txtNombre.getText());
            aeropuerto.setPais(txtPais.getText());
            aeropuerto.setCiudad(txtCiudad.getText());
            aeropuertos.AgregarAeropuerto(aeropuerto);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(txtId.getText().isEmpty()){JOptionPane.showMessageDialog(null, "Rellene todos los campos");}
        else{
        ClsAeropuerto aeropuertos = new ClsAeropuerto();
        Aeropuerto aeropuerto = new Aeropuerto();
        aeropuerto.setIdAeropuerto(Integer.parseInt(txtId.getText()));
        aeropuertos.BorrarAeropuerto(aeropuerto);}
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (txtId.getText().isEmpty() == true || txtNombre.getText().isEmpty() == true || txtPais.getText().isEmpty() == true || txtCiudad.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos necesarios");
        } else {
            ClsAeropuerto aeropuertos = new ClsAeropuerto();
            Aeropuerto aeropuerto = new Aeropuerto();
            aeropuerto.setIdAeropuerto(Integer.parseInt(txtId.getText()));
            aeropuerto.setNombre(txtNombre.getText());
            aeropuerto.setPais(txtPais.getText());
            aeropuerto.setCiudad(txtCiudad.getText());
            aeropuertos.ActualizarAeropuerto(aeropuerto);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tbAeropuertoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAeropuertoMouseClicked
        tbPAeropuerto.setSelectedIndex(tbPAeropuerto.indexOfComponent(jPanel2));
        int fila = tbAeropuerto.getSelectedRow();

        String ID = String.valueOf(tbAeropuerto.getValueAt(fila, 0));
        String Nombre = String.valueOf(tbAeropuerto.getValueAt(fila, 1));
        String Pais = String.valueOf(tbAeropuerto.getValueAt(fila, 2));
        String Ciudad = String.valueOf(tbAeropuerto.getValueAt(fila, 3));
        txtId.setText(ID);
        txtNombre.setText(Nombre);
        txtPais.setText(Pais);
        txtCiudad.setText(Ciudad);
    }//GEN-LAST:event_tbAeropuertoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAeropuerto;
    private javax.swing.JTabbedPane tbPAeropuerto;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    // End of variables declaration//GEN-END:variables
}
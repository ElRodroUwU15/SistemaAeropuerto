/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.vistas;

import com.unab.edu.DAO.ClsPasajero;
import com.unab.edu.Entidades.Pasajero;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PREDATOR
 */
public class PnlPasajero extends javax.swing.JPanel {

    /**
     * Creates new form PnlPasajero
     */
    public PnlPasajero() {
        initComponents();
        CargarTabla();
    }
    
    void CargarTabla() {
        String Titulos[] = {"idPasajero", "nombres", "apellidos", "edad", "sexo", "documentoIdentidad", "pasaporte"};
        DefaultTableModel ModeloT = new DefaultTableModel(null, Titulos);
        ClsPasajero clsPasajero = new ClsPasajero();
        ArrayList<Pasajero> pasajeros = clsPasajero.MostraPasajeros();
        String filas[] = new String[8];
        for (var Iterar : pasajeros) {
            filas[0] = String.valueOf(Iterar.getIdPasajero());
            filas[1] = String.valueOf(Iterar.getNombres());
            filas[2] = String.valueOf(Iterar.getApellidos());
            filas[3] = String.valueOf(Iterar.getEdad());
            filas[4] = String.valueOf(Iterar.getSexo());
            filas[5] = String.valueOf(Iterar.getDocumentoIdentidad());
            filas[6] = String.valueOf(Iterar.getIdPasajero());
            ModeloT.addRow(filas);
        }
        tbPasajero.setModel(ModeloT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtpPasajero = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtDui = new javax.swing.JTextField();
        txtPasapote = new javax.swing.JTextField();
        bttnGuardar = new javax.swing.JButton();
        bttnEliminar = new javax.swing.JButton();
        bttnActualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPasajero = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 102, 255));

        jtpPasajero.setBackground(new java.awt.Color(51, 102, 255));
        jtpPasajero.setForeground(new java.awt.Color(255, 255, 255));
        jtpPasajero.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pasajeros");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sexo:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DUI:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pasaporte:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Id:");

        txtNombre.setBackground(new java.awt.Color(0, 0, 0));

        txtApellido.setBackground(new java.awt.Color(0, 0, 0));

        txtId.setBackground(new java.awt.Color(0, 0, 0));

        txtEdad.setBackground(new java.awt.Color(0, 0, 0));

        txtSexo.setBackground(new java.awt.Color(0, 0, 0));

        txtDui.setBackground(new java.awt.Color(0, 0, 0));

        txtPasapote.setBackground(new java.awt.Color(0, 0, 0));

        bttnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        bttnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttnGuardar.setText("Guardar");
        bttnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnGuardarActionPerformed(evt);
            }
        });

        bttnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        bttnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttnEliminar.setText("Eliminar");
        bttnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnEliminarActionPerformed(evt);
            }
        });

        bttnActualizar.setBackground(new java.awt.Color(0, 0, 0));
        bttnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttnActualizar.setText("Actualizar");
        bttnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(bttnGuardar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombre)
                                .addComponent(txtApellido)
                                .addComponent(txtId)
                                .addComponent(txtEdad)
                                .addComponent(txtSexo)
                                .addComponent(txtDui)
                                .addComponent(txtPasapote, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bttnActualizar)
                                .addGap(121, 121, 121)
                                .addComponent(bttnEliminar)))))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPasapote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttnGuardar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bttnEliminar)
                        .addComponent(bttnActualizar)))
                .addGap(47, 47, 47))
        );

        jtpPasajero.addTab("Registro Pasajeros", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        tbPasajero.setModel(new javax.swing.table.DefaultTableModel(
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
        tbPasajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPasajeroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPasajero);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jtpPasajero.addTab("Lista Pasajeros", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 872, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jtpPasajero))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jtpPasajero))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnGuardarActionPerformed
        ClsPasajero pasajero = new ClsPasajero();
        Pasajero pasajeros = new Pasajero();
        pasajeros.setNombres(txtNombre.getText());
        pasajeros.setApellidos(txtApellido.getText());
        pasajeros.setEdad(Integer.parseInt(txtEdad.getText()));
        pasajeros.setSexo(txtSexo.getText());
        pasajeros.setDocumentoIdentidad(txtDui.getText());
        pasajeros.setPasaporte(txtPasapote.getText());
        pasajero.AgregarPasajero(pasajeros);
        CargarTabla();
    }//GEN-LAST:event_bttnGuardarActionPerformed

    private void bttnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnActualizarActionPerformed
        ClsPasajero pasajero = new ClsPasajero();
        Pasajero pasajeros = new Pasajero();
        pasajeros.setIdPasajero(Integer.parseInt(txtId.getText()));
        pasajeros.setNombres(txtNombre.getText());
        pasajeros.setApellidos(txtApellido.getText());
        pasajeros.setEdad(Integer.parseInt(txtEdad.getText()));
        pasajeros.setSexo(txtSexo.getText());
        pasajeros.setDocumentoIdentidad(txtDui.getText());
        pasajeros.setPasaporte(txtPasapote.getText());
        pasajero.ActualizarPasajero(pasajeros);
        CargarTabla();
    }//GEN-LAST:event_bttnActualizarActionPerformed

    private void bttnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnEliminarActionPerformed
        ClsPasajero pasajero = new ClsPasajero();
        Pasajero pasajeros = new Pasajero();
        pasajeros.setIdPasajero(Integer.parseInt(txtId.getText()));
        pasajero.BorrarPasajero(pasajeros);
        CargarTabla();
    }//GEN-LAST:event_bttnEliminarActionPerformed

    private void tbPasajeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPasajeroMouseClicked
        jtpPasajero.setSelectedIndex(jtpPasajero.indexOfComponent(jPanel1));
        int fila = tbPasajero.getSelectedRow();
        
        String idPasajero = String.valueOf(tbPasajero.getValueAt(fila, 0));
        String nombres = String.valueOf(tbPasajero.getValueAt(fila, 1));
        String apellidos = String.valueOf(tbPasajero.getValueAt(fila, 2));
        String edad = String.valueOf(tbPasajero.getValueAt(fila, 3));
        String sexo = String.valueOf(tbPasajero.getValueAt(fila, 4));
        String documentoIdentidad = String.valueOf(tbPasajero.getValueAt(fila, 5));
        String pasaporte = String.valueOf(tbPasajero.getValueAt(fila, 6));
        
        txtId.setText(idPasajero);
        txtNombre.setText(nombres);
        txtApellido.setText(apellidos);
        txtEdad.setText(edad);
        txtSexo.setText(sexo);
        txtDui.setText(documentoIdentidad);
        txtPasapote.setText(pasaporte);
    }//GEN-LAST:event_tbPasajeroMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnActualizar;
    private javax.swing.JButton bttnEliminar;
    private javax.swing.JButton bttnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jtpPasajero;
    private javax.swing.JTable tbPasajero;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDui;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPasapote;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
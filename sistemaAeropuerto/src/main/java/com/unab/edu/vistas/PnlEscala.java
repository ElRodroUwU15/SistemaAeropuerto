/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.vistas;

import com.unab.edu.DAO.ClsCompany;
import com.unab.edu.DAO.ClsEscala;
import com.unab.edu.DAO.ClsItinerario;
import com.unab.edu.DAO.ClsVuelo;
import com.unab.edu.DAO.Clsaeropuerto;
import com.unab.edu.DAO.InnerJoinVuelo;
import com.unab.edu.Entidades.Aeropuerto;
import com.unab.edu.Entidades.Vuelo;
import com.unab.edu.Entidades.Escala;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 *
 */
public class PnlEscala extends javax.swing.JPanel {

    /**
     * Creates new form PnlEscala
     */
    public PnlEscala() {
        initComponents();
        DisplayMemberAero();
    }

    public int idVuelo;
    String valueMemberAero[];
    int contadorAero = 1;

    void DisplayMemberAero() {
        DefaultComboBoxModel cbdefaDefault = new DefaultComboBoxModel();
        Clsaeropuerto claseAeropuerto = new Clsaeropuerto();
        ArrayList<Aeropuerto> aeropuertos = claseAeropuerto.MostrAeropuerto();
        valueMemberAero = new String[aeropuertos.size() + 1];
        String filas[] = new String[3];
        cbdefaDefault.addElement("");
        for (var IterarDatosAeropuerto : aeropuertos) {
            filas[0] = String.valueOf(IterarDatosAeropuerto.getIdAeropuerto());
            filas[1] = IterarDatosAeropuerto.getNombre();
            valueMemberAero[contadorAero] = filas[0];
            cbdefaDefault.addElement(filas[1]);
            contadorAero++;
        }
        cbAeropuerto.setModel(cbdefaDefault);
    }

    void CargarTabla() {
        Vuelo vuelo = new Vuelo();
        ClsVuelo clsVuelo = new ClsVuelo();
        vuelo = clsVuelo.SeleccionarVuelo(idVuelo);
        String Titulos[] = {"Id", "Numero Escala", "Aeropuerto", "N Pasajeros Suben", "N Pasajeros Bajan", "Precio"};
        DefaultTableModel ModeloT = new DefaultTableModel(null, Titulos);
        ClsEscala clsEscala = new ClsEscala();
        ArrayList<Escala> Escalas = clsEscala.MostrarEscala(vuelo.getIdIterinario());
        String filas[] = new String[7];
        for (var IterarEscala : Escalas) {
            filas[0] = String.valueOf(IterarEscala.getIdEscala());
            filas[1] = String.valueOf(IterarEscala.getNumeroEscala());
            filas[2] = String.valueOf(IterarEscala.getNombre());
            filas[3] = String.valueOf(IterarEscala.getNPasajerosSuben());
            filas[4] = String.valueOf(IterarEscala.getNpasajerosBajan());
            filas[5] = String.valueOf(IterarEscala.getPrecio());
            ModeloT.addRow(filas);
        }
        tbEscalas.setModel(ModeloT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbPEscala = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbAeropuerto = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEscalas = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 102, 255));

        tbPEscala.setBackground(new java.awt.Color(0, 153, 204));
        tbPEscala.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Aeropuerto:");

        cbAeropuerto.setBackground(new java.awt.Color(0, 0, 0));
        cbAeropuerto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio:");

        txtPrecio.setBackground(new java.awt.Color(0, 153, 204));
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setText("0.0");
        txtPrecio.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Id:");

        txtId.setBackground(new java.awt.Color(0, 153, 204));
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.setBorder(null);
        txtId.setEnabled(false);

        btnGuardar.setBackground(new java.awt.Color(51, 102, 255));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(51, 102, 255));
        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(51, 102, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar)
                        .addGap(177, 177, 177)
                        .addComponent(btnEliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPrecio)
                            .addComponent(cbAeropuerto, 0, 498, Short.MAX_VALUE)
                            .addComponent(txtId)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(150, 150, 150))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(2, 2, 2)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbAeropuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(2, 2, 2)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar)
                    .addComponent(btnGuardar))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        tbPEscala.addTab("Registro Escala", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        tbEscalas.setModel(new javax.swing.table.DefaultTableModel(
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
        tbEscalas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEscalasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbEscalas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        tbPEscala.addTab("Lista Escala", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbPEscala)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbPEscala, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtPrecio.getText().isEmpty() || cbAeropuerto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
        } else {
            Vuelo vuelo = new Vuelo();
            ClsVuelo clsVuelo = new ClsVuelo();
            vuelo = clsVuelo.SeleccionarVuelo(idVuelo);
            ClsEscala clsescala = new ClsEscala();
            Escala escala = new Escala();
            escala.setPrecio(Double.parseDouble(txtPrecio.getText()));
            escala.setIdAeropuerto(Integer.parseInt(valueMemberAero[cbAeropuerto.getSelectedIndex()]));
            escala.setNumeroEscala(tbEscalas.getRowCount() + 1);
            if (clsescala.ComprobarEscala(vuelo.getIdIterinario(), escala.getIdAeropuerto())== true) {
                JOptionPane.showMessageDialog(null, "La escala de ese Aeropuerto ya esta Registrada");
            }else
            {
                clsescala.AgregarEscala(escala, vuelo.getIdIterinario());
            }
        }
        CargarTabla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if (txtId.getText().isEmpty() || txtPrecio.getText().isEmpty() || cbAeropuerto.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
        } else {
            ClsEscala clsescala = new ClsEscala();
            Escala escala = new Escala();
            escala.setIdEscala(Integer.parseInt(txtId.getText()));
            escala.setPrecio(Double.parseDouble(txtPrecio.getText()));
            escala.setIdAeropuerto(Integer.parseInt(valueMemberAero[cbAeropuerto.getSelectedIndex()]));
            clsescala.ActualizarEscala(escala);
            CargarTabla();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos");
        } else {
            Vuelo vuelo = new Vuelo();
            ClsVuelo clsVuelo = new ClsVuelo();
            vuelo = clsVuelo.SeleccionarVuelo(idVuelo);
            ClsEscala clsescala = new ClsEscala();
            Escala escala = new Escala();
            escala.setIdEscala(Integer.parseInt(txtId.getText()));
            escala = clsescala.SeleccionarEscala(escala.getIdEscala());
            clsescala.BorrarEscala(escala);

            ArrayList<Escala> Escalas = clsescala.EscalasSuperiores(vuelo.getIdIterinario(), escala.getNumeroEscala());
            for (var iterarescala : Escalas) {
                clsescala.ActualizarNEscala(iterarescala.getIdItinerario(), iterarescala.getNumeroEscala());
            }
        }
        CargarTabla();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tbEscalasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEscalasMouseClicked
        tbPEscala.setSelectedIndex(tbPEscala.indexOfComponent(jPanel1));
        int fila = tbEscalas.getSelectedRow();
        int ID = Integer.parseInt(String.valueOf(tbEscalas.getValueAt(fila, 0)));
        Escala esc = new Escala();
        ClsEscala clsEscala = new ClsEscala();
        esc = clsEscala.SeleccionarEscala(ID);
        txtId.setText(String.valueOf(esc.getIdEscala()));
        txtPrecio.setText(String.valueOf(esc.getPrecio()));
        for (int i = 1; i < valueMemberAero.length; i++) {
            int idAero = Integer.parseInt(valueMemberAero[i]);
            if (esc.getIdAeropuerto() == idAero) {
                cbAeropuerto.setSelectedIndex(i);
            }
        }
    }//GEN-LAST:event_tbEscalasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbAeropuerto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbEscalas;
    private javax.swing.JTabbedPane tbPEscala;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.edu.vistas;

import com.unab.edu.DAO.ClsEscala;
import com.unab.edu.DAO.ClsVuelo;
import com.unab.edu.DAO.Clsaeropuerto;
import com.unab.edu.DAO.InnerJoinVuelo;
import com.unab.edu.Entidades.Aeropuerto;
import com.unab.edu.Entidades.Escala;
import com.unab.edu.Entidades.Vuelo;
import com.unab.edu.sistemaaeropuerto.CambioPanel;
import com.unab.edu.sistemaaeropuerto.frmMenuUsuario;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class PnlListaVuelos extends javax.swing.JPanel {

    /**
     * Creates new form PnlListaVuelos
     */
    public PnlListaVuelos() {
        initComponents();
        CargarTablaVuelos();
        DisplayMemberAero();
        tbVuelos.setBackground(new Color(0, 0, 0, 0));

        tbVuelos.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tbVuelos.getTableHeader().setOpaque(false);
        tbVuelos.getTableHeader().setBackground(new Color(0, 153, 204));
        tbVuelos.getTableHeader().setForeground(new Color(0, 0, 0));
        tbVuelos.setRowHeight(25);
    }
    public frmMenuUsuario menuUser;
    CambioPanel CmPanel = new CambioPanel();

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

    void CargarTablaVuelos() {
        ClsEscala clsEscala = new ClsEscala();
        String Titulos[] = {"Vuelo", "N Escala", "AeropuertoDestino", "Precio", "Tipo de Vuelo", "Fecha", "Hora", "Descuento", "Fecha Max Descuento"};
        DefaultTableModel ModeloT = new DefaultTableModel(null, Titulos);
        ClsVuelo clsVuelos = new ClsVuelo();
        int idAeroO = 0;
        if (cbAeropuerto.getSelectedIndex() > 0) {
            idAeroO = (Integer.parseInt(valueMemberAero[cbAeropuerto.getSelectedIndex()]));
        }
        ArrayList<InnerJoinVuelo> Vuelos = clsVuelos.MostrarVuelosOrigen(idAeroO);
        String filas[] = new String[10];
        Vuelo vuelo = new Vuelo();

        for (var IterarVuelo : Vuelos) {
            vuelo = clsVuelos.SeleccionarVuelo(IterarVuelo.getVuelo());
            ArrayList<Escala> Escalas = clsEscala.MostrarEscala(vuelo.getIdIterinario());
            if (Escalas.size() >= 1) {
                for (var IterarEscala : Escalas) {
                    filas[0] = String.valueOf(IterarVuelo.getVuelo());
                    filas[1] = String.valueOf(IterarEscala.getNumeroEscala());
                    filas[2] = IterarEscala.getNombre();
                    filas[3] = String.valueOf(IterarEscala.getPrecio());
                    filas[4] = IterarVuelo.getTipo();
                    filas[5] = String.valueOf(IterarVuelo.getFecha());
                    filas[6] = IterarVuelo.getHora() + ":" + IterarVuelo.getMinutos();
                    filas[7] = String.valueOf(IterarVuelo.getDescuento()) + "%";
                    if (IterarVuelo.getFechaDesc() == null) {
                        filas[8] = "";
                    } else {
                        filas[8] = String.valueOf(IterarVuelo.getFechaDesc());
                    }
                    ModeloT.addRow(filas);
                }
            }

        }
        tbVuelos.setModel(ModeloT);
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
        tbVuelos = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbAeropuerto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 204));
        setPreferredSize(new java.awt.Dimension(920, 528));

        tbVuelos.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        tbVuelos.setModel(new javax.swing.table.DefaultTableModel(
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
        tbVuelos.setFocusable(false);
        tbVuelos.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tbVuelos.setRowHeight(25);
        tbVuelos.setSelectionBackground(new java.awt.Color(0, 153, 204));
        tbVuelos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbVuelos.setShowVerticalLines(false);
        tbVuelos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbVuelos);

        btnNuevo.setBackground(new java.awt.Color(0, 0, 0));
        btnNuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo Pasaje");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de Vuelos");

        cbAeropuerto.setBackground(new java.awt.Color(0, 153, 204));
        cbAeropuerto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cbAeropuerto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbAeropuerto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAeropuertoItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione Aeropuerto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(377, 377, 377))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbAeropuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(jLabel2)
                    .addComponent(cbAeropuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        int fila = tbVuelos.getSelectedRow();
        String idVuelo = String.valueOf(tbVuelos.getValueAt(fila, 0));
        String NEscala = String.valueOf(tbVuelos.getValueAt(fila, 1));
        String Precio = String.valueOf(tbVuelos.getValueAt(fila, 3));
        String Descuento = String.valueOf(tbVuelos.getValueAt(fila, 7));
        double PrecioVuelo = Double.parseDouble(Precio);
        String[] c = Descuento.split("%");
        double PorcentajeDescuento = Double.parseDouble(c[0]);
        PrecioVuelo = PrecioVuelo - (PrecioVuelo * (PorcentajeDescuento / 100));

        PnlPasaje frmPasaje = new PnlPasaje();
        CmPanel.ModificarPanel(menuUser.PnlContenedor, frmPasaje);
        /*frmPasaje.txtVuelo.setText(idVuelo);
        frmPasaje.txtNEscala.setText(NEscala);
        frmPasaje.txtPrecio.setText(String.valueOf(PrecioVuelo));*/
        frmPasaje.NVuelo = Integer.parseInt(idVuelo);
        frmPasaje.DisplayMemberClase();
        frmPasaje.DisplayAsientos();
        frmPasaje.menuUser = menuUser;
        frmPasaje.Precio = PrecioVuelo;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void cbAeropuertoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAeropuertoItemStateChanged
        CargarTablaVuelos();
    }//GEN-LAST:event_cbAeropuertoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cbAeropuerto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbVuelos;
    // End of variables declaration//GEN-END:variables
}

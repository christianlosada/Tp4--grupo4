/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.util.HashSet;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Entidades.Materia;

/**
 *
 * @author Netbook
 */
public class VistaMaterias extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista
     */
    public VistaMaterias() {
        initComponents();
    }

    public boolean ValidarCamposVacios(JDesktopPane jpMateria) {
        boolean bandera = true;
        for (int i = 0; i < jpMateria.getComponents().length; i++) {
            if (!bandera) {
                break;
            }
            if (jpMateria.getComponents()[i] instanceof JTextField) {
                bandera = !((JTextField) jpMateria.getComponents()[i]).getText().equals("") ? true : false;
            }
        }
        return bandera;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMateria = new javax.swing.JDesktopPane();
        lblIdMateria = new javax.swing.JLabel();
        lbanio = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblNombreMateria = new javax.swing.JLabel();
        txtIdMateria = new javax.swing.JTextField();
        txtAnio = new javax.swing.JTextField();
        txtNombreMateria = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        lblIdMateria1 = new javax.swing.JLabel();
        lbanio1 = new javax.swing.JLabel();
        lblTitulo1 = new javax.swing.JLabel();
        lblNombreMateria1 = new javax.swing.JLabel();
        txtIdMateria1 = new javax.swing.JTextField();
        txtAnio1 = new javax.swing.JTextField();
        txtNombreMateria1 = new javax.swing.JTextField();
        btnGuardar1 = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        btnNuevo1 = new javax.swing.JButton();

        jpMateria.setBackground(new java.awt.Color(0, 0, 0));

        lblIdMateria.setText("Código Materia");

        lbanio.setText("Año al que pertenece:");

        lblTitulo.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        lblTitulo.setText("FORMULARIO MATERIAS");

        lblNombreMateria.setText("Nombre Materia:");

        txtIdMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdMateriaActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jpMateria.setLayer(lblIdMateria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpMateria.setLayer(lbanio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpMateria.setLayer(lblTitulo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpMateria.setLayer(lblNombreMateria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpMateria.setLayer(txtIdMateria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpMateria.setLayer(txtAnio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpMateria.setLayer(txtNombreMateria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpMateria.setLayer(btnGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpMateria.setLayer(btnSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jpMateria.setLayer(btnNuevo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jpMateriaLayout = new javax.swing.GroupLayout(jpMateria);
        jpMateria.setLayout(jpMateriaLayout);
        jpMateriaLayout.setHorizontalGroup(
            jpMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMateriaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnGuardar)
                .addGroup(jpMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpMateriaLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpMateriaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jpMateriaLayout.createSequentialGroup()
                                .addComponent(lblNombreMateria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpMateriaLayout.createSequentialGroup()
                                .addComponent(lbanio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMateriaLayout.createSequentialGroup()
                                .addComponent(lblIdMateria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMateriaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(139, 139, 139))
        );
        jpMateriaLayout.setVerticalGroup(
            jpMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMateriaLayout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jpMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jpMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jpMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbanio, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jpMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnNuevo)
                    .addComponent(btnSalir))
                .addGap(20, 20, 20))
        );

        jDesktopPane2.setBackground(new java.awt.Color(0, 0, 0));

        lblIdMateria1.setText("Código Materia");

        lbanio1.setText("Año al que pertenece:");

        lblTitulo1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        lblTitulo1.setText("FORMULARIO MATERIAS");

        lblNombreMateria1.setText("Nombre Materia:");

        txtIdMateria1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdMateria1ActionPerformed(evt);
            }
        });

        btnGuardar1.setText("Guardar");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });

        btnSalir1.setText("Salir");

        btnNuevo1.setText("Nuevo");
        btnNuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevo1ActionPerformed(evt);
            }
        });

        jDesktopPane2.setLayer(lblIdMateria1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(lbanio1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(lblTitulo1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(lblNombreMateria1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txtIdMateria1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txtAnio1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txtNombreMateria1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btnGuardar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btnSalir1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btnNuevo1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnGuardar1)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbanio1)
                            .addComponent(lblIdMateria1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreMateria1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreMateria1)
                            .addComponent(txtIdMateria1)
                            .addComponent(txtAnio1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevo1)
                        .addGap(55, 55, 55)
                        .addComponent(btnSalir1)
                        .addGap(48, 48, 48))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreMateria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbanio1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar1)
                    .addComponent(btnNuevo1)
                    .addComponent(btnSalir1))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMateria)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMateria)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdMateriaActionPerformed

    }//GEN-LAST:event_txtIdMateriaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            int id = Integer.parseInt(txtIdMateria.getText());
            int anio = Integer.parseInt(txtAnio.getText());
            String nombre = txtNombreMateria.getText();
            if (ValidarCamposVacios(jpMateria)) {
                Materia materia = new Materia();
                materia.agregarMateria(id, anio, nombre);
                Vista_Principal.getListaM().add(materia);
            } else {
                JOptionPane.showMessageDialog(this, "Complete los campos", "ERROR", HEIGHT);
            }

        } catch (NumberFormatException nb) {
            JOptionPane.showMessageDialog(this, "Ingrese un numero", "ERROR", HEIGHT);
            txtIdMateria.setText("");
            txtAnio.setText("");
            txtNombreMateria.setText("");

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        txtIdMateria.setText("");
        txtAnio.setText("");
        txtNombreMateria.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void txtIdMateria1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdMateria1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdMateria1ActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnNuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevo1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        hide();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnNuevo1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JDesktopPane jpMateria;
    private javax.swing.JLabel lbanio;
    private javax.swing.JLabel lbanio1;
    private javax.swing.JLabel lblIdMateria;
    private javax.swing.JLabel lblIdMateria1;
    private javax.swing.JLabel lblNombreMateria;
    private javax.swing.JLabel lblNombreMateria1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JTextField txtAnio;
    private javax.swing.JTextField txtAnio1;
    private javax.swing.JTextField txtIdMateria;
    private javax.swing.JTextField txtIdMateria1;
    private javax.swing.JTextField txtNombreMateria;
    private javax.swing.JTextField txtNombreMateria1;
    // End of variables declaration//GEN-END:variables
}

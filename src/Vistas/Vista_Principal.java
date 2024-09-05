/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.util.HashSet;
import Entidades.Alumno;
import Entidades.Materia;

/**
 *
 * @author Netbook
 */
public class Vista_Principal extends javax.swing.JFrame {

    static HashSet<Alumno> listaAlumnos = new HashSet();
    static HashSet<Materia> listaM = new HashSet();
    
        
    

    public static void setListaAlumnos(HashSet<Alumno> listaAlumnos) {
        Vista_Principal.listaAlumnos = listaAlumnos;
    }

    public static HashSet<Materia> getListaM() {
        return listaM;
    }

    public static void setListaM(HashSet<Materia> listaM) {
        Vista_Principal.listaM = listaM;
    }

    public static HashSet<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    /**
     * Creates new form Vista_Unica
     */
    public Vista_Principal() {//constructor
        initComponents();
        /*CREAR EN LA VISTA PRINCIPAL 2 HashSet que serán STATIC.
1. HashSet <Alumno> A COMPARTIR con vista Alumnos y Vista Inscripción
2. HashSet <Materia> A COMPARTIR con vista Materias y Vista Inscripción
3. Al invocar el constructor de los JinternalFrame, pase los SET como
argumentos, para cargarlos o mostrarlos*/

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAlumno = new javax.swing.JMenu();
        jmiAgregarAlumno = new javax.swing.JMenuItem();
        jmMateria = new javax.swing.JMenu();
        jmiAgregarMateria = new javax.swing.JMenuItem();
        jmRegistro = new javax.swing.JMenu();
        jmiFormularioInscripcion = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escritorio");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        jmAlumno.setText("Alumno");
        jmAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumnoActionPerformed(evt);
            }
        });

        jmiAgregarAlumno.setText("Agregar Alumno");
        jmiAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarAlumnoActionPerformed(evt);
            }
        });
        jmAlumno.add(jmiAgregarAlumno);

        jMenuBar1.add(jmAlumno);

        jmMateria.setText("Materia");

        jmiAgregarMateria.setText("Agregar Materia");
        jmiAgregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarMateriaActionPerformed(evt);
            }
        });
        jmMateria.add(jmiAgregarMateria);

        jMenuBar1.add(jmMateria);

        jmRegistro.setText("Registro");

        jmiFormularioInscripcion.setText("Formulario de Inscripcion");
        jmiFormularioInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFormularioInscripcionActionPerformed(evt);
            }
        });
        jmRegistro.add(jmiFormularioInscripcion);

        jMenuBar1.add(jmRegistro);

        jmSalir.setText("Salir");
        jmSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaAlumno a1 = new VistaAlumno();
        a1.setVisible(true);
        escritorio.add(a1);
        escritorio.moveToFront(a1);
    }//GEN-LAST:event_jmiAgregarAlumnoActionPerformed

    private void jmAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumnoActionPerformed

    }//GEN-LAST:event_jmAlumnoActionPerformed

    private void jmiAgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaMaterias a1 = new VistaMaterias();
        a1.setVisible(true);
        escritorio.add(a1);
        escritorio.moveToFront(a1);
    }//GEN-LAST:event_jmiAgregarMateriaActionPerformed

    private void jmiFormularioInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFormularioInscripcionActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaInscripcion a1 = new VistaInscripcion();
        a1.setVisible(true);
        escritorio.add(a1);
        escritorio.moveToFront(a1);        // TODO add your handling code here:
    }//GEN-LAST:event_jmiFormularioInscripcionActionPerformed

    private void jmSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jmSalirMouseClicked

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
            java.util.logging.Logger.getLogger(Vista_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_Principal().setVisible(true);
            }
        });
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAlumno;
    private javax.swing.JMenu jmMateria;
    private javax.swing.JMenu jmRegistro;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenuItem jmiAgregarAlumno;
    private javax.swing.JMenuItem jmiAgregarMateria;
    private javax.swing.JMenuItem jmiFormularioInscripcion;
    // End of variables declaration//GEN-END:variables
}


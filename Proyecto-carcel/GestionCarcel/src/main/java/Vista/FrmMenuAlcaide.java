/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author KEISUKE29
 */
public class FrmMenuAlcaide extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenuAlcaide
     */
    public FrmMenuAlcaide() {
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

        jLabel1 = new javax.swing.JLabel();
        btnRegristrarRecluso = new javax.swing.JButton();
        btnModificarActvidades = new javax.swing.JButton();
        btnRegistrarActividad = new javax.swing.JButton();
        btnConsultarActividades = new javax.swing.JButton();
        btnEliminarActividades = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Menu-Alcaide");

        btnRegristrarRecluso.setText("Registrar Recluso");
        btnRegristrarRecluso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegristrarReclusoActionPerformed(evt);
            }
        });

        btnModificarActvidades.setText("Modificar Actividades");
        btnModificarActvidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActvidadesActionPerformed(evt);
            }
        });

        btnRegistrarActividad.setText("Registrar Actividades");
        btnRegistrarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActividadActionPerformed(evt);
            }
        });

        btnConsultarActividades.setText("Cosultar Actividades");
        btnConsultarActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActividadesActionPerformed(evt);
            }
        });

        btnEliminarActividades.setText("Eliminar Actividades");
        btnEliminarActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActividadesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEliminarActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarActvidades, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegristrarRecluso, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(175, 175, 175))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnRegristrarRecluso, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnModificarActvidades, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConsultarActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminarActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActividadActionPerformed
        // TODO add your handling code here:
        FrmRegistrarActividad frmRegistrarActividad = new FrmRegistrarActividad();
        frmRegistrarActividad.setVisible(true);
        
    }//GEN-LAST:event_btnRegistrarActividadActionPerformed

    private void btnModificarActvidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActvidadesActionPerformed
        // TODO add your handling code here:
        FmrModificarActividadExistente frmModificarActividad = new FmrModificarActividadExistente();
        frmModificarActividad.setVisible(true);
    }//GEN-LAST:event_btnModificarActvidadesActionPerformed

    private void btnRegristrarReclusoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegristrarReclusoActionPerformed
        // TODO add your handling code here:
        FrmRegistroRecluso frmRegistroRecluso = new FrmRegistroRecluso();
        frmRegistroRecluso.setVisible(true);
    }//GEN-LAST:event_btnRegristrarReclusoActionPerformed

    private void btnConsultarActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActividadesActionPerformed
        // TODO add your handling code here:
        FrmConsultarActividad frmConsultarActividad = new FrmConsultarActividad();
        frmConsultarActividad.setVisible(true);

    }//GEN-LAST:event_btnConsultarActividadesActionPerformed

    private void btnEliminarActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActividadesActionPerformed
        // TODO add your handling code here:
        FmrModificarActividadExistente frmModificarActividad = new FmrModificarActividadExistente();
        frmModificarActividad.setVisible(true);

    }//GEN-LAST:event_btnEliminarActividadesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMenuAlcaide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuAlcaide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuAlcaide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuAlcaide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuAlcaide().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarActividades;
    private javax.swing.JButton btnEliminarActividades;
    private javax.swing.JButton btnModificarActvidades;
    private javax.swing.JButton btnRegistrarActividad;
    private javax.swing.JButton btnRegristrarRecluso;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

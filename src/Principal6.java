
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herrera
 */
public class Principal6 extends javax.swing.JFrame {

    /**
     * Creates new form Principal6
     */
    double v[];
    public Principal6() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtVector = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtCrear = new javax.swing.JButton();
        txtLlenarManual = new javax.swing.JButton();
        txtLlenarAuto = new javax.swing.JButton();
        txtMostrar = new javax.swing.JButton();
        txtBorrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtProductoria = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSumatoria = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("JasmineUPC", 3, 24)); // NOI18N
        jLabel1.setText("DADO UN VECTOR V ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 180, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Inicial"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Vector v");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 100, 60));

        txtVector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVectorKeyTyped(evt);
            }
        });
        getContentPane().add(txtVector, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 80, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));

        txtCrear.setText("Crear");
        txtCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCrearActionPerformed(evt);
            }
        });

        txtLlenarManual.setText("Llenar Manual");
        txtLlenarManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLlenarManualActionPerformed(evt);
            }
        });

        txtLlenarAuto.setText("Llenar Auto");
        txtLlenarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLlenarAutoActionPerformed(evt);
            }
        });

        txtMostrar.setText("Mostrar");
        txtMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMostrarActionPerformed(evt);
            }
        });

        txtBorrar.setText("Borrar");
        txtBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLlenarAuto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLlenarManual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLlenarManual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLlenarAuto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBorrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 160, 210));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Productoria de la primera mitad"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtProductoria.setColumns(20);
        txtProductoria.setRows(5);
        jScrollPane1.setViewportView(txtProductoria);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 200, 140));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Sumatoria del la segunda mitad"));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSumatoria.setColumns(20);
        txtSumatoria.setRows(5);
        jScrollPane2.setViewportView(txtSumatoria);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 210, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCrearActionPerformed
        // TODO add your handling code here:
        int vector;
        if (txtVector.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this,"Digite el vector v","ERROR",JOptionPane.ERROR_MESSAGE);
        
        txtVector.requestFocusInWindow();
        } else if (Integer.parseInt(txtVector.getText().trim())==0){
        JOptionPane.showMessageDialog(this, "El vector v no puede ser cero","ERROR",JOptionPane.ERROR_MESSAGE);
        txtVector.requestFocusInWindow();
        txtVector.selectAll();
        
        }else{
       vector = Integer.parseInt(txtVector.getText().trim());
        v= new double [vector];
        JOptionPane.showMessageDialog (this, "El vector se ha creado exitosamente");
        
        
        }
    }//GEN-LAST:event_txtCrearActionPerformed

    private void txtVectorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVectorKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
          if (!Character.isDigit(c)){
          
          getToolkit().beep();
          evt.consume();
          }
          
    }//GEN-LAST:event_txtVectorKeyTyped

    private void txtLlenarManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLlenarManualActionPerformed
        // TODO add your handling code here:
        
        double l;
        for (int i=0; i<v.length; i++) {
        l= Double.parseDouble(JOptionPane.showInputDialog(this, "Digite el elemento en la posicion"+i));
        v[i]=l;
        
        }
    }//GEN-LAST:event_txtLlenarManualActionPerformed

    private void txtMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMostrarActionPerformed
        // TODO add your handling code here:
        
        String pr,su;
        
        int produc = 1,s=0,product;
        
        int acum =0;
        
        for (int i=0; i< v.length; i++) {
           
            produc= (int) (produc*v[i]);
            pr= String.valueOf(produc);
            txtProductoria.setText(pr);
            
            acum = (int) (acum+v[i]);
            su= String.valueOf(acum);
            txtSumatoria.setText(su);
            
              }
        
        
        
    }//GEN-LAST:event_txtMostrarActionPerformed

    private void txtBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBorrarActionPerformed
        // TODO add your handling code here:
        txtVector.setText("");
        txtProductoria.setText("");
        txtSumatoria.setText("");
        
        v = null;
        txtVector.requestFocusInWindow();
        
    }//GEN-LAST:event_txtBorrarActionPerformed

    private void txtLlenarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLlenarAutoActionPerformed
        // TODO add your handling code here:
        int n;
        for (int i=0; i<v.length; i++) {
        n= (int) (Math.random()*50+1);
        
        v[i]=n;
        
        JOptionPane.showMessageDialog(this, "Vector Llenado Correctamente");
        }
    }//GEN-LAST:event_txtLlenarAutoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton txtBorrar;
    private javax.swing.JButton txtCrear;
    private javax.swing.JButton txtLlenarAuto;
    private javax.swing.JButton txtLlenarManual;
    private javax.swing.JButton txtMostrar;
    private javax.swing.JTextArea txtProductoria;
    private javax.swing.JTextArea txtSumatoria;
    private javax.swing.JTextField txtVector;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantalla;

/**
 *
 * @author user
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        btnDividir = new javax.swing.JLabel();
        btnMultiplicar = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JLabel();
        btnRestar = new javax.swing.JLabel();
        btnSumar = new javax.swing.JLabel();
        btnResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("X");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Calculadora");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Text field.png")); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 430, -1));

        txtResultado.setBackground(new java.awt.Color(0, 0, 0));
        txtResultado.setForeground(new java.awt.Color(255, 255, 255));
        txtResultado.setText("0");
        txtResultado.setBorder(null);
        txtResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 350, 30));

        btnDividir.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Group 1 (1).png")); // NOI18N
        btnDividir.setText("jLabel3");
        btnDividir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDividirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDividirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDividirMouseExited(evt);
            }
        });
        jPanel1.add(btnDividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 50, -1));

        btnMultiplicar.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Group 2 (1).png")); // NOI18N
        btnMultiplicar.setText("jLabel4");
        btnMultiplicar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMultiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMultiplicarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMultiplicarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMultiplicarMouseExited(evt);
            }
        });
        jPanel1.add(btnMultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 50, -1));

        btnBorrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Group 3 (1).png")); // NOI18N
        btnBorrar.setText("jLabel5");
        btnBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBorrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBorrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBorrarMouseExited(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 50, -1));

        btnRestar.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Group 4 (1).png")); // NOI18N
        btnRestar.setText("jLabel6");
        btnRestar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRestarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRestarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRestarMouseExited(evt);
            }
        });
        jPanel1.add(btnRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 50, -1));

        btnSumar.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Group 5 (1).png")); // NOI18N
        btnSumar.setText("jLabel7");
        btnSumar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSumar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSumarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSumarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSumarMouseExited(evt);
            }
        });
        jPanel1.add(btnSumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 50, -1));

        btnResultado.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Group 6 (1).png")); // NOI18N
        btnResultado.setText("jLabel8");
        btnResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResultado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResultadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnResultadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnResultadoMouseExited(evt);
            }
        });
        jPanel1.add(btnResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 50, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    double primernumero, segundonumero, resultado;
    String operador;
    public void capturaOperador(String op){
        primernumero = Double.parseDouble(txtResultado.getText());
        operador = op;
        txtResultado.setText("");
    }
    public void realizarOperacion() {
        segundonumero = Double.parseDouble(txtResultado.getText());
            switch(operador){
                case "+":
                    resultado = primernumero + segundonumero;
                    break;
                case "-":
                    resultado = primernumero - segundonumero;
                    break;
                case "*":
                    resultado = primernumero * segundonumero;
                    break;
                case "/":
                    resultado = primernumero / segundonumero;
                    break;
            }
            if (resultado == (int) resultado){
                txtResultado.setText(String.valueOf((int) resultado));
            }else{
                txtResultado.setText(String.valueOf(resultado));
            }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDividirMouseClicked
        capturaOperador("/");
    }//GEN-LAST:event_btnDividirMouseClicked

    private void btnMultiplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultiplicarMouseClicked
        capturaOperador("*");
    }//GEN-LAST:event_btnMultiplicarMouseClicked

    private void btnRestarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestarMouseClicked
        capturaOperador("-");
    }//GEN-LAST:event_btnRestarMouseClicked

    private void btnSumarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumarMouseClicked
        capturaOperador("+");
    }//GEN-LAST:event_btnSumarMouseClicked

    private void btnResultadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResultadoMouseClicked
        realizarOperacion();
    }//GEN-LAST:event_btnResultadoMouseClicked

    private void btnBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseClicked
        txtResultado.setText("");
        primernumero = 0;
        segundonumero = 0;
        operador = "";
    }//GEN-LAST:event_btnBorrarMouseClicked

    private void btnDividirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDividirMouseEntered
        btnDividir.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Group 1.png")); // NOI18N
    }//GEN-LAST:event_btnDividirMouseEntered

    private void btnMultiplicarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultiplicarMouseEntered
        btnMultiplicar.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Group 2.png")); // NOI18N
    }//GEN-LAST:event_btnMultiplicarMouseEntered

    private void btnBorrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseEntered
        btnBorrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Group 3.png")); // NOI18N
    }//GEN-LAST:event_btnBorrarMouseEntered

    private void btnRestarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestarMouseEntered
        btnRestar.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Group 4.png")); // NOI18N
    }//GEN-LAST:event_btnRestarMouseEntered

    private void btnSumarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumarMouseEntered
        btnSumar.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Group 5.png")); // NOI18N
    }//GEN-LAST:event_btnSumarMouseEntered

    private void btnResultadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResultadoMouseEntered
        btnResultado.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Group 6.png")); // NOI18N
    }//GEN-LAST:event_btnResultadoMouseEntered

    private void btnDividirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDividirMouseExited
        btnDividir.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Group 1 (1).png")); // NOI18N
    }//GEN-LAST:event_btnDividirMouseExited

    private void btnMultiplicarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultiplicarMouseExited
        btnMultiplicar.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Group 2 (1).png")); // NOI18N
    }//GEN-LAST:event_btnMultiplicarMouseExited

    private void btnBorrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBorrarMouseExited
        btnBorrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Group 3 (1).png")); // NOI18N
    }//GEN-LAST:event_btnBorrarMouseExited

    private void btnRestarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestarMouseExited
        btnRestar.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Group 4 (1).png")); // NOI18N
    }//GEN-LAST:event_btnRestarMouseExited

    private void btnSumarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSumarMouseExited
        btnSumar.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Group 5 (1).png")); // NOI18N
    }//GEN-LAST:event_btnSumarMouseExited

    private void btnResultadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResultadoMouseExited
        btnResultado.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Downloads\\Group 6 (1).png")); // NOI18N
    }//GEN-LAST:event_btnResultadoMouseExited

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBorrar;
    private javax.swing.JLabel btnDividir;
    private javax.swing.JLabel btnMultiplicar;
    private javax.swing.JLabel btnRestar;
    private javax.swing.JLabel btnResultado;
    private javax.swing.JLabel btnSumar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}

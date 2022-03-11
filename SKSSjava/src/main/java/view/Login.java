/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Controller.LoginController;
import Model.DAO.Banco;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends javax.swing.JFrame {

    private final LoginController controller;

    /**
     * Creates new form login
     */
    public Login() {
        initComponents();
      controller = new LoginController(this);
      Banco.inicia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textUsuario = new javax.swing.JTextField();
        textSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        SKSSfundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(textUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 170, -1));

        textSenha.setText("abc123");
        getContentPane().add(textSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 170, -1));

        jLabel2.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Senha");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 70, 30));

        jLabel3.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("LOGIN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 120, 50));

        jLabel4.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Usuario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 70, 30));

        jButton1.setFont(new java.awt.Font("Swis721 BT", 0, 14)); // NOI18N
        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 100, 40));

        SKSSfundo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fernnd\\Documents\\NetBeansProjects\\SKSSjava\\src\\main\\java\\view\\imagens\\chasing--midnight.jpeg")); // NOI18N
        getContentPane().add(SKSSfundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUsuarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        this.controller.entrarNoSistema();
    }//GEN-LAST:event_jButton1ActionPerformed

    public JPasswordField getTextSenha() {
        return textSenha;
    }

    public void setTextSenha(JPasswordField textSenha) {
        this.textSenha = textSenha;
    }

    public JTextField getTextUsuario() {
        return textUsuario;
    }

    public void setTextUsuario(JTextField textUsuario) {
        this.textUsuario = textUsuario;
    }

    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SKSSfundo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField textSenha;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

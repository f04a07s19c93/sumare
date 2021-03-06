package principal;


import insercao.BD_tratamentos;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import principal.pedidos.Pedido_balcao;
import principal.pedidos.Pedido_entrega;
import principal.pedidos.Pedidos_Lista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filipe
 */
public class Confirm_Caixa extends javax.swing.JFrame {

    /**
     * Creates new form Confirm_Caixa
     */
    public Confirm_Caixa() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnEntrar = new javax.swing.JButton();
        txtsenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtlogin = new javax.swing.JTextField();
        lblmensagem = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMInicio = new javax.swing.JMenu();
        jMInicio2 = new javax.swing.JMenuItem();
        jMPedidos = new javax.swing.JMenu();
        jMPedidos2 = new javax.swing.JMenuItem();
        jMenu_balcao = new javax.swing.JMenuItem();
        jMenu_Pedidos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jM_RemoveUser = new javax.swing.JMenuItem();
        jM_AddUser = new javax.swing.JMenuItem();
        jM_ListaUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMCadastrarCliente = new javax.swing.JMenuItem();
        jM_ListaCliente = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMCaixa2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, null));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.SW_RESIZE_CURSOR));

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Login");

        jLabel2.setText("Senha");

        lblmensagem.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblmensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(31, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblmensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jLabel4.setFont(new java.awt.Font("Vani", 0, 18)); // NOI18N
        jLabel4.setText("Digite o nome do usuário e a senha para continuar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(51, 51, 51)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 720, 340));

        jMInicio.setText("Inicio");

        jMInicio2.setText("Inicio");
        jMInicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMInicio2ActionPerformed(evt);
            }
        });
        jMInicio.add(jMInicio2);

        jMenuBar2.add(jMInicio);

        jMPedidos.setText("Pedidos");
        jMPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMPedidosActionPerformed(evt);
            }
        });

        jMPedidos2.setText("Pedido Entrega");
        jMPedidos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMPedidos2ActionPerformed(evt);
            }
        });
        jMPedidos.add(jMPedidos2);

        jMenu_balcao.setText("Pedido Balcão");
        jMenu_balcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_balcaoActionPerformed(evt);
            }
        });
        jMPedidos.add(jMenu_balcao);

        jMenu_Pedidos.setText("Cancelar Pedido");
        jMenu_Pedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_PedidosActionPerformed(evt);
            }
        });
        jMPedidos.add(jMenu_Pedidos);

        jMenuBar2.add(jMPedidos);

        jMenu1.setText("Usuarios");

        jM_RemoveUser.setText("Remover usuário");
        jM_RemoveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_RemoveUserActionPerformed(evt);
            }
        });
        jMenu1.add(jM_RemoveUser);

        jM_AddUser.setText("Adicionar usuário");
        jM_AddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_AddUserActionPerformed(evt);
            }
        });
        jMenu1.add(jM_AddUser);

        jM_ListaUsuario.setText("Usuarios cadastrados");
        jM_ListaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_ListaUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jM_ListaUsuario);

        jMenuBar2.add(jMenu1);

        jMenu2.setText("Cadastrar Cliente");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMCadastrarCliente.setText("Cadastrar");
        jMCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCadastrarClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jMCadastrarCliente);

        jM_ListaCliente.setText("Lista de Clientes");
        jM_ListaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_ListaClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jM_ListaCliente);

        jMenuBar2.add(jMenu2);

        jMenu4.setText("Caixa");

        jMCaixa2.setText("Caixa");
        jMCaixa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCaixa2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMCaixa2);

        jMenuBar2.add(jMenu4);

        jMenu3.setText("Sair");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
        Caixa frame = new Caixa();
        BD_tratamentos confirm = new BD_tratamentos();
        Inicio jo = new Inicio();
        
        String login;
        String senha;
        
        login = (txtlogin.getText());
        senha = (txtsenha.getText());
     
        
        if ("".trim().equals(login)){
            JOptionPane.showMessageDialog(null,"Por favor informe o login do usuário!.");
            txtlogin.setText("");
            txtlogin.requestFocus();
        }
                
        if ("".trim().equals(senha)){
            JOptionPane.showMessageDialog(null,"Por favor informe a senha do usuário!.");
            txtsenha.requestFocus();
        }   
        try {
            BD_tratamentos.conecta();
            if (!BD_tratamentos.confirmaAcesso(login,senha)){
                JOptionPane.showMessageDialog(null, "Acesso Negado para este usuário!.");
            }else{
                JOptionPane.showMessageDialog(null, "Acesso Liberado para este usúario!.");
                
             frame.setVisible(true);
               setVisible(false);
               //jo.setDefaultCloseOperation(Inicio.EXIT_ON_CLOSE);
             //   dispose();
           // System.exit(0);     
            // frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
               
               //}
            }
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Usuario nao encontrado no banco de dados: "+ex);
        } 
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void jMInicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMInicio2ActionPerformed
        // TODO add your handling code here:
        Menuinicio frame = new Menuinicio();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMInicio2ActionPerformed

    private void jMPedidos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMPedidos2ActionPerformed
        // TODO add your handling code here:
        Pedido_entrega frame = new Pedido_entrega();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMPedidos2ActionPerformed

    private void jMenu_balcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_balcaoActionPerformed
        // TODO add your handling code here:
        Pedido_balcao frame = new Pedido_balcao();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu_balcaoActionPerformed

    private void jMenu_PedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_PedidosActionPerformed
        // TODO add your handling code here:
        Pedidos_Lista frame = new Pedidos_Lista();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu_PedidosActionPerformed

    private void jMPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMPedidosActionPerformed

    private void jM_RemoveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_RemoveUserActionPerformed
        // TODO add your handling code here:

        String nome;
        String senha;
        boolean confirma = false;

        nome = JOptionPane.showInputDialog("<html><h3>Login do adiministrador:");
        senha = JOptionPane.showInputDialog("<html><h3>Senha do adiministrador:");

        try {
            BD_tratamentos.conecta();

            if (!BD_tratamentos.confirmaLogin(nome,senha)){
                JOptionPane.showMessageDialog(null, "<html><h3>Acesso Negado para o usuário!");

            } else{

                JOptionPane.showMessageDialog(null, "<html><h3>Acesso Liberado para o usúario "+nome+"!");
                RemoveUsuario frame = new RemoveUsuario();
                frame.setVisible(true);
                dispose();

            }
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Usuario nao encontrado no banco de dados: "+ex);
        }
    }//GEN-LAST:event_jM_RemoveUserActionPerformed

    private void jM_AddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_AddUserActionPerformed
        // TODO add your handling code here:

        String nome;
        String senha;
        boolean confirma = false;

        nome = JOptionPane.showInputDialog("<html><h3>Login do adiministrador:");
        senha = JOptionPane.showInputDialog("<html><h3>Senha do adiministrador:");

        try {
            BD_tratamentos.conecta();

            if (!BD_tratamentos.confirmaLogin(nome,senha)){
                JOptionPane.showMessageDialog(null, "<html><h3>Acesso Negado para o usuário!");

            } else{

                JOptionPane.showMessageDialog(null, "<html><h3>Acesso Liberado para o usúario "+nome+"!");
                AddUsuario frame = new AddUsuario();
                frame.setVisible(true);
                dispose();

            }
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Usuario nao encontrado no banco de dados: "+ex);
        }
    }//GEN-LAST:event_jM_AddUserActionPerformed

    private void jM_ListaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_ListaUsuarioActionPerformed
        // TODO add your handling code here:
        String nome;
        String senha;
        boolean confirma = false;

        nome = JOptionPane.showInputDialog("<html><h3>Login do adiministrador:");
        senha = JOptionPane.showInputDialog("<html><h3>Senha do adiministrador:");

        try {
            BD_tratamentos.conecta();

            if (!BD_tratamentos.confirmaLogin(nome,senha)){
                JOptionPane.showMessageDialog(null, "<html><h3>Acesso Negado para o usuário!");

            } else{

                JOptionPane.showMessageDialog(null, "Acesso Liberado para o usúario "+nome+"!");
                Lista_Usuario frame = new Lista_Usuario();
                frame.setVisible(true);
                dispose();

            }
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Usuario nao encontrado no banco de dados: "+ex);
        }
    }//GEN-LAST:event_jM_ListaUsuarioActionPerformed

    private void jMCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCadastrarClienteActionPerformed
        // TODO add your handling code here:
        Cadastrar_Cliente frame = new Cadastrar_Cliente();
        frame.setVisible(true);
        dispose();//toccar
    }//GEN-LAST:event_jMCadastrarClienteActionPerformed

    private void jM_ListaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_ListaClienteActionPerformed
        // TODO add your handling code here:
        Lista_Clientes frame = new Lista_Clientes();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jM_ListaClienteActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMCaixa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCaixa2ActionPerformed
        // TODO add your handling code here:

        Confirm_Caixa frame = new Confirm_Caixa();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMCaixa2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Inicio frame = new Inicio();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu3ActionPerformed

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
            java.util.logging.Logger.getLogger(Confirm_Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirm_Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirm_Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirm_Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confirm_Caixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMCadastrarCliente;
    private javax.swing.JMenuItem jMCaixa2;
    private javax.swing.JMenu jMInicio;
    private javax.swing.JMenuItem jMInicio2;
    private javax.swing.JMenu jMPedidos;
    private javax.swing.JMenuItem jMPedidos2;
    private javax.swing.JMenuItem jM_AddUser;
    private javax.swing.JMenuItem jM_ListaCliente;
    private javax.swing.JMenuItem jM_ListaUsuario;
    private javax.swing.JMenuItem jM_RemoveUser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenu_Pedidos;
    private javax.swing.JMenuItem jMenu_balcao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblmensagem;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JPasswordField txtsenha;
    // End of variables declaration//GEN-END:variables
}

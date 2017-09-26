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
public class Caixa extends javax.swing.JFrame {
  double total;
  
    public Caixa() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtValor = new javax.swing.JTextField();
        lblCaixa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
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

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAdd.setText("Adicionar valor");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Retirar valor");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jButton4.setText("Histórico de transações");

        jLabel1.setFont(new java.awt.Font("Vani", 0, 18)); // NOI18N
        jLabel1.setText("Caixa       R$");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtValor.setFont(new java.awt.Font("Vani", 0, 18)); // NOI18N

        lblCaixa.setText("600");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/1461795837_cono.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblCaixa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemove)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    
         int confirm;
       
         double add = Double.parseDouble(txtValor.getText());
         double antes =  Double.parseDouble(lblCaixa.getText());
         total = add +antes;
         confirm = JOptionPane.showConfirmDialog(null,"<html>Deposito : R$"+txtValor.getText()+"<br>Valor anterior: "+
                 lblCaixa.getText()+"<br><h3>Total:"+total+"</h3>"," Confirmar",JOptionPane.YES_NO_OPTION);


         
        if(JOptionPane.YES_OPTION == confirm){
     
              JOptionPane.showMessageDialog(null,"<html>Valor Depositado com sucesso!");
              lblCaixa.setText(Double.toString(total ));
              txtValor.setText("");
          }
         
    
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        
    int confirmx;
       
         double remove= Double.parseDouble(txtValor.getText());
         double antex =  Double.parseDouble(lblCaixa.getText());
         total = antex- remove;
         confirmx = JOptionPane.showConfirmDialog(null,"<html>Saque: R$"+txtValor.getText()+"<br>Valor anterior: "+
                 lblCaixa.getText()+"<br><h3>Total:"+total+"</h3>"," Confirmar",JOptionPane.YES_NO_OPTION);


         
        if(JOptionPane.YES_OPTION == confirmx){
     
              JOptionPane.showMessageDialog(null,"<html>Valor Retirado com sucesso!");
              lblCaixa.setText(Double.toString(total ));
              txtValor.setText("");
          }
    }//GEN-LAST:event_btnRemoveActionPerformed

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
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCaixa;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
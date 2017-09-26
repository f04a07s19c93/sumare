/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import insercao.BD_tratamentos;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import principal.pedidos.Pedido_balcao;
import principal.pedidos.Pedidos_Lista;

/**
 *
 * @author Filipe
 */
public class Lista_Usuario extends javax.swing.JFrame {

    /**
     * Creates new form Lista_Usuario
     */
    public Lista_Usuario() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("projetopizza?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        usuario_1Query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT u FROM Usuario_1 u");
        usuario_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : usuario_1Query.getResultList();
        usuario_1Query1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT u FROM Usuario_1 u");
        usuario_1List1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : usuario_1Query1.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtlogin = new javax.swing.JTextField();
        txtsenhaNova1 = new javax.swing.JPasswordField();
        txtsenhaAntiga = new javax.swing.JPasswordField();
        txtsenhaNova2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
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

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, usuario_1List1, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idUsuario}"));
        columnBinding.setColumnName("Id Usuario");
        columnBinding.setColumnClass(Short.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nmUsuario}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${login}"));
        columnBinding.setColumnName("Login");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${senha}"));
        columnBinding.setColumnName("Senha");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><h3>USUÁRIOS");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html><h3>ALTERAR A SENHA ");

        jLabel3.setText("<HTML><H4>NOVA SENHA");

        jLabel4.setText("<HTML><H4>DIGITE O LOGIN");

        jLabel5.setText("<HTML><H4>SENHA ANTIGA");

        jLabel6.setText("<HTML><H4>REPITA A NOVA SENHA");

        jButton1.setText("Alterar a Senha");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtsenhaNova2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtsenhaAntiga, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtsenhaNova1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsenhaAntiga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsenhaNova1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsenhaNova2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

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
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String login = txtlogin.getText();
        String antiga = txtsenhaAntiga.getText();
        String nova1 = txtsenhaNova1.getText();
        String nova2 = txtsenhaNova2.getText();
        
        if (login.equals("") ||  antiga.equals("") || nova1.equals("") || nova2.equals("") ){
            
             JOptionPane.showMessageDialog(null, "<html><h3>Por favor preencha todos os campos!");
        }else
        
         try {
             
            BD_tratamentos.conecta();
            
            if (!BD_tratamentos.confirmaAcesso(login,antiga)){
                JOptionPane.showMessageDialog(null, "<html><h3>Usuário ou senha incorretos!");
                txtlogin.setText("");
                txtsenhaAntiga.setText("");
               
            } else{
              // JOptionPane.showMessageDialog(null, "Acesso Liberado para o usúario "+login+"!");
          BD_tratamentos trocasenha = new BD_tratamentos();
           
           BD_tratamentos.alteraSenha(login, antiga, nova2);
                
                
                BD_tratamentos.desconecta();
                
            }
        } catch (Exception ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Usuario nao encontrado no banco de dados: "+ex);
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Lista_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lista_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lista_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lista_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lista_Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JPasswordField txtsenhaAntiga;
    private javax.swing.JPasswordField txtsenhaNova1;
    private javax.swing.JPasswordField txtsenhaNova2;
    private java.util.List<principal.Usuario_1> usuario_1List;
    private java.util.List<principal.Usuario_1> usuario_1List1;
    private javax.persistence.Query usuario_1Query;
    private javax.persistence.Query usuario_1Query1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

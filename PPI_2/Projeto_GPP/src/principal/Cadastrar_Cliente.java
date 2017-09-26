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
import principal.pedidos.Pedido_entrega;
import principal.pedidos.Pedidos_Lista;

/**
 *
 * @author Filipe
 */
public class Cadastrar_Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Cadastrar_Usuario
     */
    public Cadastrar_Cliente() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtend = new javax.swing.JTextField();
        btnCadastro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_Obs = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txttelefone = new javax.swing.JFormattedTextField();
        txtcelular = new javax.swing.JFormattedTextField();
        txtcep = new javax.swing.JFormattedTextField();
        txtbairro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMInicio4 = new javax.swing.JMenu();
        jMInicio5 = new javax.swing.JMenuItem();
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("ENDEREÇO:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("BAIRRO:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("NOME:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("CEP:");

        txtend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtendActionPerformed(evt);
            }
        });

        btnCadastro.setText("<html><hr>Cadastrar ");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("TELEFONE:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("CELULAR:");

        txtA_Obs.setColumns(20);
        txtA_Obs.setRows(5);
        jScrollPane1.setViewportView(txtA_Obs);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("OBSERVAÇÃO:");

        try {
            txttelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtcelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtcep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtbairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbairroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtend, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRAR CLIENTE");

        jMInicio4.setText("Inicio");

        jMInicio5.setText("Inicio");
        jMInicio5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMInicio5ActionPerformed(evt);
            }
        });
        jMInicio4.add(jMInicio5);

        jMenuBar4.add(jMInicio4);

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

        jMenuBar4.add(jMPedidos);

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

        jMenuBar4.add(jMenu1);

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

        jMenuBar4.add(jMenu2);

        jMenu4.setText("Caixa");

        jMCaixa2.setText("Caixa");
        jMCaixa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCaixa2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMCaixa2);

        jMenuBar4.add(jMenu4);

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

        jMenuBar4.add(jMenu3);

        setJMenuBar(jMenuBar4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtendActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        // TODO add your handling code here:
        Usuario userConect = new Usuario();
        Menuinicio frame1 = new Menuinicio();
        BD_tratamentos cadcliente = new BD_tratamentos();
        

        String nome = txtnome.getText();
        String endereco = txtend.getText();
        String bairro = txtbairro.getText();
        String cep = txtcep.getText();
        String tel = txttelefone.getText();
        String cel = txtcelular.getText();
        String obs = txtA_Obs.getText();
       
        if (nome.length()>8 || nome.length()>8 || bairro.length()>5 || (soContemNumeros(tel)==true) || 
                (soContemNumeros(cel)==true) || (soContemNumeros(cep)==true)){
             
            
            try {
                cadcliente.conecta();
                cadcliente.cadastroCliente(nome, endereco, bairro, cep, tel, cel, obs);
                cadcliente.desconecta();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "Ocorreu ao inserir os dados do cliente no banco de dados!");
                Logger.getLogger(Cadastrar_Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        JOptionPane.showMessageDialog(rootPane, "Cadastro efetuado com sucesso!");   
        frame1.setVisible(true);
        dispose();
        }else {
            
            JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro no preenchimento dos dados."
                    + "Prencha os dados novamente para cadastrar o cliente! ");
            txtnome.setText("");
            txtnome.requestFocus();
            txtend.setText("");
            txtbairro.setText("");
            txtcep.setText("");
            txttelefone.setText("");
            txtcelular.setText("");
            txtA_Obs.setText("");
        }

        

    }//GEN-LAST:event_btnCadastroActionPerformed

    private void txtbairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbairroActionPerformed

    private void jMInicio5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMInicio5ActionPerformed
        // TODO add your handling code here:
        Menuinicio frame = new Menuinicio();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMInicio5ActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastrar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMCadastrarCliente;
    private javax.swing.JMenuItem jMCaixa2;
    private javax.swing.JMenu jMInicio;
    private javax.swing.JMenuItem jMInicio2;
    private javax.swing.JMenu jMInicio4;
    private javax.swing.JMenuItem jMInicio5;
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
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenu_Pedidos;
    private javax.swing.JMenuItem jMenu_balcao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtA_Obs;
    private javax.swing.JTextField txtbairro;
    private javax.swing.JFormattedTextField txtcelular;
    private javax.swing.JFormattedTextField txtcep;
    private javax.swing.JTextField txtend;
    private javax.swing.JTextField txtnome;
    private javax.swing.JFormattedTextField txttelefone;
    // End of variables declaration//GEN-END:variables



 public static boolean soContemNumeros(String texto) {  
        if(texto == null)  
            return false;  
        for (char letra : texto.toCharArray())  
            if(letra < '0' || letra > '9')  
                return false;  
        return true;  
          
    }  

}

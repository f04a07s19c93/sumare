/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treino;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TRISTAO
 */
public class ViewTabel extends javax.swing.JFrame {

    /**
     * Creates new form ViewTabel
     */
    public ViewTabel() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Tabel = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jRB_php = new javax.swing.JRadioButton();
        jRB_java = new javax.swing.JRadioButton();
        jRB_html = new javax.swing.JRadioButton();
        jRB_C = new javax.swing.JRadioButton();
        jRB_sql1 = new javax.swing.JRadioButton();
        jRB_todos = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jRB_masc = new javax.swing.JRadioButton();
        jRB_femini = new javax.swing.JRadioButton();
        jRB_Indiferente = new javax.swing.JRadioButton();
        jRB_todosSexo = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jRB_manha = new javax.swing.JRadioButton();
        jRB_tarde = new javax.swing.JRadioButton();
        jRB_noite = new javax.swing.JRadioButton();
        jRB_qualquer = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jT_Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "E-mail", "Telefone", "Sexo", "Curso", "Periodo"
            }
        ));
        jScrollPane1.setViewportView(jT_Tabel);

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Curso"));

        buttonGroup1.add(jRB_php);
        jRB_php.setText("PHP");
        jRB_php.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_phpActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRB_java);
        jRB_java.setText("JAVA");

        buttonGroup1.add(jRB_html);
        jRB_html.setText("HTML");
        jRB_html.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_htmlActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRB_C);
        jRB_C.setText("C/C++");
        jRB_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_CActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRB_sql1);
        jRB_sql1.setText("SQL");
        jRB_sql1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_sql1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRB_todos);
        jRB_todos.setText("Todos");
        jRB_todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_todosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRB_php)
                    .addComponent(jRB_java)
                    .addComponent(jRB_html)
                    .addComponent(jRB_sql1)
                    .addComponent(jRB_C)
                    .addComponent(jRB_todos))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jRB_php)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRB_java)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRB_html)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRB_sql1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRB_C)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRB_todos))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        buttonGroup1.add(jRB_masc);
        jRB_masc.setText("Masculino");
        jRB_masc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_mascActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRB_femini);
        jRB_femini.setText("Feminino");

        buttonGroup1.add(jRB_Indiferente);
        jRB_Indiferente.setText("Indiferente");
        jRB_Indiferente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_IndiferenteActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRB_todosSexo);
        jRB_todosSexo.setText("Todos");
        jRB_todosSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_todosSexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRB_masc)
                    .addComponent(jRB_femini)
                    .addComponent(jRB_Indiferente)
                    .addComponent(jRB_todosSexo))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jRB_masc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRB_femini)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRB_Indiferente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRB_todosSexo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Periodo"));

        buttonGroup1.add(jRB_manha);
        jRB_manha.setText("Manhã");
        jRB_manha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRB_manhaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRB_tarde);
        jRB_tarde.setText("Tarde");

        buttonGroup1.add(jRB_noite);
        jRB_noite.setText("Noite");

        buttonGroup1.add(jRB_qualquer);
        jRB_qualquer.setText("Todos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRB_manha)
                    .addComponent(jRB_tarde)
                    .addComponent(jRB_noite)
                    .addComponent(jRB_qualquer))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jRB_manha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRB_tarde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRB_noite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRB_qualquer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addComponent(jSeparator1))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnAtualizar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jMenu1.setText("Cadastrar");

        jMenuItem1.setText("Cadastrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Visualizar Cadastros");

        jMenuItem2.setText("Visualizar ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Tabela");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRB_manhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_manhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB_manhaActionPerformed

    private void jRB_IndiferenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_IndiferenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB_IndiferenteActionPerformed

    private void jRB_mascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_mascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB_mascActionPerformed

    private void jRB_sql1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_sql1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB_sql1ActionPerformed

    private void jRB_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB_CActionPerformed

    private void jRB_htmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_htmlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB_htmlActionPerformed

    private void jRB_phpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_phpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB_phpActionPerformed

    public void mostraNaTela(int opcao) {

        DefaultTableModel val = (DefaultTableModel) jT_Tabel.getModel();
        ViewTabel operacao = new ViewTabel();

//limpar a tabela
        val.setNumRows(0);

        try {
            //para os valores do metodo e passar para um arraylist do tipo Alunos
            operacao.recuperarAlunos();
            ArrayList<Alunos> a2 = operacao.recuperarAlunos();

            //selecionar a sexualidade
            String sexualidade = null;
            switch (opcao) {
                case 1:
                    for (Alunos aluno : a2) {
                        if ("Masculino".equals(aluno.getSexo())) {
                            val.addRow(new String[]{aluno.getNome().toString(), aluno.getEmail(), aluno.getTelefone(), aluno.getSexo(), aluno.getCurso(), aluno.getPeriodo()});//um array com 5 colunas
                        }
                    }
                break;

                case 2:
                    for (Alunos aluno : a2) {
                        if ("Feminino".equals(aluno.getSexo())) {
                            val.addRow(new String[]{aluno.getNome().toString(), aluno.getEmail(), aluno.getTelefone(), aluno.getSexo(), aluno.getCurso(), aluno.getPeriodo()});
                        }
                    }
                    break;

                case 3:
                    for (Alunos aluno : a2) {
                        if ("Indiferente".equals(aluno.getSexo())) {
                            val.addRow(new String[]{aluno.getNome().toString(), aluno.getEmail(), aluno.getTelefone(), aluno.getSexo(), aluno.getCurso(), aluno.getPeriodo()});
                        }
                    }
                break;

                case 4:
                    for (Alunos aluno : a2) {
                        val.addRow(new String[]{aluno.getNome().toString(), aluno.getEmail(), aluno.getTelefone(), aluno.getSexo(), aluno.getCurso(), aluno.getPeriodo()});
                    }
                    break;
                    
                    case 5:
                    for (Alunos aluno : a2) {

                         if ("PHP".equals(aluno.getCurso())) {
                            val.addRow(new String[]{aluno.getNome().toString(), aluno.getEmail(), aluno.getTelefone(), aluno.getSexo(), aluno.getCurso(), aluno.getPeriodo()});
                    }}
                    break;
                    
                     case 6:
                    for (Alunos aluno : a2) {

                         if ("JAVA".equals(aluno.getCurso())) {
                            val.addRow(new String[]{aluno.getNome().toString(), aluno.getEmail(), aluno.getTelefone(), aluno.getSexo(), aluno.getCurso(), aluno.getPeriodo()});
                    }}
                    break;
                    
                     case 7:
                    for (Alunos aluno : a2) {

                         if ("HTML".equals(aluno.getCurso())) {
                            val.addRow(new String[]{aluno.getNome().toString(), aluno.getEmail(), aluno.getTelefone(), aluno.getSexo(), aluno.getCurso(), aluno.getPeriodo()});
                    }}
                    break;
                    
                       case 8:
                    for (Alunos aluno : a2) {

                         if ("SQL".equals(aluno.getCurso())) {
                            val.addRow(new String[]{aluno.getNome().toString(), aluno.getEmail(), aluno.getTelefone(), aluno.getSexo(), aluno.getCurso(), aluno.getPeriodo()});
                    }}
                    break;
                    
                       case 9:
                    for (Alunos aluno : a2) {

                         if ("C".equals(aluno.getCurso())) {
                            val.addRow(new String[]{aluno.getNome().toString(), aluno.getEmail(), aluno.getTelefone(), aluno.getSexo(), aluno.getCurso(), aluno.getPeriodo()});
                    }}
                    break;
                    
                    case 10:
                    for (Alunos aluno : a2) {

                        
                            val.addRow(new String[]{aluno.getNome().toString(), aluno.getEmail(), aluno.getTelefone(), aluno.getSexo(), aluno.getCurso(), aluno.getPeriodo()});
                    }
                    break;
                    
                       case 11:
                    for (Alunos aluno : a2) {

                         if ("Manhã".equals(aluno.getPeriodo())) {
                            val.addRow(new String[]{aluno.getNome().toString(), aluno.getEmail(), aluno.getTelefone(), aluno.getSexo(), aluno.getCurso(), aluno.getPeriodo()});
                    }}
                    break;
                    
                       case 12:
                    for (Alunos aluno : a2) {

                         if ("Tarde".equals(aluno.getPeriodo())) {
                            val.addRow(new String[]{aluno.getNome().toString(), aluno.getEmail(), aluno.getTelefone(), aluno.getSexo(), aluno.getCurso(), aluno.getPeriodo()});
                    }}
                    break;
                     case 13:
                    for (Alunos aluno : a2) {

                         if ("Noite".equals(aluno.getPeriodo())) {
                            val.addRow(new String[]{aluno.getNome().toString(), aluno.getEmail(), aluno.getTelefone(), aluno.getSexo(), aluno.getCurso(), aluno.getPeriodo()});
                    }}
                    break;
                    
                     case 14:
                    for (Alunos aluno : a2) {  
                            val.addRow(new String[]{aluno.getNome().toString(), aluno.getEmail(), aluno.getTelefone(), aluno.getSexo(), aluno.getCurso(), aluno.getPeriodo()});
                    }
                    break;
                    

            }
            
            
            

        } catch (IOException ex) {
            Logger.getLogger(ViewFile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed

      ViewTabel operacao = new ViewTabel();
        int opcao
                = (jRB_masc.isSelected()) ? 1
                        : (jRB_femini.isSelected()) ? 2
                                : (jRB_Indiferente.isSelected()) ? 3
                                        : (jRB_todosSexo.isSelected()) ? 4
                                                : (jRB_php.isSelected()) ? 5
                                                        : (jRB_java.isSelected()) ? 6
                                                                : (jRB_html.isSelected()) ? 7
                                                                        : (jRB_sql1.isSelected()) ? 8
                                                                                : (jRB_C.isSelected()) ? 9
                                                                                        : (jRB_todos.isSelected()) ? 10
                                                                                                : (jRB_manha.isSelected()) ? 11
                                                                                                        : (jRB_tarde.isSelected()) ? 12
                                                                                                                : (jRB_noite.isSelected()) ? 13
                                                                                                                        : (jRB_qualquer.isSelected()) ? 14
                                                                                                                                : 0;
        mostraNaTela(opcao);
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void jRB_todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_todosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB_todosActionPerformed

    private void jRB_todosSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRB_todosSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRB_todosSexoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        VewTreino frame = new VewTreino();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        ViewFile frame = new ViewFile();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        ViewTabel frame = new ViewTabel();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public static Path path = Paths.get("C:/Users/TRISTAO/Documents/NetBeansProjects/Treino/src/treino/file/banco.txt");
    public static Charset utf8 = StandardCharsets.UTF_8;

    public ArrayList<Alunos> recuperarAlunos() throws IOException {
        ArrayList<Alunos> alunos = new ArrayList<>();
        ViewFile aux = new ViewFile();
        try (BufferedReader reader = Files.newBufferedReader(path, utf8)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] t = line.split(";");
                Alunos aluno = new Alunos(t[0], t[1], t[2], t[3], t[4], t[5]);

                alunos.add(aluno);
            }
        }

        return alunos;
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
            java.util.logging.Logger.getLogger(ViewTabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTabel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTabel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRB_C;
    private javax.swing.JRadioButton jRB_Indiferente;
    private javax.swing.JRadioButton jRB_femini;
    private javax.swing.JRadioButton jRB_html;
    private javax.swing.JRadioButton jRB_java;
    private javax.swing.JRadioButton jRB_manha;
    private javax.swing.JRadioButton jRB_masc;
    private javax.swing.JRadioButton jRB_noite;
    private javax.swing.JRadioButton jRB_php;
    private javax.swing.JRadioButton jRB_qualquer;
    private javax.swing.JRadioButton jRB_sql1;
    private javax.swing.JRadioButton jRB_tarde;
    private javax.swing.JRadioButton jRB_todos;
    private javax.swing.JRadioButton jRB_todosSexo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jT_Tabel;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

/**
 *
 * @author Filipe
 */
public class atividade extends javax.swing.JFrame {

    /**
     * Creates new form atividade
     */
    
    char operacao;
    String temp,numeroantes,negativo;
    
    double n1,n2,n3,resultado;
    public atividade() {
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
        jt_tela = new javax.swing.JTextField();
        jB_backspace = new javax.swing.JButton();
        jB_mc = new javax.swing.JButton();
        jB_mr = new javax.swing.JButton();
        jB_ms = new javax.swing.JButton();
        jB_msoma = new javax.swing.JButton();
        jB_clear = new javax.swing.JButton();
        jB_7 = new javax.swing.JButton();
        jB_4 = new javax.swing.JButton();
        jB_ponto = new javax.swing.JButton();
        jB_1 = new javax.swing.JButton();
        jB_clearall = new javax.swing.JButton();
        jB_8 = new javax.swing.JButton();
        jB_5 = new javax.swing.JButton();
        jB_0 = new javax.swing.JButton();
        jB_2 = new javax.swing.JButton();
        jB_potencia = new javax.swing.JButton();
        jB_9 = new javax.swing.JButton();
        jB_6 = new javax.swing.JButton();
        jB_igual = new javax.swing.JButton();
        jB_3 = new javax.swing.JButton();
        jB_inverso = new javax.swing.JButton();
        jB_dividir = new javax.swing.JButton();
        jB_multiplicar = new javax.swing.JButton();
        jB_soma = new javax.swing.JButton();
        jB_subtrair = new javax.swing.JButton();
        jB_msubtrair = new javax.swing.JButton();
        jB_sinal = new javax.swing.JButton();
        jB_raiz = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        jPanel2.setToolTipText("");

        jB_backspace.setText("Backspc");
        jB_backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_backspaceActionPerformed(evt);
            }
        });

        jB_mc.setText("MC");

        jB_mr.setText("MR");

        jB_ms.setText("MS");

        jB_msoma.setText("M+");

        jB_clear.setText("Clear");
        jB_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_clearActionPerformed(evt);
            }
        });

        jB_7.setText("7");
        jB_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_7ActionPerformed(evt);
            }
        });

        jB_4.setText("4");
        jB_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_4ActionPerformed(evt);
            }
        });

        jB_ponto.setText(",");
        jB_ponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_pontoActionPerformed(evt);
            }
        });

        jB_1.setText("1");
        jB_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_1ActionPerformed(evt);
            }
        });

        jB_clearall.setText("Clear All");
        jB_clearall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_clearallActionPerformed(evt);
            }
        });

        jB_8.setText("8");
        jB_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_8ActionPerformed(evt);
            }
        });

        jB_5.setText("5");
        jB_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_5ActionPerformed(evt);
            }
        });

        jB_0.setText("0");
        jB_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_0ActionPerformed(evt);
            }
        });

        jB_2.setText("2");
        jB_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_2ActionPerformed(evt);
            }
        });

        jB_potencia.setText("x²");
        jB_potencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_potenciaActionPerformed(evt);
            }
        });

        jB_9.setText("9");
        jB_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_9ActionPerformed(evt);
            }
        });

        jB_6.setText("6");
        jB_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_6ActionPerformed(evt);
            }
        });

        jB_igual.setText("=");
        jB_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_igualActionPerformed(evt);
            }
        });

        jB_3.setText("3");
        jB_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_3ActionPerformed(evt);
            }
        });

        jB_inverso.setText("1/x");
        jB_inverso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_inversoActionPerformed(evt);
            }
        });

        jB_dividir.setText("/");
        jB_dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_dividirActionPerformed(evt);
            }
        });

        jB_multiplicar.setText("x");
        jB_multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_multiplicarActionPerformed(evt);
            }
        });

        jB_soma.setText("+");
        jB_soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_somaActionPerformed(evt);
            }
        });

        jB_subtrair.setText("-");
        jB_subtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_subtrairActionPerformed(evt);
            }
        });

        jB_msubtrair.setText("M-");

        jB_sinal.setText("+-");
        jB_sinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_sinalActionPerformed(evt);
            }
        });

        jB_raiz.setText("√");
        jB_raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_raizActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jt_tela)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jB_msubtrair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB_msoma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB_mr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB_mc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB_backspace, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB_ms, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jB_ponto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB_clear, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(jB_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB_sinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jB_0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB_5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB_clearall, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(jB_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB_raiz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jB_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB_soma, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jB_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jB_6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jB_potencia, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(jB_9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jB_subtrair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jB_multiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jB_inverso, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                    .addComponent(jB_dividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jt_tela, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jB_backspace, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jB_mc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jB_mr, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jB_ms, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jB_msoma, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jB_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jB_7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jB_4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jB_1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jB_ponto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jB_clearall, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jB_0, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB_soma, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jB_potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jB_inverso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jB_subtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_msubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_sinal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_raiz, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jMenu1.setText("Calculadora");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Sobre");

        jMenuItem3.setText("jMenuItem3");
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Sair");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_1ActionPerformed
        // TODO add your handling code here:
         temp = jt_tela.getText();//vai pegar o que tem no visor(no caso a tela)
        temp = temp + "1";//adcionar no temp o numero
        jt_tela.setText(temp);
    }//GEN-LAST:event_jB_1ActionPerformed

    private void jB_inversoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_inversoActionPerformed
        // TODO add your handling code here:
        operacao = 'i';//guardar a operaçao
        n1 = Float.parseFloat(jt_tela.getText());//passa a string para tipo double e o n1 sera o numero injetado
        jt_tela.setText("");//limpar a tela
    }//GEN-LAST:event_jB_inversoActionPerformed

    private void jB_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_0ActionPerformed
        // TODO add your handling code here:
        
        temp = jt_tela.getText();//vai pegar o que tem no visor(no caso a tela)
        temp = temp + "0";//adcionar no temp o numero
        jt_tela.setText(temp);//vai setar o que tem no tempo no visor
        
    }//GEN-LAST:event_jB_0ActionPerformed

    private void jB_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_2ActionPerformed
        temp = jt_tela.getText();//vai pegar o que tem no visor(no caso a tela)
        temp = temp + "2";//adcionar no temp o numero
        jt_tela.setText(temp);
    }//GEN-LAST:event_jB_2ActionPerformed

    private void jB_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_3ActionPerformed
        temp = jt_tela.getText();//vai pegar o que tem no visor(no caso a tela)
        temp = temp + "3";//adcionar no temp o numero
        jt_tela.setText(temp);
    }//GEN-LAST:event_jB_3ActionPerformed

    private void jB_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_6ActionPerformed
         temp = jt_tela.getText();//vai pegar o que tem no visor(no caso a tela)
        temp = temp + "6";//adcionar no temp o numero
        jt_tela.setText(temp);
    }//GEN-LAST:event_jB_6ActionPerformed

    private void jB_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_9ActionPerformed
     temp = jt_tela.getText();//vai pegar o que tem no visor(no caso a tela)
        temp = temp + "9";//adcionar no temp o numero
        jt_tela.setText(temp);
    }//GEN-LAST:event_jB_9ActionPerformed

    private void jB_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_8ActionPerformed
         temp = jt_tela.getText();//vai pegar o que tem no visor(no caso a tela)
        temp = temp + "8";//adcionar no temp o numero
        jt_tela.setText(temp);
    }//GEN-LAST:event_jB_8ActionPerformed

    private void jB_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_7ActionPerformed
         temp = jt_tela.getText();//vai pegar o que tem no visor(no caso a tela)
        temp = temp + "7";//adcionar no temp o numero
        jt_tela.setText(temp);
    }//GEN-LAST:event_jB_7ActionPerformed

    private void jB_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_4ActionPerformed
         temp = jt_tela.getText();//vai pegar o que tem no visor(no caso a tela)
        temp = temp + "4";//adcionar no temp o numero
        jt_tela.setText(temp);
    }//GEN-LAST:event_jB_4ActionPerformed

    private void jB_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_5ActionPerformed
         temp = jt_tela.getText();//vai pegar o que tem no visor(no caso a tela)
        temp = temp + "5";//adcionar no temp o numero
        jt_tela.setText(temp);
    }//GEN-LAST:event_jB_5ActionPerformed

    private void jB_somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_somaActionPerformed
        // TODO add your handling code here:
        
        operacao = '+';//guardar a operaçao
        n1 = Float.parseFloat(jt_tela.getText());//passa a string para tipo double
        jt_tela.setText("");//limpar a tela
    }//GEN-LAST:event_jB_somaActionPerformed

    private void jB_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_igualActionPerformed
       
        n2 = Float.parseFloat(jt_tela.getText());//passar para double
        
        switch(operacao){
            
            case '+':
            resultado = n1 + n2; 
            n1=resultado;
            break;
                
            case '-':
                resultado = n1 - n2;
                n1=resultado;
            break;
                
            case '/':
                resultado = n1 / n2;
                n1=resultado;
            break;   
                
             case '*':
                resultado = n1 * n2;
                n1=resultado;
            break; 
                 
             case 'r':
                                  
                         double raizx; 
                         n3=Double.parseDouble(jt_tela.getText());
                         raizx = java.lang.Math.sqrt(n3);
                         resultado = raizx;
                         n1=resultado;
            break;
                 
             case 'p':
                n3=Double.parseDouble(jt_tela.getText());
               resultado = n3*n3;
               n1=resultado;
                               
             break;    
                                
             case 'i':
                 
                 n2=Float.parseFloat(jt_tela.getText());
                 resultado = (int) ((1) / n2);
                 
             break;    
                 
                
             
        }
             jt_tela.setText(String.valueOf(resultado));
        
        
    }//GEN-LAST:event_jB_igualActionPerformed

    private void jB_subtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_subtrairActionPerformed
         operacao = '-';//guardar a operaçao
        n1 = Double.parseDouble(jt_tela.getText());//passa a string para tipo double
        jt_tela.setText("");//limpar a tela:
       
    }//GEN-LAST:event_jB_subtrairActionPerformed

    private void jB_dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_dividirActionPerformed
        // TODO add your handling code here:
         operacao = '/';//guardar a operaçao
        n1 = Double.parseDouble(jt_tela.getText());//passa a string para tipo double
        jt_tela.setText("");//limpar a tela:
        
    }//GEN-LAST:event_jB_dividirActionPerformed

    private void jB_multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_multiplicarActionPerformed
        
         operacao = '*';//guardar a operaçao
        n1 = Double.parseDouble(jt_tela.getText());//passa a string para tipo double
        jt_tela.setText("");//limpar a tela:
    }//GEN-LAST:event_jB_multiplicarActionPerformed

    private void jB_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_clearActionPerformed
        // TODO add your handling code here:
         jt_tela.setText("");
        
    }//GEN-LAST:event_jB_clearActionPerformed

    private void jB_clearallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_clearallActionPerformed
        // TODO add your handling code here:
        n1=0;
        n2=0;
        n3=0;
        jt_tela.setText("");
    }//GEN-LAST:event_jB_clearallActionPerformed

    private void jB_backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_backspaceActionPerformed
        // TODO add your handling code here:
 
      String str = jt_tela.getText();
       StringBuilder w = new StringBuilder(str); 
       str = String.valueOf( w.deleteCharAt(str.length() - 1) );
        jt_tela.setText(str); 
    }//GEN-LAST:event_jB_backspaceActionPerformed

    private void jB_raizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_raizActionPerformed
        // TODO add your handling code here:
          operacao = 'r';//guardar a operaçao
        n1 = Double.parseDouble(jt_tela.getText());//passa a string para tipo double
        jt_tela.setText("");
    }//GEN-LAST:event_jB_raizActionPerformed

    private void jB_potenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_potenciaActionPerformed
        // TODO add your handling code here:
        operacao = 'p';//guardar a operaçao
        n1 = Float.parseFloat(jt_tela.getText());//passa a string para tipo double
        jt_tela.setText("");//limpar a tela
    }//GEN-LAST:event_jB_potenciaActionPerformed

    private void jB_sinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_sinalActionPerformed
        // TODO add your handling code here:
        operacao = 'ç';//guardar a operaçao
        n3 = Float.parseFloat(jt_tela.getText());//passa a string para tipo double
        
        n2 = (-1) * n3;
        jt_tela.setText(String.valueOf(n2));
        
        
    }//GEN-LAST:event_jB_sinalActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
        operacao = 'n';//guardar a operaçao
        n1 = Float.parseFloat(jt_tela.getText());//passa a string para tipo double
        jt_tela.setText("")
             
                
        jt_tela.setText(String.valueOf(resultado));
        
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         System.exit (0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        System.exit (0);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jB_pontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_pontoActionPerformed
        // TODO add your handling code here:
        temp = jt_tela.getText();//vai pegar o que tem no visor(no caso a tela)
        temp = temp + ".";//adcionar no temp o numero
        jt_tela.setText(temp);
    }//GEN-LAST:event_jB_pontoActionPerformed

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
            java.util.logging.Logger.getLogger(atividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(atividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(atividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(atividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atividade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_0;
    private javax.swing.JButton jB_1;
    private javax.swing.JButton jB_2;
    private javax.swing.JButton jB_3;
    private javax.swing.JButton jB_4;
    private javax.swing.JButton jB_5;
    private javax.swing.JButton jB_6;
    private javax.swing.JButton jB_7;
    private javax.swing.JButton jB_8;
    private javax.swing.JButton jB_9;
    private javax.swing.JButton jB_backspace;
    private javax.swing.JButton jB_clear;
    private javax.swing.JButton jB_clearall;
    private javax.swing.JButton jB_dividir;
    private javax.swing.JButton jB_igual;
    private javax.swing.JButton jB_inverso;
    private javax.swing.JButton jB_mc;
    private javax.swing.JButton jB_mr;
    private javax.swing.JButton jB_ms;
    private javax.swing.JButton jB_msoma;
    private javax.swing.JButton jB_msubtrair;
    private javax.swing.JButton jB_multiplicar;
    private javax.swing.JButton jB_ponto;
    private javax.swing.JButton jB_potencia;
    private javax.swing.JButton jB_raiz;
    private javax.swing.JButton jB_sinal;
    private javax.swing.JButton jB_soma;
    private javax.swing.JButton jB_subtrair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jt_tela;
    // End of variables declaration//GEN-END:variables
}
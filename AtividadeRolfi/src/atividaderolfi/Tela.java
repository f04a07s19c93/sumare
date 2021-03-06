/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividaderolfi;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author TRISTAO
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jtex_area = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnOrdenar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtex_area.setColumns(20);
        jtex_area.setRows(5);
        jScrollPane1.setViewportView(jtex_area);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ATIVIDADE");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnOrdenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atividaderolfi/imagem/ordenar.png"))); // NOI18N
        btnOrdenar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 0), 2, true));
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });

        jSeparator1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnOrdenar)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        jSeparator2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator3.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 204));
        jMenuBar1.setBorder(new javax.swing.border.MatteBorder(null));

        jMenu1.setText("Ordenar");

        jMenuItem1.setBackground(new java.awt.Color(51, 255, 0));
        jMenuItem1.setText("   >>");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8))
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(384, 384, 384)
                    .addComponent(jSeparator2)
                    .addGap(384, 384, 384)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(197, 197, 197)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(247, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        //limpar
       // jtex_area.setText(" ");
JOptionPane.showMessageDialog(null,"<html><h2>Aguarde uns Segundos...");
        

try{ //capturar da text area
            String text = jtex_area.getText();
            String[] t = text.split("\\n");
            Stack<Integer> v2 = new Stack<>();

            for (int x = 0; x < t.length; x++) {
                v2.add(Integer.parseInt(t[x]));
            }
            v2.sort(null);
            jtex_area.setText("");
            for (int y = 0; y < v2.size(); y++) {
                jtex_area.setText(jtex_area.getText() + "\n"
                        + v2.get(y).toString());
            }
        } catch (java.lang.NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "<html><h1>APAGUE A PRIMEIRA LINHA QUE ESTA EM BRANCO OU INSIRA UM NÚMERO NA MESMA!");
        }
        System.out.println("\n");
        //------------------------------------
        //instanciar
        Colecoes l1 = new Colecoes(new ArrayList<>());
        Colecoes l2 = new Colecoes(new Vector<>());
        Colecoes l3 = new Colecoes(new LinkedList<>());
        Colecoes l4 = new Colecoes(new Stack<>());
        Colecoes l5 = new Colecoes(new PriorityQueue<>());
        Colecoes l6 = new Colecoes(new ArrayDeque<>());
        Colecoes l7 = new Colecoes(new HashSet<>());
        Colecoes l8 = new Colecoes(new TreeSet<>());
        Colecoes l9 = new Colecoes(new LinkedHashSet<>());

        Colecoes l10 = new Colecoes(new HashMap<>());
        Colecoes l11 = new Colecoes(new LinkedHashMap<>());
        Colecoes l12 = new Colecoes(new TreeMap<>());
        Colecoes l13 = new Colecoes(new IdentityHashMap<>());
        Colecoes l14 = new Colecoes(new WeakHashMap<>());
        Colecoes l15 = new Colecoes(new Hashtable<>());

        // jT_2.setText(l1.ordenar_e_tempo(new ArrayList<>(),"ArrayList "));
        //INSERIR nas collections e maps
        /* for (int x=0;x<10;x++){
         l1.inserir(Integer.parseInt(t[x]));
         l2.inserir(Integer.parseInt(t[x]));   
         l3.inserir(Integer.parseInt(t[x]));
         l4.inserir(Integer.parseInt(t[x]));
         l5.inserir(Integer.parseInt(t[x]));
         l6.inserir(Integer.parseInt(t[x]));
         l7.inserir(Integer.parseInt(t[x]));
         l8.inserir(Integer.parseInt(t[x]));
         l9.inserir(Integer.parseInt(t[x]));
         
        }*/
        //inseir o tempo da ordenação
      
       String text = jtex_area.getText();
            String[] tt = text.split("\\n");
            int tamanho = tt.length;
      
         jtex_area.setText( jtex_area.getText() + l1.ordenar_e_tempo(new ArrayList<>(), "ArrayList ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l2.ordenar_e_tempo(new Vector<>(), "Vector ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l3.ordenar_e_tempo(new LinkedList<>(), "LinkedList ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l4.ordenar_e_tempo(new Stack<>(), "Stack ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l5.ordenar_e_tempo(new PriorityQueue<>(), "PriorityQueue ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l6.ordenar_e_tempo(new ArrayDeque<>(), "ArrayDeque ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l7.ordenar_e_tempo2(new HashSet<>(), "HashSet ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l8.ordenar_e_tempo(new TreeSet<>(), "TreeSet ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l9.ordenar_e_tempo(new LinkedHashSet<>(), "LinkedHashSet ",tamanho) + "\n");
        //---------------------------------------     
         jtex_area.setText( jtex_area.getText() + l10.ordenar_e_tempoMap(new HashMap<>(), "HashMap ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l11.ordenar_e_tempoMap(new LinkedHashMap<>(), "LinkedHashMap ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l12.ordenar_e_tempoMap(new TreeMap<>(), "TreeMap ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l13.ordenar_e_tempoMap(new IdentityHashMap<>(), "IdentityHashMap ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l14.ordenar_e_tempoMap(new WeakHashMap<>(), "WeakHashMap ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l15.ordenar_e_tempoMap(new Hashtable<>(), "Hashtable ",tamanho) + "\n");


    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        //limpar
       //  jtex_area.setText(" ");

        try { //capturar da text area
            String text = jtex_area.getText();
            String[] t = text.split("\\n");
            Stack<Integer> v2 = new Stack<>();

            for (int x = 0; x < t.length; x++) {
                v2.add(Integer.parseInt(t[x]));
            }
            v2.sort(null);
            jtex_area.setText(null);
            for (int y = 0; y < v2.size(); y++) {
                jtex_area.setText(jtex_area.getText() + "\n"+ v2.get(y).toString());
            }
            System.out.println("\n");
        } catch (java.lang.NumberFormatException e) {
    JOptionPane.showMessageDialog(null, "<html><h1><ul><li>APAGUE A PRIMEIRA LINHA QUE ESTA EM BRANCO</li><br/>"
            + "<li> INSIRA UM NÚMERO NA PRIMEIRA LINHA</li><br/>"+
              "<li>SE MESMO ASSIM NÃO ORDENAR. APAGUE TUDO E INSIRA OS NÚMEROS NOVAMENTE </li><br/>");
        }
System.out.println("\n");
        Colecoes l1 = new Colecoes(new ArrayList<>());
        Colecoes l2 = new Colecoes(new Vector<>());
        Colecoes l3 = new Colecoes(new LinkedList<>());
        Colecoes l4 = new Colecoes(new Stack<>());
        Colecoes l5 = new Colecoes(new PriorityQueue<>());
        Colecoes l6 = new Colecoes(new ArrayDeque<>());
        Colecoes l7 = new Colecoes(new HashSet<>());
        Colecoes l8 = new Colecoes(new TreeSet<>());
        Colecoes l9 = new Colecoes(new LinkedHashSet<>());

        Colecoes l10 = new Colecoes(new HashMap<>());
        Colecoes l11 = new Colecoes(new LinkedHashMap<>());
        Colecoes l12 = new Colecoes(new TreeMap<>());
        Colecoes l13 = new Colecoes(new IdentityHashMap<>());
        Colecoes l14 = new Colecoes(new WeakHashMap<>());
        Colecoes l15 = new Colecoes(new Hashtable<>());

        
        String text = jtex_area.getText();
            String[] tt = text.split("\\n");
            int tamanho = tt.length;
         jtex_area.setText( jtex_area.getText()  +  l1.ordenar_e_tempo(new ArrayList<>(), "ArrayList ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l2.ordenar_e_tempo(new Vector<>(), "Vector ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l3.ordenar_e_tempo(new LinkedList<>(), "LinkedList ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l4.ordenar_e_tempo(new Stack<>(), "Stack ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l5.ordenar_e_tempo(new PriorityQueue<>(), "PriorityQueue ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l6.ordenar_e_tempo(new ArrayDeque<>(), "ArrayDeque ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l7.ordenar_e_tempo2(new HashSet<>(), "HashSet ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l8.ordenar_e_tempo(new TreeSet<>(), "TreeSet ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l9.ordenar_e_tempo(new LinkedHashSet<>(), "LinkedHashSet ",tamanho) + "\n");
        //---------------------------------------     
         jtex_area.setText( jtex_area.getText() + l10.ordenar_e_tempoMap(new HashMap<>(), "HashMap ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l11.ordenar_e_tempoMap(new LinkedHashMap<>(), "LinkedHashMap ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l12.ordenar_e_tempoMap(new TreeMap<>(), "TreeMap ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l13.ordenar_e_tempoMap(new IdentityHashMap<>(), "IdentityHashMap ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l14.ordenar_e_tempoMap(new WeakHashMap<>(), "WeakHashMap ",tamanho) + "\n");
         jtex_area.setText( jtex_area.getText() + l15.ordenar_e_tempoMap(new Hashtable<>(), "Hashtable ",tamanho) + "\n");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jtex_area;
    // End of variables declaration//GEN-END:variables
}

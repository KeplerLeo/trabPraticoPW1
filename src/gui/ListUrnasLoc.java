package gui;

import eleicoes.recursos.*;
import javax.swing.*;

public class ListUrnasLoc extends javax.swing.JFrame {

    public ListUrnasLoc(String cidade, String uf) {
        initComponents();
        lista = new Urna().listLoc(cidade, uf);
        contador = 0;
    }

    public ListUrnasLoc() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUf = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtZona = new javax.swing.JTextField();
        txtSecao = new javax.swing.JTextField();
        txtSituacao = new javax.swing.JTextField();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("UF:");

        jLabel2.setText("Cidade:");

        jLabel3.setText("Zona:");

        jLabel4.setText("Seção:");

        jLabel5.setText("Situação:");

        txtUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUfActionPerformed(evt);
            }
        });

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });

        btnPrimeiro.setText("|<");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnAnterior.setText("<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setText(">");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnUltimo.setText(">|");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUf)
                            .addComponent(txtCidade)
                            .addComponent(txtZona)
                            .addComponent(txtSecao)
                            .addComponent(txtSituacao, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnPrimeiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnPrimeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUfActionPerformed

    }//GEN-LAST:event_txtUfActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed

    }//GEN-LAST:event_txtCidadeActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed

        carregaDados(0);
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void carregaDados(int posicao) {
        Urna u = lista.get(posicao);
        Localizacao l = u.getLocalizacao();
        txtUf.setText(l.getUf());
        txtCidade.setText(l.getCidade());
        txtZona.setText(String.valueOf(u.getZona()));
        txtSecao.setText(String.valueOf(u.getSecao()));
        txtSituacao.setText(u.getSituacao().name());
        contador = posicao;
    }
    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed

        if (contador == 0) {
            JOptionPane.showMessageDialog(this, "Você já está no início da lista!");
        } else {
            contador--;
            carregaDados(contador);
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed

        if (contador == lista.size() - 1) {
            JOptionPane.showMessageDialog(this, "Você já está no fim da lista!");
        } else {
            contador++;
            carregaDados(contador);
        }
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed

        carregaDados(lista.size() - 1);
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed

        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListUrnasLoc().setVisible(true);
            }
        });
    }
    private static int contador = 0;
    private java.util.List<Urna> lista;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtSecao;
    private javax.swing.JTextField txtSituacao;
    private javax.swing.JTextField txtUf;
    private javax.swing.JTextField txtZona;
    // End of variables declaration//GEN-END:variables
}

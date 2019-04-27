package gui;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArq = new javax.swing.JMenu();
        mnuSair = new javax.swing.JMenuItem();
        mnuUrna = new javax.swing.JMenu();
        mnuCad = new javax.swing.JMenuItem();
        mnuExcluir = new javax.swing.JMenuItem();
        mnuRel = new javax.swing.JMenu();
        mnuListUrnas = new javax.swing.JMenuItem();
        mnuPesqSituacao = new javax.swing.JMenuItem();
        mnuPesqCidadeUf = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuArq.setText("Arquivo");

        mnuSair.setText("Sair");
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        mnuArq.add(mnuSair);

        jMenuBar1.add(mnuArq);

        mnuUrna.setText("Urna");

        mnuCad.setText("Cadastrar");
        mnuCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadActionPerformed(evt);
            }
        });
        mnuUrna.add(mnuCad);

        mnuExcluir.setText("Excluir");
        mnuExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExcluirActionPerformed(evt);
            }
        });
        mnuUrna.add(mnuExcluir);

        jMenuBar1.add(mnuUrna);

        mnuRel.setText("Relatórios");

        mnuListUrnas.setText("Listar todas as Urnas");
        mnuListUrnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListUrnasActionPerformed(evt);
            }
        });
        mnuRel.add(mnuListUrnas);

        mnuPesqSituacao.setText("Pesquisar por situação");
        mnuPesqSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPesqSituacaoActionPerformed(evt);
            }
        });
        mnuRel.add(mnuPesqSituacao);

        mnuPesqCidadeUf.setText("Pesquisar por Cidade/UF");
        mnuPesqCidadeUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPesqCidadeUfActionPerformed(evt);
            }
        });
        mnuRel.add(mnuPesqCidadeUf);

        jMenuBar1.add(mnuRel);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuListUrnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListUrnasActionPerformed
        new ListUrnas().setVisible(true);
    }//GEN-LAST:event_mnuListUrnasActionPerformed

    private void mnuCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadActionPerformed
        new CadUrna().setVisible(true);
    }//GEN-LAST:event_mnuCadActionPerformed

    private void mnuPesqCidadeUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPesqCidadeUfActionPerformed
        // TODO add your handling code here:
        new selLoc().setVisible(true);
    }//GEN-LAST:event_mnuPesqCidadeUfActionPerformed

    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuSairActionPerformed

    private void mnuExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExcluirActionPerformed
        new ExcUrna().setVisible(true);
    }//GEN-LAST:event_mnuExcluirActionPerformed

    private void mnuPesqSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPesqSituacaoActionPerformed
        new selSit().setVisible(true);
    }//GEN-LAST:event_mnuPesqSituacaoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuArq;
    private javax.swing.JMenuItem mnuCad;
    private javax.swing.JMenuItem mnuExcluir;
    private javax.swing.JMenuItem mnuListUrnas;
    private javax.swing.JMenuItem mnuPesqCidadeUf;
    private javax.swing.JMenuItem mnuPesqSituacao;
    private javax.swing.JMenu mnuRel;
    private javax.swing.JMenuItem mnuSair;
    private javax.swing.JMenu mnuUrna;
    // End of variables declaration//GEN-END:variables
}


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bagas Wirawan
 */
public class futama extends javax.swing.JFrame {

    /**
     * Creates new form futama
     */
    public futama() {
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

        labelnama = new javax.swing.JLabel();
        btntekan = new javax.swing.JButton();
        lnim = new javax.swing.JLabel();
        lkelas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("provis");

        labelnama.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        labelnama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelnama.setText("Hallo manusia?");

        btntekan.setText("INFO");
        btntekan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntekanMouseClicked(evt);
            }
        });

        lnim.setText("nim :");

        lkelas.setText("kelas :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelnama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btntekan, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lkelas)
                            .addComponent(lnim))))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(labelnama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lnim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lkelas)
                .addGap(70, 70, 70)
                .addComponent(btntekan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntekanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntekanMouseClicked
        // TODO add your handling code here:
        labelnama.setText("hallo nama saya Bagas Wirawan");
        lnim.setText("NIM :10118397");
        lkelas.setText("Kelas :IF9");
        
     
        JOptionPane.showMessageDialog(null, "selamat anda berhasil mengetahui siapa saya");
    }//GEN-LAST:event_btntekanMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntekan;
    private javax.swing.JLabel labelnama;
    private javax.swing.JLabel lkelas;
    private javax.swing.JLabel lnim;
    // End of variables declaration//GEN-END:variables
}

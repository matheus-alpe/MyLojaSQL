/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.ud;

import javax.swing.JOptionPane;
import modal.bean.Cliente;
import modal.dao.ClienteDAO;

/**
 *
 * @author mathe
 */
public class DeleteCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form UpdateCliente
     */
    public DeleteCliente() {
        initComponents();
        panelInf.setVisible(false);
        btnCancelar.setVisible(false);

    }

    public boolean acharUmCliente(String valor) {

        ClienteDAO uDao = new ClienteDAO();
        Cliente c = uDao.umCliente(valor);
        if (c.getId() != 0) {
            lblNome.setText(c.getNome());
            lblNasc.setText(c.getDataNasc());
            lblCEP.setText(c.getCep());
            lblEstado.setText(c.getEstado());
            return true;
        }
        return false;
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
        txtBuscaID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        panelInf = new javax.swing.JPanel();
        lblN = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblU = new javax.swing.JLabel();
        lblU1 = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        lblNasc = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblCEP = new javax.swing.JLabel();
        lblU2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Excluir Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        txtBuscaID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaIDKeyReleased(evt);
            }
        });

        jLabel1.setText("ID Cliente:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("Pode cliente usuário nesta janela.");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblN.setText("Nome:");

        lblNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblU.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblU.setText("Estado:");

        lblU1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblU1.setText("Nascimento:");

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblNasc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblCEP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblU2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblU2.setText("CEP:");

        javax.swing.GroupLayout panelInfLayout = new javax.swing.GroupLayout(panelInf);
        panelInf.setLayout(panelInfLayout);
        panelInfLayout.setHorizontalGroup(
            panelInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInfLayout.createSequentialGroup()
                .addGap(0, 79, Short.MAX_VALUE)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(panelInfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInfLayout.createSequentialGroup()
                        .addComponent(lblN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNome))
                    .addGroup(panelInfLayout.createSequentialGroup()
                        .addComponent(lblU1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNasc))
                    .addGroup(panelInfLayout.createSequentialGroup()
                        .addComponent(lblU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEstado))
                    .addGroup(panelInfLayout.createSequentialGroup()
                        .addComponent(lblU2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCEP)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInfLayout.setVerticalGroup(
            panelInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInfLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(panelInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblN)
                    .addComponent(lblNome))
                .addGap(18, 18, 18)
                .addGroup(panelInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblU1)
                    .addComponent(lblNasc))
                .addGap(18, 18, 18)
                .addGroup(panelInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblU2)
                    .addComponent(lblCEP))
                .addGap(18, 18, 18)
                .addGroup(panelInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblU)
                    .addComponent(lblEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnExcluir))
        );

        btnCancelar.setText("Outro cliente?");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelInf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCancelar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtBuscaID, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(48, 48, 48)
                                    .addComponent(btnBuscar))
                                .addComponent(jLabel3)))
                        .addGap(0, 41, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelInf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (txtBuscaID.getText().matches("[0-9]+")) {

            if (acharUmCliente(txtBuscaID.getText())) {
                panelInf.setVisible(true);
                btnBuscar.setEnabled(false);
                btnCancelar.setVisible(true);
                txtBuscaID.setEnabled(false);
            } else {
                txtBuscaID.setEnabled(true);
                panelInf.setVisible(false);
            }
        } else {
            panelInf.setVisible(false);
            JOptionPane.showMessageDialog(null, "Insira um ID válido.");
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (!txtBuscaID.getText().equals("")) {
            ClienteDAO cDao = new ClienteDAO();
            Cliente novoCliente = new Cliente();
            novoCliente.setId(Integer.parseInt(txtBuscaID.getText()));
            cDao.delete(novoCliente);

            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Preencha ID os campos.");
        }

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtBuscaIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaIDKeyReleased
        if (txtBuscaID.getText().equals("")) {
            panelInf.setVisible(false);
            lblNome.setText("");
            lblNasc.setText("");
            lblCEP.setText("");
            lblEstado.setText("");
        }
    }//GEN-LAST:event_txtBuscaIDKeyReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        txtBuscaID.setText("");
        txtBuscaID.setEnabled(true);
        btnCancelar.setVisible(false);
        btnBuscar.setEnabled(true);
        panelInf.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblN;
    private javax.swing.JLabel lblNasc;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblU;
    private javax.swing.JLabel lblU1;
    private javax.swing.JLabel lblU2;
    private javax.swing.JPanel panelInf;
    private javax.swing.JTextField txtBuscaID;
    // End of variables declaration//GEN-END:variables
}
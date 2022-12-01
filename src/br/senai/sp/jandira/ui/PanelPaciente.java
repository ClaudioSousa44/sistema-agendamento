
package br.senai.sp.jandira.ui;


public class PanelPaciente extends javax.swing.JPanel {

 
    public PanelPaciente() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scrollPaciente = new javax.swing.JScrollPane();
        tablePaciente = new javax.swing.JTable();
        buttonExcluirPaciente = new javax.swing.JButton();
        buttonEditarPaciente = new javax.swing.JButton();
        buttonAdicionarPaciente = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(800, 330));
        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Pacientes"));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 330));
        jPanel1.setLayout(null);

        tablePaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPaciente.setViewportView(tablePaciente);

        jPanel1.add(scrollPaciente);
        scrollPaciente.setBounds(10, 20, 830, 240);

        buttonExcluirPaciente.setBackground(new java.awt.Color(255, 0, 0));
        buttonExcluirPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lixeira-de-reciclagem.png"))); // NOI18N
        buttonExcluirPaciente.setToolTipText("Excluir Plano de saude");
        buttonExcluirPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(buttonExcluirPaciente);
        buttonExcluirPaciente.setBounds(580, 270, 70, 50);

        buttonEditarPaciente.setBackground(new java.awt.Color(255, 255, 0));
        buttonEditarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lapis.png"))); // NOI18N
        buttonEditarPaciente.setToolTipText("Editar Plano de saude");
        buttonEditarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(buttonEditarPaciente);
        buttonEditarPaciente.setBounds(660, 270, 70, 50);

        buttonAdicionarPaciente.setBackground(new java.awt.Color(51, 204, 0));
        buttonAdicionarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais.png"))); // NOI18N
        buttonAdicionarPaciente.setToolTipText("Adicionar Plano de Saude");
        buttonAdicionarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarPacienteActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAdicionarPaciente);
        buttonAdicionarPaciente.setBounds(740, 270, 70, 50);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 330);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPacienteActionPerformed

//        if(getLinha() != -1) {
//            excluirPlano();
//        }else{
//            JOptionPane.showMessageDialog(
//                this,
//                "Por favor, selecione o plano que você deseja excluir!!!",
//                "Atenção",
//                JOptionPane.WARNING_MESSAGE
//            );
//
//        }

    }//GEN-LAST:event_buttonExcluirPacienteActionPerformed

    private void buttonEditarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarPacienteActionPerformed

//        if(getLinha() != -1){
//            editarPlanoDeSaude();
//        } else {
//            JOptionPane.showMessageDialog(
//                this,
//                "Por favor, selecione o plano que você deseja editar!!!",
//                "Atenção",
//                JOptionPane.WARNING_MESSAGE);
//        }
    }//GEN-LAST:event_buttonEditarPacienteActionPerformed

    private void buttonAdicionarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarPacienteActionPerformed

//        PlanoDeSaudeDialog d = new PlanoDeSaudeDialog(null, true, OperacaoEnum.ADICIONAR);
//        d.setVisible(true);
//        preencherTabela();
    }//GEN-LAST:event_buttonAdicionarPacienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarPaciente;
    private javax.swing.JButton buttonEditarPaciente;
    private javax.swing.JButton buttonExcluirPaciente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollPaciente;
    private javax.swing.JTable tablePaciente;
    // End of variables declaration//GEN-END:variables
}

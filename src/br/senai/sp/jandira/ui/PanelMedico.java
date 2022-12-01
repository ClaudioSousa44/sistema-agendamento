
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO.EspecialidadesDAO;
import br.senai.sp.jandira.dao.EspecialidadeDAO.MedicoDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelMedico extends javax.swing.JPanel {
    
    private int linha;

    
    public PanelMedico() {
        initComponents();
        MedicoDAO.criarListaDeMedicos();
        preencherTabela();
    }
    
    private int getLinha() {
        linha = tableMedico.getSelectedRow();
        return linha;
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scrollMedico = new javax.swing.JScrollPane();
        tableMedico = new javax.swing.JTable();
        buttonExcluirMedico = new javax.swing.JButton();
        buttonEditarMedico = new javax.swing.JButton();
        buttonAdicionarMedico = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(850, 330));
        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Médicos"));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 330));
        jPanel1.setLayout(null);

        tableMedico.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollMedico.setViewportView(tableMedico);

        jPanel1.add(scrollMedico);
        scrollMedico.setBounds(10, 20, 830, 240);

        buttonExcluirMedico.setBackground(new java.awt.Color(255, 0, 0));
        buttonExcluirMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lixeira-de-reciclagem.png"))); // NOI18N
        buttonExcluirMedico.setToolTipText("Excluir especialidade selecionada");
        buttonExcluirMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(buttonExcluirMedico);
        buttonExcluirMedico.setBounds(580, 270, 70, 50);

        buttonEditarMedico.setBackground(new java.awt.Color(255, 255, 0));
        buttonEditarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lapis.png"))); // NOI18N
        buttonEditarMedico.setToolTipText("Editar especialidade selecionada");
        buttonEditarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(buttonEditarMedico);
        buttonEditarMedico.setBounds(660, 270, 70, 50);

        buttonAdicionarMedico.setBackground(new java.awt.Color(51, 204, 0));
        buttonAdicionarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais.png"))); // NOI18N
        buttonAdicionarMedico.setToolTipText("Adicionar especialidade");
        buttonAdicionarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarMedicoActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAdicionarMedico);
        buttonAdicionarMedico.setBounds(740, 270, 70, 50);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 330);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirMedicoActionPerformed

        if(getLinha() != -1) {
            excluirMedico();
        }else{
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione o médico que você deseja excluir!!!",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE
            );
        }
      

    }//GEN-LAST:event_buttonExcluirMedicoActionPerformed

    private void excluirMedico() {
        
        int resposta = JOptionPane.showConfirmDialog(this, 
                "Deseja mesmo excluir?",
                "tem certeza?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if(resposta == 0){
            MedicoDAO.excluir(getCodigo());
        preencherTabela();
        }
    }
       
    
    private void buttonEditarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarMedicoActionPerformed

        if (getLinha() != -1) {
            editarMedico();
        } else {
            JOptionPane.showConfirmDialog(
                    this,
                    "Selecione um medico",
                    "Médicos",
                    JOptionPane.WARNING_MESSAGE);
        }
     
        

    }//GEN-LAST:event_buttonEditarMedicoActionPerformed

    private Integer getCodigo() {
        String codigoStr = tableMedico.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }
    
    private void editarMedico(){
        
        Medico medico = MedicoDAO.getMedico(getCodigo());
        
        MedicoDialog medicoDialog = 
                new MedicoDialog(null, true, medico,
                        OperacaoEnum.EDITAR );
        medicoDialog.setVisible(true);
        
        preencherTabela();
        
    }
    
    private void buttonAdicionarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarMedicoActionPerformed
        MedicoDialog d = new MedicoDialog(null, true, OperacaoEnum.ADICIONAR);
        d.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonAdicionarMedicoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarMedico;
    private javax.swing.JButton buttonEditarMedico;
    private javax.swing.JButton buttonExcluirMedico;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollMedico;
    private javax.swing.JTable tableMedico;
    // End of variables declaration//GEN-END:variables


    private void preencherTabela() {
        tableMedico.setModel(MedicoDAO.getTabelaMedico());
        ajustarTabela();
        
    }
    
    private void ajustarTabela() {
        tableMedico.getTableHeader().setReorderingAllowed(false);
        
        tableMedico.setDefaultEditor(Object.class, null);
        
        tableMedico.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableMedico.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableMedico.getColumnModel().getColumn(1).setPreferredWidth(150);
        tableMedico.getColumnModel().getColumn(2).setPreferredWidth(377);
        tableMedico.getColumnModel().getColumn(3).setPreferredWidth(200);
    }
   
    
}

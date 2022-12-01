
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class PanelPlanoDeSaude extends javax.swing.JPanel {

  
    public PanelPlanoDeSaude() {
        initComponents();
        PlanoDeSaudeDAO.criarListaDePlanosDeSaude();
        preencherTabela();
        
    }
    
    private int linha;
    
    private int getLinha(){
        linha = tablePlanoDeSaude.getSelectedRow();
        return linha;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPlanoDeSaude = new javax.swing.JScrollPane();
        tablePlanoDeSaude = new javax.swing.JTable();
        buttonExcluirPlano = new javax.swing.JButton();
        buttonEditarPlano = new javax.swing.JButton();
        buttonAdicionarPlano = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Plano de Saude"));
        setPreferredSize(new java.awt.Dimension(850, 330));
        setLayout(null);

        tablePlanoDeSaude.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollPlanoDeSaude.setViewportView(tablePlanoDeSaude);

        add(scrollPlanoDeSaude);
        scrollPlanoDeSaude.setBounds(10, 20, 830, 240);

        buttonExcluirPlano.setBackground(new java.awt.Color(255, 0, 0));
        buttonExcluirPlano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lixeira-de-reciclagem.png"))); // NOI18N
        buttonExcluirPlano.setToolTipText("Excluir Plano de saude");
        buttonExcluirPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirPlanoActionPerformed(evt);
            }
        });
        add(buttonExcluirPlano);
        buttonExcluirPlano.setBounds(580, 270, 70, 50);

        buttonEditarPlano.setBackground(new java.awt.Color(255, 255, 0));
        buttonEditarPlano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lapis.png"))); // NOI18N
        buttonEditarPlano.setToolTipText("Editar Plano de saude");
        buttonEditarPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarPlanoActionPerformed(evt);
            }
        });
        add(buttonEditarPlano);
        buttonEditarPlano.setBounds(660, 270, 70, 50);

        buttonAdicionarPlano.setBackground(new java.awt.Color(51, 204, 0));
        buttonAdicionarPlano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais.png"))); // NOI18N
        buttonAdicionarPlano.setToolTipText("Adicionar Plano de Saude");
        buttonAdicionarPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarPlanoActionPerformed(evt);
            }
        });
        add(buttonAdicionarPlano);
        buttonAdicionarPlano.setBounds(740, 270, 70, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirPlanoActionPerformed

        if(getLinha() != -1) {
            excluirPlano();
        }else{
                JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione o plano que você deseja excluir!!!",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE
            );
            
        }
        

    }//GEN-LAST:event_buttonExcluirPlanoActionPerformed

    private void excluirPlano(){
        int resposta =  JOptionPane.showConfirmDialog(
                this,
                "Deseja realmente excluir?",
                "Tem certeza?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if (resposta == 0) {
            PlanoDeSaudeDAO.excluir(getCodigo());
            preencherTabela();
        }
    }
     private Integer getCodigo() {
        String codigoStr = tablePlanoDeSaude.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }
    
    private void buttonEditarPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarPlanoActionPerformed

        if(getLinha() != -1){
            editarPlanoDeSaude();
        } else {
             JOptionPane.showMessageDialog(
                   this,
                    "Por favor, selecione o plano que você deseja editar!!!",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonEditarPlanoActionPerformed

    private void editarPlanoDeSaude(){
        PlanoDeSaude planoDeSaude = PlanoDeSaudeDAO.getPlano(getCodigo());
        
        PlanoDeSaudeDialog planoDeSaudeDialog =
                new PlanoDeSaudeDialog(null, true, planoDeSaude, OperacaoEnum.EDITAR);
        
        planoDeSaudeDialog.setVisible(true);
        
        preencherTabela();
    }
    
    private void buttonAdicionarPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarPlanoActionPerformed
     
        PlanoDeSaudeDialog d = new PlanoDeSaudeDialog(null, true, OperacaoEnum.ADICIONAR);
        d.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonAdicionarPlanoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarPlano;
    private javax.swing.JButton buttonEditarPlano;
    private javax.swing.JButton buttonExcluirPlano;
    private javax.swing.JScrollPane scrollPlanoDeSaude;
    private javax.swing.JTable tablePlanoDeSaude;
    // End of variables declaration//GEN-END:variables

private void preencherTabela(){
    tablePlanoDeSaude.setModel(PlanoDeSaudeDAO.getTabelaPlanoDeSaude());
    ajustarTabela();
}

private void ajustarTabela(){
     tablePlanoDeSaude.getTableHeader().setResizingAllowed(false);
     
     tablePlanoDeSaude.setDefaultEditor(Object.class, null);
     
     tablePlanoDeSaude.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
     tablePlanoDeSaude.getColumnModel().getColumn(0).setPreferredWidth(165);
     tablePlanoDeSaude.getColumnModel().getColumn(1).setPreferredWidth(165);
     tablePlanoDeSaude.getColumnModel().getColumn(2).setPreferredWidth(165);
     tablePlanoDeSaude.getColumnModel().getColumn(3).setPreferredWidth(165);
     tablePlanoDeSaude.getColumnModel().getColumn(4).setPreferredWidth(167);
}
   

}


package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO.EspecialidadesDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class PanelEspecialidades extends javax.swing.JPanel {

    private int linha;

    public PanelEspecialidades() {
        initComponents();
        EspecialidadesDAO.criarListaDeEspecialidades();
        preencherTabel();

    }

    private int getLinha() {
        linha = tableEspecialidades.getSelectedRow();
        return linha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollEspecialidades = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        buttonExcluirEspecialidades = new javax.swing.JButton();
        buttonEditarEspecialidades = new javax.swing.JButton();
        buttonAdicionarEspecialidades = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Especialidades"));
        setPreferredSize(new java.awt.Dimension(850, 330));
        setLayout(null);

        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollEspecialidades.setViewportView(tableEspecialidades);

        add(scrollEspecialidades);
        scrollEspecialidades.setBounds(10, 20, 830, 240);

        buttonExcluirEspecialidades.setBackground(new java.awt.Color(255, 0, 0));
        buttonExcluirEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lixeira-de-reciclagem.png"))); // NOI18N
        buttonExcluirEspecialidades.setToolTipText("Excluir especialidade selecionada");
        buttonExcluirEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirEspecialidadesActionPerformed(evt);
            }
        });
        add(buttonExcluirEspecialidades);
        buttonExcluirEspecialidades.setBounds(580, 270, 70, 50);

        buttonEditarEspecialidades.setBackground(new java.awt.Color(255, 255, 0));
        buttonEditarEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/lapis.png"))); // NOI18N
        buttonEditarEspecialidades.setToolTipText("Editar especialidade selecionada");
        buttonEditarEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarEspecialidadesActionPerformed(evt);
            }
        });
        add(buttonEditarEspecialidades);
        buttonEditarEspecialidades.setBounds(660, 270, 70, 50);

        buttonAdicionarEspecialidades.setBackground(new java.awt.Color(51, 204, 0));
        buttonAdicionarEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais.png"))); // NOI18N
        buttonAdicionarEspecialidades.setToolTipText("Adicionar especialidade");
        buttonAdicionarEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarEspecialidadesActionPerformed(evt);
            }
        });
        add(buttonAdicionarEspecialidades);
        buttonAdicionarEspecialidades.setBounds(740, 270, 70, 50);

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadesActionPerformed

        if (getLinha() != -1) {
            excluirEspecialidade();
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por favor, selecione a especialidade que você deseja excluir!!!",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE
            );
        }


    }//GEN-LAST:event_buttonExcluirEspecialidadesActionPerformed

     private void excluirEspecialidade() {

        int resposta = JOptionPane.showConfirmDialog(this,
                "teste boy",
                "teste",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            EspecialidadesDAO.excluir(getCodigo());
            preencherTabel();

        }

    }

    private void buttonEditarEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarEspecialidadesActionPerformed
 
        if (getLinha() != -1) {
            editarEspecialidade();
        } else {
            JOptionPane.showConfirmDialog(
                    this,
                    "Selecione uma especialidade",
                    "Especialidades",
                    JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_buttonEditarEspecialidadesActionPerformed

    private Integer getCodigo() {
        String codigoStr = tableEspecialidades.getValueAt(getLinha(), 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }

    private void editarEspecialidade() {
        Especialidade especialidade = EspecialidadesDAO.getEspecialidade(getCodigo());

        EspecialidadesDialog especialidadeDialog
                = new EspecialidadesDialog(null, true, especialidade,
                        OperacaoEnum.EDITAR);
        
        especialidadeDialog.setVisible(true);
        
        preencherTabel();

    }


    private void buttonAdicionarEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadesActionPerformed
        EspecialidadesDialog d = new EspecialidadesDialog(null, true, OperacaoEnum.ADICIONAR);
        d.setVisible(true);
        preencherTabel();
    }//GEN-LAST:event_buttonAdicionarEspecialidadesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarEspecialidades;
    private javax.swing.JButton buttonEditarEspecialidades;
    private javax.swing.JButton buttonExcluirEspecialidades;
    private javax.swing.JScrollPane scrollEspecialidades;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void preencherTabel() {

        tableEspecialidades.setModel(EspecialidadesDAO.getTabelaEspecialidades());
        ajustarTabela();
    }

    private void ajustarTabela() {
        //Impedir que o usuário movimente as colunas

        tableEspecialidades.getTableHeader().setReorderingAllowed(false);

        //Bloquear a edição das células da tabela
        tableEspecialidades.setDefaultEditor(Object.class, null);

        //definir a largura das colunas
        tableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(150);
        tableEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(577);
    }

}

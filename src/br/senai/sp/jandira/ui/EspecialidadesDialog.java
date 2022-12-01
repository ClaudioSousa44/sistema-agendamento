package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO.EspecialidadesDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;

public class EspecialidadesDialog extends javax.swing.JDialog {

    private Especialidade especialidade;
    private OperacaoEnum operacao;

    public EspecialidadesDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
    }

    public EspecialidadesDialog(
            java.awt.Frame parent,
            boolean modal,
            Especialidade e,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();

        this.operacao = operacao;
        especialidade = e;

        preencherFormulario();
        preencherTitulo();
    }

    private void preencherFormulario() {

        TextFieldCodigo.setText(especialidade.getCodigo().toString());
        textFieldNomeDaEspecialidade.setText(especialidade.getNome());
        textfildDescricaoEspecialidade.setText(especialidade.getDescricao());
    }

    private void preencherTitulo() {

        labelEspecialidadeAdd.setText("Especialidades - " + operacao);

        if (operacao == OperacaoEnum.EDITAR) {
            imageAdd.setIcon(new javax.swing.ImageIcon(getClass().
                    getResource("/br/senai/sp/jandira/imagens/lapis.png")));
            backAdd.setBackground(new java.awt.Color(255, 255, 0));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelEspecialidadeAdd = new javax.swing.JLabel();
        backAdd = new javax.swing.JPanel();
        imageAdd = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        TextFieldCodigo = new javax.swing.JTextField();
        labelNomeDaEspecialidade = new javax.swing.JLabel();
        textFieldNomeDaEspecialidade = new javax.swing.JTextField();
        labelDescricaoEspecialidade = new javax.swing.JLabel();
        textfildDescricaoEspecialidade = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        labelEspecialidadeAdd.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        labelEspecialidadeAdd.setForeground(new java.awt.Color(255, 255, 255));
        labelEspecialidadeAdd.setText("Especialidades - ADICIONAR");
        jPanel1.add(labelEspecialidadeAdd);
        labelEspecialidadeAdd.setBounds(110, 10, 520, 50);

        backAdd.setBackground(new java.awt.Color(0, 255, 0));

        imageAdd.setBackground(new java.awt.Color(255, 0, 51));
        imageAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais.png"))); // NOI18N
        backAdd.add(imageAdd);

        jPanel1.add(backAdd);
        backAdd.setBounds(40, 20, 50, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 710, 80);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes das especialidades"));
        jPanel5.setLayout(null);

        labelCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigo.setText("Código:");
        jPanel5.add(labelCodigo);
        labelCodigo.setBounds(50, 60, 60, 20);

        TextFieldCodigo.setEditable(false);
        TextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCodigoActionPerformed(evt);
            }
        });
        jPanel5.add(TextFieldCodigo);
        TextFieldCodigo.setBounds(50, 90, 120, 22);

        labelNomeDaEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNomeDaEspecialidade.setText("Nome da especialidade:");
        jPanel5.add(labelNomeDaEspecialidade);
        labelNomeDaEspecialidade.setBounds(50, 130, 170, 20);

        textFieldNomeDaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeDaEspecialidadeActionPerformed(evt);
            }
        });
        jPanel5.add(textFieldNomeDaEspecialidade);
        textFieldNomeDaEspecialidade.setBounds(50, 160, 360, 22);

        labelDescricaoEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDescricaoEspecialidade.setText("Descrição da especialidade:");
        jPanel5.add(labelDescricaoEspecialidade);
        labelDescricaoEspecialidade.setBounds(50, 210, 260, 20);

        textfildDescricaoEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfildDescricaoEspecialidadeActionPerformed(evt);
            }
        });
        jPanel5.add(textfildDescricaoEspecialidade);
        textfildDescricaoEspecialidade.setBounds(50, 240, 590, 22);

        buttonSalvar.setBackground(new java.awt.Color(51, 102, 255));
        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salve-.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar especialidade");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel5.add(buttonSalvar);
        buttonSalvar.setBounds(590, 290, 60, 50);

        buttonCancelar.setBackground(new java.awt.Color(255, 0, 0));
        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir.png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel5.add(buttonCancelar);
        buttonCancelar.setBounds(510, 290, 60, 50);

        jPanel3.add(jPanel5);
        jPanel5.setBounds(10, 10, 690, 350);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 80, 710, 400);

        setSize(new java.awt.Dimension(728, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCodigoActionPerformed

    private void textFieldNomeDaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeDaEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeDaEspecialidadeActionPerformed

    private void textfildDescricaoEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfildDescricaoEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfildDescricaoEspecialidadeActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void adicionar() {
        //Criar um objeto especialidade
        Especialidade novaEspecialidade = new Especialidade();
        novaEspecialidade.setNome(textFieldNomeDaEspecialidade.getText());
        novaEspecialidade.setDescricao(textfildDescricaoEspecialidade.getText());

        //Gravar o objeto, através do dao
        EspecialidadesDAO.gravar(novaEspecialidade);

        JOptionPane.showMessageDialog(
                this,
                "Especialidade salva com sucesso",
                "Especialidades",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }

    private void editar() {
        especialidade.setNome(textFieldNomeDaEspecialidade.getText());
        especialidade.setDescricao(textfildDescricaoEspecialidade.getText());

        EspecialidadesDAO.atualizar(especialidade);

        JOptionPane.showMessageDialog(null,
                "Atualizada com sucesso",
                "Especialidades",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldCodigo;
    private javax.swing.JPanel backAdd;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel imageAdd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescricaoEspecialidade;
    private javax.swing.JLabel labelEspecialidadeAdd;
    private javax.swing.JLabel labelNomeDaEspecialidade;
    private javax.swing.JTextField textFieldNomeDaEspecialidade;
    private javax.swing.JTextField textfildDescricaoEspecialidade;
    // End of variables declaration//GEN-END:variables
}

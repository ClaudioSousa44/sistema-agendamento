package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JOptionPane;

public class PlanoDeSaudeDialog extends javax.swing.JDialog {

    private PlanoDeSaude planoDeSaude;
    private OperacaoEnum operacao;

    public PlanoDeSaudeDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;

    }

    public PlanoDeSaudeDialog(
            java.awt.Frame parent,
            boolean modal,
            PlanoDeSaude p,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        
        this.operacao = operacao;
        planoDeSaude = p;

        preencherFormulario();
        preencherTitulo();

    }

    private void preencherFormulario() {
        TextFieldCodigo1.setText(planoDeSaude.getCodigo().toString());
        textFieldlOperadora1.setText(planoDeSaude.getOperadora());
        textfildCategoria.setText(planoDeSaude.getCategoria());
        textFieldNumero1.setText(planoDeSaude.getNumero());
        formattedTextFieldValidade.setText(planoDeSaude.getValidade().
                format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
       
    }

    private void preencherTitulo() {
        labelPlanosAdd1.setText("Planos - " + operacao);

        if (operacao == OperacaoEnum.EDITAR) {
            imageAdd.setIcon(new javax.swing.ImageIcon(getClass().
                    getResource("/br/senai/sp/jandira/imagens/lapis.png")));
            backAdd.setBackground(new java.awt.Color(255, 255, 0));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
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
        jPanel2 = new javax.swing.JPanel();
        labelPlanosAdd1 = new javax.swing.JLabel();
        backPlanos1 = new javax.swing.JPanel();
        imageAdd1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        labelCodigo1 = new javax.swing.JLabel();
        TextFieldCodigo1 = new javax.swing.JTextField();
        labelOperadora1 = new javax.swing.JLabel();
        textFieldlOperadora1 = new javax.swing.JTextField();
        labelCategoria = new javax.swing.JLabel();
        textfildCategoria = new javax.swing.JTextField();
        buttonSalvar1 = new javax.swing.JButton();
        buttonCancelar1 = new javax.swing.JButton();
        labelNumero1 = new javax.swing.JLabel();
        textFieldNumero1 = new javax.swing.JTextField();
        labelValidade = new javax.swing.JLabel();
        formattedTextFieldValidade = new javax.swing.JFormattedTextField();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog1.getContentPane().setLayout(null);

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

        jDialog1.getContentPane().add(jPanel1);
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

        jDialog1.getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 80, 710, 400);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        labelPlanosAdd1.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
        labelPlanosAdd1.setForeground(new java.awt.Color(255, 255, 255));
        labelPlanosAdd1.setText("Planos De Saude - ADICIONAR");
        jPanel2.add(labelPlanosAdd1);
        labelPlanosAdd1.setBounds(110, 10, 520, 50);

        backPlanos1.setBackground(new java.awt.Color(0, 255, 0));

        imageAdd1.setBackground(new java.awt.Color(255, 0, 51));
        imageAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais.png"))); // NOI18N
        backPlanos1.add(imageAdd1);

        jPanel2.add(backPlanos1);
        backPlanos1.setBounds(40, 20, 50, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 710, 80);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes dos Planos"));
        jPanel6.setLayout(null);

        labelCodigo1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigo1.setText("Código:");
        jPanel6.add(labelCodigo1);
        labelCodigo1.setBounds(50, 30, 60, 20);

        TextFieldCodigo1.setEditable(false);
        TextFieldCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCodigo1ActionPerformed(evt);
            }
        });
        jPanel6.add(TextFieldCodigo1);
        TextFieldCodigo1.setBounds(50, 50, 120, 22);

        labelOperadora1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelOperadora1.setText("Operadora:");
        jPanel6.add(labelOperadora1);
        labelOperadora1.setBounds(50, 80, 170, 20);

        textFieldlOperadora1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldlOperadora1ActionPerformed(evt);
            }
        });
        jPanel6.add(textFieldlOperadora1);
        textFieldlOperadora1.setBounds(50, 100, 360, 22);

        labelCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCategoria.setText("Categoria:");
        jPanel6.add(labelCategoria);
        labelCategoria.setBounds(50, 140, 260, 20);

        textfildCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfildCategoriaActionPerformed(evt);
            }
        });
        jPanel6.add(textfildCategoria);
        textfildCategoria.setBounds(50, 160, 360, 22);

        buttonSalvar1.setBackground(new java.awt.Color(51, 102, 255));
        buttonSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salve-.png"))); // NOI18N
        buttonSalvar1.setToolTipText("Salvar Plano de saúde");
        buttonSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvar1ActionPerformed(evt);
            }
        });
        jPanel6.add(buttonSalvar1);
        buttonSalvar1.setBounds(590, 290, 60, 50);

        buttonCancelar1.setBackground(new java.awt.Color(255, 0, 0));
        buttonCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir.png"))); // NOI18N
        buttonCancelar1.setToolTipText("Cancelar");
        buttonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelar1ActionPerformed(evt);
            }
        });
        jPanel6.add(buttonCancelar1);
        buttonCancelar1.setBounds(510, 290, 60, 50);

        labelNumero1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNumero1.setText("Número:");
        jPanel6.add(labelNumero1);
        labelNumero1.setBounds(50, 200, 170, 20);

        textFieldNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumero1ActionPerformed(evt);
            }
        });
        jPanel6.add(textFieldNumero1);
        textFieldNumero1.setBounds(50, 220, 360, 22);

        labelValidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelValidade.setText("Validade:");
        jPanel6.add(labelValidade);
        labelValidade.setBounds(50, 260, 170, 20);

        try {
            formattedTextFieldValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        formattedTextFieldValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formattedTextFieldValidadeActionPerformed(evt);
            }
        });
        jPanel6.add(formattedTextFieldValidade);
        formattedTextFieldValidade.setBounds(50, 280, 150, 22);
        try {
            formattedTextFieldValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
                new javax.swing.text.MaskFormatter("##/##/####")));
    } catch (java.text.ParseException ex) {
        ex.printStackTrace();
    }

    jPanel4.add(jPanel6);
    jPanel6.setBounds(10, 10, 690, 350);

    getContentPane().add(jPanel4);
    jPanel4.setBounds(0, 80, 710, 400);

    setSize(new java.awt.Dimension(726, 486));
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

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        

    }//GEN-LAST:event_buttonSalvarActionPerformed

 
    
    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void TextFieldCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCodigo1ActionPerformed

    private void textfildCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfildCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfildCategoriaActionPerformed

    private void buttonSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvar1ActionPerformed

        CharSequence teste = " ";
        if(formattedTextFieldValidade.getText().contains(teste) == true ||
                textFieldlOperadora1.getText().isEmpty() == true || 
                textfildCategoria.getText().isEmpty() == true || 
                textFieldNumero1.getText().isEmpty() == true){
            JOptionPane.showMessageDialog(null, 
                    "preencha todos os campos!!", 
                    "Atenção!", 
                    JOptionPane.WARNING_MESSAGE);
        }else{
        if(operacao == OperacaoEnum.ADICIONAR){
            adicionar();
        }else{ 
            editar();
        }
        }

    }//GEN-LAST:event_buttonSalvar1ActionPerformed
   private void adicionar(){
        PlanoDeSaude novoPlano = new PlanoDeSaude();
        novoPlano.setOperadora(textFieldlOperadora1.getText());
        novoPlano.setCategoria(textfildCategoria.getText());
        novoPlano.setNumero(textFieldNumero1.getText().toString());
        novoPlano.setValidade(LocalDate.parse(formattedTextFieldValidade.getText(),
                DateTimeFormatter.ofPattern("dd/MM/yyyy")));

       
        PlanoDeSaudeDAO.gravar(novoPlano);
                JOptionPane.showMessageDialog(
                this,
                "Plano de saúde salvo com sucesso",
                "Plano de saúde",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }
    
    private void editar(){
        planoDeSaude.setOperadora(textFieldlOperadora1.getText());
        planoDeSaude.setCategoria(textfildCategoria.getText());
        planoDeSaude.setNumero(textFieldNumero1.getText().toString());
        planoDeSaude.setValidade(LocalDate.parse(formattedTextFieldValidade.getText(), 
                DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
        PlanoDeSaudeDAO.atualizar(planoDeSaude);
        
         JOptionPane.showMessageDialog(null,
                "Atualizad0 com sucesso",
                "Plano de saúde",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
       
        
    }
    private void buttonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelar1ActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelar1ActionPerformed

    private void textFieldlOperadora1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldlOperadora1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldlOperadora1ActionPerformed

    private void textFieldNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumero1ActionPerformed

    private void formattedTextFieldValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formattedTextFieldValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formattedTextFieldValidadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldCodigo;
    private javax.swing.JTextField TextFieldCodigo1;
    private javax.swing.JPanel backAdd;
    private javax.swing.JPanel backPlanos1;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonCancelar1;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JButton buttonSalvar1;
    private javax.swing.JFormattedTextField formattedTextFieldValidade;
    private javax.swing.JLabel imageAdd;
    private javax.swing.JLabel imageAdd1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCodigo1;
    private javax.swing.JLabel labelDescricaoEspecialidade;
    private javax.swing.JLabel labelEspecialidadeAdd;
    private javax.swing.JLabel labelNomeDaEspecialidade;
    private javax.swing.JLabel labelNumero1;
    private javax.swing.JLabel labelOperadora1;
    private javax.swing.JLabel labelPlanosAdd1;
    private javax.swing.JLabel labelValidade;
    private javax.swing.JTextField textFieldNomeDaEspecialidade;
    private javax.swing.JTextField textFieldNumero1;
    private javax.swing.JTextField textFieldlOperadora1;
    private javax.swing.JTextField textfildCategoria;
    private javax.swing.JTextField textfildDescricaoEspecialidade;
    // End of variables declaration//GEN-END:variables
}

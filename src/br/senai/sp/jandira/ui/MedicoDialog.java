package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO.EspecialidadesDAO;
import br.senai.sp.jandira.dao.EspecialidadeDAO.MedicoDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class MedicoDialog extends javax.swing.JDialog {

    private Medico medico;
    private OperacaoEnum operacao;

    public MedicoDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherListaDeEspecialidades();
        preencherListaDeEspDoMedico();
    }

    public MedicoDialog(
            java.awt.Frame parent,
            boolean modal,
            Medico m,
            OperacaoEnum operacao
            ) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        medico = m;
        
        preencherFormulario();
        preencherTitulo();
         preencherListaDeEspecialidades();
         preencherListaDeEspDoMedico();
        
    }
    
    private void preencherListaDeEspecialidades(){
        Jlist2.setModel(EspecialidadesDAO.preencherEspecialidade());
    }
    
    private void preencherListaDeEspDoMedico() {
    	DefaultListModel<Especialidade> espMedico = new DefaultListModel<>();
    	for (Especialidade listar : medico.getEspecialidade()) {
    		espMedico.addElement(listar);
    	}
    	jList1.setModel(espMedico);
    }
    private void preencherFormulario(){
        
        textFieldCodigo.setText(medico.getCodigo().toString());
        textFieldCrm.setText(medico.getCrm());
        textFieldNome.setText(medico.getNome());
        textFieldTelefone.setText(medico.getTelefone());
        jTextFieldEmail.setText(medico.getEmail());
        formattedTextFieldData.setText(medico.getDataNsc().
                format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        
    }
    
    private void preencherTitulo(){
        labelMedicoAdd1.setText("Médico - " + operacao);
        
        if(operacao == OperacaoEnum.EDITAR) {
            imageAdd1.setIcon(new javax.swing.ImageIcon(
                    getClass().
                            getResource
        ("/br/senai/sp/jandira/imagens/lapis.png")));
            backMedico1.setBackground(new java.awt.Color(255, 255, 0));
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jPanel2 = new javax.swing.JPanel();
        labelMedicoAdd1 = new javax.swing.JLabel();
        backMedico1 = new javax.swing.JPanel();
        imageAdd1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        buttonSalvarMedico = new javax.swing.JButton();
        buttonCancelarMedico = new javax.swing.JButton();
        LabelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelCrm = new javax.swing.JLabel();
        textFieldCrm = new javax.swing.JTextField();
        labelNome = new javax.swing.JLabel();
        textFieldNome = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        textFieldTelefone = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        labelData = new javax.swing.JLabel();
        jLabelLESpecialidades = new javax.swing.JLabel();
        jScrollPaneEMedicos = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButtonAdicionar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jLabelEMedico = new javax.swing.JLabel();
        jScrollPaneLEspecialidades = new javax.swing.JScrollPane();
        Jlist2 = new javax.swing.JList<>();
        formattedTextFieldData = new javax.swing.JFormattedTextField();

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

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    getContentPane().setLayout(null);

    jPanel2.setBackground(new java.awt.Color(0, 0, 0));
    jPanel2.setLayout(null);

    labelMedicoAdd1.setFont(new java.awt.Font("Segoe UI Black", 0, 30)); // NOI18N
    labelMedicoAdd1.setForeground(new java.awt.Color(255, 255, 255));
    labelMedicoAdd1.setText("Médicos - ADICIONAR");
    jPanel2.add(labelMedicoAdd1);
    labelMedicoAdd1.setBounds(180, 10, 350, 50);

    backMedico1.setBackground(new java.awt.Color(0, 255, 0));

    imageAdd1.setBackground(new java.awt.Color(255, 0, 51));
    imageAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais.png"))); // NOI18N
    backMedico1.add(imageAdd1);

    jPanel2.add(backMedico1);
    backMedico1.setBounds(100, 20, 50, 40);

    getContentPane().add(jPanel2);
    jPanel2.setBounds(0, 0, 710, 80);

    jPanel7.setBackground(new java.awt.Color(204, 204, 204));
    jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalhes dos Médicos"));
    jPanel7.setLayout(null);

    buttonSalvarMedico.setBackground(new java.awt.Color(51, 102, 255));
    buttonSalvarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/salve-.png"))); // NOI18N
    buttonSalvarMedico.setToolTipText("Salvar Plano de saúde");
    buttonSalvarMedico.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buttonSalvarMedicoActionPerformed(evt);
        }
    });
    jPanel7.add(buttonSalvarMedico);
    buttonSalvarMedico.setBounds(590, 290, 60, 50);

    buttonCancelarMedico.setBackground(new java.awt.Color(255, 0, 0));
    buttonCancelarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/excluir.png"))); // NOI18N
    buttonCancelarMedico.setToolTipText("Cancelar");
    buttonCancelarMedico.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buttonCancelarMedicoActionPerformed(evt);
        }
    });
    jPanel7.add(buttonCancelarMedico);
    buttonCancelarMedico.setBounds(510, 290, 60, 50);

    LabelCodigo.setText("Código:");
    jPanel7.add(LabelCodigo);
    LabelCodigo.setBounds(20, 30, 60, 16);

    textFieldCodigo.setEditable(false);
    textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            textFieldCodigoActionPerformed(evt);
        }
    });
    jPanel7.add(textFieldCodigo);
    textFieldCodigo.setBounds(20, 50, 100, 22);

    labelCrm.setText("CRM:");
    jPanel7.add(labelCrm);
    labelCrm.setBounds(140, 30, 50, 16);
    jPanel7.add(textFieldCrm);
    textFieldCrm.setBounds(140, 50, 140, 22);

    labelNome.setText("Nome do(a) Médico(a):");
    jPanel7.add(labelNome);
    labelNome.setBounds(310, 30, 260, 16);

    textFieldNome.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            textFieldNomeActionPerformed(evt);
        }
    });
    jPanel7.add(textFieldNome);
    textFieldNome.setBounds(310, 50, 370, 22);

    labelTelefone.setText("Telefone:");
    jPanel7.add(labelTelefone);
    labelTelefone.setBounds(20, 90, 80, 16);
    jPanel7.add(textFieldTelefone);
    textFieldTelefone.setBounds(20, 110, 130, 22);

    labelEmail.setText("Email:");
    jPanel7.add(labelEmail);
    labelEmail.setBounds(170, 90, 70, 16);
    jPanel7.add(jTextFieldEmail);
    jTextFieldEmail.setBounds(170, 110, 360, 22);

    labelData.setText("Data de nascimento:");
    jPanel7.add(labelData);
    labelData.setBounds(550, 90, 130, 16);

    jLabelLESpecialidades.setText("Lista de Especialidades:");
    jPanel7.add(jLabelLESpecialidades);
    jLabelLESpecialidades.setBounds(20, 160, 140, 16);

    jScrollPaneEMedicos.setViewportView(jList1);

    jPanel7.add(jScrollPaneEMedicos);
    jScrollPaneEMedicos.setBounds(280, 180, 130, 130);

    jButtonAdicionar.setBackground(new java.awt.Color(0, 255, 0));
    jButtonAdicionar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    jButtonAdicionar.setText(">");
    jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonAdicionarActionPerformed(evt);
        }
    });
    jPanel7.add(jButtonAdicionar);
    jButtonAdicionar.setBounds(190, 260, 60, 50);

    jButtonRemover.setBackground(new java.awt.Color(255, 51, 51));
    jButtonRemover.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
    jButtonRemover.setText("<");
    jButtonRemover.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonRemoverActionPerformed(evt);
        }
    });
    jPanel7.add(jButtonRemover);
    jButtonRemover.setBounds(190, 190, 60, 50);

    jLabelEMedico.setText("Especialidades do Médico(a):");
    jPanel7.add(jLabelEMedico);
    jLabelEMedico.setBounds(280, 160, 180, 16);

    jScrollPaneLEspecialidades.setViewportView(Jlist2);

    jPanel7.add(jScrollPaneLEspecialidades);
    jScrollPaneLEspecialidades.setBounds(20, 180, 130, 130);

    try {
        formattedTextFieldData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
    } catch (java.text.ParseException ex) {
        ex.printStackTrace();
    }
    jPanel7.add(formattedTextFieldData);
    formattedTextFieldData.setBounds(550, 110, 130, 22);
    try {
        formattedTextFieldValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(
            new javax.swing.text.MaskFormatter("##/##/####")));
    } catch (java.text.ParseException ex) {
        ex.printStackTrace();
    }

    getContentPane().add(jPanel7);
    jPanel7.setBounds(10, 100, 690, 350);

    setSize(new java.awt.Dimension(726, 486));
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCodigo1ActionPerformed

    private void textFieldlOperadora1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldlOperadora1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldlOperadora1ActionPerformed

    private void textfildCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfildCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfildCategoriaActionPerformed

    private void buttonSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvar1ActionPerformed

    }//GEN-LAST:event_buttonSalvar1ActionPerformed

    private void buttonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelar1ActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelar1ActionPerformed

    private void textFieldNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumero1ActionPerformed

    private void formattedTextFieldValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formattedTextFieldValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formattedTextFieldValidadeActionPerformed

    private void buttonCancelarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarMedicoActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarMedicoActionPerformed

    private void buttonSalvarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarMedicoActionPerformed

        CharSequence teste = " ";
        if(formattedTextFieldData.getText().contains(teste) == true ||
                textFieldCrm.getText().isEmpty() == true ||
                textFieldNome.getText().isEmpty() == true ||
                textFieldTelefone.getText().isEmpty() == true ||
                jTextFieldEmail.getText().isEmpty() == true ){
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
        
       

    }//GEN-LAST:event_buttonSalvarMedicoActionPerformed
    
    private ArrayList<Especialidade> pegarEspecialidades(JList<Especialidade> lista) {
        int tamanho = lista.getModel().getSize();
        ArrayList<Especialidade> listaNova = new ArrayList();
        for (int i = 0; i < tamanho; i++) {
            listaNova.add(lista.getModel().getElementAt(i));
        }
        return listaNova;
    }
    

    
     private void adicionar(){
            Medico novoMedico = new Medico();
            novoMedico.setCrm(textFieldCrm.getText());
            novoMedico.setNome( textFieldNome.getText());
            novoMedico.setTelefone( textFieldTelefone.getText());
            novoMedico.setEmail(jTextFieldEmail.getText());
            novoMedico.setDataNsc(LocalDate.parse(formattedTextFieldData.getText(),
                    DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            novoMedico.setEspecialidade(pegarEspecialidades(jList1));
            MedicoDAO.gravar(novoMedico);
                    JOptionPane.showMessageDialog(
                this,
                "Médico salvo com sucesso",
                "Médico",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
            
        }
     
     private void editar(){
         
         medico.setCrm(textFieldCrm.getText());
         medico.setNome( textFieldNome.getText());
         medico.setTelefone( textFieldTelefone.getText());
         medico.setEmail(jTextFieldEmail.getText());
         medico.setDataNsc(LocalDate.parse(formattedTextFieldData.getText(),
                    DateTimeFormatter.ofPattern("dd/MM/yyyy")));
         medico.setEspecialidade(pegarEspecialidades(jList1));
         
         MedicoDAO.atualizar(medico);
         
         JOptionPane.showMessageDialog(null,
                "Atualizad0 com sucesso",
                "Médico",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
     }
    
    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void textFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {
    	//add
    	if (Jlist2.isSelectionEmpty() == false) {
    		ArrayList<Especialidade> listaNova = new ArrayList<>();
    		int tamanho = jList1.getModel().getSize();
    		int i = 0;
    		while (tamanho > i) {
    			listaNova.add(jList1.getModel().getElementAt(i));
    			i++;
    		}
    		
    		if(listaNova.contains(Jlist2.getSelectedValue()) == false) {
    			listaNova.add(Jlist2.getSelectedValue());
    			
    			
    			DefaultListModel<Especialidade> listaDeEsp = new DefaultListModel<>();
    			for (Especialidade listar : listaNova) {
    				listaDeEsp.addElement(listar);
    			}
    			jList1.setModel(listaDeEsp);
    		} else {
    			JOptionPane.showMessageDialog(null,
    					"Especialidade ja selecionada!",
    					"Médico",
    					JOptionPane.WARNING_MESSAGE,
    					null);
    		}
    		
    	}else {
    		JOptionPane.showMessageDialog(this,
					"Selecione alguma especialidade!!!!",
					"Médico",
					JOptionPane.WARNING_MESSAGE,
					null);
    		
    	}
    	
    }

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {
    	if (jList1.isSelectionEmpty() == false) {
            ArrayList<Especialidade> listanova = new ArrayList<>();
            int tamanho = jList1.getModel().getSize();
            for (int o = 0; o < tamanho; o++) {
            	listanova.add(jList1.getModel().getElementAt(o));
            }
            listanova.remove(jList1.getSelectedValue());

            DefaultListModel<Especialidade> especialidadesLista = new DefaultListModel<Especialidade>();
            for (Especialidade listar : listanova) {
                especialidadesLista.addElement(listar);
            }
            jList1.setModel(especialidadesLista);
        } else {
            JOptionPane.showMessageDialog(this,
                    "Selecione uma especialidade para ser removida!!!!!!!",
                    "Médico",
                    JOptionPane.WARNING_MESSAGE, null);
        }
    	
        
    	
    	
    }//GEN-LAST:event_jButtonRemoverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Especialidade> Jlist2;
    private javax.swing.JLabel LabelCodigo;
    private javax.swing.JTextField TextFieldCodigo1;
    private javax.swing.JPanel backMedico1;
    private javax.swing.JButton buttonCancelar1;
    private javax.swing.JButton buttonCancelarMedico;
    private javax.swing.JButton buttonSalvar1;
    private javax.swing.JButton buttonSalvarMedico;
    private javax.swing.JFormattedTextField formattedTextFieldData;
    private javax.swing.JFormattedTextField formattedTextFieldValidade;
    private javax.swing.JLabel imageAdd1;
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JLabel jLabelEMedico;
    private javax.swing.JLabel jLabelLESpecialidades;
    private javax.swing.JList<Especialidade> jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPaneEMedicos;
    private javax.swing.JScrollPane jScrollPaneLEspecialidades;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelCodigo1;
    private javax.swing.JLabel labelCrm;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelMedicoAdd1;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNumero1;
    private javax.swing.JLabel labelOperadora1;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelValidade;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldCrm;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldNumero1;
    private javax.swing.JTextField textFieldTelefone;
    private javax.swing.JTextField textFieldlOperadora1;
    private javax.swing.JTextField textfildCategoria;
    // End of variables declaration//GEN-END:variables
}

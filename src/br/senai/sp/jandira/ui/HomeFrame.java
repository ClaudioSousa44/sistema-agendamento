/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO.EspecialidadesDAO;
import java.awt.Toolkit;



public class HomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png")));
        initPanels();
        
    }
    
    //atributo da classe
    PanelEspecialidades panelEspecialidades;
    PanelPlanoDeSaude panelPlanoDeSaude;
    PanelPaciente panelPaciente;
    PanelMedico panelMedico;
    
    //Constantes
    private final int POS_X = 10;
    private final int POS_y = 170;
    private final int LARGURA = 850;
    private final int ALTURA = 330;
    
    
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        buttonPlanoDeSaude = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buttonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistemas de agendamentos de consultas");
        setBackground(new java.awt.Color(153, 153, 153));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sistemas de agendamento de consultas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(222, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 870, 100);

        buttonSair.setBackground(new java.awt.Color(255, 0, 0));
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/sair.png"))); // NOI18N
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(800, 110, 60, 40);

        buttonAgenda.setBackground(new java.awt.Color(0, 0, 0));
        buttonAgenda.setForeground(new java.awt.Color(255, 255, 255));
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/calendar32.png"))); // NOI18N
        buttonAgenda.setText("Agenda");
        buttonAgenda.setToolTipText("");
        buttonAgenda.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(30, 110, 130, 40);

        buttonPacientes.setBackground(new java.awt.Color(0, 0, 0));
        buttonPacientes.setForeground(new java.awt.Color(255, 255, 255));
        buttonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/sick32.png"))); // NOI18N
        buttonPacientes.setText("Pacientes");
        buttonPacientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(170, 110, 130, 40);

        buttonMedicos.setBackground(new java.awt.Color(0, 0, 0));
        buttonMedicos.setForeground(new java.awt.Color(255, 255, 255));
        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/doctor32.png"))); // NOI18N
        buttonMedicos.setText("Médicos");
        buttonMedicos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(450, 110, 130, 40);

        buttonPlanoDeSaude.setBackground(new java.awt.Color(0, 0, 0));
        buttonPlanoDeSaude.setForeground(new java.awt.Color(255, 255, 255));
        buttonPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/id-card32.png"))); // NOI18N
        buttonPlanoDeSaude.setText("Plano de saúde");
        buttonPlanoDeSaude.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanoDeSaude);
        buttonPlanoDeSaude.setBounds(310, 110, 130, 40);

        buttonEspecialidades.setBackground(new java.awt.Color(0, 0, 0));
        buttonEspecialidades.setForeground(new java.awt.Color(255, 255, 255));
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/estetoscopio32.png"))); // NOI18N
        buttonEspecialidades.setText("Especialidades");
        buttonEspecialidades.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(590, 110, 130, 40);

        panelHome.setBackground(new java.awt.Color(204, 204, 204));
        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("SISACON");
        panelHome.add(jLabel3);
        jLabel3.setBounds(60, 50, 230, 60);

        jLabel4.setText("Sistema de Agendamentos de Consultas");
        panelHome.add(jLabel4);
        jLabel4.setBounds(60, 100, 240, 16);

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelHome.add(jPanel2);
        jPanel2.setBounds(60, 120, 700, 2);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Dados para contato:");
        panelHome.add(jLabel5);
        jLabel5.setBounds(590, 120, 180, 30);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("E-mail: suport@sisacon.com");
        panelHome.add(jLabel6);
        jLabel6.setBounds(580, 150, 190, 16);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Telefone: 4203121313");
        panelHome.add(jLabel7);
        jLabel7.setBounds(620, 170, 150, 16);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Site www.sisacon.com");
        panelHome.add(jLabel8);
        jLabel8.setBounds(630, 190, 140, 16);

        getContentPane().add(panelHome);
        panelHome.setBounds(10, 170, 850, 330);

        buttonHome.setBackground(new java.awt.Color(0, 0, 0));
        buttonHome.setForeground(new java.awt.Color(255, 255, 255));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/home (1).png"))); // NOI18N
        buttonHome.setText("Home");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(10, 500, 130, 40);

        setSize(new java.awt.Dimension(886, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgendaActionPerformed

    private void buttonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacientesActionPerformed
         panelPlanoDeSaude.setVisible(false);
        panelHome.setVisible(false);
        panelEspecialidades.setVisible(false);
        panelPaciente.setVisible(true);
        panelMedico.setVisible(false);
    }//GEN-LAST:event_buttonPacientesActionPerformed

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
         panelPlanoDeSaude.setVisible(false);
        panelHome.setVisible(false);
        panelEspecialidades.setVisible(false);
        panelPaciente.setVisible(false);
        panelMedico.setVisible(true);
    }//GEN-LAST:event_buttonMedicosActionPerformed

    private void buttonPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoDeSaudeActionPerformed
        panelPlanoDeSaude.setVisible(true);
        panelHome.setVisible(false);
        panelEspecialidades.setVisible(false);
        panelPaciente.setVisible(false);
        panelMedico.setVisible(false);
    }//GEN-LAST:event_buttonPlanoDeSaudeActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed
       
        
        panelEspecialidades.setVisible(true);
        panelHome.setVisible(false);
        panelPlanoDeSaude.setVisible(false);
        panelPaciente.setVisible(false);
        panelMedico.setVisible(false);
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
      panelEspecialidades.setVisible(false);
      panelHome.setVisible(true);
      panelPlanoDeSaude.setVisible(false);
      panelPaciente.setVisible(false);
      panelMedico.setVisible(false);
    }//GEN-LAST:event_buttonHomeActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanoDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {
        panelEspecialidades = new PanelEspecialidades();
        panelEspecialidades.setBounds(
                POS_X, 
                POS_y, 
                LARGURA, 
                ALTURA);
        getContentPane().add(panelEspecialidades);
        panelEspecialidades.setVisible(false);
        
        panelPlanoDeSaude = new PanelPlanoDeSaude();
        panelPlanoDeSaude.setBounds(
                POS_X,
                POS_y,
                LARGURA,
                ALTURA);
        getContentPane().add(panelPlanoDeSaude);
        panelPlanoDeSaude.setVisible(false);
        
        panelPaciente = new PanelPaciente();
        panelPaciente.setBounds(POS_X,
                POS_y,
                LARGURA,
                ALTURA);
        getContentPane().add(panelPaciente);
        panelPaciente.setVisible(false);
        
        panelMedico = new PanelMedico();
        panelMedico.setBounds(POS_X, 
                POS_y, 
                LARGURA, 
                ALTURA);
        getContentPane().add(panelMedico);
        panelMedico.setVisible(false);
        
        
    }


}

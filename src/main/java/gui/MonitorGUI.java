/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.util.ArrayList;
import modelo.Monitor_Experiencia;
import dao.FabricaConexao;
import java.sql.Connection; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import dao.Monitor_ExperienciaDAO;
/**
 *
 * @author acere
 */
public class MonitorGUI extends javax.swing.JFrame {

    /**
     * Creates new form MonitorGUI
     */
    public MonitorGUI() {
        initComponents();
        mostra_monitor();
    }
    
    private void mostra_monitor() {

        try{
            Monitor_ExperienciaDAO bd = new Monitor_ExperienciaDAO();
            ArrayList<Monitor_Experiencia> lista = bd.listarMonitores();
            DefaultTableModel model = (DefaultTableModel)tabelaInfo.getModel();
            Object[] row = new Object[6];
            for(int i = 0; i < lista.size(); i++) {
                row[0] = lista.get(i).getRG();
                row[1] = lista.get(i).getNome();
                row[2] = lista.get(i).getTelefone();
                row[3] = lista.get(i).getTitulacao();
                row[4] = lista.get(i).getCodExpProf();
                row[5] = lista.get(i).getExp_Prof();
                model.addRow(row);
            }
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e); 
        }
    }
    
    private void recarrega_monitor() {
        DefaultTableModel model = (DefaultTableModel)tabelaInfo.getModel();
        model.setRowCount(0);
        mostra_monitor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaInfo = new javax.swing.JTable();
        rgTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        telefoneTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        titulacaoTF = new javax.swing.JTextField();
        salvaBT = new javax.swing.JButton();
        recarregaBT = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        numCarteiraTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        experienciaTA = new javax.swing.JTextArea();
        limpaBT = new javax.swing.JButton();
        deletaBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RG", "Nome", "Telefone", "Titulação", "Nº Carteira de trabalho", "Experiência"
            }
        ));
        tabelaInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaInfo);

        rgTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rgTFActionPerformed(evt);
            }
        });

        jLabel1.setText("RG:");

        jLabel2.setText("Nome: ");

        jLabel3.setText("Telefone: ");

        jLabel4.setText("Titulação:");

        salvaBT.setText("Salvar");
        salvaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvaBTActionPerformed(evt);
            }
        });

        recarregaBT.setText("Recarregar");
        recarregaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recarregaBTActionPerformed(evt);
            }
        });

        jLabel5.setText("Nº Carteira: ");

        jLabel6.setText("Experiência:");

        experienciaTA.setColumns(20);
        experienciaTA.setRows(5);
        jScrollPane2.setViewportView(experienciaTA);

        limpaBT.setText("Limpar");
        limpaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpaBTActionPerformed(evt);
            }
        });

        deletaBT.setText("Deletar");
        deletaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletaBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefoneTF)
                            .addComponent(nomeTF)
                            .addComponent(rgTF)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(titulacaoTF))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numCarteiraTF, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(recarregaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(salvaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deletaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(limpaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rgTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(telefoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(titulacaoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(numCarteiraTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recarregaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvaBTActionPerformed
        
        if("".equals(rgTF.getText()) || "".equals(nomeTF.getText()) || "".equals(telefoneTF.getText()) || "".equals(titulacaoTF.getText()) || "".equals(numCarteiraTF.getText()) || "".equals(rgTF.getText())) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para enviar enviar informações.");
            return;
        }
       
        try{
            Monitor_ExperienciaDAO bd = new Monitor_ExperienciaDAO();
            Monitor_Experiencia monitor = new Monitor_Experiencia(rgTF.getText(), nomeTF.getText(), telefoneTF.getText(), titulacaoTF.getText(), experienciaTA.getText(), Integer.parseInt(numCarteiraTF.getText()));
            bd.inserirMonitor(monitor);
            JOptionPane.showMessageDialog(null, "Operação feita com sucesso!");
            recarrega_monitor();            
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e); 
        }
    }//GEN-LAST:event_salvaBTActionPerformed

    private void rgTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rgTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rgTFActionPerformed

    private void recarregaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recarregaBTActionPerformed
        DefaultTableModel model = (DefaultTableModel)tabelaInfo.getModel();
        model.setRowCount(0);
        mostra_monitor();
    }//GEN-LAST:event_recarregaBTActionPerformed

    private void limpaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpaBTActionPerformed
        rgTF.setText("");
        nomeTF.setText("");
        telefoneTF.setText("");
        titulacaoTF.setText("");
        numCarteiraTF.setText("");
        experienciaTA.setText("");
    }//GEN-LAST:event_limpaBTActionPerformed

    private void deletaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletaBTActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja realizar essa operação?", null, JOptionPane.YES_OPTION);
         
        if(result == JOptionPane.YES_OPTION) {
            
            try {
                Monitor_ExperienciaDAO bd = new Monitor_ExperienciaDAO();
                Monitor_Experiencia monitor = new Monitor_Experiencia(rgTF.getText());
                bd.deletarMonitor(monitor);
                JOptionPane.showMessageDialog(null, "Operação feita com sucesso!");
                recarrega_monitor();
            }
            catch(SQLException e) {
                JOptionPane.showMessageDialog(null, e); 
            }     
        }
    }//GEN-LAST:event_deletaBTActionPerformed

    private void tabelaInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaInfoMouseClicked
        DefaultTableModel model = (DefaultTableModel)tabelaInfo.getModel();
        int tableRowIndex = tabelaInfo.getSelectedRow();
        
        rgTF.setText(model.getValueAt(tableRowIndex, 0).toString());
        nomeTF.setText(model.getValueAt(tableRowIndex, 1).toString());
        telefoneTF.setText(model.getValueAt(tableRowIndex, 2).toString());
        titulacaoTF.setText(model.getValueAt(tableRowIndex, 3).toString());
        numCarteiraTF.setText(model.getValueAt(tableRowIndex, 4).toString());
        experienciaTA.setText(model.getValueAt(tableRowIndex, 5).toString());
    }//GEN-LAST:event_tabelaInfoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MonitorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonitorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonitorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonitorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonitorGUI().setVisible(true);
            }
        });
    }

    //Objeto de conexão ao BD
    private final FabricaConexao conObj = new FabricaConexao();
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletaBT;
    private javax.swing.JTextArea experienciaTA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpaBT;
    private javax.swing.JTextField nomeTF;
    private javax.swing.JTextField numCarteiraTF;
    private javax.swing.JButton recarregaBT;
    private javax.swing.JTextField rgTF;
    private javax.swing.JButton salvaBT;
    private javax.swing.JTable tabelaInfo;
    private javax.swing.JTextField telefoneTF;
    private javax.swing.JTextField titulacaoTF;
    // End of variables declaration//GEN-END:variables
}
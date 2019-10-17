/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automater.ui.view;

import automater.TextValue;
import automater.utilities.SimpleCallback;
import org.jetbrains.annotations.NotNull;
import javax.swing.DefaultListSelectionModel;

/**
 *
 * @author Bytevi
 */
public class PlayMacroForm extends javax.swing.JFrame implements BaseView {
    // UI callbacks
    public SimpleCallback onBackButtonCallback = SimpleCallback.createDoNothing();
    public SimpleCallback onPlayButtonCallback = SimpleCallback.createDoNothing();
    public SimpleCallback onStopButtonCallback = SimpleCallback.createDoNothing();
    public SimpleCallback onOptionsButtonCallback = SimpleCallback.createDoNothing();
    
    /**
     * Creates new form PlayMacroForm
     */
    public PlayMacroForm() {
        initComponents();
        setup();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progressBar = new javax.swing.JProgressBar();
        statusLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        macroActionsList = new javax.swing.JList<>();
        playAndStopButton = new javax.swing.JButton();
        optionsButton = new javax.swing.JButton();
        optionsLabel = new javax.swing.JLabel();
        macroNameLabel = new javax.swing.JLabel();
        macroDescriptionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        statusLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        statusLabel.setText("Idle");

        backButton.setText("< BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        macroActionsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        macroActionsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        macroActionsList.setSelectionBackground(new java.awt.Color(0, 204, 0));
        jScrollPane1.setViewportView(macroActionsList);

        playAndStopButton.setText("Play");
        playAndStopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playAndStopButtonActionPerformed(evt);
            }
        });

        optionsButton.setText("Options");
        optionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionsButtonActionPerformed(evt);
            }
        });

        optionsLabel.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        optionsLabel.setText("Play standart");

        macroNameLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        macroNameLabel.setText("Macro name");

        macroDescriptionLabel.setText("Description");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(macroNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(macroDescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(playAndStopButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(optionsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(optionsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(macroNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(macroDescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionsButton)
                    .addComponent(optionsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playAndStopButton)
                    .addComponent(statusLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        onBackButtonCallback.perform();
    }//GEN-LAST:event_backButtonActionPerformed

    private void playAndStopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playAndStopButtonActionPerformed
        if (!isPlaying)
        {
            onPlayButtonCallback.perform();
        }
        else
        {
            onStopButtonCallback.perform();
        }
    }//GEN-LAST:event_playAndStopButtonActionPerformed

    private void optionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionsButtonActionPerformed
        onOptionsButtonCallback.perform();
    }//GEN-LAST:event_optionsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PlayMacroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayMacroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayMacroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayMacroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayMacroForm().setVisible(true);
            }
        });
    }
    
    private void setup() {
        ViewUtilities.setAppIconForFrame(this);
        
        this.setTitle(TextValue.getText(TextValue.Play_FormTitle));
        
        backButton.setText(TextValue.getText(TextValue.Play_BackButtonTitle));
        playAndStopButton.setText(TextValue.getText(TextValue.Play_PlayButtonTitle, "F4"));
        
        // Set model from start
        macroActionsList.setSelectionModel(selectionModel);
    }
    
    // # GenericView
    
    @Override
    public void onViewStart()
    {
        macroActionsList.setModel(StandardDescriptionsDataSource.createGeneric());
    }
    
    @Override
    public void onViewSuspended()
    {
        
    }
    
    @Override
    public void onViewResume()
    {
        
    }
    
    @Override
    public void onViewTerminate()
    {
        
    }
    
    @Override
    public void reloadData()
    {
        
    }
    
    // # Public
    
    public void playRecording()
    {
        if (isPlaying)
        {
            return;
        }
        
        isPlaying = true;
        
        playAndStopButton.setText(TextValue.getText(TextValue.Play_StopButtonTitle, "F4"));
        backButton.setEnabled(false);
        optionsButton.setEnabled(false);
        setProgressBarValue(0);
        
        ViewUtilities.setAppRedIconForFrame(this);
    }
    
    public void cancelRecording()
    {
        if (!isPlaying)
        {
            return;
        }
        
        isPlaying = false;
        
        playAndStopButton.setText(TextValue.getText(TextValue.Play_PlayButtonTitle, "F4"));
        backButton.setEnabled(true);
        optionsButton.setEnabled(true);
        
        ViewUtilities.setAppIconForFrame(this);
    }
    
    public void finishRecording()
    {
        cancelRecording();
    }
    
    public void setMacroInfo(@NotNull String macroName, @NotNull String macroDescription, @NotNull StandardDescriptionsDataSource macroActionsDataSource)
    {
        macroNameLabel.setText(macroName);
        macroDescriptionLabel.setText(macroDescription);
        macroActionsList.setModel(macroActionsDataSource);
    }
    
    public void setMacroParametersDescription(@NotNull String value)
    {
        optionsLabel.setText(value);
    }
    
    public void setProgressBarValue(double value)
    {
        value *= 100;
        
        int progress = (int)value;
        progressBar.setValue(progress);
    }
    
    public void setStatus(String value)
    {
        statusLabel.setText(value);
    }
    
    public void setSelectedIndex(int index)
    {
        if (index >= 0 && index < macroActionsList.getModel().getSize())
        {
            selectionModel.manualySelectIndex(index);
            macroActionsList.ensureIndexIsVisible(index);
        }
    }
    
    // # Private properties
    private boolean isPlaying = false;
    private final DisabledItemSelectionModel selectionModel = new DisabledItemSelectionModel();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> macroActionsList;
    private javax.swing.JLabel macroDescriptionLabel;
    private javax.swing.JLabel macroNameLabel;
    private javax.swing.JButton optionsButton;
    private javax.swing.JLabel optionsLabel;
    private javax.swing.JButton playAndStopButton;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JLabel statusLabel;
    // End of variables declaration//GEN-END:variables
}

class DisabledItemSelectionModel extends DefaultListSelectionModel {
    @Override
    public void setSelectionInterval(int index0, int index1) {
        super.setSelectionInterval(-1, -1);
    }
    
    public void manualySelectIndex(int index) {
        super.setSelectionInterval(index, index);
    }
}

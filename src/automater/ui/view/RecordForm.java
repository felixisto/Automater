/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automater.ui.view;

import automater.utilities.AlertWindows;
import automater.utilities.Callback;
import automater.utilities.Logger;
import automater.utilities.SimpleCallback;

/**
 *
 * @author Bytevi
 */
public class RecordForm extends javax.swing.JFrame {
    // Public properties
    public SimpleCallback onSwitchToPlayButtonCallback = SimpleCallback.createDoNothing();
    public SimpleCallback onRecordMacroButtonCallback = SimpleCallback.createDoNothing();
    public SimpleCallback onStopRecordMacroButtonCallback = SimpleCallback.createDoNothing();
    public Callback<String> onSaveMacroButtonCallback = Callback.createDoNothing();
    
    /**
     * Creates new form RecordForm
     */
    public RecordForm() {
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

        macroStateLabel = new javax.swing.JLabel();
        recordMacroButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        macroActionsList = new javax.swing.JList<>();
        saveMacroButton = new javax.swing.JButton();
        macroNameField = new javax.swing.JTextField();
        switchToPlayButton = new javax.swing.JToggleButton();
        headerText = new javax.swing.JLabel();
        macroActionsListName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        macroStateLabel.setText("Idle (Press F5 to RECORD/FINISH)");

        recordMacroButton.setText("RECORD");
        recordMacroButton.setToolTipText("Begin recording actions for a macro");
        recordMacroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordMacroButtonActionPerformed(evt);
            }
        });

        macroActionsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(macroActionsList);

        saveMacroButton.setText("Save");
        saveMacroButton.setToolTipText("");
        saveMacroButton.setEnabled(false);
        saveMacroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMacroButtonActionPerformed(evt);
            }
        });

        macroNameField.setText("Untitled macro");

        switchToPlayButton.setText("PLAY >");
        switchToPlayButton.setToolTipText("");
        switchToPlayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchToPlayButtonActionPerformed(evt);
            }
        });

        headerText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        headerText.setText("Record macro");

        macroActionsListName.setText("Recorded actions");

        jLabel1.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(headerText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(switchToPlayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(macroActionsListName)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(macroNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(macroStateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(recordMacroButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveMacroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(switchToPlayButton)
                    .addComponent(headerText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(macroNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(macroActionsListName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recordMacroButton)
                    .addComponent(macroStateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveMacroButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void switchToPlayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchToPlayButtonActionPerformed
        onSwitchToPlayButtonCallback.perform();
    }//GEN-LAST:event_switchToPlayButtonActionPerformed

    private void recordMacroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordMacroButtonActionPerformed
        if (!isRecording()) {
            onRecordMacroButtonCallback.perform();
        } else {
            onStopRecordMacroButtonCallback.perform();
        }
    }//GEN-LAST:event_recordMacroButtonActionPerformed

    private void saveMacroButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMacroButtonActionPerformed
        onSaveMacroButtonCallback.perform(macroNameField.getText());
    }//GEN-LAST:event_saveMacroButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RecordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecordForm().setVisible(true);
            }
        });
    }
    
    private void setup() {
        this.setTitle(TextValue.getText(TextValue.RecordFormTitle));
        
        switchToPlayButton.setText(TextValue.getText(TextValue.RecordSwitchToPlayButton));
        switchToPlayButton.setToolTipText(TextValue.getText(TextValue.RecordSwitchToPlayButtonTip));
        
        headerText.setText(TextValue.getText(TextValue.RecordHeaderText));
        
        macroActionsListName.setText(TextValue.getText(TextValue.RecordMacroActionListName));
        
        macroNameField.setText(TextValue.getText(TextValue.RecordMacroNameFieldDefaultText));
        macroNameField.setToolTipText(TextValue.getText(TextValue.RecordMacroNameFieldTip));
        
        macroStateLabel.setText(TextValue.getText(TextValue.RecordIdleStatus, "F5"));
        
        saveMacroButton.setText(TextValue.getText(TextValue.RecordSaveButton));
        saveMacroButton.setToolTipText(TextValue.getText(TextValue.RecordSaveButtonDisabledTip));
        
        updateRecordState();
    }
    
    public boolean isRecording()
    {
        return _isRecording;
    }
    
    // # Public UI operations
    
    public void willSwitchToPlayWindow()
    {
        if (_isRecording)
        {
            Logger.warning(this, "Switching to play screen while recording is not allowed.");
        }
    }
    
    public void beginRecording()
    {
        _isRecording = true;
        macroNameField.setEnabled(false);
        switchToPlayButton.setEnabled(false);
        saveMacroButton.setEnabled(false);
        
        updateRecordState();
    }
    
    public void endRecording()
    {
        _isRecording = false;
        macroNameField.setEnabled(true);
        switchToPlayButton.setEnabled(true);
        saveMacroButton.setEnabled(true);
        
        updateRecordState();
    }
    
    public void willSaveRecording()
    {
        
    }
    
    public void didSaveRecording(boolean result, String errorMessage)
    {
        if (!result)
        {
            displayError("Save Recording", "Could not save recording: " + errorMessage);
            return;
        }
        
        // Reset to default state, prevent further saving until a new recording is made
        saveMacroButton.setEnabled(false);
        macroNameField.setText(TextValue.getText(TextValue.RecordMacroNameFieldDefaultText));
        
        // Show message alert
        AlertWindows.showMessage(getParent(), "Save Recording", "Recording saved to storage.", "Ok");
    }
    
    public void displayError(String title, String message)
    {
        AlertWindows.showErrorMessage(getParent(), title, message, "Ok");
    }
    
    private void updateRecordState()
    {
        if (!_isRecording)
        {
            recordMacroButton.setText(TextValue.getText(TextValue.RecordBeginRecordingButton));
            recordMacroButton.setToolTipText(TextValue.getText(TextValue.RecordBeginRecordingButtonTip));
        }
        else
        {
            recordMacroButton.setText(TextValue.getText(TextValue.RecordStopRecordingButton));
            recordMacroButton.setToolTipText(TextValue.getText(TextValue.RecordStopRecordingButtonTip));
        }
    }
    
    // Private properties
    private boolean _isRecording = false;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headerText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> macroActionsList;
    private javax.swing.JLabel macroActionsListName;
    private javax.swing.JTextField macroNameField;
    private javax.swing.JLabel macroStateLabel;
    private javax.swing.JButton recordMacroButton;
    private javax.swing.JButton saveMacroButton;
    private javax.swing.JToggleButton switchToPlayButton;
    // End of variables declaration//GEN-END:variables
}
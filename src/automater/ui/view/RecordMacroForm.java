/*
 * Created by Kristiyan Butev.
 * Copyright � 2019 Kristiyan Butev. All rights reserved.
 */
package automater.ui.view;

import automater.Strings;
import automater.TextValue;
import automater.settings.Hotkey;
import automater.utilities.AlertWindows;
import automater.utilities.Callback;
import automater.utilities.Logger;
import automater.utilities.SimpleCallback;
import org.jetbrains.annotations.NotNull;

/**
 *
 * @author Bytevi
 */
public class RecordMacroForm extends javax.swing.JFrame implements BaseView {
    // UI callbacks
    public SimpleCallback onSwitchToPlayButtonCallback = SimpleCallback.createDoNothing();
    public SimpleCallback onRecordMacroButtonCallback = SimpleCallback.createDoNothing();
    public SimpleCallback onStopRecordMacroButtonCallback = SimpleCallback.createDoNothing();
    public Callback<String> onSaveMacroButtonCallback = Callback.createDoNothing();
    
    /**
     * Creates new form RecordForm
     */
    public RecordMacroForm() {
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
        switchToOpenMacrosButton = new javax.swing.JToggleButton();
        headerText = new javax.swing.JLabel();
        macroActionsListName = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        macroDescriptionField = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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
        saveMacroButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMacroButtonActionPerformed(evt);
            }
        });

        macroNameField.setText("Untitled macro");

        switchToOpenMacrosButton.setText("MACROS >");
        switchToOpenMacrosButton.setToolTipText("");
        switchToOpenMacrosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchToOpenMacrosButtonActionPerformed(evt);
            }
        });

        headerText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        headerText.setText("Record macro");

        macroActionsListName.setText("Recorded actions");

        nameLabel.setText("Name");

        descriptionLabel.setText("Description");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(macroStateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(recordMacroButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveMacroButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(macroActionsListName)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLabel)
                                    .addComponent(descriptionLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(macroDescriptionField)
                                    .addComponent(macroNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(headerText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(switchToOpenMacrosButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(switchToOpenMacrosButton)
                    .addComponent(headerText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(macroNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(macroDescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descriptionLabel))
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

    private void switchToOpenMacrosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchToOpenMacrosButtonActionPerformed
        onSwitchToPlayButtonCallback.perform();
    }//GEN-LAST:event_switchToOpenMacrosButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RecordMacroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecordMacroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecordMacroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecordMacroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecordMacroForm().setVisible(true);
            }
        });
    }
    
    private void setup() {
        ViewUtilities.setAppIconForFrame(this);
        
        this.setTitle(TextValue.getText(TextValue.Record_FormTitle));
        
        headerText.setText(TextValue.getText(TextValue.Record_HeaderText));
        
        switchToOpenMacrosButton.setText(TextValue.getText(TextValue.Record_SwitchToOpenButtonTitle));
        switchToOpenMacrosButton.setToolTipText(TextValue.getText(TextValue.Record_SwitchToOpenButtonTip));
        
        macroActionsListName.setText(TextValue.getText(TextValue.Record_MacroActionListName));
        
        macroNameField.setText(TextValue.getText(TextValue.Record_MacroNameFieldDefaultText));
        macroNameField.setToolTipText(TextValue.getText(TextValue.Record_MacroNameFieldTip));
        
        macroStateLabel.setText(TextValue.getText(TextValue.Record_IdleStatus, recordOrStopHotkey));
        
        saveMacroButton.setText(TextValue.getText(TextValue.Record_SaveButton));
        saveMacroButton.setToolTipText(TextValue.getText(TextValue.Record_SaveButtonDisabledTip));
        
        updateRecordState();
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
        macroActionsList.setModel(StandardDescriptionsDataSource.createGeneric());
        
        switchToOpenMacrosButton.setSelected(false);
        
        macroNameField.setText(TextValue.getText(TextValue.Record_MacroNameFieldDefaultText));
        macroDescriptionField.setText("");
    }
    
    @Override
    public void onViewTerminate()
    {
        
    }
    
    @Override
    public void reloadData()
    {
        
    }
    
    // # Public properties getters/setters
    
    public boolean isRecording()
    {
        return _isRecording;
    }
    
    public String getMacroName()
    {
        return macroNameField.getText();
    }
    
    public String getMacroDescription()
    {
        return macroDescriptionField.getText();
    }
    
    public void setListDataSource(@NotNull StandardDescriptionsDataSource dataSource)
    {
        macroActionsList.setModel(dataSource);
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
        switchToOpenMacrosButton.setEnabled(false);
        saveMacroButton.setEnabled(false);
        
        updateRecordState();
    }
    
    public void endRecording()
    {
        _isRecording = false;
        macroNameField.setEnabled(true);
        switchToOpenMacrosButton.setEnabled(true);
        saveMacroButton.setEnabled(true);
        
        updateRecordState();
    }
    
    public void willSaveRecording()
    {
        
    }
    
    public void displayError(@NotNull String title, @NotNull String message)
    {
        AlertWindows.showErrorMessage(getParent(), title, message, "Ok");
    }
    
    public void setRecordOrStopHotkeyText(@NotNull Hotkey hotkey)
    {
        recordOrStopHotkey = hotkey.toString();
        
        macroStateLabel.setText(TextValue.getText(TextValue.Record_IdleStatus, recordOrStopHotkey));
    }
    
    // # Private
    
    private void updateRecordState()
    {
        if (!_isRecording)
        {
            recordMacroButton.setText(TextValue.getText(TextValue.Record_BeginRecordingButtonTitle));
            recordMacroButton.setToolTipText(TextValue.getText(TextValue.Record_BeginRecordingButtonTip));
        }
        else
        {
            recordMacroButton.setText(TextValue.getText(TextValue.Record_StopRecordingButtonTitle));
            recordMacroButton.setToolTipText(TextValue.getText(TextValue.Record_StopRecordingButtonTip));
        }
    }
    
    // Private properties
    private boolean _isRecording = false;
    private @NotNull String recordOrStopHotkey = Strings.DEFAULT_PLAY_OR_STOP_HOTKEY;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel headerText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> macroActionsList;
    private javax.swing.JLabel macroActionsListName;
    private javax.swing.JTextField macroDescriptionField;
    private javax.swing.JTextField macroNameField;
    private javax.swing.JLabel macroStateLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton recordMacroButton;
    private javax.swing.JButton saveMacroButton;
    private javax.swing.JToggleButton switchToOpenMacrosButton;
    // End of variables declaration//GEN-END:variables
}

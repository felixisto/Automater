/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automater.recorder;

import automater.recorder.model.RecorderUserInput;

/**
 * Forwards requests for parsed input objects.
 * 
 * @author Bytevi
 */
public interface RecorderNativeListenerDelegate {
    public void onParseInput(RecorderUserInput input);
}
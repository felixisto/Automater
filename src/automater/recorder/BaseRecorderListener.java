/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automater.recorder;

import automater.recorder.model.RecorderResult;
import automater.recorder.model.RecorderUserInput;
import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

/**
 * A listener for recorded user input actions.
 * 
 * onRecordedUserInput() indicates new input has been recorded.
 * 
 * onRecordedUserInputChanged() indicates that the recorder model has changed,
 * even when no new input object has been added. This may happen due to optimizations,
 * such as grouping multiple input objects into one.
 * 
 * onFailedRecordedUserInput() indicates failure.
 *
 * @author Bytevi
 */
public interface BaseRecorderListener {
    public void onRecordedUserInput(@NotNull RecorderUserInput input);
    public void onRecordedUserInputChanged();
    public void onFailedRecordedUserInput(@NotNull RecorderUserInput input);
    
    public void onFinishedRecording(@Nullable RecorderResult result, boolean success, @Nullable Exception exception);
}

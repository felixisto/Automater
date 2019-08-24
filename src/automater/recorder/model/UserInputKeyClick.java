/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automater.recorder.model;

/**
 * Represents a keyboard or mouse click input.
 *
 * @author Bytevi
 */
public interface UserInputKeyClick {
    public RecorderUserInputKey getKeyValue();
    public boolean isPress();
}
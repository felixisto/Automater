/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automater.input;

import java.util.Date;

/**
 * Represents a generic user input action.
 * 
 * Described only by a timestamp value.
 * 
 * @author Bytevi
 */
public interface Input {
    public Date getTimestamp();
}
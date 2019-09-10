/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automater.utilities;

/**
 *
 * @author Bytevi
 */
public class StringFormatting {
    public static boolean isStringAlphabetic(String string)
    {
        return string.matches("[A-Za-z]+");
    }
    
    public static boolean isStringNumeric(String string)
    {
        return string.matches("[0-9]+");
    }
    
    public static boolean isStringAlphanumeric(String string)
    {
        return string.matches("[A-Za-z0-9]+");
    }
    
    public static boolean isStringANumber(String string)
    {
        try {  
            Double.parseDouble(string); 
            return true;
        } catch (NumberFormatException e){  
            return false;  
        }  
    }
    
    public static boolean isStringAnInt(String string)
    {
        try {  
            Integer.parseInt(string); 
            return true;
        } catch (NumberFormatException e){  
            return false;  
        }  
    }
    
    public static boolean isStringAPositiveInt(String string)
    {
        try {  
            return Integer.parseInt(string) > 0;
        } catch (NumberFormatException e){  
            return false;  
        }  
    }
    
    public static boolean isStringANonNegativeInt(String string)
    {
        try {  
            return Integer.parseInt(string) >= 0; 
        } catch (NumberFormatException e){  
            return false;  
        }  
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleniumfacebook;

/**
 *
 * @author HP
 */
public class SeleniumfacebookTest extends Myselenium{
    
    public void tc_login(){
    
    super.InputFieldByName("email", "hristo_rock@hotmail.com");
    }
    
    public void tc_userandpass(){
        super.InputFieldByName("email", "hristo_rock@hotmail.com");
        super.InputFieldByName("pass","");
    }
   
}

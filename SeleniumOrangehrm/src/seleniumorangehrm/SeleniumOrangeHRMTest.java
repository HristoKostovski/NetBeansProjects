/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleniumorangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author HP
 */
public class SeleniumOrangeHRMTest extends Myselenium {
    //class attributes
    //constructor
    //methods
    //TC login
    public void tc_loginwithoutUsername(){
        //parent
        super.InputFieldByName("password","admin123");
        try{Thread.sleep(4000);}catch(InterruptedException e){System.out.println(e);
        }
        super.buttonByXpath("button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]");
    }       
//Instance Orangehrm
  //      SeleniumOrangeHRMTest qaOrangeHRM=new SeleniumOrangeHRM();
        //Login form
    public void tc_loginwithoutPass(){
        super.InputFieldByName("username", "Admin");
        super.buttonByXpath("button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]");
    }
    public void tc_login(){
         super.InputFieldByName("username", "Admin");
         super.InputFieldByName("password", "admin123");
         try{Thread.sleep(4000);}catch(InterruptedException e){System.out.println(e);
        }
         super.buttonByXpath("//html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
     }
    public void tc_dropdown(){
        try{Thread.sleep(4000);}catch(InterruptedException e){System.out.println(e);
        }
    super.buttonByXpath("//html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a"); 
    }
     public void tc_selectDropdownByIndex(){
         super.selectDropdownByIndex("//html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i",1);
   }
   
}

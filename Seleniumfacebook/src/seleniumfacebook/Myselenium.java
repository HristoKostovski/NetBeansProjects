/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleniumfacebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author HP
 */
public class Myselenium {
    //class attributes
    private String web_url="https://www.facebook.com/";
    private String driver_location= "C:\\Python27\\Scripts\\chromedriver.exe";
     private String driver_name=   "webdriver.chrome.driver"   ; 
     WebDriver driver;
    //construct
    public Myselenium(){
            System.setProperty(this.driver_name, this.driver_location);  
             this.driver=new ChromeDriver();  
      
// Launch website  
            this.driver.navigate().to(this.web_url);  
//Pause
            try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}
    }
    //methods
    public void InputFieldById(String selector, String str ){
        this.driver.findElement(By.id(selector)).sendKeys(str);
    }
     public void InputFieldByName(String selector, String str ){
        this.driver.findElement(By.name(selector)).sendKeys(str);
     }
     public void InputFieldByxpath(String selector, String str ){
        this.driver.findElement(By.xpath(selector)).sendKeys(str);
     }
     
     public void ButtonbyXpath(String selector,String str){
         this.driver.findElement(By.xpath(selector)).sendKeys(str);
     }
}

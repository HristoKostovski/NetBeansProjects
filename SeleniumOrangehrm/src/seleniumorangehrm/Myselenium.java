/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleniumorangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author HP
 */
public class Myselenium {
    //class attributes
        private String website_url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        private String driver_path="C:\\Python27\\Scripts\\chromedriver.exe";
        private String driver_name="webdriver.chrome.driver";
        WebDriver driver;
    //constructor
        public Myselenium () {
            System.setProperty(this.driver_path, this.driver_path);  
            this.driver=new ChromeDriver();  
    
    //Launch website  
            this.driver.navigate().to(this.website_url);  
    //Pause
            try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}
    }
    //methods
        public void InputFieldByName(String selector, String str) {
            this.driver.findElement(By.name(selector)).sendKeys(str);  
        }
        public void InputFieldByID(String selector, String str) {
            this.driver.findElement(By.id(selector)).sendKeys(str);  
        }
        public void InputFieldByXpath(String selector, String str) {
            this.driver.findElement(By.xpath(selector)).sendKeys(str);  
        }
        public void buttonByXpath(String selector) {
            this.driver.findElement(By.xpath(selector)).click();  
        }
        public void buttonByName(String selector) {
            this.driver.findElement(By.name(selector)).click();  
        }
        public void buttonById(String selector) {
            this.driver.findElement(By.id(selector)).click(); 
        }
        
        public void selectDropdownByIndex(String selector, int index){
        
        WebElement testDropDown = this.driver.findElement(By.xpath(selector));  
        Select dropdown = new Select(testDropDown);  
        dropdown.selectByIndex(index);  
        }
         public void selectDropValue(String selector, String value){
        
        WebElement testDropDown = this.driver.findElement(By.xpath(selector));  
        Select dropdown = new Select(testDropDown);  
        dropdown.selectByValue(value);  
        }
          public void selectDropVisibleText(String selector, String str){
        
        WebElement testDropDown = this.driver.findElement(By.xpath(selector));  
        Select dropdown = new Select(testDropDown);  
        dropdown.selectByVisibleText(str);  
        }
}


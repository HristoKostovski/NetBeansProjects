/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package seleniumorangehrm;



/**
 *
 * @author HP
 */
public class SeleniumOrangehrm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instance Myselenium
        
       SeleniumOrangeHRMTest qaOrangeHRM = new SeleniumOrangeHRMTest();
    
       
        //login form
       /*qaOrangeHRM.TC_loginwithoutUsername();*/
        
        qaOrangeHRM.tc_login();
        qaOrangeHRM.tc_dropdown();
        qaOrangeHRM.tc_selectDropdownByIndex();
        /*
           // declaration and instantiation of objects/variables  
    System.setProperty("webdriver.chrome.driver", "C:\\Python27\\Scripts\\chromedriver.exe");  
    WebDriver driver=new ChromeDriver();  
      
// Launch website  
    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
//Pause
  try{Thread.sleep(2000);}catch(InterruptedException e){System.out.println(e);}
    // Click on the search text box and send value  
    driver.findElement(By.name("username")).sendKeys("Admin");  
    driver.findElement(By.name("password")).sendKeys("admin123");
              
    // Click on the search button  
    driver.findElement(By.xpath("button//html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();  
       */
    }
  
}

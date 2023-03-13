/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kostovski;

/**
 *
 * @author HP
 */
public class Person {
    //class attributes
    private String first_name="lll";
    public String last_name ="pppp";  
    public int ageP =  18;
    //construct
    public Person(){}
    public Person(int ageP){
    this.ageP=ageP;
    }
    //Setter
    public void setFirst_name(String first_name){
        this.first_name=first_name;
    }
    //Getter
    public String getFirst_name(){
        return this.first_name;
    }
    //methods
    public void isAdult(int age){
         System.out.println("polnoletstvo");    
    }
    //methods
    public void Gradinka(int age){
        if(age<7){
        System.out.println ("Cestito upis");
        }else{System.out.println("ne gradinka");}  
    } 
    //methods
    public void Osnovno(int age){
        if(age>7 && age<14){
        System.out.println ("Cestito upis");
        }else{System.out.println("ne osnovno");}
}
    //methods
    public void Sredno(int age){
        if(age>14 && age<18){
        System.out.println ("Cestito upis");
        }else{System.out.println("ne sredno");}
    }
    //methods
    public void Fakultet(int age){
        if(age>18 && age<22){
        System.out.println ("Cestito upis");
        }else{System.out.println("ne fakultet");}
    }
    //methods
    public void retiring(int age){
        if(age>64){
        System.out.println ("ready for retirement");
        }else{System.out.println("not ready for retirement");}
    }
}
  
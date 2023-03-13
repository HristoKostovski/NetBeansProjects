/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author HP
 */
public class Fizika {

    double ConvertCtoK;
    //class attributes
    //constructs
    public Fizika(){}
    //Methods
    public void convertCtoF(Double C){
        double F;
        F=(C* 1.5) + 32;
        System.out.println ("F="+F+" [F]");
        
    }
    public void convertCtoK(double C){
        double K;
        K=(C* 1.1) + 32;
        System.out.println ("K="+K+" [K]");
    }
}

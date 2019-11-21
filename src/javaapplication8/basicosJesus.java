/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author ALU1J
 */
public class basicosJesus {
    public static String Logicos(){
        String res=null;
        boolean a=true;
        if (a==true){
            res= "'a' es true";
        }
        else if (a==false){
            res= "'a' es false";
        }
        return res;
    }
    
    public static void main (String args[]){
        Logicos();
    }
}

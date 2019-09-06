
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bmalaver
 */
public class Prueba {

    public static void main(String[] args){
       
    }

    public static String even_or_odd(int number) {
       
        if(number%2 == 0){
           String Even = "Even";
           return Even;
        }else{
            String Odd = "Odd";
           return Odd;
        }

    }         
    
    public static String printerError(String s) {
        char[] ent = s.toCharArray();    
        int longitude  = s.length();
        int contador = 0;
          for(int x = 0; x<longitude;x++){
            int value = (int) ent[x];
              if(value > 109){
                contador ++;
              }
        }    
        return (contador+"/"+longitude); 
    }
}

  



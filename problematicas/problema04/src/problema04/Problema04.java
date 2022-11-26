/*
1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/15

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

//import java.text.DecimalFormat;
//import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    //          1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13 - 1/15
    public static void main(String[] args) {
        // TODO code application logic here
        int contadorserie = 1;        
        double  operacion = 1;
        int primo=1;
        int numerador=1;
        boolean bandera=true;
        
        String mensaje = "1";

        while (contadorserie <= 7) {
            //mensaje = mensaje + "-" + a + "/" + contador1 + "+" + a + "/";
            //contador1 = contador1 + 2;
            primo=primo+2;
            if (bandera)
            {
                mensaje=mensaje +"-"+numerador+"/"+primo;
                operacion=operacion-(Double.valueOf(numerador)/Double.valueOf(primo));
                bandera=false; 
            }else
            {
                mensaje=mensaje +"+"+numerador+"/"+primo;     
                operacion=operacion+(Double.valueOf(numerador)/Double.valueOf(primo));
                bandera=true;
            }           
            
           // operacion=operacion-Double.valueOf(primo); 
            
          contadorserie++; 
        }
        //operacion = 
         System.out.printf("%s=%f\n",mensaje,operacion);
   }
}

/*
2
5
10
17
26
37

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author Usuario
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 2;
        int a = 3;
        String mensaje = "";
        
        do {
            mensaje = mensaje + contador + "\n";
            contador = contador + a;
            a = a + 2;       //+3 +5 +7 +9 +11 
            
        }while (contador <= 37);
        System.out.println(mensaje);

    }
}

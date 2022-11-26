/*
2
6
12
20
30
42
56
72
90
110
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author Usuario
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 2;
        int a = 4;
        String mensaje = "";
        while (contador <= 110) {
            
            mensaje = mensaje + contador + "\n";
            contador = contador + a;
            a = a + 2;
        }
        System.out.println(mensaje);

    }
}

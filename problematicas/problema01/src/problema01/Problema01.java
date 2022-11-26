/*
Listado de Jugadores
1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
4. Ángel Mena -Delantero-, edad 32, estatura 1.75
5. Michael Estrada -Delantero-, edad 27, estatura 1.93
Listado de Edades
32
24
19
32
27
Promedio de edades:  26.8
Promedio de estaturas: 1.87

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Usuario
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String jugador;
        String reporte = "";
        boolean bandera = true;
        String opcion;
        int edad;
        String posicion;
        double estatura;
        double promedio_edades;
        double promedio_estatura;
        int contador = 1;
        int acumulador_edades = 0;
        double acumulador_estatura = 0; //sumar estaturas 
        String listado_edades = "";

        do {
            System.out.println("Ingrese el nombre del jugador de futbol: ");
            jugador = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador: ");
            estatura = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese la posicion en la que juega: ");
            posicion = entrada.nextLine();

            listado_edades = listado_edades + edad + "\n";
            reporte = reporte + contador + "." + " " + jugador + " " + "-"
                    + posicion + "-" + "," + " " + "edad" + " " + edad + "," + " "
                    + "estatura" + " " + estatura + "\n";

            acumulador_edades = acumulador_edades + edad;
            acumulador_estatura = acumulador_estatura + estatura;
            contador = contador + 1;

            System.out.println("Desea continuar (presione s para salir) ");
            opcion = entrada.nextLine();
            if (opcion.equals("s")) {
                bandera = false;
            }
        } while (bandera == true);
        {

            promedio_edades = acumulador_edades / (contador - 1);
            promedio_estatura = acumulador_estatura / (contador - 1);
            System.out.printf("%s\n", reporte);
            System.out.printf("Listado de edades: \n%s\n", listado_edades);
            System.out.printf("Promedio de edades: %.2f\n", promedio_edades);
            System.out.printf("Promedio de estaturas: %.2f\n", promedio_estatura);

        }
}   }
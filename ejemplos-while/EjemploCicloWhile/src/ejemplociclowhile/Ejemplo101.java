/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo101 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite_tabla = 12;
        int contador = 1;
        int operacion;
        int tabla;
        
        System.out.println("Ingrese el limite de su tabla de multiplicar");
        limite_tabla = entrada.nextInt ();
        
        System.out.println("Ingrese el número de tabla a generar");
        tabla = entrada.nextInt();
        
        String cadena = ""; // cadena acumulador
        cadena = String.format("%sTabla de multiplicar\n", cadena);
        
        if (limite_tabla > 0) {
            limite_tabla = limite_tabla;
        }else{
            if(limite_tabla <= 0){
               limite_tabla = 12;
               }
            
                
            }
        
        while (contador <= limite_tabla){
            operacion = tabla * contador;
            
            cadena = String.format("%s%d*%d=%d\n", 
                    cadena, 
                    tabla, 
                    contador,
                    operacion);
            contador = contador + 1;
        }
                
        System.out.printf("%s\n", cadena);
        
    }
}

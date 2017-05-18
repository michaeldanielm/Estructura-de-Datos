
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael Daniel Murillo Lopez
 */
//Escribir una función recursiva que devuelva la suma de los primeros N enteros
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        int n;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print("Introduzca numero n:");
            n = Integer.parseInt(entrada.readLine());
        } while (n < 0);
        System.out.println("La suma de los numeros es:" + n + "=" + suma(n));
    }

    static long suma(int n) {
        if (n <= 1) {
            return 1;
        } else {
            long resultado = n + suma(n - 1);
            return resultado;
        }

    }
}


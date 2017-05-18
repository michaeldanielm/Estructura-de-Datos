
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
//Escribir un programa que encuentre la suma de los enteros positivos pares desde N
//hasta 2. Chequear que si N es impar se imprima un mensaje de error.
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int n, p;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduzca numero n:");
        n = Integer.parseInt(entrada.readLine());
        p = n;
        while (p >= 2) {
            p = p - 2;
        }
        if (p == 0) {
            System.out.println("La suma de los numeros positivos pares de " + n + "  es: " + sumapos(n));
        } else {
            System.out.println("El numero ingresado es impar");
        }
    }

    static long sumapos(int n) {
        if (n <= 2) {
            return 2;
        } else {
            long resultado = n + sumapos(n - 2);
            return resultado;
        }

    }
}
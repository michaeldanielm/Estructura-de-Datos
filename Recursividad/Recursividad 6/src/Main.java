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
//Escribir un programa que calcule el máximo común divisor (MCD) de dos enteros
//positivos. Si M >= N una función recursiva para MCD es
//MCD = M si N =0
//MCD = MCD (N, M mod N) si N <> 0
//El programa le debe permitir al usuario ingresar los valores para M y N desde la
//consola. Una función recursiva es entonces llamada para calcular el MCD. El
//programa entonces imprime el valor para el MCD. Si el usuario ingresa un valor
//para M que es < que N el programa es responsable de switchear los valores
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        int n, p, q, m;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Introduzca numero M:");
        m = Integer.parseInt(entrada.readLine());
        p = m;
        System.out.print("Introduzca numero N:");
        n = Integer.parseInt(entrada.readLine());
        q = n;
        System.out.println("El MCD de M Y N ES:" + sacar_mcd(n, m % n));
    }

    public static int sacar_mcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return sacar_mcd(n, m % n);
        }

    }

}

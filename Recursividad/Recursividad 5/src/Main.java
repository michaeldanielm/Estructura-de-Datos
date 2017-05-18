
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
//La forma para calcular cuantas maneras diferentes tengo para elegir r cosas
//distintas de un conjunto de n cosas es:
//C(n,r) = n! (r!*(n-r)!)
//Donde la función factorial se define como
//n! = n *(n-1)*(n-2)*…*2*1
//Descubra una versión recursiva de la fórmula anterior y escriba una función
//recursiva que calcule el valor de dicha fórmula.
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        int r;
        int n;
        int resta, c = 0;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Introduzca numero r:");
        r = Integer.parseInt(entrada.readLine());
        System.out.print("Introduzca numero n:");
        n = Integer.parseInt(entrada.readLine());
        if (n > r) {
            resta = (n - r);
            c =(int) (factorial(n) * factorial(r) * factorial(n–r));
            System.out.println("\n \t" + n + "!=" + factorial(n));
            System.out.println("\n \t" + r + "!=" + factorial(r));
            System.out.println("\n \t" + resta + "!=" + factorial(resta));
            System.out.println(c);
        } else {
            System.out.print("Error de ingreso de datos,r tiene que ser menor que n");
        }
    }

    static long factorial(int r) {
        if (r <= 1) {
            return 1;
        } else {
            long resultado = r * factorial(r - 1);
            return resultado;
        }

    }
}

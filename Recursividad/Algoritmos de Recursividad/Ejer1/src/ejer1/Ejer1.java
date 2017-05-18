//Programa recursivo que imprime en forma invertida los dígitos de un número entero.

package ejer1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejer1 {

    public static void invertir(int num){
        System.out.print(num%10);
        if(num/10!=0){
             invertir(num/10);
         }
     }

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Ingrese el numero a evaluar: ");
        n=Integer.parseInt(br.readLine());

        System.out.print("El numero invertido es: ");
        invertir(n);
        System.out.println();
    }
}
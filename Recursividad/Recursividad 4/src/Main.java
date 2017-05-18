
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael Daniel Murillo López id:534830
 */
//Escriba una función recursiva que ordene de menor a mayor un arreglo de enteros
//basándose en la siguiente idea: coloque el elemento más pequeño en la primera
//ubicación, y luego ordene el resto del arreglo con una llamada recursiva.
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner read = new Scanner(System.in);
        int aux1 = 0;
        System.out.print("Ingrese cantidad de numeros para el arreglo:");
        int tamano = read.nextInt();
        int[] arreglo = new int[tamano];
        System.out.println("Ingrese los valores:");
        for (int i = 0; i < tamano; i++) {
            arreglo[i] = read.nextInt();
        }
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (arreglo[i] < arreglo[j]) {
                    aux1 = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux1;
                }
            }
        }
        for (int i = 0; i < tamano; i++) {
            System.out.print(arreglo[i] + " ");
        }
    }

}

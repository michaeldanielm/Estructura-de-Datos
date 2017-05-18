import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
//Cuál es el resultado de esta función para distintos valores de X?
//Static int f(int x)
//{
//if (x >100)
//{
//return (x-10);
//}
//else
//{
//return(f(f(x+11)));
//}
//}
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InvertirR();
    }
    public static int InvertirR(String[] args) {
        
        

        int entrada;
        Scanner num = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo:");
        entrada = num.nextInt();
        int arr[] = new int[entrada];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("ingrese del vector:");
            arr[i] = num.nextInt();
        }
        int inicio = 0, fin = arr.length - 1;

        arr = InvierteRec(arr, inicio, fin);

        for (int i = 0; i < arr.length; i++) {

            if (i == 0) {
                System.out.println("—–INVIRTIENDO——");
                System.out.println("El vector invertido:");
            }
            System.out.println(arr[i]);
        }
    }

    public static int[] InvierteRec(int[] a, int i, int f) {
        while (i <= f) {
            int temp = a[f];
            a[f] = a[i];
            a[i] = temp;
            return InvierteRec(a, i + 1, f - 1);
        }
        return a;
    }

    

}




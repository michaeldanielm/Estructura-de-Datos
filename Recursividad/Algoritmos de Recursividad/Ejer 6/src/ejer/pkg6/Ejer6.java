package ejer.pkg6;

//algoritmo recursivo que permite sumar los elementos de un vector.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejer6 {
    public static int vector(int A[], int num){       
        if(num==0){
           return A[num];
        }
        else{
            return A[num]+vector(A,num-1);
        }       
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int V[], n;
        System.out.println("Ingrese el tamaño: ");
        n=Integer.parseInt(br.readLine());
        V=new int[n];
       
        for(int i=0;i<n;i++){
            System.out.println("V ["+i+"] = ");
            V[i]=Integer.parseInt(br.readLine());
        }
         System.out.println("La suma de los elementos es: "+vector(V,n-1));
    }
}


package ejer.pkg5;

//Diseñe una función recursiva exponente tal que dada la base y el exponente como números enteros devuelva
//su resultado. Validar que la base será mayor que cero y el exponente mayor o igual que cero.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejer5 {
    public static int exponente(int base, int exp){
        if(exp==0){
            return 1;
        }
        else{
            return base*exponente(base,exp-1);
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int n, b;
        do{
            System.out.println("Ingrese el numero: ");
            n=Integer.parseInt(br.readLine());
        }while(n<=0);

        do{
            System.out.println("Ingrese el exponente: ");
            b=Integer.parseInt(br.readLine());
        }while(b<0);
        System.out.println("El resultado es: "+exponente(n, b));
    }
}
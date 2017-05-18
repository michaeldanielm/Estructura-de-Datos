package ejer.pkg4;

//función recursiva que invierte una cadena de caracteres.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejer4 {
    public static String invertir(String cad, int tama){
        String c2="";        
        if(tama==0){
            c2+=cad.charAt(tama);
            return c2;
        }
        else{
            c2=cad.charAt(tama)+invertir(cad, tama-1);
            return c2;
        }       
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int tamaño;
        String cadena;
        System.out.println("Ingrese la cadena a evaluar: ");
        cadena=br.readLine();
        tamaño=cadena.length()-1;

        System.out.println("La nueva cadena es: "+invertir(cadena, tamaño));       
    }
}

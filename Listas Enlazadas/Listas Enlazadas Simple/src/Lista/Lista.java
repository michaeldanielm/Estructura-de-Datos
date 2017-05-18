/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

/**
 *
 * @author Michael Daniel Murillo LÓPEZ
 */
public class Lista {

    Nodo inicio;
    Nodo fin;

    public Lista() {
        inicio = null;
        fin = null;
    }

    public void InsertarInicio(String info) {//insertar Dato inicil
        Nodo nuevo = new Nodo(info, inicio);// Creamos un nodo y guardamos la información
        inicio=nuevo;// 
        if(fin==null){//permite controlar qué procesos tienen lugar, típicamente en función del valor de una o varias variables
            fin=inicio;
        }
    }
    public void InsertarFin(String info) {//
        Nodo nuevo = new Nodo(info, null);
        if(inicio==null){
            fin=nuevo;
            inicio=fin;
        }else{
            fin.setSiguiente(nuevo);
            fin=nuevo;
        }
    }
    public void EliminarInicio(){// nodo para eliminar al comienso de la lista 
        inicio=inicio.siguiente;
    }
    public String ExtraerInicio(){
        String info=inicio.getInfo();
        inicio=inicio.getSiguiente();
        if(inicio==null){
            fin=null;
        }
        return info;
    }
    public void Imprimir(){// imprimir los valores que se encuentran
        Nodo temp=inicio;
        while(temp!=null){
            
            System.out.println(temp.getInfo());
            temp=temp.siguiente;
        }
    }
}

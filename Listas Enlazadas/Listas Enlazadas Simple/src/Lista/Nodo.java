package Lista;

public class Nodo {

    private String info;
    Nodo siguiente;
    
    public Nodo(String i,Nodo n){
        info=i;
        siguiente=n;
    }//Los métodos get y set, son simples métodos que usamos en las clases para mostrar (get) o modificar (set) el valor de un atributo

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    public static void main(String[] args) {//ingreso de valores 
        Lista L=new Lista();
        L.InsertarInicio("a");
        L.InsertarFin("b");
        L.InsertarFin("c");
        L.InsertarFin("d");
        L.InsertarFin("e");
        L.InsertarInicio("Z");
        L.Imprimir();
        System.out.println("");
        L.ExtraerInicio();
        L.Imprimir();
    }
    
}

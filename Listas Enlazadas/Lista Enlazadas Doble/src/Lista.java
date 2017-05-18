

public class Lista {

    private Nodo inicio, fin;

    public Lista() {
        inicio = null;
    }

    public void AgregarNodo(int dato) {
        inicio = new Nodo(dato, inicio);
        if (inicio == null) {
            fin = inicio;
        } else {
        }
    }

    public void mostrar() {
        Nodo rec = inicio;
        while (rec != null) {
            System.out.print(rec.getDato() + " > ");
            rec = rec.getSiguiente();
        }
    }

    public void eliminar() {
        inicio = inicio.getSiguiente();
        System.out.println(" Nodo eliminado ");
    }
}

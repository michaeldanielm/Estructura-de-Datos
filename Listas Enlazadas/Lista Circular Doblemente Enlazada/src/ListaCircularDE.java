

public class ListaCircularDE {
   private NodoLista primerNodo;
   private String nombre;  

   public ListaCircularDE( String cadena ) {
      nombre = cadena;
      primerNodo = null;
    }

   public ListaCircularDE() { 
      this( "Circular DE" ); 
   }  

   public synchronized void insertar( Object elementoAInsertar ) {
      if ( estaVacio() ) {
         primerNodo = new NodoLista( elementoAInsertar);
         primerNodo.nodoProximo=primerNodo;
         primerNodo.nodoAnterior=primerNodo;
         
      }
      else {
      	 NodoLista actual = primerNodo;
      	 while(actual.nodoProximo != primerNodo) {
      	 	actual = actual.nodoProximo;
      	 }
      	 NodoLista ultimoNodo = actual;
         
         NodoLista desplazado = primerNodo;
         primerNodo = new NodoLista( elementoAInsertar,desplazado,ultimoNodo );
         ultimoNodo.nodoProximo = primerNodo;
     	 
      	 desplazado.nodoAnterior = primerNodo;
      }
   }

   public synchronized Object remover()
      throws ExcepcionListaVacia
   {
      NodoLista NodoARemover = primerNodo;
      Object elementoARemover = null;

      if ( estaVacio() )
         throw new ExcepcionListaVacia( nombre );

      elementoARemover = primerNodo.dato;  

      if ( primerNodo == primerNodo.nodoProximo )
         primerNodo = null;
      else
      {
      	 NodoLista actual = primerNodo;
      	 while(actual.nodoProximo != primerNodo) {
      	 	actual = actual.nodoProximo;
      	 }
      	 NodoLista ultimoNodo = actual;
      	 	        
         primerNodo = primerNodo.nodoProximo;
         ultimoNodo.nodoProximo = primerNodo;
         primerNodo.nodoAnterior = ultimoNodo;
      }
      
      NodoARemover.nodoProximo=null;
      NodoARemover.nodoAnterior=null;

      return elementoARemover;
   }

   public synchronized boolean estaVacio() { 
      return primerNodo == null; 
   }

   public synchronized void imprimir() {
      if ( estaVacio() ) {
         System.out.println( "Lista " + nombre + " Vac�a"  );
         return;
      }

      System.out.print( "La lista " + nombre + " es: " );

      NodoLista actual = primerNodo;

      do {
         System.out.print( actual.dato.toString() + " " );
         actual = actual.nodoProximo;
      } while ( actual != primerNodo );

      System.out.println( "\n" );
   }
}


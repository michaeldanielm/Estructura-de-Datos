
public class Main{
   public static void main( String args[] )
   {
      ListaCircularDE lista = new ListaCircularDE();  
      
      Boolean booleano = Boolean.TRUE;
      Character caracter = new Character( '$' );
      Integer entero = new Integer( 34567 );
      String cadena = "hola";
      lista.insertar( booleano );
      lista.imprimir();
      lista.insertar( caracter );
      lista.imprimir();
      lista.insertar( entero );
      lista.imprimir();
      lista.insertar( cadena );
      lista.imprimir();
      Object objetoRemovido;
      try {
         objetoRemovido = lista.remover();
         System.out.println(
            objetoRemovido.toString() + " removido" );
         lista.imprimir();
         objetoRemovido = lista.remover();
         System.out.println(
            objetoRemovido.toString() + " removido" );
         lista.imprimir();
         objetoRemovido = lista.remover();
         System.out.println(
            objetoRemovido.toString() + " removido" );
         lista.imprimir();
         objetoRemovido = lista.remover();
         System.out.println(
            objetoRemovido.toString() + " removido" );
         lista.imprimir();
      }
      catch ( ExcepcionListaVacia excepcionListaVacia ) {
         excepcionListaVacia.printStackTrace();
      }
   }
}


public class Main {
   public static void main( String args[] )
   {
      ListaCircularDE lista = new ListaCircularDE();  
      
      Boolean booleano = Boolean.TRUE;
      Character caracter = new Character( '$' );
      Integer entero = new Integer( 3 );
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
      try {//capturar el error si se produce y una vez capturado hacer algo con el bloque try nos permite estar preparados para capturarlo y tratarlo
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
      catch ( ExcepcionListaVacia excepcionListaVacia ) {//instrucciones necesarias o de tratamiento del problema capturado con el bloque try anterior
         excepcionListaVacia.printStackTrace();//ejecutar el conjunto de sentencias que tengamos en el bloque catch
      }
   }
}

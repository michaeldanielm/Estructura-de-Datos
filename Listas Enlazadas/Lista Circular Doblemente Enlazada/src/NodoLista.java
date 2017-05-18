

class NodoLista {
   Object dato;    
   NodoLista nodoProximo;
   NodoLista nodoAnterior;

   NodoLista( Object objeto ) { 
      this( objeto, null, null ); 
   }


   NodoLista( Object objeto, NodoLista prox, NodoLista ant) {
      dato = objeto;    
      nodoProximo = prox;
      nodoAnterior = ant;
      
   }

   Object obtenerObjeto() { 
      return dato; 
   }

   NodoLista obtenerProximo(){ 
      return nodoProximo; 
   }
   
   NodoLista obtenerAnterior() {
   	  return nodoAnterior; 
   }
} 

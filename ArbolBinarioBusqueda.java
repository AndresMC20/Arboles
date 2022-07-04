import javax.lang.model.util.ElementScanner6;

public class ArbolBinarioBusqueda {
    
    private Nodo raiz;

    public ArbolBinarioBusqueda(){
        raiz = null;
    }

    public boolean estaVacio(){
        return raiz == null;
    }

    /*
    Metodo recursivo para insertar un nunevo nodo al ABB
    */
    private void insertar(Nodo padre, Nodo hijo, int dato){
        if (hijo == null) {
            Nodo nuevo = new Nodo(null, dato, null);
            if(dato >= padre.getDato()){
                padre.setDerecho(nuevo);
            }else{
                padre.setIzquierdo(nuevo);
            }
        } else {
            if(dato >= padre.getDato()){
                insertar(hijo, hijo.getDerecho(), dato);
            }else{
                insertar(hijo, hijo.getIzquierdo(), dato);
            }
        }
    }

    /*
    Metodo auxiliar para insertar un nunevo nodo al ABB
    */
    public void insertar(int dato){
        if (estaVacio()) {
            Nodo nuevo = new Nodo(null, dato, null);
            raiz = nuevo;
        } else {
            if (dato >= raiz.getDato()) {
                insertar(raiz, raiz.getDerecho(), dato);
            } else {
                insertar(raiz, raiz.getIzquierdo(), dato);
            }
        }
    }

    /*
    Metodo recursivo para recorrer el arbol en orden
    */
    private void mostrarInOrden(Nodo nodo){
        if (nodo == null) {
            
        } else {
            mostrarInOrden(nodo.getIzquierdo());
            System.out.print(nodo.getDato() + "   ");
            mostrarInOrden(nodo.getDerecho());

        }
    }

    /*
    Metodo auxiliar para mostrar el arbol en orden* 
    */
    public void mostrarInOrden(){
        Nodo temp = raiz;
        mostrarInOrden(raiz);
        System.out.println();
    }

}

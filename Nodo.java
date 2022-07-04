public class Nodo {
    
    Nodo izquierdo;
    int dato;
    Nodo derecho;

    public Nodo(Nodo izquierdo, int dato, Nodo derecho) {
        this.izquierdo = izquierdo;
        this.dato = dato;
        this.derecho = derecho;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

         

}

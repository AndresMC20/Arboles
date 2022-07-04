public class Main {
    public static void main(String[] args) {
        ArbolBinarioBusqueda abb = new ArbolBinarioBusqueda();

        abb.insertar(3);
        abb.insertar(2);
        abb.insertar(4);
        abb.insertar(1);
        abb.insertar(3);
        abb.insertar(5);
        abb.insertar(7);
        abb.insertar(6);

        //Mostrar elementos de forma ordenada 
        abb.mostrarInOrden();

        abb.insertar(8);
        abb.insertar(11);
        abb.insertar(2);

        abb.mostrarInOrden();

    }
}

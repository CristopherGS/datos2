package cggs.pryecto1;

public class Nodo {

    private int grado;  //variable para determinar el grado del árbol
    public int contador_valores; // numero de claves en el nodo
    public int datos[];  // arreglo de claves 
    public Nodo hijo[]; //arreglo de hijos
    public boolean hoja; //conocer si el nodo es hoja o no
    private Nodo padre;  //padre del nodo actual
    
    Nodo(int grado, Nodo padre){
        this.grado = grado;
        this.padre = padre;
        datos = new int[grado];
        hijo = new Nodo[grado];
        hoja=true;
        contador_valores = 0;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getcontador_valores() {
        return contador_valores;
    }

    public void setcontador_valores() {
        this.contador_valores++;
    }

    public void setDatos(int ind, int valor) {
        this.datos[ind] = valor;
    }

    public int getDatos(int ind) {
        return datos[ind];
    }



    public boolean isHoja() {
        return hoja;
    }

    public void setHoja(boolean hoja) {
        this.hoja = hoja;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }
    
    
}

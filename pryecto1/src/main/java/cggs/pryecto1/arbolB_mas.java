package cggs.pryecto1;

import java.util.Arrays;

public class arbolB_mas {

    static int grado;
    Nodo raiz;

    public arbolB_mas(int grado) {
        this.grado = grado;
        raiz = new Nodo(grado, null);
    }

    public void insertarValor(Nodo x, int valor) {
        int i = x.getcontador_valores();
        if (x.isHoja()) {
            ordenar(x, valor);
            x.setDatos(i, valor);
            x.setcontador_valores();//suma 1 al contador de valores
            System.out.println(x.getDatos(i));
        } else {
            int n = 0;
            while (n < x.getcontador_valores() && valor > x.datos[i]) {
                n++;
            }
            if (x.hijo[i].getcontador_valores() == grado * 2 - 1) {
                //funcion dividir
                if (valor > x.getDatos(n)) {
                    n++;
                }
            }
            insertarValor(x.hijo[n], valor);
        }
    }

    public void insertar(arbolB_mas ab, int valor) {
        Nodo raiz_ant = ab.raiz;
        if (raiz_ant.getcontador_valores() == 2 + grado - 1) {
            Nodo nuevo = new Nodo(grado, null);//nuevo nodo
            ab.raiz = nuevo; //el nodo vacio será la nueva raiz

            nuevo.hoja = false;//Se asignan valores iniciales
            nuevo.contador_valores = 0;
            nuevo.hijo[0] = raiz_ant;//la raiz antigua será el nuevo hijo

            //dividir(nuevo, 0, raiz_ant);//dividir la raiz puesto que esta lleno el nodo
            insertarValor(nuevo, valor);
        } else {
            insertarValor(raiz_ant, valor);
        }
    }

    public void ordenar(Nodo x, int valor) {
        int i = x.getcontador_valores();
        while (i >= 1 && valor < x.datos[i - 1])//buscar la posición de insercion
        {
            x.datos[i] = x.datos[i - 1];//desplaza los valores
            i--;//desde posición maxima a minima
        }
    }
}

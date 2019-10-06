package cggs.pryecto1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m, n2, valor;
        System.out.print("Ingrese el grado m del arbol:  ");
        m = input.nextInt();

        while (m < 3) {
            System.out.print("Por favor ingrese un grado mayor a 1 : ");
            m = input.nextInt();
        }
        arbolB_mas tree = new arbolB_mas(m);//  Creamos un nuevo arbol

        System.out.print("\n Cuantos valores desea ingresar?:  ");
        n2 = input.nextInt();

        for (int i = 0; i < n2; i++) {
            System.out.print("\nIngrese valor:");
            System.out.println(i + 1);
            valor = input.nextInt();
            tree.insertar(tree, valor);
        }
        int opcion, k;

        boolean flag;
        flag = true;
        System.out.println("\tM\tE\tN\tU\n");
        System.out.println("1. Ingresar valor");
        System.out.println("2. Imprimir el arbol en PreOrden");
        System.out.println("3. Buscar un valor e imprimir el nodo");
        System.out.println("4. Borrar un valor de una hoja");
        System.out.println("5. Exit");

        while (flag) {

            System.out.print("\nSeleccionar opcion::");
            opcion = input.nextInt();
            if (opcion == 5) {
                System.exit(0);
                flag = false;
                break;
            } else {
                switch (opcion) {
                    case 1:
                        System.out.print("Cuantos valores desean ingresar?:");
                        n2 = input.nextInt();

                        for (int i = 0; i < n2; i++) {
                            System.out.print("\nIngrese valor: ");
                            System.out.println(i + 1);
                            valor = input.nextInt();
                            tree.insertar(tree, valor);
                        }

                        break;

                    case 2:
                        for (int i = 0; i < m; i++) {
                            System.out.print(tree.raiz.datos[i]+", ");
                        }
                        break;
//                        tree.print(tree.raiz);
//                        System.out.println();
//                        break;
//
//                    case 3:
//                        System.out.println("Ingrese el valor a buscar:");
//                        int key2 = input.nextInt();
//                        tree.SearchPrintNode(tree, key2);
//
//                        break;
//                    case 4:
//                        System.out.println("Ingrese el valor a ser borrado:");
//                        int key = input.nextInt();
//                        tree.deleteKey(tree, key);
//                        break;
//
//                    case 5:
//                        System.exit(0);
//                        break;
                    default:
                        System.out.println("\nError\n");
                        break;
                }
            }
        }
    }

}

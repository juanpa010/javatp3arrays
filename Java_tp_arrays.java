/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_tp_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author juampi
 */

public class Java_tp_arrays {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("");
            System.out.println("ingrese un ejercicio, ingrese 0 para salir");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    int[] enteros = new int[10];
                    //se crea el array con el tamaño 10

                    System.out.println("ingrese 10 valores");
                    //se le pide al usuario que ingrese 10 valores para asignar al array
                    for (int i = 0; i < enteros.length; i++)
                        //se utiliza un bucle for para llenar cada uno de los espacios del array
                        enteros[i] = sc.nextInt();
                    //se imprime el array
                    System.out.println("");
                    System.out.println("array original:");
                    for (int i = 0; i < enteros.length; i++)
                        System.out.print(enteros[i] + " ");

                    //se crea un nuevo array, y se clona el array original para obtener los valores a ordenar
                    int arrayAscendente[] = enteros.clone();
                    //mediante la funcion sort, se ordenan los valores en orden ascendente
                    Arrays.sort(arrayAscendente);
                    //imprimimos en orden ascendente
                    System.out.println("");
                    System.out.println("array en orden ascendente:");
                    for (int i = 0; i < arrayAscendente.length; i++)
                        System.out.print(arrayAscendente[i] + " ");

                    int arrayDescendente[] = new int[arrayAscendente.length];

                    //ahora para obtener los valores en orden descendiente, invertiremos el array arrayAscendente y lo asignaremos a arrayDescendente
                    for (int i = 0; i < arrayAscendente.length; i++)
                        arrayDescendente[i] = arrayAscendente[arrayDescendente.length - 1 - i];

                    //se imprime el array descendente
                    System.out.println("");
                    System.out.println("array en orden descendente:");
                    for (int i = 0; i < arrayDescendente.length; i++)
                        System.out.print(arrayDescendente[i] + " ");
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("ingrese su DNI sin puntos");
                    int numDNI = sc.nextInt();
                    obtenerLetra(numDNI);
                    break;

                case 3:
                    int arrayEjer12[] = new int[10];
                    int numABuscar;
                    int cuentaNum = 0;

                    System.out.println("ingrese 10 valores para el array:");
                    for (int i = 0; i < arrayEjer12.length; i++) {
                        arrayEjer12[i] = sc.nextInt();
                    }

                    // se pide al usuario el numero a buscar en el array
                    System.out.println("ingrese el numero a buscar:");
                    numABuscar = sc.nextInt();

                    for (int i = 0; i < arrayEjer12.length; i++) {
                        if (arrayEjer12[i] != numABuscar) {
                            cuentaNum++;
                        }
                    }

                    int arraySinNum[] = new int[cuentaNum];
                    int index = 0;
                    
                    for (int i = 0; i < arrayEjer12.length; i++) {
                        if (arrayEjer12[i] != numABuscar) {
                            arraySinNum[index++] = arrayEjer12[i];
                        }
                    }

                    // se imprime el array nuevo
                    System.out.println("array sin el numero ingresado");
                    for (int num : arraySinNum) {
                        System.out.print(num + " ");
                    }
                    break;
            }

        } while (opcion != 0);
    }

    public static void obtenerLetra(int numeroDNI) {
        int resto;
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        resto = (numeroDNI % 23);
        System.out.println("");
        System.out.println("su DNI con letra es: " + numeroDNI + letrasDNI[resto]);
    }
}

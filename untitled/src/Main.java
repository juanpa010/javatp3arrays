import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.print(
                    """ 
                    --- MENÚ DE OPCIONES ---
                    1. Acceder fuera del tamaño del array
                    2. Array unidimensional de tamaño 5
                    3. Array de tamaño dinámico con múltiplos
                    4. Leer 20 números decimales y calcular mayor , menor y rango
                    5. Números enteros positivos pares, promedio y conteos
                    6. Búsqueda secuencial en un array de tamaño 50
                    7. Suma de pares e impares
                    8. Ordenar array ascendente y descendente
                    9. Sumar números de cadena separada por guiones
                    10. Calcular letra de DNI
                    11. Sumar y Multiplicar 2 array en uno nuevo
                    12. Eliminar elemento de un array
                    0. Salir
                    Elige una opción:"""
            );
            // Leer opción del usuario
            opcion = scanner.nextInt();
            // Switch para manejar las opciones
            switch (opcion) {
                case 1:
                    Actividades.accederFueraArray();
                    break;
                case 2:
                    Actividades.arrayTamano5();
                    break;
                case 3:
                    Actividades.arrayMultiploDinamico();
                    break;
                case 4:
                    Actividades.calcularMayorMenorRango();
                    break;
                case 5:
                    Actividades.calcularPromedioYConteos();
                    break;
                case 6:
                    Actividades.busquedaSecuencial();
                    break;
                case 7:
                    Actividades.sumaParImpar();
                    break;
                case 8:
                    Actividades.ordenarAscDesc();
                    break;
                case 9:
                    Actividades.sumarCadenaNumeros();
                    break;
                case 10:
                    Actividades.calcularLetraDNI();
                    break;
                case 11:
                    Actividades.arrayMultiplicacionSuma();
                    break;
                case 12:
                    Actividades.arrayEliminarElemento();
                    break;
                case 0:
                    System.out.println("Cerrando el programa....");
                    break;
                default:
                    System.out.println("Opción no valida. Inténtalo nuevamente.");
                    break;
            }
        }
        while (opcion != 0);
    }
}
class Actividades {

    static String cadena;
    static int[] numeros = new int[20];
    static int entero1 = 0;
    static int entero2 = 0;
    static int suma = 0;
    static int i;
    public static void accederFueraArray() {
        int[] arreglo = {1, 2, 3, 4, 5};
        try {
            System.out.println("Indice fuera de rango");
            System.out.println(arreglo[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void arrayTamano5() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número para la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Los números introducidos son:");
        for (int num : numeros) {
            System.out.println(num);
        }
    }

    public static void arrayMultiploDinamico() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el tamaño del array: ");
        int tamaño = scanner.nextInt();
        System.out.print("Introduce el número para los múltiplos: ");
        int numero = scanner.nextInt();
        int[] arrayMultiplo = new int[tamaño];
        for (int i = 0; i < arrayMultiplo.length; i++) {
            arrayMultiplo[i] = numero * (i + 1);
        }
        System.out.println("Los múltiplos son:");
        for (int num : arrayMultiplo) {
            System.out.println(num);
        }
    }

    public static void calcularMayorMenorRango() {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[20];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número decimal: ");
            numeros[i] = scanner.nextDouble();
        }
        double mayor = numeros[0];
        double menor = numeros[0];
        for (double num : numeros) {
            if (num > mayor) mayor = num;
            if (num < menor) menor = num;
        }
        double rango = mayor - menor;
        System.out.println("El mayor número es: " + mayor);
        System.out.println("El menor número es: " + menor);
        System.out.println("El rango es: " + rango);
    }

    public static void calcularPromedioYConteos() {
        int[] numeros = new int[20];
        Random random = new Random();
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            // Genera un número par
            numeros[i] = 2 * (random.nextInt(50) + 1);
            suma += numeros[i];
        }
        double promedio = suma / (double) numeros.length;
        int iguales = 0, mayores = 0, menores = 0;
        for (int num : numeros) {
            if (num == promedio) iguales++;
            if (num > promedio) mayores++;
            if (num < promedio) menores++;
        }
        System.out.println("El promedio es: " + promedio);
        System.out.println("Números iguales al promedio: " + iguales);
        System.out.println("Números mayores al promedio: " + mayores);
        System.out.println("Números menores al promedio: " + menores);
    }
    public static void busquedaSecuencial() {
        int[] numeros = new int[50];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }
        System.out.print("Introduce el número que deseas buscar: ");
        int valor = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor) {
                System.out.println("El valor " + valor + " fue encontrado en la posición " + i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El valor no se encontró en el arreglo.");
        }
    }
    public static void sumaParImpar() {
        Random random = new Random();
        System.out.println("Números generados:");
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10);
            System.out.print(numeros[i] + " ");
        }
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                entero1 += numeros[i];
            } else {
                entero2 += numeros[i];
            }
        }
        System.out.println("\n\nSuma de números pares: " + entero1);
        System.out.println("Suma de números impares: " + entero2);

    }
    public static void ordenarAscDesc() {
        Scanner sc = new Scanner(System.in);
        int[] enteros = new int[10];
        //se crea el array con el tamaño 10

        System.out.println("ingrese 10 valores");
        //se le pide al usuario que ingrese 10 valores para asignar al array
        for (i = 0; i < enteros.length; i++)
            //se utiliza un bucle for para llenar cada uno de los espacios del array
            enteros[i] = sc.nextInt();
        //se imprime el array
        System.out.println(" ");
        System.out.println("array original:");
        for (i = 0; i < enteros.length; i++)
            System.out.print(enteros[i] + " ");

        //se crea un nuevo array, y se clona el array original para obtener los valores a ordenar
        int arrayAscendente[] = enteros.clone();
        //mediante la funcion sort, se ordenan los valores en orden ascendente
        Arrays.sort(arrayAscendente);
        //imprimimos en orden ascendente
        System.out.println(" ");
        System.out.println("array en orden ascendente:");
        for (i = 0; i < arrayAscendente.length; i++)
            System.out.print(arrayAscendente[i] + " ");

        int arrayDescendente[] = new int[arrayAscendente.length];

        //ahora para obtener los valores en orden descendiente, invertiremos el array arrayAscendente y lo asignaremos a arrayDescendente
        for (i = 0; i < arrayAscendente.length; i++)
            arrayDescendente[i] = arrayAscendente[arrayDescendente.length - 1 - i];

        //se imprime el array descendente
        System.out.println(" ");
        System.out.println("array en orden descendente:");
        for (i = 0; i < arrayDescendente.length; i++)
            System.out.print(arrayDescendente[i] + " ");
    }
    public static void sumarCadenaNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena de numeros separados por guiones medios");
        cadena = sc.nextLine();
        String[] cadenaNum = cadena.split("-");
        for (i = 0; i < cadenaNum.length; i++){
            suma += Integer.parseInt(cadenaNum[i]);
        }
        int promedio = suma/i;
        System.out.println("La suma total es de: " + suma);
        System.out.println("El promedio es de: " + promedio);
    }
    public static void calcularLetraDNI() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su DNI sin puntos:");
        int numDNI = sc.nextInt();
        obtenerLetra(numDNI);
    }
    public static void obtenerLetra(int numeroDNI) {
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = numeroDNI % 23;
        System.out.println("Su DNI con letra es: " + numeroDNI + letrasDNI[resto]);
    }
    public static void arrayMultiplicacionSuma (){
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int [5];
        int[] array2 = new int [10];
        int[] array3 = new int [5];
        for (i = 0; i < array1.length; i++){
            System.out.println("Ingrese el numero entero del primer arreglo " + i);
            array1[i] = sc.nextInt();
        }
        for (i = 0; i < array2.length; i++){
            System.out.println("Ingrese el numero entero del segundo arreglo " + i);
            array2[i] = sc.nextInt();
        }
        for (i = 0; i < array1.length; i++){
            suma = 0;
            for ( int e = 0; e < array2.length; e++){
                suma += array1[i] * array2[e];
            }
            array3[i] = suma;
        }
        for (i = 0; i < array3.length; i++){
            System.out.println(array3[i]);
        }
    }
    public static void arrayEliminarElemento (){
        Scanner sc = new Scanner(System.in);
        int arrayEjer12[] = new int[10];
        int numABuscar;
        int cuentaNum = 0;
        System.out.println("ingrese 10 valores para el array:");
        for (i = 0; i < arrayEjer12.length; i++) {
            arrayEjer12[i] = sc.nextInt();
        }
        // se pide al usuario el numero a buscar en el array
        System.out.println("ingrese el numero a buscar:");
        numABuscar = sc.nextInt();
        for (i = 0; i < arrayEjer12.length; i++) {
            if (arrayEjer12[i] != numABuscar) {
                cuentaNum++;
            }
        }
        int arraySinNum[] = new int[cuentaNum];
        int index = 0;
        for (i = 0; i < arrayEjer12.length; i++) {
            if (arrayEjer12[i] != numABuscar) {
                arraySinNum[index++] = arrayEjer12[i];
            }
        }
        // se imprime el array nuevo
        System.out.println("array sin el numero ingresado");
        for (int num : arraySinNum) {
            System.out.print(num + " ");
        }
    }
// Private stactic Scanner sc; Hubiera esvitado que repitiese tanto
// "Scanner sc = new Scanner(System.in);"
}

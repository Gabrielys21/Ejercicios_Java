import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Scanner scanner = new Scanner(System.in);
    static void suma_dos_numeros() {
        try{
            System.out.println("Digite el primer numero");
            int num1 = scanner.nextInt();
            System.out.println("Digite el segundo numero");
            int num2 = scanner.nextInt();
            int resultado = num1 + num2;
            System.out.println("El resultado es: " + resultado);
        }catch(Exception e){
            System.out.println("Error al ingresar los numeros, por favor intente de nuevo.");
        }
    }
    static void numero_par_impar() {
        try {
            System.out.println("Digite el primer numero");
            int num1 = scanner.nextInt();
            if (num1 % 2 == 0) {
                System.out.println("El numero es par");
            } else {
                System.out.println("El numero es impar");
            }
        }catch(Exception e){
            System.out.println("Error al ingresar los datos, por favor intenta de nuevo");
        }
    }
    static void factorial_numero(){
        try {
            System.out.println("Digite el numero para sacar su factorial");
            int num1 = scanner.nextInt();
            int factor = 1;
            for (int i = 1; i <= num1; i++) {
                factor *= i;
            }
            System.out.println("El factorial de " + num1 + " es: " + factor);
        }catch(Exception e){
            System.out.print("Error al ingresar los datos, por favor intente de nuevo.");
        }
    }
    static void tabla_multiplicar(){
        try {
            System.out.println("Digite el numero a calcular su tabla de multiplicar");
            int num1 = scanner.nextInt();
            int resultado;
            System.out.println("Orden Ascendente");
            for (int i = 1; i <= 10; i++) {
                resultado = num1 * i;
                System.out.println(num1 + " X " + i + " = " + resultado);
            }
            System.out.println("Orden Descendente");
            for (int i = 10; i >= 1; i--) {
                resultado = num1 * i;
                System.out.println(num1 + " X " + i + " = " + resultado);
            }
        }catch(Exception e){
            System.out.println("Error al ingresar los datos, por favor intente de nuevo");
        }
    }
    static void numeros_max_min(){
        try {
            int numero;
            int maximo = Integer.MIN_VALUE;
            int minimo = Integer.MAX_VALUE;
            System.out.println("Digite una serie de numeros enteros (Digite un numero negativo para terminar)");

            while (true) {
                numero = scanner.nextInt();

                if (numero < 0) {
                    break;
                }
                if (numero > maximo) {
                    maximo = numero;
                }
                if (numero < minimo) {
                    minimo = numero;
                }
            }
            if (maximo == Integer.MIN_VALUE && minimo == Integer.MAX_VALUE) {
                System.out.println("No se encontraron numeros validos");
            } else {
                System.out.println("El numero mas grande es " + maximo);
                System.out.println("El numero mas pequenio es " + minimo);
            }
        }catch(Exception e){
            System.out.println("Error al ingresar los datos, por favor intente de nuevo");
        }
    }
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        int option;
        do {
            System.out.println("Menu Principal");
            System.out.println("1.Hola Mundo");
            System.out.println("2.Suma de dos Numeros");
            System.out.println("3.Numero par o impar");
            System.out.println("4.Factorial de un numero");
            System.out.println("5.Tabla de multiplicar");
            System.out.println("6.Numeros maximos y minimos");
            System.out.println("7.Naser");
            System.out.println("8.Salir");
            System.out.println("Seleccione una opcion");
            option = scanner.nextInt();

            switch (option){
                case 1: System.out.println("Hola Mundo");
                    break;
                case 2: suma_dos_numeros();
                    break;
                case 3: numero_par_impar();
                    break;
                case 4: factorial_numero();
                    break;
                case 5: tabla_multiplicar();
                    break;
                case 6: numeros_max_min();
                    break;
                case 7: System.out.println("Saliendo del Sistema...");
                    break;
                default: System.out.println("Opcion no valida, intenta de nuevo");
            }
        } while(option != 7);
        scanner.close();
    }
}
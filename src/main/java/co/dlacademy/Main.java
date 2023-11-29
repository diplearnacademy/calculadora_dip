package co.dlacademy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operacion;
        Calculadora calculadora = new Calculadora();

        System.out.println("Ingrese el primer número:");
        num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        num2 = scanner.nextDouble();

        System.out.println("Ingrese la operación (+, -, *, /):");
        operacion = scanner.next().charAt(0);

        double resultado = 0;
        switch (operacion) {
            case '+':
                resultado = calculadora.sumar(num1, num2);
                break;
            case '-':
                resultado = calculadora.restar(num1, num2);
                break;
            case '*':
                resultado = calculadora.multiplicar(num1, num2);
                break;
            case '/':
                resultado = calculadora.dividir(num1, num2);
                break;
            default:
                System.out.println("Operación no válida.");
                break;
        }

        if (operacion == '+' || operacion == '-' || operacion == '*' || operacion == '/') {
            System.out.println("El resultado es: " + resultado);
        }
    }
}
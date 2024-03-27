package org.example;

public class Calculadora {
    static double calcularMedia(int[] notas) {
        int somarNotas = 0;

        for (int numero : notas) {
            somarNotas += numero;
        }

        return (double) somarNotas / notas.length;
    }
}

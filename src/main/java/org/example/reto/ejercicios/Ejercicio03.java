package org.example.reto.ejercicios;

import java.util.function.BiFunction;

public class Ejercicio03 {

    public void derivate() {
        BiFunction<Integer, Integer, Integer> exponentCoefficient = (x, y) -> x * y;

        final Integer A = 5;
        final Integer B = 3;
        final Integer C = 8;
        final Integer EXPONENT = 9;

        System.out.println(A + "X" + "^" + EXPONENT + " + " + B + "X" + "^" + (EXPONENT - 1) + " + " + C + "X\n");

        System.out.println("Resultado");
        System.out.println(exponentCoefficient.apply(A, EXPONENT) + "X" + "^" + (EXPONENT - 1) + " + " +
                exponentCoefficient.apply(B, (EXPONENT - 1)) + "X" + "^" + (EXPONENT - 2) + " + " + C);

    }

    public void integral() {
        BiFunction<Integer, Integer, Integer> coefficientOverExponent = (x, y) -> x / (y + 1);

        final Integer A = 5;
        final Integer EXPONENT = 9;

        System.out.println("∫" + A + "X^" + EXPONENT + " dx");

        System.out.println("Resultado: ");
        System.out.println(coefficientOverExponent.apply(A, EXPONENT) + "X^" + (EXPONENT + 1) + " + C");

    }

    public static void main(String[] args) {
        var ejercicio03 = new Ejercicio03();
        // ejercicio03.derivate(); TODO descomentar para la derivada
        //ejercicio03.integral(); TODO descomentar para la integral

    }
}

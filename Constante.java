package br.com.fiap;

public class Constante {
    public static void main(String[] args) {
        final double PI = 3.1415;
        final float GRAVIDADE_TERRESTRE = 9.8f;
        double calculo = PI * GRAVIDADE_TERRESTRE;
        System.out.println(" Valor do PI:\t\t" + PI + "\nValor da Gravidade:\t" + GRAVIDADE_TERRESTRE);
        System.out.println("Resultado da multiplicação: " + calculo);

    }
}

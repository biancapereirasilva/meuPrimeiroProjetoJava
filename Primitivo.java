package br.com.fiap;

public class Primitivo {
    public static void main(String[] args) {
        // declaração e inicialização de variável
        char sexo = 'F';
        byte idade = 25;
        short codigo = 15650;
        int alunos = 55, classes = 11;
        long brasileiros = 3220550777L;
        float media = 8.7f;
        double dolar = 5.22;
        boolean alternativa = false;
        String nome = "Bianca";
        System.out.println("\nSexo: " + sexo + "\nIdade: " + idade + "\nCódigo: " + codigo);
        System.out.println("\nAlunos: " + alunos + "\nTurmas: " + classes + "\nMédia: " + media);
        System.out.println("\nHabitantes: " + brasileiros + "\nCotação dólar: R$ " + dolar);
        System.out.println("\nAlternativa: " + alternativa + "\nNome: " + nome);
    }
}

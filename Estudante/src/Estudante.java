public class Estudante {
    private String nome;
    private double nota;

    public Estudante(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public static double calcularMedia(Estudante[] estudantes) {
        double soma = 0;
        for (Estudante estudante : estudantes) {
            soma += estudante.getNota();
        }
        return soma / estudantes.length;
    }
}
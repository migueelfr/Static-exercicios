public class Livro {
    private String titulo;
    private String autor;
    private int quantidadeDisponivel;

    public Livro(String titulo, String autor, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public static void emprestarLivro(Livro[] livros, String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                if (livro.getQuantidadeDisponivel() > 0) {
                    livro.quantidadeDisponivel--;
                    System.out.println("Livro emprestado: " + livro.getTitulo());
                    return;
                } else {
                    System.out.println("Não há cópias disponíveis do livro: " + livro.getTitulo());
                    return;
                }
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public static boolean verificarDisponibilidade(Livro[] livros, String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo)) {
                return livro.getQuantidadeDisponivel() > 0;
            }
        }
        return false;
    }
}

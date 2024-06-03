public class TesteLivro {
        public static void main(String[] args) {
            Livro[] livros = new Livro[3];
            livros[0] = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 5);
            livros[1] = new Livro("Harry Potter", "J.K. Rowling", 3);
            livros[2] = new Livro("1984", "George Orwell", 0);

            Livro.emprestarLivro(livros, "O Senhor dos Anéis");
            Livro.emprestarLivro(livros, "1984");

            if (Livro.verificarDisponibilidade(livros, "Harry Potter")) {
                System.out.println("Harry Potter está disponível para empréstimo.");
            } else {
                System.out.println("Harry Potter não está disponível para empréstimo.");
            }
        }
    }


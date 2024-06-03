public class TesteEstudante {
        public static void main(String[] args) {
            Estudante[] estudantes = new Estudante[3];
            estudantes[0] = new Estudante("João", 7.5);
            estudantes[1] = new Estudante("Maria", 8.0);
            estudantes[2] = new Estudante("Pedro", 6.0);

            double media = Estudante.calcularMedia(estudantes);
            System.out.println("A média das notas dos estudantes é: " + media);
        }
    }

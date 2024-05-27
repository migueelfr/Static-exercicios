public class Testajogador {
    public static void main(String[] args) {
        int num=0;

        System.out.printf("%nAlerta: %s%n" , jogador .alerta ? "sim" : "nao");

        jogador j1 = new jogador(++num);
        jogador j2 = new jogador(++num);
        jogador j3 = new jogador(++num);

        jogador.alerta=true;

        j1.info();
        j2.info();
        j3.info();

    }
}

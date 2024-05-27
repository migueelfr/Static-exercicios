public class jogador {
    private final int maxvidas=3;
    private int num=0;
    private int vidas=0;
    static boolean alerta=false;
    static int qntjogador=0;
    public jogador(int num){
        this.num = num;
        this.vidas = 1;
        System.out.printf("Jogador número %d criado%n" ,num);

    }

    public int getVidas() {
        return this.vidas;
    }
    public void addvidas(){
        if (this.vidas < maxvidas)
        this.vidas++;
    }

    public void info(){
        System.out.printf("%nJogador: %d", this.num);
        System.out.printf("%nVidas: %d", this.vidas);
        System.out.printf("%nAlerta: %s", alerta ? "sim" : "nao");
        System.out.printf("%nJogadores: %d", qntjogador);
        System.out.printf("%n----------------------------------");




    }


}

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public static double calcularValorTotalEmEstoque(Produto[] produtos) {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco() * produto.getQuantidadeEmEstoque();
        }
        return total;
    }

    public static Produto encontrarProdutoMaisCaro(Produto[] produtos) {
        Produto produtoMaisCaro = produtos[0];
        for (int i = 1; i < produtos.length; i++) {
            if (produtos[i].getPreco() > produtoMaisCaro.getPreco()) {
                produtoMaisCaro = produtos[i];
            }
        }
        return produtoMaisCaro;
    }
}

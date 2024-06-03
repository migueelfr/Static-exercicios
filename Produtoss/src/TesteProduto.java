public class TesteProduto {
        public static void main(String[] args) {
            Produto[] produtos = new Produto[3];
            produtos[0] = new Produto("Lápis", 1.5, 100);
            produtos[1] = new Produto("Caderno", 10.0, 50);
            produtos[2] = new Produto("Borracha", 0.5, 200);

            double valorTotal = Produto.calcularValorTotalEmEstoque(produtos);
            System.out.println("O valor total em estoque é: " + valorTotal);

            Produto produtoMaisCaro = Produto.encontrarProdutoMaisCaro(produtos);
            System.out.println("O produto mais caro é: " + produtoMaisCaro.getNome() + " - R$" + produtoMaisCaro.getPreco());
        }
    }

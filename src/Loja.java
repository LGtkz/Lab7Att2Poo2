public class Loja extends Compras{
    public Loja(double preco, double qtd) {
        super(preco, qtd);
    }

    @Override
    void processaPagamento() {
        System.out.println("Pagamento feito na loja!");
    }
}

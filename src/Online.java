public class Online extends Compras{
    public Online(double preco, double qtd) {
        super(preco, qtd);
    }

    @Override
    void processaPagamento() {
        System.out.println("Pagamento feito de forma online!");
    }
}

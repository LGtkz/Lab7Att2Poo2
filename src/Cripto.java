public class Cripto extends Compras{
    public Cripto(double preco, double qtd) {
        super(preco, qtd);
    }

    @Override
    void processaPagamento() {
        System.out.println("Pagamento feito via bitcoin");
    }
}

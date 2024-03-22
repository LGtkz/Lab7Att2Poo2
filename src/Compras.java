public abstract class Compras {
    private double preco;
    private double qtd;

    public Compras(double preco, double qtd) {
        this.preco = preco;
        this.qtd = qtd;
    }

    public void processaCompra(){
        processaPagamento();
        preparaPct();
    }

    abstract void processaPagamento();
    public void preparaPct(){
        if(preco > 100.00 || qtd > 10){
            System.out.println("Entrega disponivel via correios");
        }
        else{
            System.out.println("Entrega não esta disponivel");
        }
    }
}

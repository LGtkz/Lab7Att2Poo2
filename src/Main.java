public class Main {
    public static void main(String[] args) {
        Compras compras = new Online(110.00, 5);
        compras.processaCompra();
        Compras loja = new Loja(90, 5);
        loja.processaCompra();
        Compras cripto = new Cripto(5, 10);
        cripto.processaCompra();
    }
}
public class Main {
    public static void main(String[] args) {
        /*A escolha entre Template e Decorator depende das necessidades específicas
         do projeto. Template é ideal para definir algoritmos com partes fixas e
          variáveis, enquanto Decorator é mais adequado para adicionar funcionalidades
           dinamicamente sem modificar o código original.*/
        Compras compras = new Online(110.00, 5);
        compras.processaCompra();
        Compras loja = new Loja(90, 5);
        loja.processaCompra();
        Compras cripto = new Cripto(5, 10);
        cripto.processaCompra();
    }
}
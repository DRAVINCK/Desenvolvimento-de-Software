package abstract_factory;

public class Erp {
    public static void main(String[] args) {
        iFabrica fabrica = new fabricaCassandra();
        Consumidor consumidor = new Consumidor(fabrica);
        System.out.println(consumidor.produtoA.Salvar());
        System.out.println(consumidor.produtoB.Salvar());
    }
}

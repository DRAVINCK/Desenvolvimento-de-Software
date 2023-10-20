package abstract_factory;

public class Consumidor {
    private iFabrica fabrica;
    public iProduto produtoA;
    public iProduto produtoB;

    public Consumidor(iFabrica fabrica) {
        this.fabrica = fabrica;
        this.produtoA = fabrica.fabricarProdutoA();
        this.produtoB = fabrica.fabricarProdutoB();
    }
}

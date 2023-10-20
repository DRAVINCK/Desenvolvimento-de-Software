package abstract_factory;

public class FabricaMysql implements iFabrica{
    @Override
    public iProduto fabricarProdutoA() {
        return new ProdutoAMysql();
    }

    @Override
    public iProduto fabricarProdutoB() {
        return new ProdutoBMysql();
    }
}

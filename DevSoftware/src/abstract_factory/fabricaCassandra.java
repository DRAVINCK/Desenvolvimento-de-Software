package abstract_factory;

public class fabricaCassandra implements iFabrica {

    @Override
    public iProduto fabricarProdutoA() {
        return new produtoAcassandra();
    }

    @Override
    public iProduto fabricarProdutoB() {
        return new produtoBcassandra();
    }
}

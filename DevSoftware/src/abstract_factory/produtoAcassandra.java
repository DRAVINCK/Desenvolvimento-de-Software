package abstract_factory;

public class produtoAcassandra implements iProduto{

    @Override
    public String Salvar() {
        return "salvando Produto A no Cassandra";
    }
}

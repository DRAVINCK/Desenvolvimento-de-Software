package abstract_factory;

public class produtoBcassandra implements iProduto{
    @Override
    public String Salvar() {
        return "Salvando B em Cassandra";
    }
}

package AvaliativaVeiculo;

public interface Armazenamento {

    public default void salvarDados(String veiculo) {

    }

    public String recuperarDados();
}

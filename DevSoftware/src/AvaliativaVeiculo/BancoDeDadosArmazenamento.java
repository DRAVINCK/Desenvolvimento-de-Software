package AvaliativaVeiculo;

public class BancoDeDadosArmazenamento implements Armazenamento {

    @Override
    public  void salvarDados(String veiculo) {
        ConexaoBanco.getInstance().getConnection();
    }

    @Override
    public String recuperarDados() {
        return null;
    }
}

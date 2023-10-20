package AvaliativaVeiculo;

public class FabricaArmazenamento {

    public static Armazenamento criarArmazenamentoBancoDeDados() {
        return new BancoDeDadosArmazenamento();
    }

    public static Armazenamento criarArmazenamentoArquivo() {
        return new ArquivoArmazenamento();
    }
}

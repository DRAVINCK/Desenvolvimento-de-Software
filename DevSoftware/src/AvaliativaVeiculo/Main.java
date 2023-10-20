package AvaliativaVeiculo;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Armazenamento armazenamentoBancoDeDados = FabricaArmazenamento.criarArmazenamentoBancoDeDados();
        Concessionaria concessionariaComBanco = new Concessionaria(armazenamentoBancoDeDados);

        Armazenamento armazenamentoArquivo = FabricaArmazenamento.criarArmazenamentoArquivo();
        Concessionaria concessionariaComArquivo = new Concessionaria(armazenamentoArquivo);

        // Agora, você pode usar as concessionárias com diferentes implementações de armazenamento
        concessionariaComBanco.adicionarVeiculo("Carro 1");
        concessionariaComArquivo.adicionarVeiculo("Carro 2");

        List<String> veiculosDoBanco = concessionariaComBanco.listarVeiculos();
        List<String> veiculosDoArquivo = concessionariaComArquivo.listarVeiculos();

        System.out.println("Veículos no Banco de Dados: " + veiculosDoBanco);
        System.out.println("Veículos no Arquivo: " + veiculosDoArquivo);
    }
}

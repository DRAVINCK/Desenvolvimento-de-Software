package AvaliativaVeiculo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Concessionaria {

    private Armazenamento armazenamento;

    // Construtor que recebe uma instância de Armazenamento como dependência
    public Concessionaria(Armazenamento armazenamento) {
        this.armazenamento = armazenamento;
    }

    // Método para adicionar um veículo ao estoque
    public void adicionarVeiculo(String veiculo) {
        armazenamento.salvarDados(veiculo);
    }

    // Método para listar todos os veículos em estoque
    public List<String> listarVeiculos() {
        String dados = armazenamento.recuperarDados();
        if (dados != null && !dados.isEmpty()) {
            // Implemente a lógica para dividir os dados e retornar uma lista de veículos
            // Aqui, vou apenas retornar os dados como uma única string para simplificar
            return Arrays.asList(dados.split("\n"));
        }
        return Collections.emptyList();
    }
}

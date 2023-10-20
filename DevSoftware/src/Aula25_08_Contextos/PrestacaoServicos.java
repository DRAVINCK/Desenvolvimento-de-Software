package Aula25_08_Contextos;

public class PrestacaoServicos extends Contexto {

    public double taxaServico;

    public PrestacaoServicos(double custoDireto, double taxaServico) {
        super(custoDireto);
        this.taxaServico = taxaServico;
    }

    @Override
    public double calcularCustoTotal() {
        return getCustoDireto() + taxaServico;
    }
}

package Aula25_08_Contextos;

public class ProducaoProdutos extends Contexto { //teste em extend

    private double custoIndireto;

    public ProducaoProdutos(double custoDireto, double custoIndireto) {
        super(custoDireto);
        this.custoIndireto = custoIndireto;
    }

    @Override
    public double calcularCustoTotal() {
        return getCustoDireto() + custoIndireto;
    }
}

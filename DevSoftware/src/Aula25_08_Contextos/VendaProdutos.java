package Aula25_08_Contextos;

public class VendaProdutos extends Contexto{ //classe para ser utlizada quando Contexto for uma interface

    public double margemLucro;

    public VendaProdutos(double custoDireto, double margemLucro) {
        super(custoDireto);
        this.margemLucro = margemLucro;
    }

    @Override
    public double calcularCustoTotal() {
        return getCustoDireto() * margemLucro;
    }
}

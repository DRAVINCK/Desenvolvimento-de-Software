package Aula25_08_Contextos;

public class Contexto { //Classe alterada para ser utilizada p/ extend
    private double custoDireto = 0;

    public double getCustoDireto() {
        return custoDireto;
    }
    public void setCustoDireto(double custoDireto) {
        this.custoDireto = custoDireto;
    }

    public Contexto(double custoDireto) {
        this.custoDireto = custoDireto;
    }

    public double calcularCustoTotal()
    {
        return custoDireto;
    }

}

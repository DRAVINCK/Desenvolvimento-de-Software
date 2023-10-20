package Aula25_08_Contextos;

public class UtilizaContextos {

    public Contexto Contextualiza;

    public UtilizaContextos(Contexto contextualiza) {
        Contextualiza = contextualiza;
    }

    public double calcular(){
        double calc = Contextualiza.calcularCustoTotal();
        return calc;
    }
}

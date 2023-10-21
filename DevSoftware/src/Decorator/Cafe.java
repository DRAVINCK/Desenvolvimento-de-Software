package Decorator;
//componente concreto
public class Cafe implements iBebida{

    @Override
    public String Descricao() {
        return "Café";
    }

    @Override
    public double custo() {
        return 3.0;
    }
}

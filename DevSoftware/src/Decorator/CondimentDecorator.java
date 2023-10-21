package Decorator;

public abstract class CondimentDecorator implements iBebida {
    protected iBebida Condiment;

    public CondimentDecorator(iBebida condimentDeco) {
        Condiment = condimentDeco;
    }

    public String Descricao() {
        return Condiment.Descricao();
    }

    public double custo() {
        return Condiment.custo();
    }
}

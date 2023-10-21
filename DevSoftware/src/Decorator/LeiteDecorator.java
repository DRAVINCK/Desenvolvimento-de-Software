package Decorator;

public class LeiteDecorator extends CondimentDecorator{


    public LeiteDecorator(iBebida condimentDeco) {
        super(condimentDeco);
    }

    @Override
    public String Descricao() {
        return super.Descricao() + ", leite";
    }

    @Override
    public double custo() {
        return super.custo() + 1.5;
    }
}

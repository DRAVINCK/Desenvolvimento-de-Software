package Decorator;

public class UisqueDecorator extends CondimentDecorator {

    public UisqueDecorator(iBebida condimentDeco) {
        super(condimentDeco);
    }

    @Override
    public String Descricao() {
        return super.Descricao() + ", uisque";
    }

    @Override
    public double custo() {
        return super.custo() + 30.00;
    }
}

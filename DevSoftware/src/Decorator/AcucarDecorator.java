package Decorator;

public class AcucarDecorator extends CondimentDecorator {


    public AcucarDecorator(iBebida condimentDeco) {
        super(condimentDeco);
    }

    @Override
    public String Descricao() {
        return super.Descricao() +", açucar";
    }

    @Override
    public double custo() {
        return super.custo() + 0.5;
    }
}

package FactoryMethodPROF;


public class FabricaCirculo implements IfabricaFormas {
    @Override

    public Iforma criarForma() {
        return new Circulo();
    }
}

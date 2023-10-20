package FactoryMethodPROF;


public class FabricaRetangulo implements IfabricaFormas {
    @Override


    public Iforma criarForma() {
        return new Retangulo();
    }


}

package FactoryMethodPROF;

public class TestaDesenhista {
    public static void main(String[] args) throws ClassNotFoundException {
        Desenhista desenho = new Desenhista();
        desenho.desenhe(TipoFigura.CIRCULO);

        String classe;
        classe = "FactoryMethodPROF.Circulo";

        Class<Iforma> x = (Class<Iforma>) Class.forName(classe);

        x.descriptorString();


    }
}

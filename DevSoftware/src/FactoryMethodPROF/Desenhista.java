package FactoryMethodPROF;


public class Desenhista {

    public void desenhe(TipoFigura Figura) {


        switch (Figura){

            case CIRCULO : {
                FabricaCirculo fc = new FabricaCirculo();
                Iforma bola = fc.criarForma();
                bola.desenhar();

            break;
            }
            case RETANGULO : {
                FabricaRetangulo fr = new FabricaRetangulo();
                Iforma retang = fr.criarForma();
                retang.desenhar();
            break;
            }
        }



    }

}

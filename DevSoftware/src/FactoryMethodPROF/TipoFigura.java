package FactoryMethodPROF;

public enum TipoFigura {
    CIRCULO("circulo"),
    RETANGULO("retangulo");

    private String descricao;

    TipoFigura(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }



}

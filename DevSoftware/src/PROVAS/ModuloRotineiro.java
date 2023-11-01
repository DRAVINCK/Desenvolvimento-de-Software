package PROVAS;

public class ModuloRotineiro extends Modulo{
    @Override
    public Atendimento criarAtendimento() {
        return new Rotineiro();
    }
}

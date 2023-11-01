package PROVAS;

public class ModuloEmergencia extends Modulo {
    @Override
    public Atendimento criarAtendimento() {
        return new Emergencia();
    }
}

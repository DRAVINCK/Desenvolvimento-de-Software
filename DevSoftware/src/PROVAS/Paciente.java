package PROVAS;

public class Paciente {

    private Atendimento atendimento;

    public Paciente(Modulo modulo) {
        this.atendimento = modulo.criarAtendimento();
    }

    public void notificar() {
        this.atendimento.notificar();
    }
}

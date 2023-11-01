package PROVAS;

public class Emergencia implements Atendimento{
    @Override
    public void notificar() {
        System.out.println("UTI notificada.");
    }
}

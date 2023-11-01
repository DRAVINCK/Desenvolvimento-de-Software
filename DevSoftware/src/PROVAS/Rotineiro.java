package PROVAS;

public class Rotineiro implements Atendimento{
    @Override
    public void notificar() {
        System.out.println("Enfermagem notificada.");
    }
}

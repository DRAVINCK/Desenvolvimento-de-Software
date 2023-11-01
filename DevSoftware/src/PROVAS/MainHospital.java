package PROVAS;

public class MainHospital {

    public static void main(String[] args) {

        Modulo moduloEmergencia = new ModuloEmergencia();
        Modulo moduloRotineiro = new ModuloRotineiro();

        Paciente paciente1 = new Paciente(moduloEmergencia);
        Paciente paciente2 = new Paciente(moduloRotineiro);


        paciente2.notificar();
    }
}

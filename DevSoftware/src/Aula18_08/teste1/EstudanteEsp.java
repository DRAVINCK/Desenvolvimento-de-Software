package Aula18_08.teste1;

import Aula18_08.teste1.Estudante;

import java.util.Objects;

public class EstudanteEsp extends Estudante {

    public String verificaNota(){
        String result = "";
        if (this.Conceito == "a"|| this.Conceito == "b" || this.Conceito == "c"){
            result = "Aprovado";

        }else result = "Reprovado";

        return result;
    }


}

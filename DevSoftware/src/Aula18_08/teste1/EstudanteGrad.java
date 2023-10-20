package Aula18_08.teste1;

import Aula18_08.teste1.Estudante;

public class EstudanteGrad extends Estudante {


    public String verificaNota(){
        String result = "";
        System.out.println(this.Nota);

        if(this.Nota>=6) {
            result = "Aprovado";
        } else if(this.Nota>=4){
            result ="Prova final";
        }
        else result = "Reprovado";

        return result;

    }

}

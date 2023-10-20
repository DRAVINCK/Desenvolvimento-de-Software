package Aula18_08.teste1;

import Aula18_08.teste1.Curso;

public class testeEstudante {
    public static void main(String[] args) {
        Curso c = new Curso();
        EstudanteGrad ed = new EstudanteGrad();
        EstudanteEsp ep = new EstudanteEsp();

        ed.Nota = 2;
        ep.Conceito = "f";

        System.out.println(c.Resultado(ep));
    }
}

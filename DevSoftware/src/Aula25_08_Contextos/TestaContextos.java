package Aula25_08_Contextos;

public class TestaContextos {
    public static void main(String[] args) {

        PrestacaoServicos ps = new PrestacaoServicos(100,40);
        UtilizaContextos utps = new UtilizaContextos(ps);
        ProducaoProdutos pp = new ProducaoProdutos(200,100);
        UtilizaContextos utpp = new UtilizaContextos(pp);

        System.out.println(utpp.calcular());
        System.out.println(utps.calcular());



    }
}

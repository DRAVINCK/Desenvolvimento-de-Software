package solidAula2;

public class teste {
    public static void main(String[] args) {
        cartaoCred cc = new cartaoCred();
        venda venda = new venda();

        cc.Nome = "lucas";
        cc.Numero = "741258";
        cc.DataValidade = "12/02/2023";

        if(venda.ProcessarPagamento(cc)){
            System.out.println("Compra cc confirmada");
        }else System.out.println("Compra ccrejeitada");

        CartaoSenf senf = new CartaoSenf();
        senf.Nome = "lucas";
        senf.Numero = "741258";
        senf.DataValidade = "12/02/2023";

        if(venda.ProcessarPagamento(senf)){
            System.out.println("Compra cc confirmada");
        }else System.out.println("Compra ccrejeitada");



    }

}

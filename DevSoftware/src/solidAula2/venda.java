package solidAula2;

public class venda {

    public double ValorCobrar;
    public boolean ProcessarPagamento(cartaoBase cartao){

        boolean resultado = false;
        if(cartao.validar()){
            return true;
        }

        return resultado;
    }
}

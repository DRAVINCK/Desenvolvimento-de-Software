package solidAula2;

import com.sun.jdi.request.StepRequest;

public abstract class cartaoBase {
    public  String Nome;
    public String Numero;
    public String DataValidade;
    public double ValorCobrado;

    protected boolean ValidarNome(){
        boolean resultado = false;
        if (this.Nome.equalsIgnoreCase("lucas")){
            resultado = true;

        }
        return resultado;
    }

    protected boolean ValidarNumero(){
        boolean resultado = false;
        if (this.Numero.equalsIgnoreCase("741258")){
            resultado = true;
        }
        return resultado;
    }

    protected boolean ValidarData(){
         boolean resultado = false;
        if (this.DataValidade.equalsIgnoreCase("12/02/2023")){
            resultado = true;

        }
        return resultado;
    }

    protected boolean ValidarCobranca(){
        boolean resultado = false;
        if(this.ValorCobrado == 500){
            resultado = true;
        }
        return resultado;
    }

    protected boolean validar(){
        if(ValidarNome() && ValidarNumero() && ValidarData()){
            return true;
        }
        return false;
    }
}

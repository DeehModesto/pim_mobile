package androidpimunip.com.projetofirebase.Model;

import com.google.gson.annotations.SerializedName;

public class ApoliceModel {
    @SerializedName("plano")
    private String plano;
    @SerializedName("validade")
    private String validade;
    @SerializedName("valor")
    private double valor;

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

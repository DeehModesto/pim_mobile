package androidpimunip.com.projetofirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class form_apolice extends AppCompatActivity {
    private EditText mPlano;
    private EditText mValidade;
    private EditText mValor;

    private String plano = Globals.apoliceModel.getPlano();
    private String validade = Globals.apoliceModel.getValidade();
    private String valor = String.valueOf(Globals.apoliceModel.getValor());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_apolice);

        getSupportActionBar().hide();
        this.mPlano = (EditText) findViewById(R.id.editTextTextPersonName2);
        this.mValidade = (EditText) findViewById(R.id.editTextTextPersonName3);
        this.mValor = (EditText) findViewById(R.id.editTextNumber2);

        this.mPlano.setText(String.format("Plano: %s", this.plano));
        this.mValidade.setText(String.format("Validade: %s", this.validade));
        this.mValor.setText(String.format("Valor: R$%s ", this.valor));
    }
}
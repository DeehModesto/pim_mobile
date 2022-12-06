package androidpimunip.com.projetofirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class dados_pessoais extends AppCompatActivity {
    private EditText mNome;
    private EditText mEmail;
    private EditText mDtNascimento;
    private EditText mTelefone;

    private String name = Globals.userModel.getNome();
    private String email = Globals.userModel.getEmail();
    private String telefone = Globals.userModel.getTelefone();
    private String dataNascimento = Globals.userModel.getDtNascimento();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados_pessoais);

        getSupportActionBar().hide();
        this.mNome = (EditText) findViewById(R.id.editTextTextPersonName4);
        this.mEmail = (EditText) findViewById(R.id.editTextTextEmailAddress);
        this.mDtNascimento = (EditText) findViewById(R.id.editTextDate);
        this.mTelefone = (EditText) findViewById(R.id.editTextPhone2);

        this.mNome.setText(String.format("Nome: %s", this.name));
        this.mEmail.setText(String.format("E-mail: %s", this.email));
        this.mDtNascimento.setText(String.format("Data Nascimento: %s", this.dataNascimento));
        this.mTelefone.setText(String.format("Telefone: %s", this.telefone));
    }
}
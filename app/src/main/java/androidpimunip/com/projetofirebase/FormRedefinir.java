package androidpimunip.com.projetofirebase;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormRedefinir extends AppCompatActivity {
    private Button botao;
    private EditText mEmail;
    private EditText mSenha;
    private EditText mConfirmarSenha;
    String email = Globals.userModel.getEmail();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_redefinir);
        getSupportActionBar().hide();
        botao= (Button) findViewById(R.id.bt_redefinir);
        this.mEmail = findViewById(R.id.edit_email);
        this.mSenha = findViewById(R.id.editsenha);
        this.mConfirmarSenha = findViewById(R.id.editTrocasenha);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailEdit = mEmail.getText().toString();
                String senhaEdit = mSenha.getText().toString();
                String confirmSenhaEdit = mConfirmarSenha.getText().toString();
                if(emailEdit.equals(email)){
                    if(senhaEdit.equals(confirmSenhaEdit) && !senhaEdit.trim().equals("") && !senhaEdit.trim().equals("")){
                        Globals.userModel.setSenha(senhaEdit);
                        Intent intent = new Intent(FormRedefinir.this, FormLogin.class);
                        Toast.makeText(getApplicationContext(),"Senha Redefinida com Sucesso",Toast.LENGTH_LONG).show();
                        startActivity(intent);
                    }else{
                        Toast.makeText(getApplicationContext(),"As senhas não são iguais",Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(getApplicationContext(),"E-mail não encontrado",Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
package androidpimunip.com.projetofirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

import androidpimunip.com.projetofirebase.External.GetApolice;
import androidpimunip.com.projetofirebase.External.GetClient;
import androidpimunip.com.projetofirebase.Model.ApoliceModel;
import androidpimunip.com.projetofirebase.Model.UserModel;
import androidpimunip.com.projetofirebase.Retrofit.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FormLogin extends AppCompatActivity {
    private GetClient mGetClient = RetrofitClient.createService(GetClient.class);
    private GetApolice mGetApolice = RetrofitClient.createService(GetApolice.class);
    private TextView text_menu,txt_btn_esqueceu_a_senha;
    private EditText mEmail;
    private EditText mSenha;
    String email;
    String senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);
        getSupportActionBar().hide();
        IniciarComponentes();
        IniciarComponentes1();
        Call<UserModel> cliente =  this.mGetClient.getClient();
        Call<ApoliceModel> apolice =  this.mGetApolice.getApolice();
        this.mEmail = findViewById(R.id.edit_email);
        this.mSenha = findViewById(R.id.edit_senha);

        txt_btn_esqueceu_a_senha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormLogin.this,FormRedefinir.class);
                startActivity(intent);
            }
        });

        text_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailText = mEmail.getText().toString();
                String senhaText = mSenha.getText().toString();
                if(emailText.equals(email) && senhaText.equals(senha)){
                    mEmail.setText("");
                    mSenha.setText("");
                    Intent intent = new Intent(FormLogin.this,FormMenu.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "Usuário não encontrado", Toast.LENGTH_SHORT).show();
                    mEmail.setText("");
                    mSenha.setText("");
                }
            }
        });

        cliente.enqueue(new Callback<UserModel>() {
            @Override
            public void onResponse(Call<UserModel> call, Response<UserModel> response) {
                Globals.userModel = response.body();
                email = Globals.userModel.getEmail();
                senha=  Globals.userModel.getSenha();
                Toast.makeText(getApplicationContext(), "Cliente request!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<UserModel> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        apolice.enqueue(new Callback<ApoliceModel>() {
            @Override
            public void onResponse(Call<ApoliceModel> call, Response<ApoliceModel> response) {
                Globals.apoliceModel = response.body();
                Toast.makeText(getApplicationContext(), "Apolice request!", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onFailure(Call<ApoliceModel> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void IniciarComponentes () {text_menu = findViewById(R.id.bt_entrar);}
    private void IniciarComponentes1 () {txt_btn_esqueceu_a_senha = findViewById(R.id.bt_esquecer);}
}

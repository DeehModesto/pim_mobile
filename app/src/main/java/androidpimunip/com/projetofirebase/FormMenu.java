package androidpimunip.com.projetofirebase;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FormMenu extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }

    private TextView txt_privacidade,txt_suporte,txt_dados_pessoais,txt_apolice;
    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_menu);
        getSupportActionBar().hide();

        IniciarComponentes();
        IniciarComponentes2();
        IniciarComponentes3();
        IniciarComponentes4();
        this.btnLogout = (Button) findViewById(R.id.btn_logout);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormMenu.this, FormLogin.class);
                startActivity(intent);
            }
        });


        txt_suporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormMenu.this, Suporte.class);
                startActivity(intent);
            }
        });


        txt_privacidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormMenu.this,FormPrivacidade.class);
                startActivity(intent);
            }

        });

        txt_dados_pessoais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormMenu.this,dados_pessoais.class);
                startActivity(intent);
            }

        });

        txt_apolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormMenu.this,form_apolice.class);
                startActivity(intent);
            }

        });

    }

    private void IniciarComponentes () {txt_privacidade = findViewById(R.id.bt_privacidade);}
    private void IniciarComponentes2 () {txt_suporte = findViewById(R.id.bt_suporte);}
    private void IniciarComponentes3 () {txt_dados_pessoais = findViewById(R.id.bt_dadospessoais);}
    private void IniciarComponentes4 () {txt_apolice = findViewById(R.id.bt_apolice);}
}

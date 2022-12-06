package androidpimunip.com.projetofirebase;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button redSenha,botaoVoltar;
    Button bt_entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt_entrar =findViewById(R.id.bt_entrar);

        Toast.makeText(getApplicationContext(),"Senha Redefinida com Sucesso",Toast.LENGTH_LONG).show();

        redSenha=findViewById(R.id.bt_redefinir);

        redSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }

        });

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent redefinir=new Intent(getApplicationContext(),FormRedefinir.class);
                startActivity(redefinir);
            }
        });

    }

    public void teste(){

    }
}
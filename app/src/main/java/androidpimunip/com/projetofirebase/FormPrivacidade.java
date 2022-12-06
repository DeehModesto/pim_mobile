package androidpimunip.com.projetofirebase;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class FormPrivacidade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacidade);

        getSupportActionBar().hide();
    }
}
package br.com.spotfree.spotfree.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import br.com.spotfree.spotfree.R;

/**
 * Created by re_ja on 15/03/2018.
 */

public class LoginActivity extends Activity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(LoginActivity.this, ListaMusicasActivity.class);
                startActivity(i);

            }
        });
    }
}

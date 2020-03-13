package com.projetobilac.miniquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RespostaCertaActivity extends AppCompatActivity {

    private Context context = RespostaCertaActivity.this;
    private Button btnRetornarMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta_certa);

        btnRetornarMain = findViewById(R.id.res_cer_btn_retornar_main);
        btnRetornarMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(context, QuizActivity.class);
        startActivity(intent);
        finish();
    }
}

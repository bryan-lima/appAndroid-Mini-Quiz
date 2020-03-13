package com.projetobilac.miniquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizActivity extends AppCompatActivity {

    private Context context = QuizActivity.this;
    private Button btnOpcao1, btnOpcao2, btnOpcao3, btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        btnOpcao1 = findViewById(R.id.qui_btn_opcao_1);
        btnOpcao2 = findViewById(R.id.qui_btn_opcao_2);
        btnOpcao3 = findViewById(R.id.qui_btn_opcao_3);
        btnVoltar = findViewById(R.id.qui_btn_voltar);

        btnOpcao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, RespostaErradaActivity.class);
                startActivity(intent);
            }
        });

        btnOpcao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, RespostaCertaActivity.class);
                startActivity(intent);
            }
        });

        btnOpcao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, RespostaErradaActivity.class);
                startActivity(intent);
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
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
        Intent intent = new Intent(context, MainActivity.class);
        startActivity(intent);
        finish();
    }
}

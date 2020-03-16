package com.projetobilac.miniquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class RespostaErradaActivity extends AppCompatActivity {

    private Context context = RespostaErradaActivity.this;
    private Button btnVoltar;
    private ImageView gifRespErrada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta_errada);

        gifRespErrada = findViewById(R.id.res_err_img_gif);

        Glide.with(this).load(R.drawable.gif_resp_errada).into(gifRespErrada);

        btnVoltar = findViewById(R.id.res_err_btn_tentar_novamente);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, QuizActivity.class);
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

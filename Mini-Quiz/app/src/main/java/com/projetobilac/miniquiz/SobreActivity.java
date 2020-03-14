package com.projetobilac.miniquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SobreActivity extends AppCompatActivity {

    private Context context = SobreActivity.this;
    private TextView linkRepositorio;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        btnVoltar = findViewById(R.id.sob_btn_voltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        linkRepositorio = findViewById(R.id.sob_txt_link_repositorio);
        linkRepositorio.setText(Html.fromHtml("<a href=\'https://github.com/bryan-lima/appAndroid-Mini-Quiz\'>github.com/bryan-lima/appAndroid-Mini-Quiz</a>"));
        linkRepositorio.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

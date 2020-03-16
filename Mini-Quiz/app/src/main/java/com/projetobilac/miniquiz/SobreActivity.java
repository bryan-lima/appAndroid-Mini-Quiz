package com.projetobilac.miniquiz;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
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

        configuraNavBar();

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

    private void configuraNavBar() {
        setTitle("Sobre");
        ActionBar actionBar = getSupportActionBar(); // instancia objt da BAR
        actionBar.setDisplayHomeAsUpEnabled(true); // exibe o ícone
        actionBar.setHomeButtonEnabled(true); // habilita click
    }

    // Para inserir a ação e selecionar para qual página voltar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
                finish();
            default:
                break;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(context, MainActivity.class);
        startActivity(intent);
        finish();
    }
}

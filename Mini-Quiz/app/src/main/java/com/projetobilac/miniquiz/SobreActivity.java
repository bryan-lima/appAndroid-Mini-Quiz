package com.projetobilac.miniquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class SobreActivity extends AppCompatActivity {

    private TextView linkRepositorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        linkRepositorio = findViewById(R.id.sob_txt_link_repositorio);
        linkRepositorio.setText(Html.fromHtml("<a href=\'https://github.com/bryan-lima/appAndroid-Mini-Quiz\'>github.com/bryan-lima/appAndroid-Mini-Quiz</a>"));
    }
}

package com.projetobilac.miniquiz;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

public class RespostaCertaActivity extends AppCompatActivity {

    private Context context = RespostaCertaActivity.this;
    private Button btnRetornarMain;
    private ImageView gifRespCerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta_certa);

        configuraNavBar();

        gifRespCerta = findViewById(R.id.res_cer_img_gif);

        Glide.with(this)
                .asGif()
                .load(R.drawable.gif_resp_certa)
                .listener(new RequestListener<GifDrawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<GifDrawable> target, boolean isFirstResource) {
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(GifDrawable resource, Object model, Target<GifDrawable> target, DataSource dataSource, boolean isFirstResource) {
                        resource.setLoopCount(1);
                        resource.registerAnimationCallback(new Animatable2Compat.AnimationCallback() {
                            @Override
                            public void onAnimationEnd(Drawable drawable) {
                                //do whatever after specified number of loops complete
                            }
                        });
                        return false;
                    }}).into(gifRespCerta);

        btnRetornarMain = findViewById(R.id.res_cer_btn_voltar_home);
        btnRetornarMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void configuraNavBar() {
        setTitle("Acertou!");
        ActionBar actionBar = getSupportActionBar(); // instancia objt da BAR
        actionBar.setDisplayHomeAsUpEnabled(true); // exibe o ícone
        actionBar.setHomeButtonEnabled(true); // habilita click
    }

    // Para inserir a ação e selecionar para qual página voltar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent intent = new Intent(context, QuizActivity.class);
                startActivity(intent);
                finish();
            default:
                break;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(context, QuizActivity.class);
        startActivity(intent);
        finish();
    }
}

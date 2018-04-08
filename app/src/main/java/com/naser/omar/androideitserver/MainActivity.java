package com.naser.omar.androideitserver;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.naser.omar.androideitserver.R;
import com.naser.omar.androideitserver.SingIn;

public class MainActivity extends AppCompatActivity {


    Button btnSingin;
    TextView txtslogan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSingin=(Button)findViewById(R.id.btnSingnUp);
        txtslogan=(TextView)findViewById(R.id.txtSlogan);


        Typeface face =Typeface.createFromAsset(getAssets(),"fonts/NABILA.TTF");
        txtslogan.setTypeface(face);
    }

    public void Singin(View view) {
        Intent Singin =new Intent(this,SingIn.class);
        startActivity(Singin);
    }
    public void Singup(View view) {
        Intent SingUp =new Intent(this,SingUp.class);
        startActivity(SingUp);
    }
}

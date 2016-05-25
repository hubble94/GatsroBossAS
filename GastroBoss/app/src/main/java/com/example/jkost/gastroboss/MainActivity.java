package com.example.jkost.gastroboss;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity{
    private Button btn;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        btn = (Button)findViewById(R.id.angry_btn);
        txt = (TextView)findViewById(R.id.Home_registrieren);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg_Activity = new Intent(getApplicationContext(),Registrieren.class);
                startActivity(reg_Activity);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suche_Activity = new Intent(getApplicationContext(),Suche.class);
                startActivity(suche_Activity);
            }
        });

    }
}

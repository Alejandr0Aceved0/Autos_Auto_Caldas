package com.example.autos_auto_caldas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Servicios extends AppCompatActivity {

    private Button mbtn_volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);

        mbtn_volver      = (Button) findViewById(R.id.BTN_volver);
        mbtn_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Servicios.this, MenuPrincipal.class);
                startActivity(intent);
                finish();
                return;

            }
        });
    }
}

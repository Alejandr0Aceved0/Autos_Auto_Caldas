package com.example.autos_auto_caldas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuPrincipal extends AppCompatActivity {

    private Button mbtn_Ingresar_servicios, mbtn_Ingresar_quienes_somos, mbtn_Ingresar_estrena_usado, mbtn_Ingresar_vender_carro;

 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);

     mbtn_Ingresar_quienes_somos    = (Button) findViewById(R.id.BTN_quienes_somos);
     mbtn_Ingresar_servicios        = (Button) findViewById(R.id.BTN_servicios);
     mbtn_Ingresar_estrena_usado    = (Button) findViewById(R.id.btn_estrena_usado);
     mbtn_Ingresar_vender_carro     = (Button) findViewById(R.id.btn_vender_carro);

     mbtn_Ingresar_quienes_somos.setOnClickListener(new View.OnClickListener(){

         @Override
         public void onClick(View view) {

             Intent intent = new Intent(MenuPrincipal.this, QuienesSomos.class);

             startActivity(intent);

             finish();
         }
     });


     mbtn_Ingresar_servicios.setOnClickListener(new View.OnClickListener(){

         @Override
         public void onClick(View view) {

             Intent intent = new Intent(MenuPrincipal.this, Servicios.class);
             startActivity(intent);
             finish();
         }
     });

     mbtn_Ingresar_vender_carro.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(MenuPrincipal.this, VenderVehiculo.class);
             startActivity(intent);
             finish();
         }
     });

     mbtn_Ingresar_estrena_usado.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(MenuPrincipal.this, CarrosVentas.class);
             startActivity(intent);
             finish();
         }
     });
   }
}
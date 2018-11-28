package com.example.matinal.fragment05;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Fragment05 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment05);

    }

    public void mostrarDialogo(View view) {

        FragmentManager FM = getFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();

        Fragmento1 preferencias = new Fragmento1();
        FT.add(R.id.contenedor, preferencias).commit();
    }
}





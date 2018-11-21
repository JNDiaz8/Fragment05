package com.example.matinal.fragment05;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fragment05 extends AppCompatActivity {

    private Button btnMostrarPreferencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment05);



    }
    public void llamada (View view){
        FragmentManager FM = getFragmentManager();
        FragmentTransaction FT = FM.beginTransaction();

        Fragmento1 preferencias = new Fragmento1();
        FT.replace(android.R.id.content, preferencias);
        FT.commit();

    }
}





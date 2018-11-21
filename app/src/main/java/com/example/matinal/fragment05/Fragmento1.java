package com.example.matinal.fragment05;

import android.os.Bundle;
import android.preference.PreferenceFragment;


public class Fragmento1 extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);
    }

}

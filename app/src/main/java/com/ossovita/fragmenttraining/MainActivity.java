package com.ossovita.fragmenttraining;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_ders);

        ll = findViewById(R.id.linearlayout);
        fragment_a fragment_a = new fragment_a();
        fragment_b fragment_b = new fragment_b();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.linearlayout,fragment_a,"FragmentA");
        transaction.add(R.id.linearlayout,fragment_b,"FragmentB");
        transaction.remove(fragment_a);
        transaction.remove(fragment_b);
        transaction.commit();
    }
}
package com.ossovita.fragmenttraining;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout ll;
    Button buttonSil,buttonEkle;
    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction transaction = fragmentManager.beginTransaction();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_ders);
        buttonEkle = findViewById(R.id.buttonEkle);
        buttonSil = findViewById(R.id.buttonSil);
        ll = findViewById(R.id.linearlayout);
        fragment_a fragment_a = new fragment_a();
        fragment_b fragment_b = new fragment_b();

        transaction.add(R.id.linearlayout,fragment_a,"FragmentA");
        transaction.add(R.id.linearlayout,fragment_b,"FragmentB");
        transaction.commit();

        buttonEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transaction = fragmentManager.beginTransaction();
                transaction = transaction.add(R.id.linearlayout,fragment_b,"FragmentB");
                transaction.commit();
            }
        });

        buttonSil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               transaction = fragmentManager.beginTransaction();
               transaction.remove(fragment_b);
               transaction.commit();
            }
        });



    }
}
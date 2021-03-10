package com.ossovita.fragmenttraining;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    String siteAddress;
    FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_ders);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.edittext);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                siteAddress = editText.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("siteAddress",siteAddress);
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                fragment_a fragment_a = new fragment_a();
                fragment_a.setArguments(bundle);
                transaction.add(R.id.framelayout,fragment_a,"fragmentA").commit() ;


            }
        });


    }
}
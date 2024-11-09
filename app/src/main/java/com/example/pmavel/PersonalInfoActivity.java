package com.example.pmavel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PersonalInfoActivity extends AppCompatActivity {
    private Button oBtnUpisi;
    private String sIme;
    private EditText oIme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);

        oIme = (EditText) findViewById(R.id.etIme);
        oBtnUpisi = (Button) findViewById(R.id.btnUpisi);

        oBtnUpisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sIme = oIme.getText().toString();

                if (sIme.length() == 0) {
                    Toast.makeText(PersonalInfoActivity.this, "String je prazan", Toast.LENGTH_SHORT).show();
                }

                else {
                    Intent oUpisiIme = new Intent(getApplicationContext(), StudentInfoActivity.class);
                    oUpisiIme.putExtra("ime", sIme);
                    startActivity(oUpisiIme);
                }


            }
        });
    }
}



package com.example.pmavel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class StudentInfoActivity extends AppCompatActivity {
private String sIme;
private String sPredmet;
private AutoCompleteTextView aPredmet;
private Button oButton;

    @Override
    public void onBackPressed()
    {

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        final Bundle oExtras = getIntent().getExtras();
        sIme = oExtras.getString("ime");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, PREDMETI);
        AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.actvText);
        textView.setAdapter(adapter);

        aPredmet = (AutoCompleteTextView) findViewById(R.id.actvText);
        oButton = (Button) findViewById(R.id.btnDalje);

        oButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sPredmet = aPredmet.getText().toString();
                Intent oSummary = new Intent(getApplicationContext(),SummaryActivity.class);
                oSummary.putExtra("ime",sIme);
                oSummary.putExtra("predmet",sPredmet);
                startActivity(oSummary);
            }
        });
    }

    private static final String[] PREDMETI = new String[] {
            "Programiranje", "Matematika", "PMA", "Eng", "Xd"
    };







}
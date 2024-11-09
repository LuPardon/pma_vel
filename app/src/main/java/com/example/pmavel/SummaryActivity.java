package com.example.pmavel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SummaryActivity extends AppCompatActivity {
    private String sIme;
    private String sPredmet;

    private TextView oIme;
    private TextView oPredmet;

    private Button oButton;

    @Override
    public void onBackPressed()
    {

    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        final Bundle oExtras = getIntent().getExtras();
        sIme = oExtras.getString("ime");
        sPredmet = oExtras.getString("predmet");

        oIme = (TextView) findViewById(R.id.tvIme);
        oIme.setText(sIme);

        oPredmet = (TextView) findViewById(R.id.tvPredmet);
        oPredmet.setText(sPredmet);

        oButton = (Button) findViewById(R.id.button);

        oButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oHome = new Intent(getApplicationContext(), PersonalInfoActivity.class);
                startActivity(oHome);
            }
        });


    }
}
package com.example.farmmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class add_material extends AppCompatActivity {
    private int mcounter = 0;
    private Button bt6, bt8;
    private TextView txV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_material);

        bt6 = (Button) findViewById(R.id.button6);
        bt8 = (Button) findViewById(R.id.button8);
        txV = (TextView) findViewById(R.id.textView8);

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter++;
                txV.setText(Integer.toString(mcounter)
                );
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcounter --;
                txV.setText(Integer.toString(mcounter)
                );
            }
        });

    }
}

package com.example.farmmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button, button5, button4, button3, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                openDatabase();
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                openTimeline();
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                openInventory();
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                openInputData();
            }
        });


    }

    public void openDatabase() {
        Intent intent = new Intent(this, Activity5.class);
        startActivity(intent);
    }
    public void openTimeline() {
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }
    public void openInventory() {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }
    public void openInputData() {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void open(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://thingspeak.com/channels/977058/charts/1?bgcolor=%23ffffff&color=%23d62020&dynamic=true&results=60&type=line&update=15"));
        startActivity(browserIntent);
    }

}



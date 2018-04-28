package com.example.iamtanya.miwak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView number,family,color,phrase;
    public static final String menu ="Menu";
    public static final Integer num_val=1,fam_val=2,col_val=3,phr_val=4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * toolbar
         */
        Toolbar toolbar = findViewById(R.id.category_toolbar);
        toolbar.setTitle("Category");
        /**
         * text area
         */
        number = findViewById(R.id.number);
        family = findViewById(R.id.family);
        color = findViewById(R.id.color);
        phrase = findViewById(R.id.phrase);
        /**
         * click event
         */
        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numintent =  new Intent(MainActivity.this,category.class);
                numintent.putExtra(menu,num_val);
                startActivity(numintent);
            }
        });
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent famintent =  new Intent(MainActivity.this,category.class);
                famintent.putExtra(menu,fam_val);
                startActivity(famintent);
            }
        });
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colintent =  new Intent(MainActivity.this,category.class);
                colintent.putExtra(menu,col_val);
                startActivity(colintent);
            }
        });
       phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrintent =  new Intent(MainActivity.this,category.class);
                phrintent.putExtra(menu,phr_val);
                startActivity(phrintent);
            }
        });
    }
}

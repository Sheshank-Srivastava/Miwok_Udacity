package com.example.iamtanya.miwak;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

import static com.example.iamtanya.miwak.R.color.color_color;
import static com.example.iamtanya.miwak.R.color.family_color;
import static com.example.iamtanya.miwak.R.color.number_color;
import static com.example.iamtanya.miwak.R.color.phrase_color;

public class category extends AppCompatActivity {
    ArrayList<Word> infoArrayList;
    RecyclerView  recyclerView;
    WordAdapter wordAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Intent intent =getIntent();
        Integer value = intent.getIntExtra("Menu",1);
        infoArrayList = new ArrayList<>();
        infoArrayList = createFakeData(value);

        recyclerView = findViewById(R.id.listarea);

        wordAdapter =new WordAdapter(infoArrayList,this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(wordAdapter);
    }

    @SuppressLint("ResourceAsColor")
    private ArrayList<Word> createFakeData(int value) {
        ArrayList<Word> arrayList = new ArrayList<>();
        Toolbar toolbar =findViewById(R.id.category_toolbar);
        Word model;
        int length;
        int[] image;
        View view = findViewById(R.id.listitem);

        switch (value){
            /**
             *  Number Category
             */
            case  1:
                view.setBackgroundColor(R.color.number_color);
                image=new int[]{
                        R.drawable.number_one,
                        R.drawable.number_two,
                        R.drawable.number_three,
                        R.drawable.number_four,
                        R.drawable.number_five,
                        R.drawable.number_six,
                        R.drawable.number_seven,
                        R.drawable.number_eight,
                        R.drawable.number_nine,
                        R.drawable.number_ten,
                };
                toolbar.setTitle("Number");
                length = getResources().getStringArray(R.array.default_number).length;
                 for(int i=0;i<length;i++){
                     model = new Word(
                             getResources().getStringArray(R.array.default_number)[i],
                             getResources().getStringArray(R.array.miwok_number)[i],
                             image[i],
                             R.color.number_color
                     );
                     arrayList.add(model);
                 }

                break;
            case  2:
                image=new int[]{
                        R.drawable.family_father,
                        R.drawable.family_mother,
                        R.drawable.family_son,
                        R.drawable.family_daughter,
                        R.drawable.family_older_brother,
                        R.drawable.family_younger_brother,
                        R.drawable.family_older_sister,
                        R.drawable.family_younger_sister,
                        R.drawable.family_grandmother,
                        R.drawable.family_grandfather,
                };
                toolbar.setTitle("Family Member");
                length = getResources().getStringArray(R.array.default_family).length;
                for(int i=0;i<length;i++){
                    model = new Word(
                            getResources().getStringArray(R.array.default_family)[i],
                            getResources().getStringArray(R.array.miwok_family)[i],
                            image[i],
                            R.color.family_color
                    );
                    arrayList.add(model);
                }

                break;
            case  3:
                image=new int[]{
                        R.drawable.color_red,
                        R.drawable.color_green,
                        R.drawable.color_brown,
                        R.drawable.color_gray,
                        R.drawable.color_black,
                        R.drawable.color_white,
                        R.drawable.color_dusty_yellow,
                        R.drawable.color_mustard_yellow

                };
                toolbar.setTitle("Color");
                length = getResources().getStringArray(R.array.default_color).length;
                for(int i=0;i<length;i++){
                    model = new Word(
                            getResources().getStringArray(R.array.default_color)[i],
                            getResources().getStringArray(R.array.miwok_color)[i],
                            image[i],
                            R.color.color_color
                    );
                    arrayList.add(model);
                }

                break;
            case  4:
                toolbar.setTitle("Phrase");
                length = getResources().getStringArray(R.array.default_phrase).length;
                for(int i=0;i<length;i++){
                    model = new Word(
                            getResources().getStringArray(R.array.default_phrase)[i],
                            getResources().getStringArray(R.array.miwok_phrase)[i],
                            R.color.phrase_color
                    );
                    arrayList.add(model);
                }

                break;
        }
        return arrayList;
    }

}

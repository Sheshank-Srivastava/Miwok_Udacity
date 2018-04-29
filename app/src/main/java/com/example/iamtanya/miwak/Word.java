package com.example.iamtanya.miwak;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;

/**
 * Created by iamtanya on 4/24/2018.
 */

public class Word  {
    private static String color;
    private String default_word;
    private String  miwok_word;
    private int imageView;


    public Word(String default_word, String miwok_word,int imageView,String color) {
        this.default_word = default_word;
        this.miwok_word = miwok_word;
        this.imageView = imageView;
        this.color = color;
    }


   public Word(String default_word, String miwok_word,String color) {
        this.default_word = default_word;
        this.miwok_word = miwok_word;
        this.color = color;
   }

    public void setDefault_word(String default_word) {
        this.default_word = default_word;
    }

    public void setMiwok_word(String miwok_word) {
        this.miwok_word = miwok_word;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }


    public String getDefault_word() {
        return default_word;
    }

    public String getMiwok_word() {
        return miwok_word;
    }

    public int getImageView() {
        return imageView;
    }

    public static String getColor() {
        return color;
    }
}

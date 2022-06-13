package com.example.emojiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.vanniktech.emoji.EmojiPopup;

public class MainActivity extends AppCompatActivity {

    ImageView imageView, text;
    EditText editText;
    TextView textView;
    String txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.emojibtn);
        editText = findViewById(R.id.emoji);
//        text = findViewById(R.id.text1);
//        textView = findViewById(R.id.textview);



        EmojiPopup emojiPopup = EmojiPopup.Builder.fromRootView(findViewById(R.id.rootview1) ).build(editText);


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Emojifrgmnt emojifrgmnt = new Emojifrgmnt();
//                emojifrgmnt.show(getSupportFragmentManager(), emojifrgmnt.getTag());
                emojiPopup.toggle();

                imageView.setVisibility(View.GONE);
            }
        });

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                emojiPopup.toggle();

                txt = editText.getText().toString();
                textView.setText(txt);
                textView.setTextColor(Color.WHITE);


            }
        });

    }

    @Override
    public void onBackPressed() {
        imageView.setVisibility(View.VISIBLE);

    }
}
package com.example.emojiapp;

import static android.view.Gravity.CENTER_HORIZONTAL;
import static android.view.Gravity.CENTER_VERTICAL;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.DragEvent;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.vanniktech.emoji.EmojiPopup;

public class MainActivity2 extends AppCompatActivity {

    EditText multilineTxt;
    Button bold, italic, underline, background;
    ImageView left, center, right, emoji;
    LinearLayout layout , fontlayout, alligmnt, blditlic;
    TextView txt, font0, font1, font2, font3, font4, font5, font6, font7;

    private int xDelta;
    private int yDelta;


    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        layout = findViewById(R.id.layouttxt);
//        multilineTxt  = findViewById(R.id.editTextTextMultiLine);
        bold = findViewById(R.id.boldBtn);
        italic = findViewById(R.id.italicBtn);
        underline = findViewById(R.id.underlineBtn);
        left = findViewById(R.id.leftBtn);
       // background = findViewById(R.id.background);
        center = findViewById(R.id.centerBtn);
        right = findViewById(R.id.rightBtn);
        font0 = findViewById(R.id.font0);
        font1 = findViewById(R.id.font1);
        font2 = findViewById(R.id.font2);
        font3 = findViewById(R.id.font3);
        font4 = findViewById(R.id.font4);
        font5 = findViewById(R.id.font5);
        font6 = findViewById(R.id.font6);
        font7 = findViewById(R.id.font7);
        txt = findViewById(R.id.background);
        fontlayout = findViewById(R.id.fontlayout);
        emoji = findViewById(R.id.emoji);
        alligmnt = findViewById(R.id.alligmnt);
        blditlic = findViewById(R.id.blditlic);

        EditText editText = new EditText(MainActivity2.this);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setBackground(getDrawable(R.drawable.border));

                params.gravity = Gravity.CENTER_VERTICAL | CENTER_HORIZONTAL;
                editText.setLayoutParams(params);
                editText.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                editText.setHint("Text");
                //editText.setText("SAHIL DOIIIIIIIIII");
                editText.setTextSize(30f);
                // editText.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
                layout.addView(editText);
                fontlayout.setVisibility(View.VISIBLE);
                emoji.setVisibility(View.VISIBLE);
                alligmnt.setVisibility(View.VISIBLE);
                blditlic.setVisibility(View.VISIBLE);
                layout.setEnabled(false);
            }
        });


//        background.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
////                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
////                editText.setLayoutParams(params);
//                editText.setBackground(getDrawable(R.drawable.bg));
//            }
//        });


        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {


            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if(editText != null){

                    txt.setText(editText.getText().toString());
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        EmojiPopup emojiPopup = EmojiPopup.Builder.fromRootView(findViewById(R.id.relativelayout) ).build(editText);

        emoji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                emojiPopup.toggle();
            }
        });

        font0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/default.ttf");
                editText.setTypeface(tf);
            }
        });

        font1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Abel-Regular.ttf");
                editText.setTypeface(tf);
            }
        });

        font2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/IndieFlower-Regular.ttf");
                editText.setTypeface(tf);
            }
        });

        font3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/PermanentMarker-Regular.ttf");
                editText.setTypeface(tf);
            }
        });

        font4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Macondo-Regular.ttf");
                editText.setTypeface(tf);
            }
        });

        font5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/CormorantGaramond-Regular.ttf");
                editText.setTypeface(tf);
            }
        });

        font6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/OleoScriptSwashCaps-Regular.ttf");
                editText.setTypeface(tf);
            }
        });

        font7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Satisfy-Regular.ttf");
                editText.setTypeface(tf);
            }
        });


        bold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spannable spannableString = new SpannableStringBuilder(editText.getText());
                spannableString.setSpan(new StyleSpan(Typeface.BOLD), editText.getSelectionStart(), editText.getSelectionEnd(), 0);
                editText.setText(spannableString);

            }
        });


        italic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spannable spannableString = new SpannableStringBuilder(editText.getText());
                spannableString.setSpan(new StyleSpan(Typeface.ITALIC), editText.getSelectionStart(), editText.getSelectionEnd(), 0);
                editText.setText(spannableString);
            }
        });


        underline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Spannable spannableString = new SpannableStringBuilder(editText.getText());
                spannableString.setSpan(new UnderlineSpan(), editText.getSelectionStart(), editText.getSelectionEnd(), 0);
                editText.setText(spannableString);
            }
        });


        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                left.setVisibility(View.GONE);
                right.setVisibility(View.VISIBLE);


                editText.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_END);
                params.gravity = Gravity.RIGHT | CENTER_VERTICAL;
                editText.setLayoutParams(params);
                Spannable spannableString = new SpannableStringBuilder(editText.getText());
                editText.setText(spannableString);

//                params.gravity = Gravity.LEFT | CENTER_VERTICAL;
//                editText.setLayoutParams(params);
//                Spannable spannableString = new SpannableStringBuilder(editText.getText());
//                editText.setText(spannableString);


            }
        });

        center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                left.setVisibility(View.VISIBLE);
                center.setVisibility(View.GONE);

                editText.setTextAlignment(View.TEXT_ALIGNMENT_VIEW_START);
                params.gravity = Gravity.LEFT | CENTER_VERTICAL;
                editText.setLayoutParams(params);
                Spannable spannableString = new SpannableStringBuilder(editText.getText());
                editText.setText(spannableString);
//                params.gravity = Gravity.CENTER_VERTICAL | CENTER_HORIZONTAL;
//                editText.setLayoutParams(params);
//                Spannable spannableString = new SpannableStringBuilder(editText.getText());
//                editText.setText(spannableString);

            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                right.setVisibility(View.GONE);
                center.setVisibility(View.VISIBLE);

                editText.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                params.gravity = Gravity.CENTER_VERTICAL | CENTER_HORIZONTAL;
                editText.setLayoutParams(params);
                Spannable spannableString = new SpannableStringBuilder(editText.getText());
                editText.setText(spannableString);

//                params.gravity = Gravity.RIGHT| CENTER_VERTICAL;
//                editText.setLayoutParams(params);
//                Spannable spannableString = new SpannableStringBuilder(editText.getText());
//                editText.setText(spannableString);


            }
        });

        //move text on screen


//        editText.setOnDragListener(new View.OnDragListener() {
//            @Override
//            public boolean onDrag(View view, DragEvent dragEvent) {
//
//                final int x = (int) dragEvent.getX();
//                final int y = (int) dragEvent.getY();
//
//                switch (dragEvent.getAction() & DragEvent.ACTION_DRAG_STARTED) {
//
//                    case DragEvent.ACTION_DRAG_ENTERED:
//                        LinearLayout.LayoutParams lParams = (LinearLayout.LayoutParams)
//                                view.getLayoutParams();
//
//                        xDelta = x - lParams.leftMargin;
//                        yDelta = y - lParams.topMargin;
//                        break;
//
//                    case DragEvent.ACTION_DROP:
//                        Toast.makeText(MainActivity2.this,
//                                "thanks for new location!", Toast.LENGTH_SHORT)
//                                .show();
//                        break;
//
//                    case DragEvent.ACTION_DRAG_EXITED:
//                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view
//                                .getLayoutParams();
//                        layoutParams.leftMargin = x - xDelta;
//                        layoutParams.topMargin = y - yDelta;
//                        layoutParams.rightMargin = 0;
//                        layoutParams.bottomMargin = 0;
//                        view.setLayoutParams(layoutParams);
//                        break;
//                }
//                layout.invalidate();
//                return true;
//
//            }
//        });

//
//        editText.setOnTouchListener(onTouchListener());
//    }
//
//    private View.OnTouchListener onTouchListener() {
//            return new View.OnTouchListener() {
//
//                @SuppressLint("ClickableViewAccessibility")
//                @Override
//                public boolean onTouch(View view, MotionEvent event) {
//
//                    final int x = (int) event.getRawX();
//                    final int y = (int) event.getRawY();
//
//                    switch (event.getAction() & MotionEvent.ACTION_MASK) {
//
//                        case MotionEvent.ACTION_DOWN:
//                            LinearLayout.LayoutParams lParams = (LinearLayout.LayoutParams)
//                                    view.getLayoutParams();
//
//                            xDelta = x - lParams.leftMargin;
//                            yDelta = y - lParams.topMargin;
//                            break;
//
//                        case MotionEvent.ACTION_UP:
//                            Toast.makeText(MainActivity2.this,
//                                    "thanks for new location!", Toast.LENGTH_SHORT)
//                                    .show();
//                            break;
//
//                        case MotionEvent.ACTION_MOVE:
//                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view
//                                    .getLayoutParams();
//                            layoutParams.leftMargin = x - xDelta;
//                            layoutParams.topMargin = y - yDelta;
//                            layoutParams.rightMargin = 0;
//                            layoutParams.bottomMargin = 0;
//                            view.setLayoutParams(layoutParams);
//                            break;
//                    }
//                    layout.invalidate();
//                    return true;
//                }
//            };  //
//

    }


}

//
//    float x,y;
//    float dx,dy;
//
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//
//        if(event.getAction() == MotionEvent.ACTION_DOWN){
//            x = event.getX();
//            y = event.getY();
//        }
//
//        if(event.getAction() == MotionEvent.ACTION_MOVE){
//            dx = event.getX() - x;
//            dy = event.getY() - y;
//
//            background.setX(background.getX() + dx);
//            background.setY(background.getY() + dy);
//
//            x = event.getX();
//            y = event.getY();
//        }
//
//        return super.onTouchEvent(event);
//    }


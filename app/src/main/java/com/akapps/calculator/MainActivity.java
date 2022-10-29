package com.akapps.calculator;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.airbnb.lottie.LottieAnimationView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
   private TextView answerView,getterTextView;
   private Button one,two,three,four,five,six,seven,eight,nine,zero,ac,equal,add,sub,mul,div,dot,mod,DZero;
   RelativeLayout dismod;
   LinearLayout btmmode;
   ImageButton del;
    String process;
    @SuppressLint({"MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answerView = findViewById(R.id.answerview);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        DZero = findViewById(R.id.doubleZero);
        dot = findViewById(R.id.dot);
        div = findViewById(R.id.div);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        ac = findViewById(R.id.ac);
        equal = findViewById(R.id.equal);
        mod = findViewById(R.id.mod);
        del = findViewById(R.id.delete);
        dismod = findViewById(R.id.viewlayout);
        btmmode = findViewById(R.id.layoutbutton);
        getterTextView = findViewById(R.id.gettextView);
        DZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exceedLength();
                process = getterTextView.getText().toString();
                getterTextView.setText(process + "00");
            }
        });


        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String poped;
                poped = getterTextView.getText().toString();
                if(!poped.isEmpty()) {
                    poped = poped.substring(0, poped.length() - 1);
                    getterTextView.setText(poped);
                }
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getterTextView.setText("");
                getterTextView.setText("");
                answerView.setText("0");
                answerView.setTextSize(TypedValue.COMPLEX_UNIT_SP,30);
                answerView.setTextColor(Color.parseColor("#B8B5B5"));
                getterTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                getterTextView.setTextColor(Color.parseColor("#FFFFFF"));
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exceedLength();
                process = getterTextView.getText().toString();
                getterTextView.setText(process + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exceedLength();
                process = getterTextView.getText().toString();
                getterTextView.setText(process + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exceedLength();

                process = getterTextView.getText().toString();
                getterTextView.setText(process + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exceedLength();
                process = getterTextView.getText().toString();
                getterTextView.setText(process + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exceedLength();
                process = getterTextView.getText().toString();
                getterTextView.setText(process + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exceedLength();
                process = getterTextView.getText().toString();
                getterTextView.setText(process + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exceedLength();
                process = getterTextView.getText().toString();
                getterTextView.setText(process + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exceedLength();
                process = getterTextView.getText().toString();
                getterTextView.setText(process + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exceedLength();
                process = getterTextView.getText().toString();
                getterTextView.setText(process + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exceedLength();
                process = getterTextView.getText().toString();
                getterTextView.setText(process + "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exceedLength();
                process = getterTextView.getText().toString();
                getterTextView.setText(process + "0");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exceedLength();

                process = getterTextView.getText().toString();
                getterTextView.setText(process + "+");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exceedLength();
                process = getterTextView.getText().toString();
                getterTextView.setText(process + "-");
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exceedLength();
                process = getterTextView.getText().toString();
                getterTextView.setText(process + "×");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exceedLength();
                process = getterTextView.getText().toString();
                getterTextView.setText(process + "÷");
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exceedLength();
                process = getterTextView.getText().toString();
                getterTextView.setText(process + ".");
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exceedLength();
                process = getterTextView.getText().toString();
                getterTextView.setText(process + "%");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getterTextView.setTextColor(Color.parseColor("#B8B5B5"));
                answerView.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                answerView.setTextColor(Color.parseColor("#FFFFFF"));
                process = getterTextView.getText().toString();

                process = process.replaceAll("×", "*");
                process = process.replaceAll("%",  "/100");
                process = process.replaceAll("÷","/");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult = "";

                try {
                    Scriptable scriptable = rhino.initStandardObjects();
                    finalResult = rhino.evaluateString(scriptable,process,"javascript",1,null).toString();
                    finalAnswerView(Double.parseDouble(finalResult));
                }catch (Exception e){
                   answerView.setText("Error! Check the Expression");
                    answerView.setTextSize(TypedValue.COMPLEX_UNIT_SP,30);
                    answerView.setTextColor(Color.parseColor("#B8B5B5"));
                    getterTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP,50);
                    getterTextView.setTextColor(Color.parseColor("#FFFFFF"));
                }

            }
        });

    }
    private void exceedLength() {
        if (getterTextView.getText().toString().length() > 10) {
            getterTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        }
    }
    private void finalAnswerView(double finalResult){
        int num ;
        num = (int) finalResult;
        if(num == finalResult){
            answerView.setText( num+"");
        }
        else{
            answerView.setText(finalResult+"");
        }
    }

}
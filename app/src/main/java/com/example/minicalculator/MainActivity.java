  package com.example.minicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

  public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnMul,btnDivide,btnClear,btnSub,btnAdd,btnDot;
    Button btnEqual ;
    EditText ed1 ;
    float res1 , res2 ;
    boolean Add, Sub, Mul, Div ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button)findViewById(R.id.but0);
        btn1 = (Button)findViewById(R.id.but1);
        btn2 = (Button)findViewById(R.id.but2);
        btn3 = (Button)findViewById(R.id.but3);
        btn4 = (Button)findViewById(R.id.but4);
        btn5 = (Button)findViewById(R.id.but5);
        btn6 = (Button)findViewById(R.id.but6);
        btn7 = (Button)findViewById(R.id.but7);
        btn8 = (Button)findViewById(R.id.but8);
        btn9 = (Button)findViewById(R.id.but9);
        btnAdd = (Button)findViewById(R.id.butadd);
        btnSub = (Button)findViewById(R.id.butsub);
        btnDivide = (Button)findViewById(R.id.butdivide);
        btnMul = (Button)findViewById(R.id.butmulti);
        btnDot = (Button)findViewById(R.id.butdot);
        btnClear = (Button)findViewById(R.id.butclear);
        btnEqual = (Button)findViewById(R.id.butequal);
        ed1 = (EditText)findViewById(R.id.editText);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "0");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + ".");
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null){
                    ed1.setText("");
                }
                else {
                    res1 = Float.parseFloat(ed1.getText()+ "");
                    Add = true ;
                    ed1.setText(null);
                }

            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null){
                    ed1.setText("");
                }
                else {
                    res1 = Float.parseFloat(ed1.getText()+ "");
                    Mul = true ;
                    ed1.setText(null);
                }

            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null){
                    ed1.setText("");
                }
                else {
                    res1 = Float.parseFloat(ed1.getText()+ "");
                    Sub = true ;
                    ed1.setText(null);
                }

            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null){
                    ed1.setText("");
                }
                else {
                    res1 = Float.parseFloat(ed1.getText()+ "");
                    Div = true ;
                    ed1.setText(null);
                }

            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res2 = Float.parseFloat(ed1.getText()+"");
                 if (Add == true) {
                     ed1.setText(res1 + res2 + "");
                     Add = false;
                 }
                if (Mul == true) {
                    ed1.setText(res1 * res2 + "");
                    Mul = false;
                }
                if (Div == true) {
                    ed1.setText(res1 / res2 + "");
                    Div = false;
                }
                if (Sub == true) {
                    ed1.setText(res1 - res2 + "");
                    Sub = false;
                }
            }
        });


    }
}

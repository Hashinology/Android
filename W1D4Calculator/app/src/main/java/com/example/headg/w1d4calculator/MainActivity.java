package com.example.headg.w1d4calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btZero, btOne, btTwo, btThree, btFour, btFive, btSix, btSeven, btEight, btNine, btAdd, btSub, btDiv, btMult, btEquals, btPoint, btClear;
    EditText ed1;

    float Value1, Value2;
    boolean mAddition, mSubtract, mMultiplication, mDivision ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btZero = (Button) findViewById(R.id.btnZero);
        btOne = (Button) findViewById(R.id.btnOne);
        btTwo = (Button) findViewById(R.id.btnTwo);
        btThree = (Button) findViewById(R.id.btnThree);
        btFour = (Button) findViewById(R.id.btnFour);
        btFive = (Button) findViewById(R.id.btnFive);
        btSix = (Button) findViewById(R.id.btnSix);
        btSeven = (Button) findViewById(R.id.btnSeven);
        btEight = (Button) findViewById(R.id.btnEight);
        btNine = (Button) findViewById(R.id.btnNine);
        btAdd = (Button) findViewById(R.id.btnAddition);
        btSub = (Button) findViewById(R.id.btnSubtract);
        btDiv = (Button) findViewById(R.id.btnDivide);
        btMult = (Button) findViewById(R.id.btnMultiply);
        btEquals = (Button) findViewById(R.id.btnEquals);
        btPoint = (Button) findViewById(R.id.btnPoint);
        btClear = (Button) findViewById(R.id.btnClear);

        ed1 = (EditText) findViewById(R.id.editText);


        btZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });

        btOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
            }
        });

        btTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });

        btThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });

        btFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });

        btFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });

        btSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });

        btSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });

        btEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });

        btNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });

        btPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+".");
            }
        });

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1 == null){
                    ed1.setText("");
                }else {
                    Value1 = Float.parseFloat(ed1.getText() + "");
                    mAddition = true;
                    ed1.setText(null);
                }
            }
        });

        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(ed1.getText() + "");
                mSubtract = true ;
                ed1.setText(null);
            }
        });

        btMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(ed1.getText() + "");
                mMultiplication = true;
                ed1.setText(null);
            }
        });

        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Value1 = Float.parseFloat(ed1.getText()+"");
                    mDivision = true ;
                    ed1.setText(null);

            }
        });

        btEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value2 = Float.parseFloat(ed1.getText() + "");

                if (mAddition == true){

                    ed1.setText(Value1 + Value2 +"");
                    mAddition=false;
                }


                if (mSubtract == true){
                    ed1.setText(Value1 - Value2 +"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    ed1.setText(Value1 * Value2 + "");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    ed1.setText(Value1 / Value2+"");
                    mDivision=false;
                }
            }
        });

        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });
    }
}

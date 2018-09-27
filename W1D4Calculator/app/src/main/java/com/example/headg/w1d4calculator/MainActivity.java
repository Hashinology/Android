package com.example.headg.w1d4calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btZero, btOne, btTwo, btThree, btFour, btFive, btSix, btSeven, btEight, btNine, btAdd, btSub, btDiv, btMult, btEquals, btPoint, btClear;
    TextView tView;

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

        tView = (TextView) findViewById(R.id.tvNumbers);


        btZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tView.setText(tView.getText()+"0");
            }
        });

        btOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tView.setText(tView.getText()+"1");
            }
        });

        btTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tView.setText(tView.getText()+"2");
            }
        });

        btThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tView.setText(tView.getText()+"3");
            }
        });

        btFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tView.setText(tView.getText()+"4");
            }
        });

        btFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tView.setText(tView.getText()+"5");
            }
        });

        btSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tView.setText(tView.getText()+"6");
            }
        });

        btSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tView.setText(tView.getText()+"7");
            }
        });

        btEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tView.setText(tView.getText()+"8");
            }
        });

        btNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tView.setText(tView.getText()+"9");
            }
        });

        btPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tView.setText(tView.getText()+".");
            }
        });

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tView == null){
                    tView.setText("");
                }else {
                    Value1 = Float.parseFloat(tView.getText() + "");
                    mAddition = true;
                    tView.setText(null);
                }
            }
        });

        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(tView.getText() + "");
                mSubtract = true ;
                tView.setText(null);
            }
        });

        btMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(tView.getText() + "");
                mMultiplication = true;
                tView.setText(null);
            }
        });

        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Value1 = Float.parseFloat(tView.getText()+"");
                    mDivision = true ;
                tView.setText(null);

            }
        });

        btEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value2 = Float.parseFloat(tView.getText() + "");

                if (mAddition == true){

                    tView.setText(Value1 + Value2 +"");
                    mAddition=false;
                }


                if (mSubtract == true){
                    tView.setText(Value1 - Value2 +"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    tView.setText(Value1 * Value2 + "");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    tView.setText(Value1 / Value2+"");
                    mDivision=false;
                }
            }
        });

        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tView.setText("");
            }
        });
    }
}

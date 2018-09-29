package com.example.headg.locationandviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.function.Predicate;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    EditText etNumber1, etNumber2, etPersonName, etPersonGender;
    Button btnName;
    TextView tvName;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        switch (intent.getAction()){
            case "sendingValue":
                String value =








                .getStringExtra(Constants.KEY);
                Toast.makeText(this, value, Toast.LENGTH_SHORT).show();
                break;

            case "sendingPerson":
                StringBuilder sb = new StringBuilder();
                Person person = (Person) intent.getSerializableExtra(Constants.KEY_2);
                sb.append(person.getName());
                sb.append(" ");
                sb.append(person.getGender());
        }

        //binding views
        etNumber1 = findViewById(R.id.etNumber1);
        etNumber2 = findViewById(R.id.etNumber2);
        btnName = findViewById(R.id.btnDoMagic);
        etPersonName = findViewById(R.id.etPersonName);
        etPersonGender = findViewById(R.id.etPersonGender);


        //set on click listeners
        btnName.setOnClickListener(view ->
        {int etNum1 = Integer.parseInt(etNumber1.getText().toString());
            int etNum2 = Integer.parseInt(etNumber2.getText().toString());

            tvName.setText(String.valueOf(etNum1 + etNum2));
            }

          );

        Log.d(TAG, "onCreate: ");




    }



    public void onToSecond(View view) {
        String value = etNumber1.getText().toString();

        Intent intent = new Intent(this, SecondActivity.class);
        intent.setAction("sendingValue");
        intent.putExtra(Constants.KEY, value);
        startActivity(intent);

    }

    public void passPersonToSecond(View view) {

        String personName = etPersonName.getText().toString();
        String personGender = etPersonGender.getText().toString();


        Person person = new Person(personName, personGender);
        Intent intent = new Intent(this, SecondActivity.class);
        intent.setAction("sending|Person");
        intent.putExtra(Constants.KEY_2, person);
        startActivity(intent);

    }
}

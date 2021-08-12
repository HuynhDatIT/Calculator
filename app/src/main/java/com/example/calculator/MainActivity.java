package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    //Khai báo biến
    EditText mEdittext1, mEdittext2;
    TextView mTextviewResult;
    Button mBtnSum, mBtnSubtraction, mBtnMulti, mBtnDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ánh xạ
        mEdittext1 = findViewById(R.id.Edittext1);
        mEdittext2 = findViewById(R.id.Edittext2);
        mTextviewResult = findViewById(R.id.TextviewResult);
        mBtnSum = findViewById(R.id.ButtonSum);
        mBtnSubtraction = findViewById(R.id.ButtonSubtraction);
        mBtnMulti = findViewById(R.id.ButtonMultipcation);
        mBtnDivision = findViewById(R.id.ButtonDivision);

        //Thông báo

 //       Toast.makeText(this, "Xin chao", Toast.LENGTH_SHORT).show();

        //Flow
        mBtnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number1 = mEdittext1.getText().toString();
                String number2 = mEdittext2.getText().toString();

                if(number1.equals("") || number2.equals("")){
                    Toast.makeText(MainActivity.this, "Chưa nhập đủ số", Toast.LENGTH_SHORT).show();
                    return;
                }

                int Result = Integer.parseInt(number1) + Integer.parseInt(number2);

                mTextviewResult.setText("Kết quả = " + Result);
            }
        });

        mBtnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number1 = mEdittext1.getText().toString();
                String number2 = mEdittext2.getText().toString();

                if(number1.equals("") || number2.equals("")){
                    Toast.makeText(MainActivity.this, "Chưa nhập đủ số", Toast.LENGTH_SHORT).show();
                    return;
                }

                int Result = Integer.parseInt(number1) - Integer.parseInt(number2);

                mTextviewResult.setText("Kết quả = " + Result);
            }
        });

        mBtnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number1 = mEdittext1.getText().toString();
                String number2 = mEdittext2.getText().toString();

                if(number1.equals("") || number2.equals("")){
                    Toast.makeText(MainActivity.this, "Chưa nhập đủ số", Toast.LENGTH_SHORT).show();
                    return;
                }

                int Result = Integer.parseInt(number1) * Integer.parseInt(number2);

                mTextviewResult.setText("Kết quả = " + Result);
            }
        });

        mBtnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number1 = mEdittext1.getText().toString();
                String number2 = mEdittext2.getText().toString();

                if(number1.equals("") || number2.equals("")){
                    Toast.makeText(MainActivity.this, "Chưa nhập đủ số", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(number2.equals("0")){
                    Toast.makeText(MainActivity.this, "Mẫu số phải khác 0", Toast.LENGTH_SHORT).show();
                    return;
                }

                Float Result = Float.parseFloat(number1) / Float.parseFloat(number2);

                mTextviewResult.setText("Kết quả = " + Result);
            }
        });

    }
}
package com.umutakpinar.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextNumber;
    EditText editTextNumber2;
    TextView txtResult;
    double number1;
    double number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        txtResult = findViewById(R.id.txtResult);
    }

    public boolean getNumbers(){
        if(editTextNumber.getText().toString().matches("") || editTextNumber2.getText().toString().matches("")){
            txtResult.setTextSize(30);
            txtResult.setText("Please enter only number");
            editTextNumber.setText("");
            editTextNumber2.setText("");
            return false;
        }
        else{
            txtResult.setTextSize(150);
            number1 = Double.parseDouble(editTextNumber.getText().toString());
            number2 = Double.parseDouble(editTextNumber2.getText().toString());
            return true;
        }
    }

    public void setTxtResult(double result){
        this.txtResult.setText(String.valueOf(result));
    }

    public void plus(View view){
        if(getNumbers() == true){
            setTxtResult(number1 + number2);
        }
    }

    public void minus(View view){
        if(getNumbers() == true){

            setTxtResult(number1 - number2);
        }
    }

    public void multiply(View view){
        if(getNumbers() == true){

            setTxtResult(number1 * number2);
        }
    }

    public void divide(View view){
        if(getNumbers() == true){

            setTxtResult(number1 / number2);
        }
    }

}

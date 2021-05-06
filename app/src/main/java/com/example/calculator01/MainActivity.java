package com.example.calculator01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.edit);
    }
    public void num(View v) {
        switch (v.getId()) {
            case R.id.num0:
                editText.append("0");
                break;
            case R.id.num1:
                editText.append("1");
                break;
            case R.id.num2:
                editText.append("2");
                break;
            case R.id.num3:
                editText.append("3");
                break;
            case R.id.num4:
                editText.append("4");
                break;
            case R.id.num5:
                editText.append("5");
                break;
            case R.id.num6:
                editText.append("6");
                break;
            case R.id.num7:
                editText.append("7");
                break;
            case R.id.num8:
                editText.append("8");
                break;
            case R.id.num9:
                editText.append("9");
                break;
        }

    }

    public void clear(View v) {
        editText.setText("");
    }

}
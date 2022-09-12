package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnExit;
    Button btnHello;
    EditText edtName;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapping();
        clickButton();
    }

    private void clickButton() {
        btnExit.setOnClickListener(view -> finish());

        btnHello.setOnClickListener(view -> {
            String res = (edtName.getText().toString().isEmpty()) ?
                    "Name is empty!" : "Hello, " + edtName.getText().toString();

            Toast.makeText(this, res, Toast.LENGTH_SHORT).show();
        });
    }

    private void mapping() {
        btnExit = findViewById(R.id.btn_exit);
        btnHello = findViewById(R.id.btn_hello);
        edtName = findViewById(R.id.edt_name);
    }
}
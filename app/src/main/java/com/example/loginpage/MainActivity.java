package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText tx_email;
    EditText tx_password;
    EditText tx_otp;
    Button bt_login;

    String mail = "musa";
    String pass1 = "12345";
    int otp = 2132;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx_email = findViewById(R.id.tx_email);
        tx_password = findViewById(R.id.tx_password);
        tx_otp = findViewById(R.id.tx_otp);
        bt_login = findViewById(R.id.bt_login);
    }

    @Override
    protected void onResume() {
        super.onResume();
        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = tx_email.getText().toString();
                String password = tx_password.getText().toString();
                int otpCheck = Integer.parseInt(tx_otp.getText().toString());

                if (email.equals(mail) && password.equals(pass1) ){
                    if (otpCheck == otp){
                        Intent intent = new Intent(MainActivity.this,Welcome.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "OTP wrong", Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(MainActivity.this, "Incorrect Credentials please", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
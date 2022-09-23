package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText tx_email;
    EditText tx_password;
    Button bt_login;

    String mail = "musa";
    String pass1 = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx_email = findViewById(R.id.tx_email);
        tx_password = findViewById(R.id.tx_password);
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

                if (email.equals(mail) && password.equals(pass1)){
                    Intent intent = new Intent(MainActivity.this,Welcome.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Incorrect Credentials please", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
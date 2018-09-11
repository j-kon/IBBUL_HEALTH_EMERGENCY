package com.example.jaykon.ibb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    Button btn,btnReg;
    EditText email, password;
    String EMAIL = "mkhafilat30@gmail.com";
    String PASSWORD = "123456";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        btn = findViewById(R.id.login);
        btnReg = findViewById(R.id.register);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().equals(EMAIL) && password.getText().toString().equals(PASSWORD)) {
                    Intent intent = new Intent(Login.this, HealthProfile.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Login.this, "Invalid Password...", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnReg = findViewById(R.id.register);
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, Register.class);
                startActivity(intent);
            }

        });

    }


}

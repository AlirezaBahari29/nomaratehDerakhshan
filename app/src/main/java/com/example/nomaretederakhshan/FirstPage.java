package com.example.nomaretederakhshan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);

        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        Button loginButton = (Button) findViewById(R.id.loginButton);
        TextView welcomeText = (TextView) findViewById(R.id.welcomeText);
        TextView loginText = (TextView) findViewById(R.id.loginText);
        String inputPassword = passwordEditText.getText().toString();
        String passwordStudents = "1385";
        ConstraintLayout layoutPage= (ConstraintLayout) findViewById(R.id.layoutPage);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputPassword = passwordEditText.getText().toString();
                if (inputPassword.equals(passwordStudents)){
                    Toast.makeText(FirstPage.this,"رمز صحیح میباشد.",Toast.LENGTH_LONG).show();
                    startActivity(new Intent(FirstPage.this,SplashScreenStudents.class));

                }

                else{
                    Toast.makeText(FirstPage.this,"رمز اشتباه میباشد",Toast.LENGTH_SHORT).show();
                    passwordEditText.setVisibility(View.INVISIBLE);
                    loginButton.setVisibility(View.INVISIBLE);
                    welcomeText.setVisibility(View.INVISIBLE);
                    loginText.setVisibility(View.INVISIBLE);
                    layoutPage.setBackgroundDrawable(getResources().getDrawable(R.drawable.background_oncorrect_paddword));
                }
            }
        });

    }
}
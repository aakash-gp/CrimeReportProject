package com.gpaakash.aakashgupta.crimereport;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.context = this;

        Button loginBtn = (Button)findViewById(R.id.loginButton);
        Button registerBtn = (Button)findViewById(R.id.registerButton);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText username_txt = (EditText)findViewById(R.id.userName);
                EditText password_txt = (EditText)findViewById(R.id.password);

                String username = username_txt.getText().toString();
                String password = password_txt.getText().toString();

                String data = "login&username=" + username + "&password=" + password;

                new ServerConnect(context, data).execute("login");


            }
        });

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText username_txt = (EditText)findViewById(R.id.userName);
                EditText password_txt = (EditText)findViewById(R.id.password);

                String username = username_txt.getText().toString();
                String password = password_txt.getText().toString();

                String data = "register&username=" + username + "&password=" + password;

                new ServerConnect(context, data).execute("register");
            }
        });


    }
}

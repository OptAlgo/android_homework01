package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    private EditText usertext;
    private EditText passtext;
    private Button loginbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        usertext=(EditText)this.findViewById(R.id.ed1);
        passtext=(EditText)this.findViewById(R.id.ed2);
        loginbutton=(Button)this.findViewById(R.id.bt);
        loginbutton.setOnClickListener(new ButtonListener());
    }
    private class ButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            String user=usertext.getText().toString();
            String pass=passtext.getText().toString();
            if (user.equals("")||pass.equals("")){
                Toast.makeText(LoginActivity.this,"用户名与密码不能为空！",Toast.LENGTH_SHORT).show();
            }
            else if (user.equals("2021")&&pass.equals("abc")){
                Toast.makeText(LoginActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(LoginActivity.this,"用户名或密码输入有误，请更正后重新输入！",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
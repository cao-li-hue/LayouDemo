//package com.example.layoudemo;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.text.TextUtils;
//import android.view.View;
//import android.widget.Button;
//import android.widget.CheckBox;
//import android.widget.EditText;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//
//
//import com.example.layoudemo.R;
//import com.example.layoudemo.DemoActivity;
//
//public class DemoActivity extends AppCompatActivity{
//private EditText etUsername;
//private EditText etPassword;
//private CheckBox cbAutoLogin;
//private Button btnLogin;
//@Override
//protected void onCreate(Bundle savedInstanceState){
//    super.onCreate(savedInstanceState);
//    setContentView(R.layout.activity_main);
//    etUsername = findViewById(R.id.et_username);
//    etPassword = findViewById(R.id.et_password);
//    cbAutoLogin = findViewById(R.id.cb_auto_login);
//    btnLogin = findViewById(R.id.btn_login);
//    btnLogin.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            login();
//        }
//
//        private void login() {
//            String username = etUsername.getText().toString().trim();
//            String password = etPassword.getText().toString();
//            if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password));{
//                Toast.makeText(this,"用户名不能为空",Toast.LENGTH_LONG).show();
//                return;
//            }
//            if ("android".equals(username) && "123456".equals(password)){
//                Toast.makeText(this,"登陆成功",Toast.LENGTH_LONG).show();
//                Intent intent = new Intent(this,DemoActivity.class);
//                intent.putExtra("username",username);
//                startActivity(intent);
//            }else {
//                Toast.makeText(this,"用户名或密码不正确",Toast.LENGTH_LONG).show();
//            }
//        }
//    });
//}
//}

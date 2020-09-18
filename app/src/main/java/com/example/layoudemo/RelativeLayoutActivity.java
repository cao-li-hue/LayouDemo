package com.example.layoudemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.layoudemo.R;

public class RelativeLayoutActivity extends AppCompatActivity {
    //1。定义界面上的控件元素
    private TextView tvInput;
    private TextView tvResult;
    private String inputStr;
    private String express;
    private boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(androidx.loader.R.layout.relative_activity_layou);

        tvInput = findViewById(R.id.tv_input);
//        tvResult = findViewById(R.id.tv_result);

        flag = false;
        express = "";
        inputStr = "";
    }
    public void calculate(View view){
        Button button = (Button) view;
        if (flag){
            inputStr = "";
            tvInput.setText(inputStr);
            tvResult.setText("0");
            flag = !flag;

        }
        switch (view.getId()){
            case R.id.btn_0:
            case R.id.btn_00:
            case R.id.btn_1:
            case R.id.btn_2:
            case R.id.btn_3:
            case R.id.btn_4:
            case R.id.btn_5:
            case R.id.btn_6:
            case R.id.btn_7:
            case R.id.btn_8:
            case R.id.btn_9:
            case R.id.btn_dot:
            case R.id.btn_add:
            case R.id.btn_sub:
                inputStr += button.getText().toString();
                express +=button.getText().toString();
                break;
            case  R.id.btn_multi:
                inputStr += button.getText().toString();
                express += "*";
                break;
            case  R.id.btn_div:
                inputStr += button.getText().toString();
                express += "/";
                break;
            case  R.id.btn_C:
                inputStr += "";
                ;                express += "";
                break;
            case R.id.btn_DEL:
                if (inputStr.length() > 0){
                    inputStr = inputStr.substring(0, inputStr.length() - 1);
                    express = express.substring(0, express.length() - 1);
                }
                break;
            case R.id.btn_equal:
                if (express.length() > 0){
//                    long result = (long) AviatorEvaluator.execute(express);
//                    tvResult.setText(String.valueOf(result));

                }
                flag = true;
                express = "";
                break;

            case R.id.btn_percent:
                if (tvResult.length() >0){
                    long temp = Long.parseLong(tvResult.getText().toString());
                    tvResult.setText(String.valueOf(temp * 0.01));
                }
                break;
        }
        tvInput.setText(inputStr);
    }
}
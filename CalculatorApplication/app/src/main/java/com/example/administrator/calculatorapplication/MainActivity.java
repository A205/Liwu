package com.example.administrator.calculatorapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    double number1;//��һ����
    double number2;//�ڶ�����
    double result;//������
    EditText text1;//�ı�1
    EditText text2;//�ı�2
    TextView tv;//������ʾ�����TextView

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.textview);
        Button add = (Button) findViewById(R.id.add);
        add .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //�����¼�
                text1=(EditText)findViewById(R.id.edit_01);
                number1=Double.parseDouble(text1.getText().toString());
                text2=(EditText)findViewById(R.id.edit_02);
                number2=Double.parseDouble(text2.getText().toString());
                result=number1+number2;
                tv.setText(String.valueOf(result));
            }
        });
        Button subtract = (Button) findViewById(R.id.subtract);
        subtract .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //�����¼�
                text1 = (EditText) findViewById(R.id.edit_01);
                number1 = Double.parseDouble(text1.getText().toString());
                text2 = (EditText) findViewById(R.id.edit_02);
                number2 = Double.parseDouble(text2.getText().toString());
                result = number1 * number2;
//                tv.setText(result.valueOf());
                tv.setText(String.valueOf(result));
            }
        });
        Button multiply = (Button) findViewById(R.id.multiply);
        multiply .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //�����¼�
                text1=(EditText)findViewById(R.id.edit_01);
                number1=Double.parseDouble(text1.getText().toString());
                text2=(EditText)findViewById(R.id.edit_02);
                number2=Double.parseDouble(text2.getText().toString());
                result=number1-number2;
                tv.setText(String.valueOf(result));
            }
        });
        Button divide = (Button) findViewById(R.id.divide);
        divide .setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //�����¼�
                text1 = (EditText) findViewById(R.id.edit_01);
                number1 = Double.parseDouble(text1.getText().toString());
                text2 = (EditText) findViewById(R.id.edit_02);
                number2 = Double.parseDouble(text2.getText().toString());
                result = number1 / number2;
                tv.setText(String.valueOf(result));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

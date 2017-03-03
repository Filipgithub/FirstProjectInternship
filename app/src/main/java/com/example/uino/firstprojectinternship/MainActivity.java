package com.example.uino.firstprojectinternship;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textVew);
        textView.setText("0");

        final EditText editText1 = (EditText) findViewById(R.id.editText1);
        final EditText editText2 = (EditText) findViewById(R.id.editText2);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt1= editText1.getText().toString();
                String txt2= editText2 .getText().toString();
                if(!((txt1.matches("")||(txt2.matches("")))))
                {
                    if(isNumber(txt1)&&isNumber(txt2))
                {
                    int result = Integer.parseInt(txt1) + Integer.parseInt(txt2);
                    textView.setText("" + result);
                }
                    else
                Toast.makeText(MainActivity.this, "Type numbers only", Toast.LENGTH_SHORT).show();

            }
        }

        protected boolean isNumber(String a){
        try{
            Integer.parseInt(a);
        }catch(Exception e){
            return false;

        }
        return true;
    }

    }


}
}
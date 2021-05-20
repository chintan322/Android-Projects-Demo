package com.chintan.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public  static final String MSG = "com.chintan.multiScreen.ORDER";

    public void placeOrder(View view){
//        We will handle the click on the button here
//        Build an  Intent to open another activity
        Intent intent = new Intent(this,OrderActivity.class);
        EditText editText1 = findViewById(R.id.et1);
        EditText editText2= findViewById(R.id.et2);
        EditText editText3 = findViewById(R.id.et3);

        String message = "Order for " + editText1.getText().toString() + " , "
                + editText2.getText().toString() + " & "
                + editText1.getText().toString() + "placed successfully....";

        intent.putExtra(MSG,message);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
package com.example.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mtxtCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        mtxtCount = (TextView) findViewById(R.id.txtCount);
        if(mtxtCount !=null)
            mtxtCount.setText(Integer.toString(mCount));
        };
    public void showToast(View view){
        Toast toast = Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT);
        toast.show();
    }
    public void countUp(View view){
        mCount++;
        if (mtxtCount!=null)
            mtxtCount.setText(Integer.toString(mCount));
    }

    }

package com.example.sjcet.color;
import android.widget.Button;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {
    View v;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        v= this.getWindow().getDecorView();
        bt=(Button) findViewById(R.id.bt);
    }
    public void click(View view) {
        v.setBackgroundResource(android.R.color.holo_orange_light);
    }
}
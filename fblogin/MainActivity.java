package com.example.sjcet.fblogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.System.out;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void login(View view) {
        EditText E1, E2;
        E1 = (EditText) findViewById(R.id.et1);
        E2 = (EditText) findViewById(R.id.et2);
        if (E1.getText().toString().equals("admin"))&&
        (E2.getText().toString().equals("admin"))
        {
            Intent intent = new Intent(MainActivity.this, home.class);
        }
        else
        {
            Toast.makeText(this, "username or password is empty", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override

    public boolean OnoptionsItemSelected(menuItem, item)
    {
        switch(item,getItemId()){
        case R.id.sign-out:
            Toast.makeText(this,"sign-out",Toast.LENGTH_SHORT).show();
    }
    return true;
    }
}




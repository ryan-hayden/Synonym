package com.vcu.ryanhayden.synonym;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v){
        if(v.getId() == R.id.findSynonymButton){
            Intent intent = new Intent(MainActivity.this, Results.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.enterValuesButton){
            Intent intent = new Intent(MainActivity.this, EnterValues.class);
            startActivity(intent);
        }
    }
}

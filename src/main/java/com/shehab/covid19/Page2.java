package com.shehab.covid19;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Page2 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
    }
    public void goToPage3 (View view){
        Intent intent = new Intent (this, Page3.class);
        startActivity(intent);
    }
}




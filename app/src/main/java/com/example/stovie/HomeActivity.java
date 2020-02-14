package com.example.stovie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescroll);

        ImageButton mapsButton = (ImageButton) findViewById(R.id.map);


        mapsButton.setOnClickListener(mMapsListener);
    }

    private View.OnClickListener mMapsListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            
        }
    };
}

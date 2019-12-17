package com.androidmani.daggerretrofitex.view.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.androidmani.daggerretrofitex.AppController;
import com.androidmani.daggerretrofitex.R;
import com.androidmani.daggerretrofitex.utils.Utilities;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Utilities utilities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initialize the injection
        AppController.getAppComponent().inject(this);

        checkInternet();

    }

    private void checkInternet() {
        if(utilities.isNetworkConnected())
        {
            Toast.makeText(this, "Internet connected", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "No internet connection", Toast.LENGTH_SHORT).show();
        }
    }
}

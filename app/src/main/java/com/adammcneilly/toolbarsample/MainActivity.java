package com.adammcneilly.toolbarsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtain a reference to the Toolbar component.
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Set our Toolbar to be the support action bar so it will behave in the same way
        // ActionBar does in older versions of Android.
        setSupportActionBar(toolbar);
    }
}

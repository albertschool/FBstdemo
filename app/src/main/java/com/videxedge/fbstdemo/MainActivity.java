package com.videxedge.fbstdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

/**
 * @author		Albert Levy <albert.school2015@gmail.com>
 * @version     1.0
 * @since		4/12/2019
 * Basic application to demonstrate upload & download file to Firebase Storage
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Uploading selected image file to Firebase Storage
     * <p>
     *
     * @param view
     */
    public void upload(View view) {
    }

    /**
     * Downloading selected image file to Firebase Storage
     * <p>
     *
     * @param view
     */
    public void download(View view) {
    }
}

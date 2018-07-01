package com.example.dexty.imageresize;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class EditorActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private ImageView mImageView;
    private String imageStringpath;
    Bitmap b;
    Uri imageUri;
    Bundle getExtras;
    ExifInterface exif;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {


        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.rotate:
                    mTextMessage.setText("Rotate");
                    return true;
                case R.id.crop:
                    mTextMessage.setText("Crop");
                    return true;
                case R.id.resize:
                    mTextMessage.setText("Resize");
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);
        mImageView = (ImageView) findViewById(R.id.imageEdit);
            Bundle extras = getIntent().getExtras();
            String data = extras.getString("data");

        Picasso picasso = null;
        picasso.load(data).into(mImageView);



        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }





    }


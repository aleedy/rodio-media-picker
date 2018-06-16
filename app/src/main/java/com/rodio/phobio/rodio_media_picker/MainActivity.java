package com.rodio.phobio.rodio_media_picker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.rodio.phobio.rodiobottompicker.PickerBottomSheet;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.clickMe).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        PickerBottomSheet.Builder builder = new PickerBottomSheet.Builder(this);
        PickerBottomSheet dialog = builder.build();
        dialog.show();
    }
}

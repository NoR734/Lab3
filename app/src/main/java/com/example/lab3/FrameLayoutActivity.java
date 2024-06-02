package com.example.lab3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FrameLayoutActivity extends AppCompatActivity {
    private ImageView imageView;
    private ImageButton imageButton;
    private int[] images = {R.drawable.apple, R.drawable.ananas, R.drawable.banana,
    R.drawable.orange, R.drawable.qiwi};
    private int currentImageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        imageView = (ImageView) findViewById(R.id.imageView);
        imageButton = (ImageButton) findViewById(R.id.imageButton);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (currentImageIndex < images.length - 1) {
                    currentImageIndex++;
                }
                else {
                    currentImageIndex = 0;
                }
                imageView.setImageResource(images[currentImageIndex]);
            }
        });
    }
}
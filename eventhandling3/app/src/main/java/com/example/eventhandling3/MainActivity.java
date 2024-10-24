package com.example.eventhandling3;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.util.Log;
public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private LinearLayout mainLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainLayout = findViewById(R.id.main);
    }
    public void changeToOrange(View view) {
        mainLayout.setBackgroundColor(Color.parseColor("#FFA500"));
        Log.i(TAG, "Background color changed to Orange");
    }
    public void changeToRed(View view) {
        mainLayout.setBackgroundColor(Color.RED);
        Log.i(TAG, "Background color changed to RED");
    }

}
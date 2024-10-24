package com.example.eventhandling2;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private LinearLayout linearLayout1, linearLayout2, linearLayout3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main),
                (v, insets) -> {
                    Insets systemBars =
                            insets.getInsets(WindowInsetsCompat.Type.systemBars());
                    v.setPadding(systemBars.left, systemBars.top, systemBars.right,
                            systemBars.bottom);
                    return insets;
                });
        linearLayout1 = findViewById(R.id.linearLayout3);
        linearLayout3 = findViewById(R.id.linearLayout5);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);

        assert button1 != null;
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = Color.BLUE;
                linearLayout1.setBackgroundColor(color);
                button1.setBackgroundColor(color);
                Log.i(TAG, "Color changed to blue");
            }
        });
        assert button2 != null;
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int color = Color.RED;
                linearLayout3.setBackgroundColor(color);
                button2.setBackgroundColor(color);

                Log.i(TAG, "Color changed to RED");
            }
        });


            }


    }


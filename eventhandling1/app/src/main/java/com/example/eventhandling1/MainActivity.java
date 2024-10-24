package com.example.eventhandling1;
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
public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    private LinearLayout linearLayout1;
    private LinearLayout linearLayout3;
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
        linearLayout1=findViewById(R.id.linearLayout3);
        linearLayout3=findViewById(R.id.linearLayout5);
        Button button1=findViewById(R.id.button1);

        Button button2=findViewById(R.id.button2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        int id=v.getId();
        if (id==R.id.button1) {
            Log.i(TAG, "Color changed to WHITE");

            linearLayout1.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));
        } else if (id==R.id.button2) {
            Log.i(TAG, "Color changed to BLUE");

            linearLayout3.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
        }
    }
}

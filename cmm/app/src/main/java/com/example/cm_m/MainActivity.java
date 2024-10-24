package com.example.cm_m;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Conversion rate (You can update it dynamically if needed)
    private static final double CONVERSION_RATE = 100.0; // Example rate: 100cm = 1 meter

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // UI elements
        EditText minput = findViewById(R.id.minput);
        Button convertButton = findViewById(R.id.convertButton);
        TextView resultTextView = findViewById(R.id.resultTextView);

        // Set up click listener for the conversion button
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the value entered by the user
                String mvalue = minput.getText().toString();

                // Convert to INR if the input is not empty
                if (!TextUtils.isEmpty(mvalue)) {
                    double mv = Double.parseDouble(mvalue);
                    double centimetervalue = mv * CONVERSION_RATE;

                    // Display the result
                    resultTextView.setText(String.format("%.2fcm", centimetervalue));
                } else {
                    // Handle empty input case
                    resultTextView.setText("Please enter a valid input");
                }
            }
        });
    }
}

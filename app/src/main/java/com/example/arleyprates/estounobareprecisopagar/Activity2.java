package com.example.arleyprates.estounobareprecisopagar;

/**
 * Created by arleyprates on 4/2/16.
 */

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class Activity2 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        String defaultName = "";
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            defaultName = extras.getString("Name");
        }
        EditText text_username = (EditText) findViewById(R.id.textUsername);
        text_username.setHint(defaultName);

        Button button = (Button) findViewById(R.id.botao);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                Intent data = new Intent();

                EditText textUsername = (EditText) findViewById(R.id.textUsername);

                data.setData(Uri.parse(textUsername.getText().toString()));
                setResult(RESULT_OK, data);

                finish();
            }
        });

    }
}

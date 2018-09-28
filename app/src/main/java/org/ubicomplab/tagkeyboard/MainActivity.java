package org.ubicomplab.tagkeyboard;

import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Keyboard keyboard;
    private KeyboardView keyboardView;
    private TextView studyMetricsTextView;

    private List<String> records = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        keyboard = new Keyboard(this, R.raw.qwerty_keyboard);
        keyboardView = findViewById(R.id.keyboardView);
        keyboardView.setKeyboard(keyboard);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null) {

        }
    }


}

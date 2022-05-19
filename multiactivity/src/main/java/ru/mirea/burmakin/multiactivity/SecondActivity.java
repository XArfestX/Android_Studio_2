package ru.mirea.burmakin.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView2;
    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView2 = (TextView) findViewById(R.id.textView2);
        String text = (String) getIntent().getSerializableExtra("key");
        textView2.setText(text);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume()");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, " onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, " onStop()");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, " onDestroy()");
    }
    @Override
    public void onRestart() {
        super.onRestart();
        Log.i(TAG, " onRestart()");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, " onSaveInstanceState()");
    }
    @Override
    public void onRestoreInstanceState(Bundle outState) {
        super.onRestoreInstanceState(outState);
        Log.i(TAG, " onRestoreInstanceState()");
    }
}

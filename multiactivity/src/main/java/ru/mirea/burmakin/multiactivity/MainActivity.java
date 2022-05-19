package ru.mirea.burmakin.multiactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClickNewActivity(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("key", "MIREA - Бурмакин Артём Валерьевич");
        startActivity(intent);
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
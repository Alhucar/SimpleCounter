package edu.upc.eseiaat.pma.simplecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SimpleCounterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_counter);
    }
    public void clkExit(View v) {
        Button boto = (Button) v;
        Log.i("click", "Has clicat el boto Exit");
    }
}

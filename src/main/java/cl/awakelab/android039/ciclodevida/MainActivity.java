package cl.awakelab.android039.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Log.i("MainActivity", "onCreate [START]");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
        Log.i("MainActivity", "onCreate [END]");
    }

    @Override protected void onStart() {
        Log.i("MainActivity", "onStart [START]");

        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();

        Log.i("MainActivity", "onStart [END]");
    }

    @Override protected void onResume() {
        Log.i("MainActivity", "onResume [START]");
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();
        Log.i("MainActivity", "onResume [END]");
    }

    @Override protected void onPause() {
        Log.i("MainActivity", "onPause [START]");

        Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
        super.onPause();
        Log.i("MainActivity", "onPause [END]");
    }

    @Override protected void onStop() {
        Log.i("MainActivity", "onStop [START]");

        Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
        super.onStop();

        Log.i("MainActivity", "onStop [END]");

    }

    @Override protected void onRestart() {
        Log.i("MainActivity", "onRestart [START]");

        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show();
        Log.i("MainActivity", "onRestart [END]");
    }

    @Override protected void onDestroy() {
        Log.i("MainActivity", "onDestroy [START]");

        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
        super.onDestroy();

        Log.i("MainActivity", "onDestroy [END]");
    }
}
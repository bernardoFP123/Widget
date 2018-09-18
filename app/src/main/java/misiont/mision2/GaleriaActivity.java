package misiont.mision2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class GaleriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);
    }



    @Override
    protected void onStart() {
        Log.e("OnStart",getResources().getString(R.string.logOnStart));
        super.onStart();

    }

    @Override
    protected void onPause() {
        Log.e("OnPause",getResources().getString(R.string.logOnPause));
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e("OnStop",getResources().getString(R.string.logOnStop));
        super.onStop();
    }
}

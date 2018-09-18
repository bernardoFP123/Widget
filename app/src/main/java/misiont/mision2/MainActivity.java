package misiont.mision2;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextUser;
    EditText editTextPassword;
    Button buttonForgotData;
    Button buttonLogIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonForgotData = (Button)findViewById(R.id.buttonForgottenData);
        buttonLogIn = (Button)findViewById(R.id.buttonLogIn);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        editTextUser = (EditText) findViewById(R.id.editTextUserName);
        //Configura el snackbar para evisar el usuario que debe recuperar sus datos
        buttonForgotData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar snackBar = Snackbar.make(view,getResources().getString(R.string.snackMustRecoverData),Snackbar.LENGTH_LONG)
                        .setAction(getResources().getString(R.string.snackButtonRecoverData), new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                //Informa al usuario que las instrucciones de recuperación se han enviado a su correo
                                Toast.makeText(getApplicationContext(),getResources().getString(R.string.toastRecoveryDataSent),Toast.LENGTH_LONG).show();
                            }
                        })
                        .setActionTextColor(getResources().getColor(R.color.colorAccent))
                        .setText(getResources().getString(R.string.snackMustRecoverData));
                snackBar.getView().setBackgroundColor(Color.MAGENTA);
                snackBar.show();
            }
        });

        buttonLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logIn();
            }
        });

    }

    //Revisa que los campos no estén vacíos, en ese caso entra a la galería
    public void logIn(){
        if(!editTextPassword.getText().toString().equals("") && !editTextUser.getText().toString().equals("") ){
            Intent intent = new Intent(MainActivity.this,GaleriaActivity.class);
            startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(),"Se deben llenar ambos campos para iniciar sesión",Toast.LENGTH_LONG).show();
        }
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

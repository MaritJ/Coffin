package coffinn.maritjaspers.odisee.be.coffinn;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //declareer variabelen
    private Button aanmelden1;
    private EditText LoginPas1;
    private EditText loginNaam1;

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //linken met knoppen
        aanmelden1 = (Button) findViewById(R.id.aanmelden);
        LoginPas1 = (EditText) findViewById(R.id.LoginPas);
        loginNaam1 = (EditText) findViewById(R.id.loginNaam);

        //test 1
        //functie schrijven voor knop iets te laten doen
        aanmelden1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer errors = 0; //geen fouten
                if (!loginNaam1.getText().toString().contains("@") || !loginNaam1.getText().toString().contains(".")) //moet een @bevatten en een .
                {
                    errors++ ; //errors = 1 --> dus fout --> dus melding
                    loginNaam1.setError("Gelieve een geldig email adres op te geven");
                }

            }
        });

        t = (TextView) findViewById(R.id.myFont);
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(), "fonts/myFont.otf");
        t.setTypeface(myCustomFont);
    }

    public void sendToLocation(View view)
    {
        Intent intent = new Intent(this, location.class);
        startActivity(intent);
    }






}

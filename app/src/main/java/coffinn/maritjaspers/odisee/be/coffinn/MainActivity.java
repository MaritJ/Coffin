package coffinn.maritjaspers.odisee.be.coffinn;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by Marit Jaspers on 6/12/2016.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button aanmelden1;
    private EditText LoginPas1;
    private EditText loginNaam1;
    private Button  registreer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //linken met knoppen
        aanmelden1 = (Button) findViewById(R.id.aanmelden);
        LoginPas1 = (EditText) findViewById(R.id.LoginPas);
        loginNaam1 = (EditText) findViewById(R.id.loginNaam);
        registreer1 = (Button) findViewById(R.id.registreer);

      /*  registreer1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){ //als er op register knop wordt geduwd dan naar andere pagina
                Intent registerIntent = new Intent(MainActivity.this, Register.class);
                MainActivity.this.startActivity(registerIntent);

            }
        });  */




        aanmelden1.setOnClickListener(this); //knop gebruiken;
    }

    public void sendToRegister(View view)
    {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

    @Override

    public void onClick(View v) {
        switch (v.getId()){ // welke view is actief (login of register of main?)
            case R.id.aanmelden:

                break;


        }

    }
}
        //test 1
        //functie schrijven voor knop iets te laten doen
        //aanmelden1.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        Integer errors = 0; //geen fouten
        //       if (!loginNaam1.getText().toString().contains("@") || !loginNaam1.getText().toString().contains(".")) //moet een @bevatten en een .
        //        {
        //            errors++ ; //errors = 1 --> dus fout --> dus melding
        //            loginNaam1.setError("Gelieve een geldig email adres op te geven");
        //        }

        //    }
        //});

        //t = (TextView) findViewById(R.id.myFont);
        //Typeface myCustomFont=Typeface.createFromAsset(getAssets(), "fonts/myFont.otf");
        //t.setTypeface(myCustomFont);
    //}

    //public void sendToLocation(View view)
    //{
    //    Intent intent = new Intent(this, location.class);
    //    startActivity(intent);
    //}








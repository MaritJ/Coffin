package coffinn.maritjaspers.odisee.be.coffinn;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Marit Jaspers on 6/12/2016.
 */

public class Login extends MainActivity implements View.OnClickListener {

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

        registreer1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){ //als er op register knop wordt geduwd dan naar andere pagina
                Intent registerIntent = new Intent(Login.this, Register.class);
                Login.this.startActivity(registerIntent);

            }
        });


        aanmelden1.setOnClickListener(this); //knop gebruiken
    }

    @Override

    public void onClick(View v) {
        switch (v.getId()){ // welke view is actief (login of register of main?)
            case R.id.aanmelden:

                break;


        }

    }
}
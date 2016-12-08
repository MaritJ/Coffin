package coffinn.maritjaspers.odisee.be.coffinn;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Marit Jaspers on 8/12/2016.
 */

public class UserArea extends AppCompatActivity { //AppCompatActivity

    private EditText LoginPas1;
    private EditText loginNaam1;
    private Button aanmelden1;
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


    }
}

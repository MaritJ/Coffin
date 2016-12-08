package coffinn.maritjaspers.odisee.be.coffinn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Marit Jaspers on 6/12/2016.
 */

public class Register extends AppCompatActivity {

    private EditText txtUser1;
    private EditText txtEmail1;
    private EditText txtPassword11;
    private EditText txtPassword21;
    private Button btnRegister1;
    private Button btnSignin1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //linken met knoppen
        txtUser1 = (EditText) findViewById(R.id.txtUser);
        txtEmail1 = (EditText) findViewById(R.id.txtEmail);
        txtPassword11 = (EditText) findViewById(R.id.txtPassword1);
        txtPassword21 = (EditText) findViewById(R.id.txtPassword2);
        btnRegister1 = (Button) findViewById(R.id.btnRegister);
        btnSignin1 = (Button) findViewById(R.id.btnSignin);
    }


}

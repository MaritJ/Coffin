package coffinn.maritjaspers.odisee.be.coffinn;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Registeren extends AppCompatActivity {

    private EditText txtUser1;
    private EditText txtEmail1;
    private EditText txtPassword11;
    private EditText txtPassword21;
    private Button btnRegister1;
    private Button btnSignin1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeren);

        //linken met knoppen
        txtUser1 = (EditText) findViewById(R.id.txtUser);
        txtEmail1 = (EditText) findViewById(R.id.txtEmail);
        txtPassword11 = (EditText) findViewById(R.id.txtPassword1);
        txtPassword21 = (EditText) findViewById(R.id.txtPassword2);
        btnRegister1 = (Button) findViewById(R.id.btnRegister);
        btnSignin1 = (Button) findViewById(R.id.btnSignin);

    }

    public void sendToMain(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

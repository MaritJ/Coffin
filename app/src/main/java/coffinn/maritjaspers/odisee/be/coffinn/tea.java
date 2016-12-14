package coffinn.maritjaspers.odisee.be.coffinn;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class tea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tea);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void sendToAantalGreenTea(View view)
    {
        Intent intent = new Intent(this, aantal.class);
        startActivity(intent);
    }

    public void sendToAantalHoneyTea(View view)
    {
        Intent intent = new Intent(this, aantal.class);
        startActivity(intent);
    }

    public void sendToAantalLemonTea(View view)
    {
        Intent intent = new Intent(this, aantal.class);
        startActivity(intent);
    }

    public void sendToAantalMintTea(View view)
    {
        Intent intent = new Intent(this, aantal.class);
        startActivity(intent);
    }

    public void sendToAantalRosehipTea(View view)
    {
        Intent intent = new Intent(this, aantal.class);
        startActivity(intent);
    }

}

package coffinn.maritjaspers.odisee.be.coffinn;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class milkshake extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milkshake);
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

    public void sendToAantalMBanana(View view)
    {
        Intent intent = new Intent(this, aantal.class);
        startActivity(intent);
    }

    public void sendToAantalMCherry(View view)
    {
        Intent intent = new Intent(this, aantal.class);
        startActivity(intent);
    }

    public void sendToAantalMChoco(View view)
    {
        Intent intent = new Intent(this, aantal.class);
        startActivity(intent);
    }

    public void sendToAantalMCoconut(View view)
    {
        Intent intent = new Intent(this, aantal.class);
        startActivity(intent);
    }

    public void sendToAantalMKiwi(View view)
    {
        Intent intent = new Intent(this, aantal.class);
        startActivity(intent);
    }

    public void sendToAantalMStrawberry(View view)
    {
        Intent intent = new Intent(this, aantal.class);
        startActivity(intent);
    }

    public void sendToAantalMVanilla(View view)
    {
        Intent intent = new Intent(this, aantal.class);
        startActivity(intent);
    }

}

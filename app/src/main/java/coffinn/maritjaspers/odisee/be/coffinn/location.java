package coffinn.maritjaspers.odisee.be.coffinn;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class location extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);


    }

    public void sendToCoffinn(View view)
    {
        Intent intent = new Intent(this, order.class);
        startActivity(intent);
    }

    public void sendToTakeAway(View view)
    {
        Intent intent = new Intent(this, order.class);
        startActivity(intent);
    }

}

package coffinn.maritjaspers.odisee.be.coffinn;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;

public class Location extends AppCompatActivity {

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

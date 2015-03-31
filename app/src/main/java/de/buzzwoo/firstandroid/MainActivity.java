package de.buzzwoo.firstandroid;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] myNames = {
            "Armno",
            "Prommarak",
            "is",
            "Cool!",
            "Awesome!",
            "Superb!",
            "Generator!"
        };

        final TextView textLabel = (TextView) findViewById(R.id.helloWorld);
        textLabel.setText("Hello Armno");

        Button pushMe = (Button) findViewById(R.id.button);
        pushMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randGen = new Random();
                int rando = randGen.nextInt(5) + 1;
                String randnum = Integer.toString(rando);
                textLabel.setText(randnum);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

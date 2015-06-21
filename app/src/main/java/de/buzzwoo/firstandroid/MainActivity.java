package de.buzzwoo.firstandroid;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

        final TextView guessLabel = (TextView) findViewById(R.id.guessLabel);
        final TextView resultText = (TextView) findViewById(R.id.resultText);
        final EditText guessText = (EditText) findViewById(R.id.guessText);

        Button pushMe = (Button) findViewById(R.id.button);

        pushMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String randText = "";
                Random randGen = new Random();
                final int rando = randGen.nextInt(5) + 1;

                int userNumber = Integer.parseInt(guessText.getText().toString());

                if (userNumber < 1 || userNumber > 5) {
                    guessLabel.setText("Please guess 1 - 5!!");
                } else if (userNumber == rando) {
                    guessLabel.setText("You got it right!!");
                } else {
                    guessLabel.setText("Not quite, try again!");
                    guessText.setText("0");
                }

                randText = Integer.toString(rando);
                resultText.setText(randText);
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

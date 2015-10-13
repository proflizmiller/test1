package com.example.ct_d103.helloworld;


import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity
implements OnClickListener{
Button button;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView message = (TextView) findViewById(R.id.tvHelloWorld);
        message.setText("Good bye");
        button = (Button) findViewById(R.id.btnClickMe);
        button.setOnClickListener(this);
    }

    public void onClick(View v) {
        counter++;
        int jnk = counter %3;
        if (jnk == 0) {
            button.setBackgroundColor(Color.GREEN);
        } else if (jnk == 1) {
            button.setBackgroundColor(Color.RED);
        }else {
            button.setBackgroundColor(Color.DKGRAY);
        }


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

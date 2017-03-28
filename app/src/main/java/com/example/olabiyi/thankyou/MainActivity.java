package com.example.olabiyi.thankyou;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b1;
    int currentIndex=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        b1 = (Button) findViewById(R.id.button1);
        setSupportActionBar(toolbar);

        b1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                final  String[] Textlist = {"Lorem Ipsum has been the industry's standard dummy text ever since the 1500s ", "when an unknown printer took a galley of type and scrambled it to make a type specimen book ", "It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged", "Lorem ipsum dolor sit amet, consectetur adipiscing elit", "Cras blandit nec ex non porta", "Vestibulum rhoncus nec justo ac mattis", "Nulla congue pharetra lorem ac suscipit", "Nullam vitae augue ac massa consectetur dapibus"};
                Random random = new Random();
             //   String randomText = Textlist[random.nextInt(Textlist.length)];
                TextView tv = (TextView)findViewById(R.id.textView1);
                tv.setText(Textlist[currentIndex++ % Textlist.length]);
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

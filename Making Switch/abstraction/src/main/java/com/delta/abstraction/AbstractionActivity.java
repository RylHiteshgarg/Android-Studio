package com.delta.abstraction;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class AbstractionActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abstraction);
        //
        // Start here
        //

        Fan myF = new Fan();
        Light myL = new Light();

        myF.breakDevice();
        myL.breakDevice();

        Switch myS = new Switch();

        myS.wireUp(myF);
        myS.wireUp(myL);

        myS.flipUp();
        myS.flipDown();

        myS.unWire(myF);

        myS.flipUp();
        myS.flipDown();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.abstraction, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}

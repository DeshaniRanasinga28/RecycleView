package com.newsalerts.ef.volley;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.newsalerts.ef.volley.adapter.ScenarioAdapter;
import com.newsalerts.ef.volley.fragment.ScenarioFragment;
import com.newsalerts.ef.volley.model.Scenario;
import com.newsalerts.ef.volley.util.Config;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ScenarioFragment.OnFragmentInteractionListener{

    String server_url = Config.CENARIO_URL;  // call a Scenario URL
    ArrayList<Scenario> items;
    ListView listView;
    private ScenarioAdapter adapter;
    Scenario scenario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        checkInternetConnection();

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.mainContainer, ScenarioFragment.newInstance("", ""), "rageComicList")
                    .commit();
        }

    }

    public boolean checkInternetConnection(){
        ConnectivityManager connMgr = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if(networkInfo != null && networkInfo.isConnected()){
            Toast.makeText(this, "Connected", Toast.LENGTH_LONG).show();
            return true;
        }else {
            Toast.makeText(this, "No Network Connection Available", Toast.LENGTH_LONG).show();
            return false;
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

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}

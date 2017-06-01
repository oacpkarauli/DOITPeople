package com.example.lenovo.doitpeople;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private String TAG = MainActivity.class.getSimpleName();

    private ProgressDialog pDialog;
    private ListView lv;

    // URL to get contacts JSON
    private static String url = "http://api.androidhive.info/contacts/";

    ArrayList<HashMap<String, String>> contactList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactList = new ArrayList<>();

        lv = (ListView) findViewById(R.id.list);
        new GetContacts().execute();
    }
    public void dir_search(View view){
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);


    }

}

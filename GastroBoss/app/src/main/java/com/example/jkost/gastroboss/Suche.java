package com.example.jkost.gastroboss;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SearchView;
import android.widget.TextView;


/**
 * Created by J.Kost on 11.05.2016.
 */
public class Suche extends Activity {

    private SearchView search;
    private String s;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.suche);
        textView = (TextView) findViewById(R.id.editText3);
        search = (SearchView)findViewById(R.id.searchView);
    }

}

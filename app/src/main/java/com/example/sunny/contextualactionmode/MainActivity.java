package com.example.sunny.contextualactionmode;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    int[] image_id = {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,
    R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h};

    ArrayList<Contact> contacts = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);


        String[] Name,Email;
        Name = getResources().getStringArray(R.array.name);
        Email = getResources().getStringArray(R.array.email);
        int i = 0;
        for (String NAME: Name){
            Contact contact = new Contact(image_id[i],NAME,Email[i]);
            contacts.add(contact);
            i++;
        }
        adapter = new ContactAdapter(contacts,MainActivity.this);
        recyclerView.setAdapter(adapter);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_main,menu);
        return true;
    }
}

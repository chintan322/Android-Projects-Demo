package com.chintan.dbdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.chintan.dbdemo.adapter.RecyclerViewAdapter;
import com.chintan.dbdemo.data.MyDBHandler;
import com.chintan.dbdemo.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private ArrayList<Contact> contactArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //RecyclerView initializer
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyDBHandler db = new MyDBHandler(MainActivity.this);

        // create the contact
        Contact chintan = new Contact();
        chintan.setPhoneNumber("9999900000");
        chintan.setName("Chintan");

        // add contact in the database
        db.addContact(chintan);


        contactArrayList = new ArrayList<>();

        // Get all contacts
        List<Contact> contactList = db.getAllContacts();

        for(Contact contact:contactList){
            Log.d("dbchintan","Id: "+contact.getId() +"\n" +
                                        " Name: "+contact.getName() +"\n" +
                                        " Phone Number: "+contact.getPhoneNumber() +"\n");
            contactArrayList.add(contact);
        }

        //Use your recyclerView
        recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this,contactArrayList);
        recyclerView.setAdapter(recyclerViewAdapter);


        Log.d("dbchintan","You have "+db.getCount()+" contacts available in the database");

    }
}
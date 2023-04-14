package com.example.morningsimplelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Contacts
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var mContacts: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mContacts = findViewById(R.id.mListContact)
        mContacts.setOnItemClickListener { adapterView, view, position, id ->
            val name = adapterView.getItemAtPosition(position).toString()
            Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        }
    }
}

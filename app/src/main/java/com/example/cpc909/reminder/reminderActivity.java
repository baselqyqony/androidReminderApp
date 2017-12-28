package com.example.cpc909.reminder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class reminderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder);

        ListView m_listView= (ListView) findViewById(R.id.reminders_list_view);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.reminders_row,R.id.row_text,
                new String[]{"first","second","third"});

        m_listView.setAdapter(arrayAdapter);
    }
}

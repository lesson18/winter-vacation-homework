package com.example.lansen.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import com.example.dujiang.myapplication.R;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity

{
    public ArrayList list=new ArrayList();

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Click(View view)
    {
        EditText text=(EditText)findViewById(R.id.e);
        String s=text.getText().toString();
        list.add(s);
        ListView listView=(ListView)findViewById(R.id.l);
        ArrayAdapter<String> ad =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(ad);
    }
}

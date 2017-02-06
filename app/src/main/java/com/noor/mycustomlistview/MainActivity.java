package com.noor.mycustomlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView customList;
    String countryList[] ={"Bangladesh","India","China","Australia","USA","New Zealand","Portugle"};

    int flags[]={R.drawable.bd,R.drawable.india,R.drawable.china,R.drawable.australia,R.drawable.america,R.drawable.new_zealand,R.drawable.portugle};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customList=(ListView)findViewById(R.id.customList);

        CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),countryList,flags);
        customList.setAdapter(customAdapter);






    }
}

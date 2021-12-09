package com.example.mysqlapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
         listView(ListView)findViewById(R.id.listdata);
         
         tampilkanBarang(s"http://192.168.1.4:8080/service_data_php");
    }
    
    private void tampilkanBarang(String s) {
        class tampilkanBarang extend AsyncTask<Void,Void,String>
        {
            @Override
            protected void onPreExecute() {
                super.onPreExecute();    
            }
            
            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
            String doInBackground(Void...voString doInBackground(Void...void))
        }
    }
}
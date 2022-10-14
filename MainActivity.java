package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflate = getMenuInflater();
        inflate.inflate(R.menu.example_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.item1:
                Toast.makeText(this, "You clicked the item 1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(this, "You clicked the item2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.ite3:
                Toast.makeText(this, "You clicked the item3", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sub_item1:
                Toast.makeText(this, "You Clicked the sub item1 ", Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.sub_item2:
                Toast.makeText(this, "You clicked the sub item2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sub_item3:
                Toast.makeText(this, "You clicked the sub item3", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }
}

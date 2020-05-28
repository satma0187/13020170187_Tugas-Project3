package com.example.project3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Toolbar tool;
    private Button balok, limas, prisma, kerucut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tool = findViewById(R.id.toolbar);
        balok = findViewById(R.id.balok);
        limas = findViewById(R.id.limas);
        prisma = findViewById(R.id.prisma);
        kerucut = findViewById(R.id.kerucut);
        tool.setTitle("");
        setSupportActionBar(tool);

        balok.setOnClickListener(klik);
        limas.setOnClickListener(klik);
        prisma.setOnClickListener(klik);
        kerucut.setOnClickListener(klik);
    }
    View.OnClickListener klik = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.kerucut:
                    Intent in = new Intent(MainActivity.this, Main2Activity.class);
                    in.putExtra("bangun", "ker");
                    startActivity(in);
                    break;
                case R.id.balok:
                    in = new Intent(MainActivity.this, Main2Activity.class);
                    in.putExtra("bangun", "bal");
                    startActivity(in);
                    break;
                case R.id.prisma:
                    in = new Intent(MainActivity.this, Main2Activity.class);
                    in.putExtra("bangun", "pri");
                    startActivity(in);
                    break;
                case R.id.limas:
                    in = new Intent(MainActivity.this, Main2Activity.class);
                    in.putExtra("bangun", "lim");
                    startActivity(in);
                    break;
                default:
                    break;
            }
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.akun){
            startActivity(new Intent(MainActivity.this, Main3Activity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}

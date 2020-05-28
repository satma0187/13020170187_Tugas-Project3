package com.example.project3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class Main2Activity extends AppCompatActivity {

    private TextView judul, hasil;
    private ImageView img;
    private TextInputLayout a, b, c;
    private Button hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        judul = findViewById(R.id.judul);
        hasil = findViewById(R.id.hasil);
        img = findViewById(R.id.img);
        a = findViewById(R.id.nil1);
        b = findViewById(R.id.nil2);
        c = findViewById(R.id.nil3);
        hitung = findViewById(R.id.hitung);
        Intent in =getIntent();
        hitung(in);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void hitung(Intent in){
        switch (in.getStringExtra("bangun")){
            case "ker":
                getSupportActionBar().setTitle("HITUNG VOLUME KERUCUT");
                judul.setText("KERUCUT");
                img.setImageResource(R.drawable.kerucut);
                a.setHint("Jari-Jari");
                b.setHint("Tinggi");
                hitung.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (a.getEditText().getText().equals("") || b.getEditText().getText().toString().equals("")){
                            Toast.makeText(Main2Activity.this, "Jari-jari dan tinggi tidak boleh kosong", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Double r = Double.parseDouble(a.getEditText().getText().toString());
                            Double t = Double.parseDouble(b.getEditText().getText().toString());
                            Double vl = (1/3*3.14*r*r)*t;
                            hasil.setText("VOLUMENYA ADALAH " +vl);
                        }
                    }
                });
                break;
            case "bal":
                getSupportActionBar().setTitle("HITUNG VOLUME BALOK");
                judul.setText("BALOK");
                img.setImageResource(R.drawable.balok);
                a.setHint("Panjang");
                b.setHint("Lebar");
                c.setHint("Tinggi");
                c.setVisibility(View.VISIBLE);
                hitung.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (a.getEditText().getText().equals("") || b.getEditText().getText().toString().equals("") || c.getEditText().getText().toString().equals("")){
                            Toast.makeText(Main2Activity.this, "Panjang, lebar dan tinggi tidak boleh kosong", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Double p = Double.parseDouble(a.getEditText().getText().toString());
                            Double l = Double.parseDouble(a.getEditText().getText().toString());
                            Double t = Double.parseDouble(b.getEditText().getText().toString());
                            Double vl = p*l*t;
                            hasil.setText("VOLUMENYA ADALAH " +vl);
                        }
                    }
                });
                break;
            case "pri":
                getSupportActionBar().setTitle("HITUNG VOLUME PRISMA SEGILIMA");
                judul.setText("PRISMA SEGILIMA");
                img.setImageResource(R.drawable.pris);
                a.setHint("Sisi Alas");
                b.setHint("Jari-Jari Alas");
                c.setHint("Tinggi");
                c.setVisibility(View.VISIBLE);
                hitung.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (a.getEditText().getText().equals("") || b.getEditText().getText().toString().equals("") || c.getEditText().getText().toString().equals("")){
                            Toast.makeText(Main2Activity.this, "Sisi alas, jari-jari alas dan tinggi tidak boleh kosong", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Double s = Double.parseDouble(a.getEditText().getText().toString());
                            Double r = Double.parseDouble(a.getEditText().getText().toString());
                            Double t = Double.parseDouble(b.getEditText().getText().toString());
                            Double vl = (1/2*(5*s*r))*t;
                            hasil.setText("VOLUMENYA ADALAH " +vl);
                        }
                    }
                });
                break;
            case "lim":
                getSupportActionBar().setTitle("HITUNG VOLUME LIMAS SEGILIMA");
                judul.setText("LIMAS SEGILIMA");
                img.setImageResource(R.drawable.lim);
                a.setHint("Luas Alas");
                b.setHint("Tinggi");
                hitung.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (a.getEditText().getText().equals("") || b.getEditText().getText().toString().equals("")){
                            Toast.makeText(Main2Activity.this, "Luas alas dan tinggi tidak boleh kosong", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Double la = Double.parseDouble(a.getEditText().getText().toString());
                            Double t = Double.parseDouble(b.getEditText().getText().toString());
                            Double vl = (1/3*la)*t;
                            hasil.setText("VOLUMENYA ADALAH " +vl);
                        }
                    }
                });
                break;
            default:
                Toast.makeText(this, "Action tidak dikenali", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<>();
        items.add(new Item("Abmi Sukma Edri","12250120341",R.drawable.a1));
        items.add(new Item("Ahmad Kurniawan","12250111514",R.drawable.b));
        items.add(new Item("Aufa Hajati","12250120338",R.drawable.c));
        items.add(new Item("Daffa Finanda","12250111603",R.drawable.d));
        items.add(new Item("Daffa Ikhwan Nurfauzan","12250110979",R.drawable.e));
        items.add(new Item("Dwi Jelita Adhliyah","12250120331",R.drawable.f));
        items.add(new Item("Dwi Mahdini","12250111298",R.drawable.g));
        items.add(new Item("Fajri","12250110382",R.drawable.h));
        items.add(new Item("Fakhri","12250111381",R.drawable.i));
        items.add(new Item("Farras Lathief","12250111328",R.drawable.j));
        items.add(new Item("Gilang Ramadhan Indra","12250111323",R.drawable.k));
        items.add(new Item("Hafidz Alhadid Rahman","12250111794",R.drawable.l));
        items.add(new Item("Haritsah Naufaldy","12250110361",R.drawable.m));
        items.add(new Item("M. Nabil Dawami","12250111527",R.drawable.n));
        items.add(new Item("Muh. Zaki Erbai Syas","12250111134",R.drawable.o));
        items.add(new Item("Muhammad Aditya Rinaldi","12250111048",R.drawable.p));
        items.add(new Item("Muhammad Dhimas Hadid","12250111231",R.drawable.q));
        items.add(new Item("Muhammad Faruq","12250111791",R.drawable.r));
        items.add(new Item("Muhammad Rafly Wirayudha","12250111489",R.drawable.s));
        items.add(new Item("Nurika Dwi Wahyuni","12250120360",R.drawable.t));
        items.add(new Item("Ogya Secio Noegroho S","12250111346",R.drawable.u));
        items.add(new Item("Rahma Laksita","12250124357",R.drawable.v));
        items.add(new Item("Surya Hidayatullah F","12250111759",R.drawable.w));

        MyAdapter adapter = new MyAdapter(this, items);
        adapter.setOnItemClickListener(item -> {
            // Ketika item di RecyclerView diklik, buka DetailActivity dan kirim data item
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("name", item.getName());
            intent.putExtra("nim", item.getNim());
            intent.putExtra("image", item.getImage());
            startActivity(intent);
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
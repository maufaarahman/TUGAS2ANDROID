package id.ac.uinsuska.tugas2android;

import static id.ac.uinsuska.tugas2android.R.id.rvKuliner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

import id.ac.uinsuska.tugas2android.R.id;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvKuliner;
    private ArrayList<Masakan> list = new ArrayList<>();


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvKuliner = findViewById(R.id.rvKuliner);
        rvKuliner.setHasFixedSize(true);

        list.addAll(DataMasakan.getlistData());
        showRecyclerlist();
    }
    private void showRecyclerlist(){
        rvKuliner.setLayoutManager(new LinearLayoutManager(this));
        ListmasakanAdapter listmasakanAdapter = new ListmasakanAdapter(list);
        rvKuliner.setAdapter(listmasakanAdapter);
    }
}
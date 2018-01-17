package com.example.student.rejestracjawizyt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {
    @BindView(R.id.recyclerView)
    RecyclerView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ButterKnife.bind(this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        list.setLayoutManager(layoutManager);

        ArrayList<Lekarz> lista = new ArrayList<>();

        lista.add(new Lekarz("Jan Kowalski","dermatolog"));
        lista.add(new Lekarz("Anna Nowak","chirurg"));
        lista.add(new Lekarz("Monika Nijaka","anestezjolog"));
        lista.add(new Lekarz("Krzysztof Blabla","pediatra"));


        LekarzAdapter lekarzAdapter = new LekarzAdapter(lista);
        list.setAdapter(lekarzAdapter);


    }
}

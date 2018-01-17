package com.example.student.rejestracjawizyt;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by student on 2018-01-17.
 */

public class LekarzAdapter extends RecyclerView.Adapter<LekarzAdapter.ViewHolder>{

    private ArrayList<Lekarz> lista = new ArrayList<>();
    LekarzAdapter(ArrayList<Lekarz> lista) {
        this.lista = lista;
    }

    @Override
    public LekarzAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(LekarzAdapter.ViewHolder holder, int position) {
        holder.setNazwisko(lista.get(position).getNazwisko());
        holder.setSpecjalizacja(lista.get(position).getSpecjalizacja());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        @BindView(R.id.nazwiskoLekarza)
        TextView nazwisko;

        @BindView(R.id.specjalizacjaLekarza)
        TextView specjalizacja;

        @BindView(R.id.button_wybierz)
        Button wybierz;

        @OnClick(R.id.button_wybierz)
        void onNameClick() {

            if (wybierz.getText() == "WYBRANO") {
                wybierz.setText("WYBIERZ");

            } else
            {
                wybierz.setText("WYBRANO");

            }
        }
        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }
        private void setNazwisko(String name) {
            nazwisko.setText(name);
        }
        private void setSpecjalizacja(String name) {
            specjalizacja.setText(name);
        }
    }
}



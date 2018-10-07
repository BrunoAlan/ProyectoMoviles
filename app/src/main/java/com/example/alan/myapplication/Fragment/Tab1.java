package com.example.alan.myapplication.Fragment;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.alan.myapplication.AgregarAlimento;
import com.example.alan.myapplication.Operaciones.AdaptadorAlimentos;
import com.example.alan.myapplication.Entidades.Alimento;
import com.example.alan.myapplication.R;

import java.util.ArrayList;

public class Tab1 extends Fragment {

    RecyclerView recyclerAlimentos;
    ArrayList<Alimento> listaAlimento;
    FloatingActionButton fab;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1, container, false);

        fab = getActivity().findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Snackbar.make(v, "Llamar INTENT insertar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/


            Intent intent= new Intent(getActivity(),AgregarAlimento.class);
            startActivity(intent);

            }
        });

        listaAlimento = new ArrayList<>();
        recyclerAlimentos = rootView.findViewById(R.id.recyclerId);
        recyclerAlimentos.setLayoutManager(new LinearLayoutManager(getContext()));
        llenarLista();

        AdaptadorAlimentos adapter = new AdaptadorAlimentos(listaAlimento);
        recyclerAlimentos.setAdapter(adapter);

        return rootView;


    }

    private void llenarLista() {
        listaAlimento.add(new Alimento("Hamburguesa",230,0.5,14, 18.3,"Carnes y Frutos secos"));
        listaAlimento.add(new Alimento("Manzana",52,    10.5,0.2, 0.3,"Frutas"));
        listaAlimento.add(new Alimento("Zanahoria",37,0.5,1, 0.2,"Verduras"));
        listaAlimento.add(new Alimento("Pechuga de Pollo",108,0,22.4, 2.1,"Carnes y Frutos secos"));
        listaAlimento.add(new Alimento("Yogur entero",61,4,3.3, 3.5,"Lacteos"));
        listaAlimento.add(new Alimento("Arroz",123,27.9,2.2, 0.3,"Cereales"));

    }
}

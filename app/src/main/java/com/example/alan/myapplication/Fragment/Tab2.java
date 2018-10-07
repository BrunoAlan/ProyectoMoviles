package com.example.alan.myapplication.Fragment;

import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.alan.myapplication.Operaciones.AdaptadorAlimentos;
import com.example.alan.myapplication.Entidades.Alimento;
import com.example.alan.myapplication.R;

import java.util.ArrayList;


public class Tab2 extends Fragment  {

    RecyclerView recyclerAlimentos;
    ArrayList<Alimento> listaAlimento;
    FloatingActionButton fab;

    private ImageView imagenPiramide;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.tab2, container, false);


        imagenPiramide = rootView.findViewById(R.id.imagen1);
        listaAlimento = new ArrayList<>();
        recyclerAlimentos = rootView.findViewById(R.id.recyclerActividad2);
        recyclerAlimentos.setLayoutManager(new LinearLayoutManager(getContext()));
        llenarLista();

        AdaptadorAlimentos adapter = new AdaptadorAlimentos(listaAlimento);


        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),listaAlimento.get(recyclerAlimentos.getChildAdapterPosition(view)).getCategoria(),Toast.LENGTH_SHORT).show();
            }
        });

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

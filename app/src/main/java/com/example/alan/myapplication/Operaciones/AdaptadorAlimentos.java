package com.example.alan.myapplication.Operaciones;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alan.myapplication.Entidades.Alimento;
import com.example.alan.myapplication.R;

import java.util.ArrayList;

public class AdaptadorAlimentos extends RecyclerView.Adapter<AdaptadorAlimentos.ViewHolderAlimentos>
implements View.OnClickListener  {

    ArrayList<Alimento> listaAlimento;
    private View.OnClickListener listener;


    public AdaptadorAlimentos(ArrayList<Alimento> listaAlimento) {
        this.listaAlimento = listaAlimento;
    }

    @NonNull
    @Override
    public ViewHolderAlimentos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista_alimentos,null,false);

        RecyclerView.LayoutParams layParams = new RecyclerView.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(layParams);

        view.setOnClickListener(this);
        return new ViewHolderAlimentos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderAlimentos holder, int position) {

        holder.nombre.setText(listaAlimento.get(position).getNombre());
        holder.calorias.setText("Calorias: " + String.valueOf(listaAlimento.get(position).getCalorias()));
        holder.hidratos.setText("Hidratos: " + String.valueOf(listaAlimento.get(position).getHidratos())+" %");
        holder.proteinas.setText("Proteinas: " + String.valueOf(listaAlimento.get(position).getProteinas())+" %");
        holder.grasas.setText("Grasas: " + String.valueOf(listaAlimento.get(position).getGrasas())+" %");

    }

    @Override
    public int getItemCount() {return listaAlimento.size();}

    public void setOnClickListener(View.OnClickListener listener){
        this.listener= listener;
    }

    @Override
    public void onClick(View view) {
        if (listener != null) {
            listener.onClick(view);
        }

    }

    public class ViewHolderAlimentos extends RecyclerView.ViewHolder {

        TextView nombre;
        TextView calorias;
        TextView hidratos;
        TextView proteinas;
        TextView grasas;
        //ImageView imagen;

        public ViewHolderAlimentos(View itemView) {
            super(itemView);
            nombre=itemView.findViewById(R.id.idNombre);
            calorias=itemView.findViewById(R.id.idCalorias);
            hidratos=itemView.findViewById(R.id.idHidratos);
            proteinas=itemView.findViewById(R.id.idProteinas);
            grasas=itemView.findViewById(R.id.idGrasas);
            //imagen=itemView.findViewById(R.id.idImagenAlimento);


        }


    }
}

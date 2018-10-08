package com.example.alan.myapplication;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatSpinner;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.alan.myapplication.Operaciones.ConexionSQLiteHelper;
import com.example.alan.myapplication.Utilidades.Utilidades;


public class AgregarAlimento extends AppCompatActivity {

    private TextInputEditText textInputNombre;
    private TextInputEditText textInputCalorias;
    private TextInputEditText textInputHidratos;
    private TextInputEditText textInputProteinas;
    private TextInputEditText textInputGrasa;
    private AppCompatButton btnAgregar;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        getSupportActionBar().setTitle("Agregar Alimento");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.agregar_alimento);


        textInputNombre = findViewById(R.id.text_input_nombre);
        textInputCalorias= findViewById(R.id.text_input_calorias);
        textInputHidratos=findViewById(R.id.text_input_hidratos);
        textInputProteinas=findViewById(R.id.text_input_proteinas);
        textInputGrasa=findViewById(R.id.text_input_grasas);
        btnAgregar=findViewById(R.id.btnAgregar);

        final AppCompatSpinner combo_categorias = findViewById(R.id.categorySpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.combo_categorias,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        combo_categorias.setAdapter(adapter);
        //obtengo el elemento del spinner
        final String asd = combo_categorias.getSelectedItem().toString();

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 //registrarAlimento();
                 finish();
            }
        });



        }

    private void registrarAlimento() {

        ConexionSQLiteHelper conexion = new ConexionSQLiteHelper(this,"bd_alimentos",null,1);
        SQLiteDatabase db= conexion.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Utilidades.CAMPO_NOMBRE,textInputNombre.getText().toString());
        values.put(Utilidades.CAMPO_CALORIAS,textInputCalorias.getText().toString());
        values.put(Utilidades.CAMPO_HIDRATOS,textInputHidratos.getText().toString());
        values.put(Utilidades.CAMPO_PROTEINAS,textInputProteinas.getText().toString());
        values.put(Utilidades.CAMPO_GRASAS,textInputGrasa.getText().toString());
        values.put(Utilidades.CAMPO_CATEGORIA,"cat");

        long idResultado =db.insert(Utilidades.TABLA_ALIMENTOS,null,values);
        db.close();
        Toast.makeText(this, "idresultante"+ idResultado, Toast.LENGTH_SHORT).show();

    }


}

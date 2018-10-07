package com.example.alan.myapplication.Utilidades;

public class Utilidades {



    public static final String TABLA_ALIMENTOS="alimento";
    public static final String CAMPO_ID="id";
    public static final String CAMPO_NOMBRE="nombre";
    public static final String CAMPO_CALORIAS="calorias";
    public static final String CAMPO_HIDRATOS="hidratos";
    public static final String CAMPO_PROTEINAS="proteinas";
    public static final String CAMPO_GRASAS="grasas";
    public static final String CAMPO_CATEGORIA="categoria";


    public static final String CREAR_TABLA_ALIMENTO="CREATE TABLE alimento(id INTEGER PRIMARY KEY, nombre TEXT, calorias TEXT, hidratos TEXT, proteinas TEXT ,grasas TEXT, categoria TEXT )";


            /*"CREATE TABLE "+TABLA_ALIMENTOS+ "("+CAMPO_ID+" INTEGER, "+CAMPO_NOMBRE+
            "  TEXT, "+CAMPO_CALORIAS+" TEXT, "+CAMPO_HIDRATOS+" TEXT, "+CAMPO_PROTEINAS+" TEXT, " +CAMPO_GRASAS+" TEXT, "+CAMPO_CATEGORIA+" TEXT )";*/

}

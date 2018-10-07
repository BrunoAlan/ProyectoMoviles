package com.example.alan.myapplication.Entidades;

public class Alimento {

    private String nombre;
    private int calorias;
    private double hidratos;
    private double proteinas;
    private double grasas;
    private String categoria;

    public Alimento(String nombre, int calorias, double hidratos, double proteinas, double grasas, String categoria) {
        this.nombre = nombre;
        this.calorias = calorias;
        this.hidratos = hidratos;
        this.proteinas = proteinas;
        this.grasas = grasas;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public double getHidratos() {
        return hidratos;
    }

    public void setHidratos(double hidratos) {
        this.hidratos = hidratos;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    public double getGrasas() {
        return grasas;
    }

    public void setGrasas(double grasas) {
        this.grasas = grasas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "nombre='" + nombre + '\'' +
                ", calorias=" + calorias +
                ", hidratos=" + hidratos +
                ", proteinas=" + proteinas +
                ", grasas=" + grasas +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
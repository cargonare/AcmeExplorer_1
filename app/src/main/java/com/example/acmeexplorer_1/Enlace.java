package com.example.acmeexplorer_1;

import java.util.ArrayList;
import java.util.List;

public class Enlace {

    private String descripcion;
    private int recursoImageView;
    private Class clase;

    public Enlace(String descripcion, int recursoImageView, Class clase) {
        this.descripcion = descripcion;
        this.recursoImageView = recursoImageView;
        this.clase = clase;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getRecursoImageView() {
        return recursoImageView;
    }

    public void setRecursoImageView(int recursoImageView) {
        this.recursoImageView = recursoImageView;
    }

    public Class getClase() {
        return clase;
    }

    public void setClase(Class clase) {
        this.clase = clase;
    }

    public static List<Enlace> generaEnlace(){
        List<Enlace> lista=new ArrayList<>();
        lista.add(new Enlace("Viajes Disponibles", R.drawable.viajar, MainActivity.class));
        lista.add(new Enlace("Viajes Seleccionados", R.drawable.objetivo, MainActivity.class));

        return lista;
    }
}

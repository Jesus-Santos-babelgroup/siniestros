package com.babeleros.siniestros.dtos;


import com.babeleros.siniestros.Categorias;

import java.time.LocalDate;
import java.util.Date;

public class Bien implements IBienAfectado{

    private LocalDate fechaCompra;
    private double valorCompra;
    private Categorias categoria;


    public double getValorCompra() {
        return valorCompra;
    }

    public Categorias getCategoria(){
        return categoria;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
}

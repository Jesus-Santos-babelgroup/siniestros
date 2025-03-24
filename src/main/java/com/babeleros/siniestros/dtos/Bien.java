package com.babeleros.siniestros.dtos;


import com.babeleros.siniestros.Categorias;

import java.util.Date;

public class Bien implements IBienAfectado{

    private Date fechaCompra;
    private double valorCompra;
    private Categorias categoria;


    public double getValorCompra() {
        return valorCompra;
    }

    public Categorias getCategoria(){
        return categoria;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }
}

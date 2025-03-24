package com.babeleros.siniestros.tablasAmortizacion;

import com.babeleros.siniestros.Categorias;

import java.util.Map;

public class TablaAmortizacion implements ITablaAmortizacion {

    private String compañia;
    private int valorResidual;
    private Map<Categorias, Double> tabla;

    public TablaAmortizacion(String compañia, int valorResidual) {
        this.compañia = compañia;
        this.valorResidual = valorResidual;
        this.tabla = null;
    }

    public TablaAmortizacion(String compañia, int valorResidual, Map<Categorias, Double> tabla) {
        this.compañia = compañia;
        this.valorResidual = valorResidual;
        this.tabla = tabla;
    }

    public String getCompañia() {
        return compañia;
    }

    public int getValorResidual() {
        return valorResidual;
    }

    public void setValorResidual(int valorResidual) {
        this.valorResidual = valorResidual;
    }

    public Map<Categorias, Double> getTabla() {
        return tabla;
    }

    public void setTabla(Map<Categorias, Double> tabla) {
        this.tabla = tabla;
    }

    @Override
    public void addToTable(Categorias categoria, Double tiempoAmortizacion) {
        tabla.put(categoria, tiempoAmortizacion);
    }

    @Override
    public Double getTiempoAmortizacion(Categorias categorias) {
        return tabla.get(categorias);
    }
}

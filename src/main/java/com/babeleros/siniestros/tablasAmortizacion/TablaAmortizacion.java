package com.babeleros.siniestros.tablasAmortizacion;

import com.babeleros.siniestros.Categorias;

import java.util.Map;

public class TablaAmortizacion implements ITablaAmortizacion {

    private String compañia;
    private int valorResidual;
    private Map<Categorias, Integer> tabla;

    public TablaAmortizacion(String compañia, int valorResidual) {
        this.compañia = compañia;
        this.valorResidual = valorResidual;
        this.tabla = null;
    }

    public TablaAmortizacion(String compañia, int valorResidual, Map<Categorias, Integer> tabla) {
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

    public Map<Categorias, Integer> getTabla() {
        return tabla;
    }

    public void setTabla(Map<Categorias, Integer> tabla) {
        this.tabla = tabla;
    }

    @Override
    public void addToTable(Categorias categoria, int tiempoAmortizacion) {
        tabla.put(categoria, tiempoAmortizacion);
    }
}

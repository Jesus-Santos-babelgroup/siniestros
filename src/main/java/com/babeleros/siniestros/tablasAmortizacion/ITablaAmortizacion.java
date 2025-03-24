package com.babeleros.siniestros.tablasAmortizacion;

import com.babeleros.siniestros.Categorias;

public interface ITablaAmortizacion {
    void addToTable(Categorias categoria, Double tiempoAmortizacion);

    Double getTiempoAmortizacion(Categorias categorias);
}

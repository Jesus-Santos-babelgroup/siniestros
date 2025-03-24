package com.babeleros.siniestros.calculo;

import com.babeleros.siniestros.dtos.Bien;
import com.babeleros.siniestros.tablasAmortizacion.ITablaAmortizacion;

import java.util.Date;

public interface ICalcDepreciacion {
    double calculoDepreciacion(Bien bien, ITablaAmortizacion tablas, Date fechaSiniestro);
}

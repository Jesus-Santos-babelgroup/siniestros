package com.babeleros.siniestros.calculo;

import com.babeleros.siniestros.dtos.Bien;
import com.babeleros.siniestros.tablasAmortizacion.ITablaAmortizacion;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;
import java.util.Date;

@Service
public class CalcDepreciacionGeneral implements ICalcDepreciacion {

    @Override
    public double calculoDepreciacion(Bien bien, ITablaAmortizacion tablas, Date fechaSiniestro) {  //Actualizar luego
        double depreciacionAnual = 1.0 / tablas.getAnosAmortizacion(); //Esto viene en las tablas
        double valorInicial = bien.getValorCompra();
        double valorFinal = 0.;
        double valorDepreciado = bien.getValorCompra();
        long anosTranscurridos = ChronoUnit.YEARS.between(bien.getFechaCompra(), fechaSiniestro);
        for (int i = 0; i < anosTranscurridos; i++) {
            valorDepreciado -= valorDepreciado * depreciacionAnual;
        }
        if (anosTranscurridos <= tablas.getAnosAmortizacion()) {
            valorFinal = valorDepreciado;
        } else {
            valorFinal = valorInicial * 0.15;
        }
        return valorFinal;
    }
}

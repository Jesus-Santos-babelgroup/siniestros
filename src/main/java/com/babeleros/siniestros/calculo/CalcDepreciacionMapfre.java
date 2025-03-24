package com.babeleros.siniestros.calculo;

import com.babeleros.siniestros.dtos.Bien;
import com.babeleros.siniestros.tablasAmortizacion.ITablaAmortizacion;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;
import java.util.Date;

@Service
public class CalcDepreciacionMapfre implements ICalcDepreciacion {

    @Override
    public double calculoDepreciacion(Bien bien, ITablaAmortizacion tablas, Date fechaSiniestro) {  //Actualizar luego
        double depreciacionAnual = 1.0 / tablas.getAnosAmortizacion(); //Esto viene en las tablas
        long anosTranscurridos = ChronoUnit.YEARS.between(bien.getFechaCompra(), fechaSiniestro);
        double valorDepreciado = 0.;
        if (anosTranscurridos <= tablas.getAnosAmortizacion()) {
            valorDepreciado = bien.getValorCompra() * (depreciacionAnual * anosTranscurridos);
        } else {
            valorDepreciado = bien.getValorCompra() * 0.17;
        }
        return valorDepreciado;
    }


}

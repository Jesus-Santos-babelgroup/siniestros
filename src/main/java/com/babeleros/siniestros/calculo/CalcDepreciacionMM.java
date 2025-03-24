package com.babeleros.siniestros.calculo;

import com.babeleros.siniestros.dtos.Bien;
import com.babeleros.siniestros.tablasAmortizacion.ITablaAmortizacion;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;
import java.util.Date;


@Service
public class CalcDepreciacionMM implements ICalcDepreciacion {

    @Override
    public double calculoDepreciacion(Bien bien, ITablaAmortizacion tabla, Date fechaSiniestro) {
        long diasTranscurridos = ChronoUnit.DAYS.between(bien.getFechaCompra(), fechaSiniestro);
        double anosTranscurridos = (double) diasTranscurridos / 365;
        double depreciacion = anosTranscurridos / (tabla.getAnosAmortizacion() * 2);
        double valorDepreciado = 0.;
        if (anosTranscurridos <= tabla.getAnosAmortizacion()) {
            valorDepreciado = bien.getValorCompra() * depreciacion;
        } else {
            valorDepreciado = bien.getValorCompra() * 0.10;
        }

        return valorDepreciado;
    }
}

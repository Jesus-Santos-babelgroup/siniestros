package com.babeleros.siniestros.calculo;

import com.babeleros.siniestros.dtos.Bien;
import com.babeleros.siniestros.tablasAmortizacion.ITablaAmortizacion;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;
import java.util.Date;


@Service
public class CalculoDepreciacionAllianz implements ICalcDepreciacion {

    @Override
    public double calculoDepreciacion(Bien bien, ITablaAmortizacion tabla, Date fechaSiniestro) {
        double depreciacionAnual = tabla.getAnosAmortizacion();
        double valorDepreciado = bien.getValorCompra();
        long anosTranscurridos = ChronoUnit.YEARS.between(bien.getFechaCompra(), fechaSiniestro);

        for (int i = 0; i < anosTranscurridos; i++) {
            valorDepreciado -= valorDepreciado * depreciacionAnual;
        }
        valorDepreciado += valorDepreciado * 0.05; //Allianz aumenta un 5% sobre la valoracion
        return valorDepreciado;
    }
}



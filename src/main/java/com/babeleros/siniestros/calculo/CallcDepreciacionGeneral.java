package com.babeleros.siniestros.calculo;

import com.babeleros.siniestros.dtos.IBienAfectado;

public class CallcDepreciacionGeneral implements ICalcDepreciacion {

    
    @Override
    public double calculoDepreciacion(IBienAfectado bien) {
        double depreciacionAnual = 1.0 / bien.getAnosAmortizacion();
        double valorDepreciado = bien.getValorCompra();
        for (int i = 0; i < bien.getAnosDesdeCompra(); i++) {
            valorDepreciado -= valorDepreciado * depreciacionAnual;
        }
        return valorDepreciado;
    }
}

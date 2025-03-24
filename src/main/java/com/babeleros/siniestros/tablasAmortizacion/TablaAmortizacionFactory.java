package com.babeleros.siniestros.tablasAmortizacion;

import com.babeleros.siniestros.Categorias;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class TablaAmortizacionFactory {

    private static Random rnd = new Random();

    public static ITablaAmortizacion buildTablaAmortizacion(String compañia) {
        Double valorResidual;
        Map<Categorias, Double> tabla;
        if (compañia.equalsIgnoreCase("general")) {
            valorResidual = 15.0;
            tabla = getTabla();
        } else if (compañia.equalsIgnoreCase("mapfre")) {
            valorResidual = 17.0;
            tabla = getTabla();
        } else if (compañia.equalsIgnoreCase("allianz")) {
            valorResidual = 0.0;
            tabla = getTabla();
        } else if (compañia.equalsIgnoreCase("mutua-madrileña")) {
            valorResidual = 10.0;
            tabla = getTabla();
        } else {
            throw new RuntimeException("Compañia no soportada");
        }
        return new TablaAmortizacion(compañia, 17, tabla);
    }

    // esto debería de obtenerse de una base de datos
    private static Map<Categorias, Double> getTabla() {
        Map<Categorias, Double> tabla = new HashMap<>();
        for (Categorias cat : Categorias.values()) {
            Double añosAmortizacion = generateAñosAmortizacion(12);
            tabla.put(cat, añosAmortizacion);
        }
        return tabla;
    }

    private static Double generateAñosAmortizacion(int maxAños) {
        return rnd.nextDouble(maxAños);
    }

}

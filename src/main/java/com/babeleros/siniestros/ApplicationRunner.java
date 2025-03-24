package com.babeleros.siniestros;

import com.babeleros.siniestros.dtos.Bien;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

@Component
public class ApplicationRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tipo de bien: \n");
        Categorias categoria = Categorias.valueOf(scanner.nextLine().toUpperCase());

        System.out.print("Ingrese el valor de compra del bien: \n");
        double valorCompra = Double.valueOf(scanner.nextLine());

        System.out.print("Ingrese la fecha de compra del bien: (formato YYYY-MM-DD) \n");
        String fechaCompraStr = scanner.nextLine();
        LocalDate fechaCompra = LocalDate.parse(fechaCompraStr);
        System.out.println(fechaCompra);

        Bien bien = new Bien();

        bien.setFechaCompra(fechaCompra);
        bien.setValorCompra(valorCompra);
        bien.setCategoria(categoria);

        System.out.println("Selecciona la compañía de seguros (General/Mapfre/Allianz/Mutua Madrileña):  \n");
        String companiaSeleccionada = scanner.nextLine();

        //calcular valor para el bien con la compañia elegida
        double valorFinal = ;

        System.out.println("\nLa valoración final del bien es: " + valorFinal + " €");
    }
}

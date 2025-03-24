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

        System.out.print("Ingrese el tipo de bien: ");
        Categorias categoria = Categorias.valueOf(scanner.nextLine());

        System.out.print("Ingrese el valor de compra del bien: ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Ingrese la fecha de compra del bien: (formato YYYY-MM-DD)");
        String fechaCompraStr = scanner.next();
        LocalDate fechaCompra = LocalDate.parse(fechaCompraStr);

        Bien bien = new Bien();

        bien.setFechaCompra(fechaCompra);
        bien.setValorCompra(valorCompra);
        bien.setCategoria(categoria);

        System.out.println("Selecciona la compañía de seguros (Mapfre/Allianz/Mutua Madrileña): ");
        String companiaSeleccionada = scanner.nextLine();

        //calcular valor para el bien con la compañia elegida



    }
}

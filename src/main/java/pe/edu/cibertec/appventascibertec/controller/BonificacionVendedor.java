package pe.edu.cibertec.appventascibertec.controller;

import java.util.Scanner;
import pe.edu.cibertec.appventascibertec.model.Venta;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/venta")

public class BonificacionVendedor {
    @GetMapping("/bonificacion")
    public String mostrarFormulario(Model model) {
        model.addAttribute("venta", new Venta());
        return "bonificacion";
    }

    @PostMapping("/calcularBonificacion")
    public String calcularBonificacion(Venta venta, Model model) {
        double monto = venta.getMonto();
        double bonificacion = calcularBonificacionPorMonto(monto);
        model.addAttribute("bonificacion", bonificacion);
        return "resultado-bonificacion";
    }

    private double calcularBonificacionPorMonto(double monto) {
        if (monto >= 0 && monto <= 1000) {
            return monto * 0.10;
        } else if (monto <= 2000) {
            return monto * 0.20;
        } else if (monto <= 3000) {
            return monto * 0.30;
        } else {
            return 0; // No hay bonificación para montos mayores a 3000
        }
    }
}

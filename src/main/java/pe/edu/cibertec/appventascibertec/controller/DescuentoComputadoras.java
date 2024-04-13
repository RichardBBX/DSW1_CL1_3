package pe.edu.cibertec.appventascibertec.controller;

import java.util.Scanner;
import pe.edu.cibertec.appventascibertec.model.Computadora;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/computadoras")
public class DescuentoComputadoras {
    @GetMapping("/descuento")
    public String mostrarFormulario(Model model) {
        model.addAttribute("computadora", new Computadora());
        return "descuento";
    }

    @PostMapping("/calcularDescuento")
    public String calcularDescuento(Computadora computadora, Model model) {
        int cantidad = computadora.getCantidad();
        double descuento = 0.0;
        if (cantidad < 5) {
            descuento = 0.10;
        } else if (cantidad < 10) {
            descuento = 0.20;
        } else {
            descuento = 0.40;
        }
        double precioTotal = cantidad * 11000;
        double totalConDescuento = precioTotal - (precioTotal * descuento);
        model.addAttribute("totalConDescuento", totalConDescuento);
        return "resultado";
    }
}

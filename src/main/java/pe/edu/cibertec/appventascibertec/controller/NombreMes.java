package pe.edu.cibertec.appventascibertec.controller;

import java.util.Scanner;
import pe.edu.cibertec.appventascibertec.model.Mes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mes")

public class NombreMes {

    @GetMapping("/nombre")
    public String mostrarFormulario(Model model) {
        model.addAttribute("mes", new Mes());
        return "nombre-mes";
    }

    @PostMapping("/obtenerNombre")
    public String obtenerNombreMes(Mes mes, Model model) {
        int numero = mes.getNumero();
        String nombre = obtenerNombreMesPorNumero(numero);
        model.addAttribute("nombreMes", nombre);
        return "resultado-nombre-mes";
    }

    private String obtenerNombreMesPorNumero(int numero) {
        String[] nombres = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        if (numero >= 1 && numero <= 12) {
            return nombres[numero - 1];
        } else {
            return "Número de mes inválido";
        }
    }
}

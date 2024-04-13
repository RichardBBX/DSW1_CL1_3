package pe.edu.cibertec.appventascibertec.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Computadora {
    private int cantidad;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}


package uni.edu.pe.tiendaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Producto {
    private int id_producto;
    private String nombre;
    private String descripcion;
    private int stock;
    private double precio;
}

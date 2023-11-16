package uni.edu.pe.tiendaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Producto {
    private int id_producto;
    private int id_vendedor;
    private String nombre;
    private String descripcion;
    private double precio;
}

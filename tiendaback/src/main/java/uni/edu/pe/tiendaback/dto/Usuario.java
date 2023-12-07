package uni.edu.pe.tiendaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Usuario {
    private String nombre;
    private int telefono;
    private String direccion;
}

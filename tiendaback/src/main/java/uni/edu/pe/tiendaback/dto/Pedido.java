package uni.edu.pe.tiendaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Pedido {
    private int id_pedido;
    private int id_producto;
    private int id_usuario;
    private String fecha;
}
package uni.edu.pe.tiendaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RptaPedido {
    private int id_pedido;
    private int id_usuario;
    private int id_producto;
    private String estado;
    private String fecha;
}

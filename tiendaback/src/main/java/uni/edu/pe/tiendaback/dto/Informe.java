package uni.edu.pe.tiendaback.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Informe {
    private String tipo;
    private String asunto;
    private String descripcion;
}
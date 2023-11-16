package uni.edu.pe.tiendaback.dto.rest;

import lombok.Data;
import uni.edu.pe.tiendaback.dto.RptaPedido;

import java.util.List;

@Data
public class RptaReportePedidos {
    private List<RptaPedido> reportes;
}

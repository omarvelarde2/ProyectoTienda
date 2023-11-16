package uni.edu.pe.tiendaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uni.edu.pe.tiendaback.dto.rest.RptaReportePedidos;
import uni.edu.pe.tiendaback.service.ObtenerPedidosService;

@RestController
@RequestMapping("/obtenerPedidos")
public class ObtenerPedidosController {
    @Autowired
    private ObtenerPedidosService obtenerPedidosService;

    @PostMapping
    public RptaReportePedidos obtenerPedidos(){
        RptaReportePedidos rsps = new RptaReportePedidos();
        rsps.setReportes(obtenerPedidosService.obtenerPedidos());
        return rsps;
    }
}

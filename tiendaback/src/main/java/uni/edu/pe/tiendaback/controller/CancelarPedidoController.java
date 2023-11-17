package uni.edu.pe.tiendaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uni.edu.pe.tiendaback.dto.RptaPedido;
import uni.edu.pe.tiendaback.service.CancelarPedidoService;



@RestController
@RequestMapping("/cancelarPedido")
public class CancelarPedidoController {
    @Autowired
    private CancelarPedidoService cancelarPedidoService;

    @PostMapping
    public String cancelarPedido(@RequestBody int id_producto) { return cancelarPedidoService.cancelarPedido(id_producto); }
}

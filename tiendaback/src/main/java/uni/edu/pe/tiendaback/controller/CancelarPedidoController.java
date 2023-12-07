package uni.edu.pe.tiendaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.tiendaback.service.CancelarPedidoService;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/cancelarPedido")
public class CancelarPedidoController {
    @Autowired
    private CancelarPedidoService cancelarPedidoService;

    @PostMapping
    public String cancelarPedido(@RequestBody int id_producto) { return cancelarPedidoService.cancelarPedido(id_producto); }
}

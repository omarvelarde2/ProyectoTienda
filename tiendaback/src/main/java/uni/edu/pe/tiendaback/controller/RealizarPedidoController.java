package uni.edu.pe.tiendaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.tiendaback.dto.Pedido;
import uni.edu.pe.tiendaback.service.RealizarPedidoService;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/realizarPedido")
public class RealizarPedidoController {
    @Autowired
    private RealizarPedidoService realizarPedidoService;

    @PostMapping
    public Pedido registrarPedido(@RequestBody Pedido pedido) {
        return realizarPedidoService.realizarPedido(pedido);
    }
}
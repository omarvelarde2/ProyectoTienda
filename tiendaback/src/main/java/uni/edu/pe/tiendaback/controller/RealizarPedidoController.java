package uni.edu.pe.tiendaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uni.edu.pe.tiendaback.dto.Pedido;
import uni.edu.pe.tiendaback.service.RealizarPedidoService;

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
package uni.edu.pe.tiendaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uni.edu.pe.tiendaback.dto.Pedido;
import uni.edu.pe.tiendaback.dto.Producto;
import uni.edu.pe.tiendaback.service.RealizarPedidoService;
import uni.edu.pe.tiendaback.service.VenderProductoService;

@RestController
@RequestMapping("/venderProducto")
public class VenderProductoController {
    @Autowired
    private VenderProductoService venderProductoService;

    @PostMapping
    public Producto venderProducto(@RequestBody Producto producto) { return venderProductoService.venderProducto(producto); }
}
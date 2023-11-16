package uni.edu.pe.tiendaback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.tiendaback.dao.RealizarPedidoDao;
import uni.edu.pe.tiendaback.dao.VenderProductoDao;
import uni.edu.pe.tiendaback.dto.Pedido;
import uni.edu.pe.tiendaback.dto.Producto;

@Service
public class VenderProductoService {
    @Autowired
    // Se crea objeto de dao para llamar a la ejecución de los métodos e implementar el service
    private VenderProductoDao venderProductoDao;
    public Producto venderProducto(Producto producto) { return venderProductoDao.venderProducto(producto); }
}

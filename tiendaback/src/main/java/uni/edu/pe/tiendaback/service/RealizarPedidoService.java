package uni.edu.pe.tiendaback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.tiendaback.dao.ObtenerPedidosDao;
import uni.edu.pe.tiendaback.dao.RealizarPedidoDao;
import uni.edu.pe.tiendaback.dto.Pedido;

@Service
public class RealizarPedidoService {
    @Autowired
    // Se crea objeto de dao para llamar a la ejecución de los métodos e implementar el service
    private RealizarPedidoDao realizarPedidoDao;
    public Pedido realizarPedido(Pedido pedido) {
        return realizarPedidoDao.realizarPedido(pedido);
    }
}

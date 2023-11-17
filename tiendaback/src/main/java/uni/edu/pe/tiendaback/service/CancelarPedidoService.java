package uni.edu.pe.tiendaback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.tiendaback.dao.CancelarPedidoDao;
import uni.edu.pe.tiendaback.dao.CrearCuentaDao;
import uni.edu.pe.tiendaback.dto.Pedido;
import uni.edu.pe.tiendaback.dto.RptaPedido;
import uni.edu.pe.tiendaback.dto.Usuario;

@Service
public class CancelarPedidoService {
    @Autowired
    // Se crea objeto de dao para llamar a la ejecución de los métodos e implementar el service
    private CancelarPedidoDao cancelarPedidoDao;
    public String cancelarPedido(int id_producto) { return cancelarPedidoDao.cancelarPedido(id_producto); }
}

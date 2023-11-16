package uni.edu.pe.tiendaback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.tiendaback.dao.ObtenerPedidosDao;
import uni.edu.pe.tiendaback.dto.RptaPedido;

import java.util.List;

@Service
public class ObtenerPedidosService {
    @Autowired
    // Se crea objeto de dao para llamar a la ejecución de los métodos e implementar el service
    private ObtenerPedidosDao obtenerPedidosDao;
    public List<RptaPedido> obtenerPedidos() {
        return obtenerPedidosDao.obtenerPedidos();
    }
}
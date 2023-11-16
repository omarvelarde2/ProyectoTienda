package uni.edu.pe.tiendaback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.tiendaback.dao.CrearCuentaDao;
import uni.edu.pe.tiendaback.dto.Pedido;
import uni.edu.pe.tiendaback.dto.Usuario;

import java.util.List;

@Service
public class CrearCuentaService {
    @Autowired
    // Se crea objeto de dao para llamar a la ejecución de los métodos e implementar el service
    private CrearCuentaDao crearCuentaDao;
    public Usuario crearCuenta(Usuario usuario) { return crearCuentaDao.crearCuenta(usuario); }
}

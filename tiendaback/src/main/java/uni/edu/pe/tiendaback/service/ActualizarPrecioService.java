package uni.edu.pe.tiendaback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import uni.edu.pe.tiendaback.dao.ActualizarPrecioDao;
import uni.edu.pe.tiendaback.dao.CrearCuentaDao;
import uni.edu.pe.tiendaback.dto.ObjUs;
import uni.edu.pe.tiendaback.dto.Usuario;

@Repository
public class ActualizarPrecioService {
    @Autowired
    // Se crea objeto de dao para llamar a la ejecución de los métodos e implementar el service
    private ActualizarPrecioDao actualizarPrecioDao;
    public ObjUs actualizarPrecio(ObjUs objus) { return actualizarPrecioDao.actualizarPrecio(objus); }
}

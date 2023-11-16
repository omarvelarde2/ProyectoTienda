package uni.edu.pe.tiendaback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.edu.pe.tiendaback.dao.EnviarInformeDao;
import uni.edu.pe.tiendaback.dto.Informe;

@Service
public class EnviarInformeService {
    @Autowired
    // Se crea objeto de dao para llamar a la ejecución de los métodos e implementar el service
    private EnviarInformeDao enviarInformeDao;

    public Informe enviarInforme(Informe informe){ return enviarInformeDao.enviarInforme(informe); }
}

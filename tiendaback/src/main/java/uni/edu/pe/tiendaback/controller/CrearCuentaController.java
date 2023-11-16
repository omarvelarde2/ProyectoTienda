package uni.edu.pe.tiendaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uni.edu.pe.tiendaback.dto.Usuario;
import uni.edu.pe.tiendaback.service.CrearCuentaService;

@RestController
@RequestMapping("/crearCuenta")
public class CrearCuentaController {
    @Autowired
    private CrearCuentaService crearCuentaService;

    @PostMapping
    public Usuario crearCuenta(@RequestBody Usuario usuario) {
        return crearCuentaService.crearCuenta(usuario);
    }
}

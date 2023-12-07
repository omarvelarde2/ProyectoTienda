package uni.edu.pe.tiendaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.tiendaback.dto.Usuario;
import uni.edu.pe.tiendaback.service.CrearCuentaService;

@CrossOrigin(origins = {"*"})
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

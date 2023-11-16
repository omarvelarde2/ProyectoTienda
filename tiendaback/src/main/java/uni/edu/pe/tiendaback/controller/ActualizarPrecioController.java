package uni.edu.pe.tiendaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uni.edu.pe.tiendaback.dto.ObjUs;
import uni.edu.pe.tiendaback.dto.Usuario;
import uni.edu.pe.tiendaback.service.ActualizarPrecioService;
import uni.edu.pe.tiendaback.service.CrearCuentaService;

@RestController
@RequestMapping("/actualizarPrecio")
public class ActualizarPrecioController {
    @Autowired
    private ActualizarPrecioService actualizarPrecioService;

    @PostMapping
    public ObjUs actualizarPrecio(@RequestBody ObjUs objus) {
        return actualizarPrecioService.actualizarPrecio(objus);
    }
}

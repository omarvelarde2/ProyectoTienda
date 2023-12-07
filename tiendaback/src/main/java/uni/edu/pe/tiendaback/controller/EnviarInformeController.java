package uni.edu.pe.tiendaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uni.edu.pe.tiendaback.dto.Informe;
import uni.edu.pe.tiendaback.service.EnviarInformeService;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/enviarInforme")
public class EnviarInformeController {
    @Autowired
    private EnviarInformeService enviarInformeService;

    @PostMapping
    public Informe enviarInforme(@RequestBody Informe informe) {
        return enviarInformeService.enviarInforme(informe);
    }
}

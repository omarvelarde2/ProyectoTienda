package uni.edu.pe.tiendaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uni.edu.pe.tiendaback.dto.Informe;
import uni.edu.pe.tiendaback.service.EnviarInformeService;

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

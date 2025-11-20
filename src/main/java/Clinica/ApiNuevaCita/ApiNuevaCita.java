package Clinica.ApiNuevaCita;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiNuevaCita")
public class ApiNuevaCita {

    @Autowired
    private ServicioNuevaCita serv;

    @PostMapping("/nuevo")
    public Salida nuevaCita(@RequestBody Entrada ent) {
        return serv.nuevaCita(ent);
    }

    @GetMapping("/salida")
    public Salida getSalida() {
        return serv.getSalida();
    }
}

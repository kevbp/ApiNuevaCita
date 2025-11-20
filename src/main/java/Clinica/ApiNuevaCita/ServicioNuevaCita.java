package Clinica.ApiNuevaCita;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServicioNuevaCita {

    @Autowired
    private RestTemplate resTem;
    private Salida sal;

    public Salida nuevaCita(Entrada ent) {
        Long idPac = ent.getIdPac();
        Long idHor = ent.getIdHor();

        String urlPac = "http://ApiPaciente/paciente/buscar/" + idPac;
        String urlHor = "http://ApiHorario/horario/buscar/" + idHor;

        PacienteDTO pac = resTem.getForObject(urlPac, PacienteDTO.class);
        HorarioDTO hor = resTem.getForObject(urlHor, HorarioDTO.class);

        sal = new Salida();
        sal.setPac(pac);
        sal.setHor(hor);

        return sal;
    }

    public Salida getSalida() {
        return sal;
    }
}

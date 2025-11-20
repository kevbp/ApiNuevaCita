
package Clinica.ApiNuevaCita;

public class Salida {
    
    private PacienteDTO pac;
    private HorarioDTO hor;

    public Salida() {
    }
    
    public Salida(PacienteDTO pac, HorarioDTO hor) {
        this.pac = pac;
        this.hor = hor;
    }

    public PacienteDTO getPac() {
        return pac;
    }

    public void setPac(PacienteDTO pac) {
        this.pac = pac;
    }

    public HorarioDTO getHor() {
        return hor;
    }

    public void setHor(HorarioDTO hor) {
        this.hor = hor;
    }
    
    
    
}

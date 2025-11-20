
package Clinica.ApiNuevaCita;

public class Entrada {
    
    private Long idPac;
    private Long idHor;

    public Entrada() {
    }

    public Entrada(Long idPac, Long idHor) {
        this.idPac = idPac;
        this.idHor = idHor;
    }

    public Long getIdPac() {
        return idPac;
    }

    public void setIdPac(Long idPac) {
        this.idPac = idPac;
    }

    public Long getIdHor() {
        return idHor;
    }

    public void setIdHor(Long idHor) {
        this.idHor = idHor;
    }
    
    
}

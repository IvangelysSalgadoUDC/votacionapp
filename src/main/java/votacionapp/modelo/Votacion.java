package votacionapp.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Table(name = "Votacion")
public class Votacion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty
    private String fecha;

    @NotEmpty
    private String partidoPolitico;

    @NotEmpty
    private String candidato;

    @NotEmpty
    private String votante;

    @NotEmpty
    private String pais;

    @NotEmpty
    private String departamento;

    @NotEmpty
    private String ciudad;

    @NotEmpty
    private String mesa;

    @NotEmpty
    private String puestoPolitico;

    @NotEmpty
    private String duracion;

    @NotEmpty
    private String numeroTarjeton;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getPartidoPolitico() { return partidoPolitico; }
    public void setPartidoPolitico(String partidoPolitico) { this.partidoPolitico = partidoPolitico; }

    public String getCandidato() { return candidato; }
    public void setCandidato(String candidato) { this.candidato = candidato; }

    public String getVotante() { return votante; }
    public void setVotante(String votante) { this.votante = votante; }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getMesa() { return mesa; }
    public void setMesa(String mesa) { this.mesa = mesa; }

    public String getPuestoPolitico() { return puestoPolitico; }
    public void setPuestoPolitico(String puestoPolitico) { this.puestoPolitico = puestoPolitico; }

    public String getDuracion() { return duracion; }
    public void setDuracion(String duracion) { this.duracion = duracion; }

    public String getNumeroTarjeton() { return numeroTarjeton; }
    public void setNumeroTarjeton(String numeroTarjeton) { this.numeroTarjeton = numeroTarjeton; }
}

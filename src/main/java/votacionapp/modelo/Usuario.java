package votacionapp.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
@Table(name = "Usuarios")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @NotEmpty
    private String cedula;

    @NotEmpty
    private String clave;

    @NotEmpty
    private String nombre;

    @Email
    private String email;

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }
    public String getClave() { return clave; }
    public void setClave(String clave) { this.clave = clave; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}

package clase_automovil;

public class class_persona {
    String nombre;
    int numeroLicencia;
    int numeroTelefono;
    String direccion;
    String tipoSangre;

    public class_persona() {
    }

    public class_persona(String nombre, int numeroLicencia, int numeroTelefono, String direccion, String tipoSangre) {
        this.nombre = nombre;
        this.numeroLicencia = numeroLicencia;
        this.numeroTelefono = numeroTelefono;
        this.direccion = direccion;
        this.tipoSangre = tipoSangre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }
    
    
}
